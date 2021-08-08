package com.singtel.service;

public enum ParrotSounds {
	DOG("DOG","Woof, woof"),
	CAT("CAT","Me ow"),
	Rooster("ROOSTER","Cock-a-doodle-doo");

	private String type; 
	private String sound;
	
	ParrotSounds(String type, String sound){
	this.type=type;
	this.sound=sound;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	
}
