package com.singtel.service;

public class Cat extends Animal {

	public Cat() {
		FlyDecorator flyDecorator = new FlyDecorator(this);
		flyDecorator.fly();
		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();
		SingDecorator n = new SingDecorator(this, "abs...");
		n.sing();
	}

	public static void main(String[] args) {
		Animal duck = new Cat();
		System.out.println(duck);

	}

}
