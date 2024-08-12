# AOP的核心概念
>>>
    概念：AOP(Aspect Oriented Programming)面向切面编程，一种编程范式
    作用：在不惊动原始设计的基础上为方法进行功能增强
    
    核心概念
        代理（Proxy）：SpringAOP的核心本质是采用代理模式实现的
        连接点（JoinPoint）：在SpringAOP中，理解为任意方法的执行
        切入点（Pointcut）：匹配连接点的式子.
        通知（Advice）：若干个方法的共性功能，在切入点处执行，最终体现为一个方法
        切面（Aspect）：描述通知与切入点的对应关系
        目标对象（Target）：被代理的原始对象成为目标对象
# 切入点表达式
 
动作关键字(访问修饰符 返回值 包名.类/接口名.方法名（参数）异常名)
`execution(void org.example.service.*Service.*(..))`



# advise 通知类型
```java
public class ClassName {
    public Object methodName(Object... obj){
        // 代码1
        try{
            // 代码2
            // 原始业务操作
            // 代码3
        } catch (Exception e){
            // 代码 4
        }
    }
    // 代码5
}
```


(1)前置通知(Before)，追加功能到方法执行前,类似于在代码1或者代码2添加内容

(2)后置通知(after),追加功能到方法执行后,不管方法执行的过程中有没有抛出异常都会执行，类似于在代码5添加内容

(3)返回后通知(AfterReturning),追加功能到方法执行后，只有方法正常执行结束后才进行,类似于在代码3添加内容，如果方法执行抛出异常，返回后通知将不会被添加

(4)抛出异常后通知,追加功能到方法抛出异常后，只有方法执行出异常才进行,类似于在代码4添加内容，只有方法抛出异常后才会被添加

(5)环绕通知(around),环绕通知功能比较强大，它可以追加功能到方法执行的前后，这也是比较常用的方式，它可以实现其他四种通知类型的功能

# 依赖
```xml
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.20.1</version>
<!--    <scope>runtime</scope>-->
</dependency>
```
