package com.demo;

public class Reversed_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am Iron man";
		System.out.println("Original String :- \n" + s);
		
		char c[] = s.toCharArray(); //CharArray is use to Break Each words into separate character. Like 'a','b','c'.
		
		String res = ""; // create Empty String where we will store reversed String.
	
		//Reversed the String Logic. 
		// running for loop in reverse direction.
		for(int i=c.length-1; i>=0;i--) {
			res = res + c[i];	
		}
		
		System.out.println("Reversed String :- \n" + res);
	
		
	}
}
