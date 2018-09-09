package com.spring.IoC.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringMainFactory {
	public static void main(String[] args){
		
		//BeanFactory  factory = new XmlBeanFactory(new ClassPathResource("Beans.xml")); //XmlBeanFactory��������
		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");//��ȡbeans.xml�����ļ�
		HelloWorldBean bean = (HelloWorldBean) factory.getBean("helloWorld");//ͨ��id��ȡbean����
		
		//bean.setMessage("Hi,Hello Spring");
		System.out.println(bean.getMessage());
	}
}