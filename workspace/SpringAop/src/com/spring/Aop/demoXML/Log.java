package com.spring.Aop.demoXML;

public class Log {
	public void before(){
		System.out.println("before֮ǰ");
	}
	public void after(){
		System.out.println("after֮��");
	}
	
	public void afterReturning(Object result){
		System.out.println("afterReturning:"+result);
	}
	
	public void afterThrowing(Exception exception){
		System.out.println("afterThrowing:"+exception.toString());
	}
}