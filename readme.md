# 环境
JDK8
Spring5 (Spring6 已经不支持 jdk8)

# 搭建过程
新建maven项目, 文件目录

```
-- pom.xml
-- src/main/resources/Beans.xml
-- src/main/java/org/example/HelloWorld.java
-- src/main/java/org/example/Main.java
```

## Bean.xml
Spring Config 基本模板
```xml
<?xml version="1.0" encoding="UTF-8"?>

<!--bean标签标示配置bean
    id属性标示给bean起名字
    class属性表示给bean定义类型
-->
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
<bean id="" class=""></bean>
</beans>
```

# 参考链接
- [黑马2022新版SSM框架教程（ Spring_day01）](https://blog.csdn.net/m0_58730471/article/details/127737445)
- [黑马2022新版SSM框架教程（ Spring_day02）](https://blog.csdn.net/m0_58730471/article/details/127744102)
- [黑马2022新版SSM框架教程（ Spring_day03）](https://blog.csdn.net/m0_58730471/article/details/127782322)
- [Spring中@Import和@ComponentScan在导入bean的区别](https://blog.csdn.net/xzyash/article/details/128173311)
