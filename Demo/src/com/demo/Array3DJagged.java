package com.demo;

import java.util.Scanner;

public class Array3DJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the number of College :- ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int a[][][] = new int[n][][];
		
		for(int i=0;i<n;i++) {
			System.out.println("Please Enter the Number of Classes in college " + i + ":- " );
			int classes = sc.nextInt();
			a[i] = new int[classes][];
			for(int j=0;j<a[i].length;j++) {
				System.out.println("please Enter the no. of students in each class :- ");
				int b=sc.nextInt();
				a[i][j]=new int[b];
			}
		}
		
		
		//Inputs
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Please Enter the Marks of college "+ i + " Class"+ j+ " Students"+ k + ":- ");
					a[i][j][k]= sc.nextInt();
					
				}
				System.out.println();
			}
		}
		
		//outputs
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	sc.close();
	}

}
