# Spring 整合 MyBatis
建表语句：
```sql
create table learnjdbc.tbl_account(
    id int primary key auto_increment,
    name varchar(35),
    money double
) Engine=INNODB DEFAULT CHARSET=UTF8;

insert into learnjdbc.tbl_account values(null, 'yuwei', '-1');
```


## 依赖的 pom
```xml
        <!--Spring操作数据库需要该jar包-->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.3.31</version>
</dependency>
    
<!--
    Spring与Mybatis整合的jar包
    这个jar包mybatis在前面，是Mybatis提供的
-->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>2.1.1</version>
</dependency>
```
