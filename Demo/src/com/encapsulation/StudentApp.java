package com.encapsulation;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String gender;
	
	// set methods for name, age, gender.
	public void setData(String n,int a,String g) {
		name = n;
		age = a;
		gender =g;
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

public class StudentApp {

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
		
		Student s1 = new Student();
		s1.setData(s, a, g);
		System.out.println("Your Name is :- " + s1.getName());
		System.out.println("Your Age is :- " + s1.getAge());
		System.out.println("Your Gender is :- " + s1.getGender());
		
		sc.close();
	}

}


