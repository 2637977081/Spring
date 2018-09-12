package com.spring.EventHandler.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@Configurable
public class OnApplicationEvent implements ApplicationListener<ApplicationEvent>{
	@Bean
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("----------ApplicationEvent÷¥––------");
		
	}
}
