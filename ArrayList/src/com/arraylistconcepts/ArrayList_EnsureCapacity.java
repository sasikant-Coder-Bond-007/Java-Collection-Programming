//Java program to use ensureCapacity() method to increase the size of an arraylist after it’s initialization.
package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_EnsureCapacity {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		
		players.add("Rohit Sharma");
		players.add("Shikhar Dhawan");
		players.add("Virat Kohli");
		players.add("Mahendra Sigh Dhoni");
		players.add("Ravindra Jadeja");
		
		System.out.println(players);
		
		((ArrayList<String>) players).ensureCapacity(20);
		
		players.add("Lokesh Rahul");
		players.add("Rishabh Pant");
		players.add("Hardik Pandya");
		players.add("Jasprit Bumrah");
		players.add("Bhavaneshwar Kumar");
		players.add("Yuzvendra Chahal");
		
		System.out.println(players);
	}

}
