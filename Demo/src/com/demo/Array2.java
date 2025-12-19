package com.demo;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of students present in class :-");
		int n = sc.nextInt();	
		int a[] = new int[n];
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Please Enter Marks of Student "+ i);
			a[i]= sc.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

		sc.close();
	}

}
