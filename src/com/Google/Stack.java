package com.Google;

public class Stack {
	int stck[] = new int[10];
	int tos;  //variable top of stack
	
	//initialize top of stack
	Stack() {
		tos = -1;
	}
	
	//push an item on to the stack
	void push(int item) {
		if(tos==9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
}
