package com.demo;

import java.util.Scanner;

public class Swapping_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " " );
		}
		
		System.out.println("\nEnter the index to swap:- ");
		int index1 = sc.nextInt();
		
		System.out.println("Enter the second index to swap :-");
		int index2 = sc.nextInt();
		
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		
		System.out.println("Array after sorting :- ");
		for(int i=0;i<a.length;i++) {
			System.out.print(i + " ");
		}
		
		sc.close();

	}

}
