# SQL 前置操作

```sql
use learnjdbc;

create table learnjdbc.tbl_account(
    id int primary key auto_increment,
    name varchar(35),
    money double
) Engine=INNODB DEFAULT CHARSET=UTF8;

create table tbl_log(
   id int primary key auto_increment,
   info varchar(255),
   createDate datetime
) Engine=INNODB DEFAULT CHARSET=UTF8;
```

数据准备
```sql
truncate tbl_account;
truncate tbl_log;
insert into tbl_account values(1, 'ming', 100);
insert into tbl_account values(2, 'wang', 100);
```
# 
(1) 在需要被事务管理的方法上添加注解 @Transactional

@Transactional可以写在接口类上、接口方法上、实现类上和实现类方法上：
- 写在接口类上，该接口的所有实现类的所有方法都会有事务
- 写在接口方法上，该接口的所有实现类的该方法都会有事务
- 写在实现类上，该类中的所有方法都会有事务
- 写在实现类方法上，该方法上有事务

**建议写在实现类或实现类的方法上**


(2) 在JdbcConfig类中配置事务管理器
```java
// 配置事务管理器，mybatis使用的是jdbc事务
@Bean
public PlatformTransactionManager transactionManager(DataSource dataSource){
    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    transactionManager.setDataSource(dataSource);
    return transactionManager;
}
```


(3) 在 SpringConfig 的配置类中开启事务注解 @EnableTransactionManagement

# Spring事务角色

- 事务管理员：发起事务方，在Spring中通常指代业务层开启事务的方法
- 事务协调员：加入事务方，在Spring中通常指代数据层方法，也可以是业务层方法


# 参考
[@Transactional注解的失效场景](https://juejin.cn/post/6844904096747503629)
