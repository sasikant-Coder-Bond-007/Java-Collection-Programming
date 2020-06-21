package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_ToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Rohit");
		list.add("Virat");
		list.add("Mahendra");
		list.add("Shikhar");
		list.add("Hardik");
		list.add("Lokesh");
		list.add("Rishabh");
		list.add("Ravindra");
		list.add("Bhuvaneshwar");
		list.add("Jasprit");
		list.add("Yuzvendra");
		
		String array[] =  list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(array));
	}

}
