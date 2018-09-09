package com.spring.IoC.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainContext {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); //获取beans.xml配置文件
		
		HelloWorldBean bean = (HelloWorldBean) context.getBean("helloWorld");//通过id获取bean对象
		
		//bean.setMessage("Hi,Hello Spring");
		System.out.println(bean.getMessage());
	}
}
