package com.singtel.service;

public class Rooster  extends Animal {

	public Rooster() {
		FlyDecorator flyDecorator=new FlyDecorator(this);
		flyDecorator.fly();
		SwimDecorator swimDecorator=new SwimDecorator(this);
		swimDecorator.swim();
		SingDecorator n = new SingDecorator(this,"abs...");
		n.sing();
	}
	
	

	public static void main(String[] args) {
		Animal duck=new Rooster();
		System.out.println(duck);
		
	}
	
}
