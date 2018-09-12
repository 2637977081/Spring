package com.spring.Aop.demoXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansXML.xml");
		User user = (User) context.getBean("user");
		System.out.println("-----------------------------");
		//User user = new User();
		user.getUsername();
		System.out.println("-----------------------------");
		user.getPassword();
		System.out.println("-----------------------------");
		user.setUsername("admin1");
		System.out.println("-----------------------------");
		user.setPassword("123451");
		System.out.println("-----------------------------");
		user.getUsername();
		System.out.println("-----------------------------");
		user.getPassword();
	}
}
