package com.demo;

public class Reversed_Sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Iron Man";
		System.out.println("Original string :- ");
		System.out.println(s);
		
		String[] words = s.split(" ");
		
		String result = "";
		
		for(int i = words.length-1 ; i>=0 ;i--) {
			result = result + words[i] + " ";
		} 
		System.out.println("Reversed String :- ");
		System.out.println(result);
	}

}
