package com.demo;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the number of Employes :- ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String a[] = new String[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Please Enter The name of Employe :- " + i);
			a[i] = sc.nextLine();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
			
		sc.close();
	}
}
