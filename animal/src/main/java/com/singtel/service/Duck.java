package com.singtel.service;

import org.springframework.stereotype.Component;

@Component
public class Duck extends Animal {

	
	public Duck() {
		SwimDecorator swimDecorator = new SwimDecorator(this);
		swimDecorator.swim();
		SingDecorator n = new SingDecorator(this, "Quack , quack");
		n.sing();
	}

}
