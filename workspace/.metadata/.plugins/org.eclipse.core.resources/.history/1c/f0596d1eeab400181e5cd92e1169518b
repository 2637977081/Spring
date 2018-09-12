package com.spring.EventHandler.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] agrs){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		A a = (A) context.getBean("A");
		System.out.println("--------"+a.getMessage()+"-----------");
		context.refresh();
		context.stop();
		context.close();
	}
}
