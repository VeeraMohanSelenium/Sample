package com.Google;

public class ForEachSearch {
	public static void main(String[] args) {
		int nums[] = {6,8,3,4,2,1,};
		int val = 5;
		boolean found = false;
		for(int x:nums) {
			if(x == val) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("value found");

		else if(!found)
		System.out.println("Not found");
}

}