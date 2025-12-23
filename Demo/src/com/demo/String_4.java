package com.demo;

public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Arsh";
		String S2 = "arsh"; 
		
		//reference are not equal and also value are also are not equal.
		// beacuse arsh != Arsh.
		
		if(S1==S2) {
			System.out.println("Refereance are Equals");
		}
		else {
			System.out.println("refereance are not Equals");
		}
		if(S1.equals(S2)) {
			System.out.println("Values are equals");
		}
		else {
			System.out.println("Values are equals");	
		}

	}

}
