package com.spring.Aop.demoXML;

public class Log {
	public void before(){
		System.out.println("before之前");
	}
	public void after(){
		System.out.println("after之后");
	}
	
	public void afterReturning(Object result){
		System.out.println("afterReturning:"+result);
	}
	
	public void afterThrowing(Exception exception){
		System.out.println("afterThrowing:"+exception.toString());
	}
}
