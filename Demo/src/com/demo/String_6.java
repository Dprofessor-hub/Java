package com.demo;

public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Md ";
		String S2 = "Arsh"; 
		
		String S3 = S1.concat(S2);
		System.out.println(S3);
		String S4 = "Md Arsh";
		
		//reference are not equal and also value are also are not equal.
		// beacuse arsh != Arsh.
		
		if(S3==S4) {
			System.out.println("Refereance are Equals");
		}
		else {
			System.out.println("refereance are not Equals");
		}
		if(S3.equals(S4)) {
			System.out.println("Values are equals");
		}
		else {
			System.out.println("Values are equals");	
		}

	}

}
