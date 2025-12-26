package com.encapsulation;

import java.util.Scanner;

public class ShadowingProblemSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the student Name :-");
		String s = sc.nextLine();
		
		System.out.println("Please Enter the student age :-");
		int a = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Please Enter the student gender :-");
		String g = sc.nextLine();
		
		Student13 s1 = new Student13();
		s1.setData(s, a, g);
		System.out.println("Your Name is :- " + s1.getName());
		System.out.println("Your Age is :- " + s1.getAge());
		System.out.println("Your Gender is :- " + s1.getGender());
		
		sc.close();

	}

}


// this. keyword is a temporary storage to store the location of current object.
// if we move to next line the this keyword is deleted and we can't access current object.
// while using constructor we need to use this keyword as it give access to instance variable of that object.
// so we don't get null values and we can set values in object. 

class Student13{
	private String name;
	private int age;
	private String gender;
	
	// set methods for name, age, gender.
	public void setData(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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
