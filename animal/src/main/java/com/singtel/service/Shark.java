package com.singtel.service;

public class Shark  extends SwimmingAnimals {

	public Shark() {

		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();

	}

	public static void main(String[] args) {
		Animal duck = new Clownfish();
		System.out.println(duck);

	}

	@Override
	void size() {
		System.out.println("large");
	}

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("grey");

	}

	
	void eat() {
		System.out.println("eat");
		
	}	
}
