package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component  // 通知类必须配置成Spring管理的bean
@Aspect  // 设置当前类为切面类(通知类)
public class AdviceClass {

    @Pointcut("execution(void org.example.dao.BookDao.save())")  // 精确匹配一个接口中的 save()
    private void beforePt(){}  // 定义一个空方法

//    @Before("AdviceClass.beforePt()")  // 在切入点 beforePt() 的前面运行当前操作（前置通知）
    @Before("beforePt()")  // 同一个类中可以隐藏类名
//    public void before(){  // 可以不注入参数 jp
    public void before(JoinPoint jp){
        System.out.println("-------------- before ----------------");
        Signature signature = jp.getSignature();
        System.out.println("signature: " + signature);  // void org.example.dao.BookDao.save()
        String className = signature.getDeclaringTypeName();  // 通过签名获取执行操作名称(接口名)
        String methodName = signature.getName();  // 通过签名获取执行操作名称(方法名)
        System.out.println("className: " + className);
        System.out.println("methodName: " + methodName);
        Object [] obs = jp.getArgs();  // 获取参数列表
        System.out.println("getArgs: " + Arrays.asList(obs));
        System.out.println("-------------- before ----------------");
    }

    @Pointcut("execution(* org.example.dao.BookDao.*d*(..)) ")  // .. 表示任意数量的参数
    private void aroundPt(){}

    @Around("aroundPt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------around----------------");
        Long startTime = System.currentTimeMillis();
        /*
        // 这里可以修改原方法传入的参数
        Object [] obj = pjp.getArgs()
        obj[0] = ..;
        pjp.proceed(obj);
         */

        Object ret = pjp.proceed();
        System.out.printf("%s 消耗时间：%d\n", pjp.getSignature(), System.currentTimeMillis()-startTime);
        System.out.println("--------------around----------------");
        return ret;  // 这里可以修改返回值
    }

    @Pointcut("execution(* org..selectByName(String, Boolean))")  // .. 匹配org包下的任意包中的所有名称为 selectByName 的方法
    void afterPt(){}

//    @AfterReturning("afterPt()")  // 原方法失败时不生效
    @After("afterPt()")  // 原方法失败时也生效
//    void after(JoinPoint pt)  // 可以注入参数 jp
    void after(JoinPoint jp){
        System.out.println("--------------after----------------");
        System.out.println("--------------after----------------");
    }


    @Pointcut("execution(* org.*.*.*Dao.selectByName(..))")
    void modifyArgsPt(){}

    @Around("modifyArgsPt()")
    Object modifyArgs(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------around: modifyArgs----------------");
        Object [] args = pjp.getArgs();
        args[0] = args[0] +  " modifyArgs";
        Object ret = pjp.proceed(args);
        System.out.println("--------------around: modifyArgs----------------");
        return ret;
    }
}
