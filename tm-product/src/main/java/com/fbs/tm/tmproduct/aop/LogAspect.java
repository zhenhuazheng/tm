package com.fbs.tm.tmproduct.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 日志切面
 */
@Aspect
@Component
public class LogAspect {

    //切点
    @Pointcut("@annotation(com.fbs.tm.tmproduct.aop.LogAction)")
    public void annotationPointCut(){};

    //捕捉切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LogAction action = method.getAnnotation(LogAction.class);
        System.out.println("" + action.monitor());
    }

    //捕捉方法
    //@Before("execution(*.service.*(..)))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("" + method.getName());
    }





}
