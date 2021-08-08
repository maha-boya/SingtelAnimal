package com.singtel.service;

public abstract class AnimalDecorator extends Animal {
	Animal animal;

	public AnimalDecorator(Animal animal) {
		this.animal = animal;
	}

}
