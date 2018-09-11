package com.spring.Aop.annontation.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean(name={"a1,a2,a3"})
	public A a(){
		return (new A());
	}
	
	@Bean(name="b")
	public B b(){
		return (new B());
	}
}
