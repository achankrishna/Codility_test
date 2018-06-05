package com.codility.Annimals.birds;

import com.codility.Animals.Bird;

public class Chicken extends Bird{
	private String sound;
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public void sing(String song){
		System.out.println(song);
	}
}
