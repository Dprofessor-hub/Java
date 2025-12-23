package com.demo;

import java.util.Scanner;
public class Array_SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the First Number :-");
		int a = sc.nextInt();
		
		System.out.println("Please Enter the Second Number :-");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping :- ");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping :-");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		sc.close();
	}

}
