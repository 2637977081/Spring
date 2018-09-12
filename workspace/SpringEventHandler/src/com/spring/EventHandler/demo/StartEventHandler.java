package com.spring.EventHandler.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextStartedEvent;
@Configurable
public class StartEventHandler implements ApplicationListener<ContextStartedEvent>{
	@Bean
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("--------ContextStartedEvent÷¥––------------");
		
	}
}
