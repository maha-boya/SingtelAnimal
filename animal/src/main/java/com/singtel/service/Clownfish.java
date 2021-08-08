package com.singtel.service;

public class Clownfish extends SwimmingAnimals {

	public Clownfish() {

		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();

	}

	public static void main(String[] args) {
		Animal duck = new Clownfish();
		System.out.println(duck);

	}

	@Override
	void size() {
		System.out.println("small");
	}

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("orange");

	}

	void jokes() {
		System.out.println("jokes");

	}

}
