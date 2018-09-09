package com.spring.IoC.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringMainFactory {
	public static void main(String[] args){
		
		//BeanFactory  factory = new XmlBeanFactory(new ClassPathResource("Beans.xml")); //XmlBeanFactory方法过期
		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");//获取beans.xml配置文件
		HelloWorldBean bean = (HelloWorldBean) factory.getBean("helloWorld");//通过id获取bean对象
		
		//bean.setMessage("Hi,Hello Spring");
		System.out.println(bean.getMessage());
	}
}
