package com.demo;

public class String_intern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = new String("Deep");
		String S2 = S1.intern(); 
		
		String S3 = S1.intern();
		
		
		if(S2==S3) {
			System.out.println("Refereance are Equals");
		}
		else {
			System.out.println("refereance are not Equals");
		}
		if(S2.equals(S3)) {
			System.out.println("Values are equals");
		}
		else {
			System.out.println("Values are equals");	
		}

	}

}
