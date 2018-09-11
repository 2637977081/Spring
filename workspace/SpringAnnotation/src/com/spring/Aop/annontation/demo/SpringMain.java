package com.spring.Aop.annontation.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		A a = (A) context.getBean(A.class);
		B b = new B();
		b.setUsername("admin");
		b.setPassword("123456");
		a.setB(b);
		System.out.println("Êä³ö:"+a.getB());
	}
}
