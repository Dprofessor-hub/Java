package com.demo;

import java.util.Scanner;

public class Array_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = {10,20,30,40,50,60};
		
		System.out.println("Please Enter the Number :- ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = a.length -1;
		int mid;
		boolean found = false;
		
		while(low<=high) {
			mid = (low + high)/2;
			
			if(a[mid] == key ) {
				System.out.println("Key found at the Index " + mid);
				found = true;
				break;
			}
			else if(key < a[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		if(!found) {
			System.out.println("Key is not Found.");
		}
		
		sc.close();
	}
}
