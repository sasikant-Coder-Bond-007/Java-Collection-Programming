package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForEach {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		
		players.add("ROHIT SHARMA");
		players.add("VIRAT KOHLI");
		players.add("MAHENDRA SINGH DHONI");
		players.add("SHIKHAR DHAWAN");
		players.add("HARDIK PANDYA");
		players.add("LOKESH RAHUL");
		players.add("RISHABH PANT");
		players.add("RAVINDRA JADEJA");
		players.add("BHUVANESHWAR KUMAR");
		players.add("JASPRIT BUMRAH");
		players.add("YUZVENDRA CHAHAL");
		
		players.forEach(names -> printPlayersNamesToloweCase(names));
		
		
	}

	private static void printPlayersNamesToloweCase(String names) {
		System.out.println(names.toLowerCase());
	}

}
