package com.Google;

public class ForEachNested {
	public static void main(String[] args) {
		 //Two Dimensional Array
		int[][] twoDArray = {{1,2,3,4},{4,3,2,1}};
		
		//iterating every element of twoarray using for-each loop
		for(int[] oneDArray : twoDArray){
			System.out.print("[");
			
			//iterating every element of onDArray using for-each loop
			for(int i:oneDArray) {
				System.out.print(i+"\t");
			}
			System.out.println("]");
		}
		
	}

}
