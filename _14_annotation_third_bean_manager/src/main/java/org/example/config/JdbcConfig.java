package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    public JdbcConfig(Dummy dummy){
        System.out.println("构造器: " + dummy);  // 如果构造的第三方还需要注入其他对象
    }

    @Bean  // @Bean注解的作用是将方法的返回值制作为Spring管理的一个bean对象
    DataSource getDataSource(Dummy dummy){
        System.out.println("getDataSource: " + dummy);  // 如果构造的第三方还需要注入其他对象
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
