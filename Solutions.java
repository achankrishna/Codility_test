package com.codility.startup;
import com.codility.Animals.*;
import com.codility.Annimals.birds.Chicken;
import com.codility.Annimals.birds.Duck;
import com.codility.Annimals.birds.Rooster;
import com.codility.fish.ClownFish;
import com.codility.fish.Shark;
import com.codility.services.Animal;

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
			
			//Chicken chiken = new Rooster();
			//roost.setSound("Cock-a-doodle-doo");
			
			//problem B
			
			Shark shr = new Shark();
			shr.setColor("grey");
			ClownFish cln = new ClownFish();
			cln.setColor("orange");
			cln.makeJokes();
			
			//Problem D
			Bird btrfly = new Butterfly();
			btrfly.fly();
			Animal cater = new Catterpillar();
			cater.walk();
			}
}
