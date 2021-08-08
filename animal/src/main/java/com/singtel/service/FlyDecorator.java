package com.singtel.service;

public class FlyDecorator extends AnimalDecorator {

	private Animal animal;
	public FlyDecorator(Animal animal) {
		super(animal);
		this.animal=animal;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fly() {
		System.out.println("Fly");
		animal.canFly=true;
	}

}
