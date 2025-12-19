package com.demo;

import java.util.Scanner;

public class Ar_sample2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the number of classes :- ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please Enter the number of Students :- ");
		int m = sc.nextInt();
		sc.nextLine();
		
		int a[][] = new int[n][m];
		
		
		// Hardcode Program 
		//class 0 i/p
//		a[0][0] = 11;
//		a[0][1] = 12;
//		a[0][2] = 13;
//		a[0][3] = 14;
//		a[0][4] = 15;
//		
//		//class 1 i/p
//		a[1][0] = 21;
//		a[1][1] = 22;
//		a[1][2] = 23;
//		a[1][3] = 24;
//		a[1][4] = 25;
//
//		//class 2 i/p
//		a[2][0] = 31;
//		a[2][1] = 32;
//		a[2][2] = 33;
//		a[2][3] = 34;
//		a[2][4] = 35;
//		
//		//class 0 o/p
//		System.out.print(a[0][0] + " ");
//		System.out.print(a[0][1] + " ");
//		System.out.print(a[0][2] + " ");
//		System.out.print(a[0][3] + " ");
//		System.out.print(a[0][4] + " ");
//		System.out.println();
//		
//		//class 1 o/p
//		System.out.print(a[1][0] + " ");
//		System.out.print(a[1][1] + " ");
//		System.out.print(a[1][2] + " ");
//		System.out.print(a[1][3] + " ");
//		System.out.print(a[1][4] + " ");
//		System.out.println();
//		//class 2 o/p
//		System.out.print(a[2][0] + " ");
//		System.out.print(a[2][1] + " ");
//		System.out.print(a[2][2] + " ");
//		System.out.print(a[2][3] + " ");
//		System.out.print(a[2][4] + " ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Please Enetr the marks of class :- "+ i + " Student :- "+ j);
				a[i][j] = sc.nextInt();
			}
			
		}
//		
//		System.out.println("Please Enetr the marks of class 0 student 1");
//		a[0][1] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 0 student 2");
//		a[0][2] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 0 student 3");
//		a[0][3] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 0 student 4");
//		a[0][4] = sc.nextInt();
//
//		System.out.println("Please Enetr the marks of class 1 student 0");
//		a[1][0] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 1 student 1");
//		a[1][1] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 1 student 2");
//		a[1][2] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 1 student 3");
//		a[1][3] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 1 student 4");
//		a[1][4] = sc.nextInt();
//		
//		System.out.println("Please Enetr the marks of class 2 student 0");
//		a[2][0] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 2 student 1");
//		a[2][1] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 2 student 2");
//		a[2][2] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 2 student 3");
//		a[2][3] = sc.nextInt();
//		System.out.println("Please Enetr the marks of class 2 student 4");
//		a[2][4] = sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
