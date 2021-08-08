package com.singtel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.service.Chicken;
import com.singtel.service.Duck;

@SpringBootTest
class AnimalApplicationTests {

	@Autowired
	private Duck duck;
	@Autowired 
	Chicken chicken;

	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void duckTest() {
		assertEquals("Quack , quack", duck.sing);
		assertEquals(true, duck.canSwim);
	}
	
	@Test
	void chickenTest() {
		assertEquals("Cluck, cluck", chicken.sing);
		assertEquals(true, chicken.canWalk);
	}
}
