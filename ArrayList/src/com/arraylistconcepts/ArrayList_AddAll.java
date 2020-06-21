package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_AddAll {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Mukesh");
		
		List<String> person = new ArrayList<String>();
		
		person.add("Jai");
		person.add("Veeru");
		
		person.addAll(2, names);
		
		System.out.println(person);

	}

}
