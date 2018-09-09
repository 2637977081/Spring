package com.spring.DI.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] arg){
		
		System.out.println("-------读取beans1文件---------");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans1.xml");
		
		System.out.println("----构造函数依赖注入------");
		AConstructor ac =(AConstructor) context1.getBean("AConstructor");
		ac.aConstructorSpeack();
		
		System.out.println("-------读取beans2文件---------");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans2.xml");
		
		System.out.println("----get/set依赖注入------");
		AFunction af = (AFunction) context2.getBean("AFunction");
		af.aFunctionSpeack();
		
		System.out.println("-------读取beans3文件---------");
		ApplicationContext context3 = new ClassPathXmlApplicationContext("Beans3.xml");
		
		System.out.println("----get/set依赖注入------");
		AFunction af1 = (AFunction) context3.getBean("AFunction");
		af.aFunctionSpeack();
		
		System.out.println("-------读取beans4文件---------");
		ApplicationContext context4 = new ClassPathXmlApplicationContext("Beans4.xml");
		
		System.out.println("----集合依赖注入------");
		JavaCollection js = (JavaCollection) context4.getBean("JavaCollection");
		System.out.println("list"+js.getList());
		System.out.println("map"+js.getMap());
		System.out.println("set"+js.getSet());
		System.out.println("properties"+js.getProperties());
	}
}
