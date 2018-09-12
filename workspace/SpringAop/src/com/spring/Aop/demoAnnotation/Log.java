package com.spring.Aop.demoAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {
	
	@Pointcut("execution(* com.spring.Aop.demoAnnotation.User.*(..))")
	public void logging(){System.out.println("pointcut切入点");}
	
	@Before("logging()")
	public void before(){
		System.out.println("before之前");
	}
	@After("logging()")
	public void after(){
		System.out.println("after之后");
	}
	@AfterReturning(pointcut="logging()", returning="result")
	public void afterReturning(Object result){
		System.out.println("afterReturning:"+result);
	}
}
