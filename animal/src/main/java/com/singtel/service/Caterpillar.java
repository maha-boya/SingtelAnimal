package com.singtel.service;

public class Caterpillar extends Animal {

	public Caterpillar() {
		WalkDecorator walkDecorator = new WalkDecorator(this);
		walkDecorator.walk();
	}

}
