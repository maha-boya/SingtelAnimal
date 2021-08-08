package com.singtel.service;

public class Dog extends Animal {

	public Dog() {
		FlyDecorator flyDecorator = new FlyDecorator(this);
		flyDecorator.fly();
		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();
		SingDecorator n = new SingDecorator(this, "abs...");
		n.sing();
	}

	public static void main(String[] args) {
		Animal duck = new Dog();
		System.out.println(duck);

	}

}
