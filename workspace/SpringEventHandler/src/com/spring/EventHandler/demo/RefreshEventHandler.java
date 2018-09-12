package com.spring.EventHandler.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;

@Configurable
public class RefreshEventHandler implements ApplicationListener<ContextRefreshedEvent>{
	@Bean
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		System.out.println("ContextRefreshedEvent÷¥––");
		
	}
	
}
