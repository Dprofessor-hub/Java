package com.encapsulation;

import java.util.Scanner;

public class ShadowingProblemApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the student Name :-");
		String s = sc.nextLine();
		
		System.out.println("Please Enter the student age :-");
		int a = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Please Enter the student gender :-");
		String g = sc.nextLine();
		
		Student12 s1 = new Student12();
		s1.setData(s, a, g);
		System.out.println("Your Name is :- " + s1.getName());
		System.out.println("Your Age is :- " + s1.getAge());
		System.out.println("Your Gender is :- " + s1.getGender());
		
		sc.close();

	}

}


class Student12{
	private String name;
	private int age;
	private String gender;
	
	// set methods for name, age, gender.
	public void setData(String name,int age,String gender) {
		name = name;
		age = age;
		gender = gender;
	}
	
	// getter methods for name.
	public String getName() {
		return name;
	}
	
	// getter methods for age.
	public int getAge() {
		return age;
	}
		
	// getter methods for Gender.
	public String getGender() {
		return gender;
	}
	
}
// output null,0,null.
