package com.Google;

public class SwitchSeason {
	public static void main(String[] args) {
		int month = 4;
		String season;
		switch(month) {
		case 12:
		case 1:
		case 2:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="summer";
			break;
		case 6:
		case 7:
		case 8:
			season="rainy";
			break;
		case 9:
		case 10:
		case 11:
			season="spring";
			break;
			default:
				season="Bogus month";
						}
		System.out.println(" season is "+ season);
	}

}
