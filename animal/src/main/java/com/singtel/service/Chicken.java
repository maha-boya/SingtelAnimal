package com.singtel.service;

import org.springframework.stereotype.Component;

@Component
public class Chicken extends Animal {

	public Chicken() {
		WalkDecorator walkDec = new WalkDecorator(this);
		walkDec.walk();
		SingDecorator singDec = new SingDecorator(this, "Cluck, cluck");
		singDec.sing();
	}

}
