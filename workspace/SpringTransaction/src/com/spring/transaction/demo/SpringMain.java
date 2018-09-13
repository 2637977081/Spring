package com.spring.transaction.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserJdbcTemplate ujt = (UserJdbcTemplate) context.getBean("userJdbcTemplate");
		System.out.println("--------第一次查询数据库-----------");
		System.out.println(ujt.queryAll().toString());
		
		System.out.println("---------正常执行-----------");
		ujt.update(2);
		System.out.println("--------第二次查询数据库-----------");
		System.out.println(ujt.queryAll().toString());
		
		System.out.println("---------错误执行-----------");
		ujt.update(3);
		System.out.println("--------第二次查询数据库-----------");
		System.out.println(ujt.queryAll().toString());
		
	}
}
