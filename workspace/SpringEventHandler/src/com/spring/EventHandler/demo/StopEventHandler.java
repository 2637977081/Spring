package com.spring.EventHandler.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextStoppedEvent;

@Configurable
public class StopEventHandler implements ApplicationListener<ContextStoppedEvent>{
	@Bean
	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("ContextStoppedEvent÷¥––");
		
	}

}
