package com.spring.DI.example;

public class AConstructor {
	private B b;
	public AConstructor(B b){
		System.out.println("AConstructor ���캯��");
		this.b = b;
	}
	
	public void aConstructorSpeack(){
		b.bSpeack();
	}
	
}
