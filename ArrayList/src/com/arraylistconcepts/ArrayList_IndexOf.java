package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_IndexOf {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		
		players.add("Rohit Sharma");
		players.add("Virat Kohli");
		players.add("Mahendra Singh Dhoni");
		players.add("Shikhar Dhawan");
		players.add("Hardik Pandya");
		players.add("Lokesh Rahul");
		players.add("Rishabh Pant");
		players.add("Ravindra Jadeja");
		players.add("Bhuvaneshwar Kumar");
		players.add("Jasprit Bumrah");
		players.add("Yuzvendra Chahal");
		
		int firstIndex = players.indexOf("Mahendra Singh Dhoni");
		
		System.out.println(firstIndex);             //2
		
		firstIndex = players.indexOf("Sachin Tendulkar");
		
		System.out.println(firstIndex);          //-1
	}

}
