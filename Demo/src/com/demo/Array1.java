package com.demo;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a[]= new int[5];
			
			System.out.println("Please Enter Marks of Student 1 :- ");
			a[0]= sc.nextInt();
			
			System.out.println("Please Enter Marks of Student 2 :- ");
			a[1]= sc.nextInt();
			
			System.out.println("Please Enter Marks of Student 3 :- ");
			a[2] = sc.nextInt();
			
			System.out.println("Please Enter Marks of Student 4 :- ");
			a[3] = sc.nextInt();
			
			System.out.println("Please Enter Marks of Student 5 :- ");
			a[4] = sc.nextInt();
			
			
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			
			sc.close();
		}
		
	}

}
