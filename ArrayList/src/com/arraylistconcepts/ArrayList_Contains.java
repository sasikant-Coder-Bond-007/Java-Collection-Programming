package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Contains {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Guava");
		list.add("Grapes");
		list.add("Banana");
		list.add("Water Melon");
		
		System.out.println(list.contains("Guava"));       //true
		
		System.out.println(list.contains("Avacado"));    //false

	}

}
