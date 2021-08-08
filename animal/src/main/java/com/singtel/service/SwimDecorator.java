package com.singtel.service;

public class SwimDecorator extends AnimalDecorator {

	private Animal animal;
	public SwimDecorator(Animal animal) {
		super(animal);
		this.animal=animal;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void swim() {
		System.out.println("swim");		
		animal.canSwim=true;
	}

}
