# 按照构造器注入
## 注入引用类型
引用 `userDao` 这个 bean
```xml
<bean id="userDao" class="org.example.dao.impl.UserDaoImpl"/>


<bean id="bookService"
      name="service service4 bookEbi"
      class="org.example.service.impl.BookServiceImpl"
>
    <!--
        property标签表示配置当前bean的属性
            name属性表示配置哪一个具体的属性
            ref属性表示参照哪一个bean
    -->

    <constructor-arg  name="bookDao" ref="bookDao"/>
    <constructor-arg name="userDao" ref="userDao"/>
</bean>
```
## 注入简单类型
按照名称注入
```xml
<bean id="bookDao" class="org.example.dao.impl.BookDaoImpl">
    <!--name属性：设置注入的属性名，实际是set方法对应的名称-->
    <!--value属性：设置注入简单类型数据值-->
    <constructor-arg name="connectionNum" value="100"/>
    <constructor-arg name="databaseName" value="MySQL"/>
</bean>
```

按照类型注入
```xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
    <constructor-arg type="int" value="10"/>
    <constructor-arg type="java.lang.String" value="mysql"/>
</bean>
```

按照字段顺序注入
```xml
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
    <constructor-arg index="1" value="100"/>
    <constructor-arg index="0" value="mysql"/>
</bean>
```
