package com.singtel.service;

public class WalkDecorator extends AnimalDecorator {
private Animal animal;
	public WalkDecorator(Animal animal) {
		super(animal);
		this.animal=animal;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("walk");
		animal.canWalk=true;
	}

}
