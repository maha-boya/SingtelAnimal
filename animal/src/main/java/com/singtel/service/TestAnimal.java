package com.singtel.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(ParrotSounds.DOG),
				new Clownfish(), new Shark(), new Clownfish(), new Dolhpin(), new Dog(), new Butterfly(), new Cat() };

		Map<String, Integer> result = new HashMap();
		Arrays.stream(animals).forEach(o -> {

			if (o.canFly) {
				int d = result.getOrDefault("Fly", 1);
				result.put("Fly", d + 1);
			} else if (o.canSing) {
				int d = result.getOrDefault("Sing", 1);
				result.put("Sing", d + 1);
			} else if (o.canSwim) {
				int d = result.getOrDefault("Swim", 1);
				result.put("Swim", d + 1);
			} else if (o.canWalk) {
				int d = result.getOrDefault("Walk", 1);
				result.put("Walk", d + 1);
			}
		});

		System.out.println("Count of each Action::" + result);
	}

}
