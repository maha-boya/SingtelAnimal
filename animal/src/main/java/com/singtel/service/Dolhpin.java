package com.singtel.service;

public class Dolhpin extends SwimmingAnimals {

	public Dolhpin() {

		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();
		SingDecorator n = new SingDecorator(this, "abs...");
		n.sing();
	}

	public static void main(String[] args) {
		Animal duck = new Dolhpin();
		System.out.println(duck);

	}

	@Override
	void size() {
		// TODO Auto-generated method stub

	}

	@Override
	void color() {
		// TODO Auto-generated method stub

	}

}
