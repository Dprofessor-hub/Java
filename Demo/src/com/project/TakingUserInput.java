package com.project;

import java.util.Scanner;

public class TakingUserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your Name :- ");
		String name = sc.nextLine(); // for taking whole sentance from user. 

		
		System.out.println("Please Enter your Age :- ");
		int age = sc.nextInt();

		
		sc.nextLine(); // if we are using string after using primitive data type than we have to use sc.nextline for using string data type.
		System.out.println("Please Enter your Gender :- ");
		String gender = sc.nextLine();  // for only taking single word for questions. If we only use next user cannot type more than 1 word.

		
		System.out.println("Please Enter your Mobile Number :- ");
		String number = sc.nextLine();

	
		System.out.println("Please Enter your Address :- ");
		String address = sc.nextLine();

		
		System.out.println("Please Enter your College Id Number :- ");
		int collegeId = sc.nextInt();

		
		sc.nextLine();
		System.out.println("Enter your College Name :- ");
		String collegeName	= sc.nextLine();

		
		System.out.println("Please Enter your Adhar Number :-");
		int adharNumber = sc.nextInt();

		
		sc.nextLine();
		System.out.println("Please Enter your Email id :- ");
		String emailId = sc.nextLine();

		
		System.out.println("Please Enter your Caste :- ");
		String caste = sc.nextLine();
		
		
		// Printing User Detail after Filling Form data. 
		System.out.println("User Details :- ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(number);
		System.out.println(address);
		System.out.println(collegeId);
		System.out.println(collegeName);
		System.out.println(adharNumber);
		System.out.println(emailId);
		System.out.println(caste);
		
		
	}

}
