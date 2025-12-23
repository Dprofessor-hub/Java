package com.demo;

import java.util.Scanner;

public class Array_SwapWithoutThirdVariable {

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
		
		// let a = 10 and b = 20;
		a = a + b; //30
		b = a - b; //10
		a = a - b; //20
		
		System.out.println("After Swapping :-");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		sc.close();
	}

}
