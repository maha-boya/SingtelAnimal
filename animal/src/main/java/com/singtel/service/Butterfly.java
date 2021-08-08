package com.singtel.service;

public class Butterfly extends Animal {

	public Butterfly() {
		FlyDecorator flyDecorator = new FlyDecorator(this);
		flyDecorator.fly();
	}

	public static void main(String[] args) {
		Animal duck = new Butterfly();
		System.out.println(duck);

	}

}
