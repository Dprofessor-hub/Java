package com.demo;

 class Student {

		// TODO Auto-generated method stub
		String name;
		int age;
		String gender;
		
		void study() {
			System.out.println();
		
		}

	}

 public class StudentApp {
	public static void main(String[] args) {
		Student S1 = new Student();
		System.out.println("Before Assigning  the values");
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.gender);
		
		System.out.println("After Assigning the values");
		S1.name ="Arsh";
		S1.age = 25;
		S1.gender = "Male";
		
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.gender);
	}
	
}
