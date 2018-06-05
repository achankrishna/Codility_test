package com.codility.Annimals.birds;

import com.codility.Animals.Bird;

public class Duck extends Bird{
	private String sound =null;
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void swim(){
		System.out.println("I can swim");
	}
}
