package com.spring.autowire.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		System.out.println("------�Զ�ע��byName----------");
		ApplicationContext  context1 = new ClassPathXmlApplicationContext("Beans1.xml");
		A a1 = (A) context1.getBean("A");
		System.out.println(a1.getStr());
		
		System.out.println("------�Զ�ע��byType----------");
		ApplicationContext  context2 = new ClassPathXmlApplicationContext("Beans2.xml");
		A a2 = (A) context2.getBean("A");
		System.out.println(a2.getStr());
		
		System.out.println("------�Զ�ע�빹�캯��----------");
		ApplicationContext  context3 = new ClassPathXmlApplicationContext("Beans3.xml");
		A a3 = (A) context3.getBean("A");
		System.out.println(a3.getStr());
		
	}
}
