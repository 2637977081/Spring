package com.spring.Aop.annontation.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	private String msg;
	@Autowired
	private B b;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
}
