package com.spring.IoC.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainContext {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); //��ȡbeans.xml�����ļ�
		
		HelloWorldBean bean = (HelloWorldBean) context.getBean("helloWorld");//ͨ��id��ȡbean����
		
		//bean.setMessage("Hi,Hello Spring");
		System.out.println(bean.getMessage());
	}
}
