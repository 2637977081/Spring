package com.spring.IoC.example;

public class HelloWorldBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 public void init(){
		 System.out.println("Bean-init.");
	 }
	 public void destroy(){
		 System.out.println("Bean-destroy");
	 }
}
