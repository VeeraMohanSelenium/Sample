package com.Google;

import java.util.ArrayList;

public class ForEachCollection {
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<String>();
		
		//Adding elements to ArrayList
		
		List.add("First");
		List.add("Second");
		List.add("Third");
		List.add("Fourth");
		List.add("Fifth");
		List.add("Sixth");
		for(String Str:List) {
			System.out.println(Str);
		}
	}

}
