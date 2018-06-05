package com.codility.fish;

import com.codility.Animals.Fish;

public class Shark extends Fish{
	
	private Long size;
	private String color;
	
	public void eat(){
		System.out.println("Shark can eat other fish");
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
