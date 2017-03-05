package com.renz.countdown;
/*
 * Recursion example
 * Jayson Mallari
 */

public class Countdown {
	
	public static void main(String[] args){
		countdown(20);
	}
	
	public static void countdown(int num){
		
		/*The function will end when this block is satisfied
		 * When the Value is 0
		 */
		if(num == 0){
			System.out.println("Blast OFF!");
		}
		else{
			//calling the function inside itself (recursion)
			System.out.println(num);
			countdown(num - 1);
		}
		
	}
}
