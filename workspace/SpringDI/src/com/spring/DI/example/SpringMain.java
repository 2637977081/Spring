package com.spring.DI.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] arg){
		
		System.out.println("-------��ȡbeans1�ļ�---------");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans1.xml");
		
		System.out.println("----���캯������ע��------");
		AConstructor ac =(AConstructor) context1.getBean("AConstructor");
		ac.aConstructorSpeack();
		
		System.out.println("-------��ȡbeans2�ļ�---------");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans2.xml");
		
		System.out.println("----get/set����ע��------");
		AFunction af = (AFunction) context2.getBean("AFunction");
		af.aFunctionSpeack();
		
		System.out.println("-------��ȡbeans3�ļ�---------");
		ApplicationContext context3 = new ClassPathXmlApplicationContext("Beans3.xml");
		
		System.out.println("----get/set����ע��------");
		AFunction af1 = (AFunction) context3.getBean("AFunction");
		af.aFunctionSpeack();
		
		System.out.println("-------��ȡbeans4�ļ�---------");
		ApplicationContext context4 = new ClassPathXmlApplicationContext("Beans4.xml");
		
		System.out.println("----��������ע��------");
		JavaCollection js = (JavaCollection) context4.getBean("JavaCollection");
		System.out.println("list"+js.getList());
		System.out.println("map"+js.getMap());
		System.out.println("set"+js.getSet());
		System.out.println("properties"+js.getProperties());
	}
}