package org.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    // 定义 SqlSessionFactoryBean，用于产生 SqlSessionFactory 对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置模型类的别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("org.example.domain");
        // 设置数据源 会自动注入 Druid
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    /*
        定义 Bean: 返回 MapperScannerConfigurer 对象
        用于替换 mybatis-config.xml 中引入映射文件的操作：
                <!--以包为单位引入映射文件-->
                <package name="org.example.dao"/>
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("org.example.dao");
        return msc;
    }
}
