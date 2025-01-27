package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove {

	public static void main(String[] args) {
		ArrayList<String> alphabets = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K"));
		
		System.out.println(alphabets);
		
		alphabets.remove("D");
		alphabets.remove("H");
		
		System.out.println(alphabets);
		
		alphabets.remove("P");
		alphabets.remove("Z");
		
		System.out.println(alphabets);
	}

}
