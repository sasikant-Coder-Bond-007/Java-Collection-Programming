package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class SimpleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		//Iterator<Integer> iterator = list.iterator();
		ListIterator<Integer> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.print("["+iterator.next()+"] ");
		}

	}

}
