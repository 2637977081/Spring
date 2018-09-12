package com.spring.EventHandler.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;

@Configurable

public class ClosedEventHandler implements ApplicationListener<ContextClosedEvent>{
	
	@Bean
	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		System.out.println("ContextClosedEvent÷¥––");
	}
	
}
