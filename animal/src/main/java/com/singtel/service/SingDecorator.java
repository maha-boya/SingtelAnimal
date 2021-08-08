package com.singtel.service;

public class SingDecorator extends AnimalDecorator {
private String sound;
private Animal  animal;
	public SingDecorator(Animal animal) {
		super(animal);
		this.animal=animal;
		// TODO Auto-generated constructor stub
	}
	
	public SingDecorator(Animal animal, String sound) {
		super(animal);
		this.animal=animal;
		this.sound=sound;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String sing() {
		System.out.println(this.sound!=null?sound: "sing");
		this.animal.canSing=true;
		this.animal.sing= this.sound;
		return this.sound;
	}

}
