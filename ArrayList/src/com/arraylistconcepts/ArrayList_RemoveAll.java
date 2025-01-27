package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_RemoveAll {

	public static void main(String[] args) {
		ArrayList<String> alphabets = new ArrayList<String>(Arrays.asList("A","D","B","C","D","D","E","F","D","G","H","D","I","J","D"));
		
		System.out.println(alphabets);
		
		alphabets.removeAll(Collections.singleton("D"));
		
		System.out.println(alphabets);

	}

}
