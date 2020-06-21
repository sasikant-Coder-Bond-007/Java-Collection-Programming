package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Clear {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Suresh");
		names.add("Rames");
		names.add("Mukesh");
		
		System.out.println(names);
		
		names.clear();
		
		System.out.println(names);

	}

}
