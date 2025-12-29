package com.string;

public class Signature {

	 public static void main(String... args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World 1!");
		
		// how we can call other main methods in main methods.
		// calling 1st integer main methods.
		int a[]= {10,20,30,40};
		main(a);
		
		//  calling 2nd float method in  main methods.
		float b[]= {10.0f,20.20f,30.22f,40.33f};
		main(b);
	}
	 
	 public static void main(float [] args) {
			// TODO Auto-generated method stub
			System.out.println("Hello World 2!");
		} 

	 public static void main(int [] args) {
			// TODO Auto-generated method stub
			System.out.println("Hello World 3!");
		} 

	 public static void main(char [] args) {
			// TODO Auto-generated method stub
			System.out.println("Hello World 4!");
		} 
}
	



// Signature which are allowed while declaring main method in Java.
// String [] args
// String args []
// String ... args
// static public void main(String... args)
// final synchronized public static void main(String... args)

// Methods can be overload by changing data type of array.