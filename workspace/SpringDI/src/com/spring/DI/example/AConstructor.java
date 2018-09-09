package com.spring.DI.example;

public class AConstructor {
	private B b;
	public AConstructor(B b){
		System.out.println("AConstructor ¹¹Ôìº¯Êý");
		this.b = b;
	}
	
	public void aConstructorSpeack(){
		b.bSpeack();
	}
	
}
