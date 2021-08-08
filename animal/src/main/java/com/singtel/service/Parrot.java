package com.singtel.service;

public class Parrot extends Animal {

	private ParrotSounds livingWith;

	public Parrot(ParrotSounds livingWith) {
		this.livingWith = livingWith;
		WalkDecorator walkDec = new WalkDecorator(this);
		walkDec.walk();

		SingDecorator singDec = new SingDecorator(this, livingWith.getSound());
		singDec.sing();

	}

}
