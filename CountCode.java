package com.codility.Animals;

import java.lang.reflect.Method;
import java.util.HashMap;

import java.util.*;

import com.codility.Annimals.birds.Chicken;
import com.codility.Annimals.birds.Duck;
import com.codility.Annimals.birds.Parrot;
import com.codility.Annimals.birds.Rooster;
import com.codility.fish.ClownFish;
import com.codility.fish.Shark;
import com.codility.services.Animal;

public class CountCode {
	
	public static void main(String[] args){
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Catterpillar(),
				new Butterfly()
				};
		String [] methods = new String[]{"fly", "walk", "sing", "swim"};
		HashMap hm = new HashMap();
		int count =0;
		for(int i=0;i<animals.length;i++){
			for(String s : methods){
				try{
				Method presents = animals[i].getClass().getMethod(s);
				if(!presents.equals(null) && !presents.equals("")){
					hm.put(s, count+1);
				}
				}catch(Exception e){
				}
			}
			count=0;
		}
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			 Map.Entry pair = (Map.Entry)it.next();
		     System.out.println(pair.getKey() + " = " + pair.getValue());
		     //it.remove();
		}
	}
	
}
