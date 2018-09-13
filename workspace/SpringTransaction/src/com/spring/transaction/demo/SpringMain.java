package com.spring.transaction.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserJdbcTemplate ujt = (UserJdbcTemplate) context.getBean("userJdbcTemplate");
		System.out.println("--------��һ�β�ѯ���ݿ�-----------");
		System.out.println(ujt.queryAll().toString());
		
		System.out.println("---------����ִ��-----------");
		ujt.update(2);
		System.out.println("--------�ڶ��β�ѯ���ݿ�-----------");
		System.out.println(ujt.queryAll().toString());
		
		System.out.println("---------����ִ��-----------");
		ujt.update(3);
		System.out.println("--------�ڶ��β�ѯ���ݿ�-----------");
		System.out.println(ujt.queryAll().toString());
		
	}
}
