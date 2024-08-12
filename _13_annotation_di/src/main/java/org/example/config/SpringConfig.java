package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // 设定当前类为配置类
@ComponentScan("org.example")  // 扫描指定包及其子包中的所有类上的注解.  多个package需要用数组格式 {"org.example.dao", "org.example.service"}
@PropertySource({"jdbc.properties"})  // 读取配置文件
public class SpringConfig {

}
