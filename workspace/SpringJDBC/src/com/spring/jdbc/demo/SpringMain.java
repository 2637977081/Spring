package com.spring.jdbc.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("JDBCBeans.xml");
		UserJdbcTemplate ujt = (UserJdbcTemplate) context.getBean("userJdbcTemplate");
		
		UserPO user = new UserPO();
		user.setUsername("lg");
		user.setPassword("12345");
		int rownum = ujt.createUser(user);
		
		user.setUsername("zdj");
		user.setPassword("12345");
		rownum += ujt.createUser(user);
		
		user.setUsername("zh");
		user.setPassword("12345");
		rownum += ujt.createUser(user);
		System.out.println("����������"+rownum);
		
		List<UserPO> list = ujt.getUserListAll();
		for(UserPO u : list){
			System.out.println(u.toString());
		}
		System.out.println("----------------");
		user.setId(1);
		user.setUsername("hm");
		rownum = ujt.updateUserById(user);
		user = ujt.getUserById(1);
		System.out.println(user);
	}
}
