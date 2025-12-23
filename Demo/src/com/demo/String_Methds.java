package com.demo;

public class String_Methds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Arsh Sing";
		// Method to convert string to different forms.
		System.out.println(S1.toUpperCase());
		System.out.println(S1.toLowerCase());
		
		// This method don't change original string S1 because it is Immutable String.
		// Immutable String are not changeable.
		
		System.out.println(S1.contains("Ar")); // to check that it contain "Ar" in S1 or not.
		System.out.println(S1.indexOf("h")); // to check index of character in S1.
		System.out.println(S1.substring(3)); // to print Sentance after the index given by user.
		System.out.println(S1.substring(0,1)); // to print selected part so give range for that.
		
		System.out.println(S1.charAt(3)); // to print character for given index.
		
	}
}
