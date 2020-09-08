package cn.ctgu.firstdemo.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Pointcut("execution(* cn.ctgu.firstdemo.spring..*.*(..))")
    public void myPointCut(){

    }

    @Before("myPointCut()")
    public void beforeTest(){
        System.out.println("方法执行前do！");

    }
}
