package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Add {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Mukesh");
		names.add("Suresh");
		names.add("Ramesh");
		
		System.out.println(names);
		
		//names.forEach(System.out::println);
		
		//names.forEach(p -> System.out.println(p));

	}

}
