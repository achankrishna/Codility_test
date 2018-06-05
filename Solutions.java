package com.codility.startup;
import com.codility.Animals.*;
import com.codility.Annimals.birds.Chicken;
import com.codility.Annimals.birds.Duck;

public class Solutions {
		public static void main(String[] args) {
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			bird.sing();
			Duck d = new Duck();
			d.setSound("Quack, quack");
			d.sing();
			d.swim();
			Chicken chik = new Chicken();
			chik.setSound("Cluck, Cluck");
			chik.sing();
		}
}
