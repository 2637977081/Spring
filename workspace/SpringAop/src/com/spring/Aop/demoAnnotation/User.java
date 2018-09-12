package com.spring.Aop.demoAnnotation;


public class User {
	private String username;
	private String password;
	public String getUsername() {
		System.out.println("getUsername:"+username);
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername:"+username);
		this.username = username;
	}
	public String getPassword() {
		System.out.println("getPassword:"+password);
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword:"+password);
		this.password = password;
	}
	
}
