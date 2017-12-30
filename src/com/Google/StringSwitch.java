package com.Google;

public class StringSwitch {
	public static void main(String[] args) {
		String str = "ten";
		switch(str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
			default:
				System.out.println("not matched");
				break;
		}
	}

}
