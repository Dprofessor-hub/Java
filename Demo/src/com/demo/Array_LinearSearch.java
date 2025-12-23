package com.demo;

import java.util.Scanner;

public class Array_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int[] a = {3, 5, 7, 9, 11};

        System.out.println("Enter the number to Search :- ");
        int key = sc.nextInt();

        boolean found = false;
        int idx = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                idx = i;
                break;
            }
        }

        if (found) {
            System.out.println("Key found at index " + idx);
        } else {
            System.out.println("Key not found");
        }

       
        
        sc.nextLine();
        System.out.println("Enter the numebr to Search :- ");
        int key1 = sc.nextInt();
        
        int b[] = {1,2,3,4,5,6,7,8,9};
        
        boolean found1 = false;
        int index1 = -1;
        
        for(int i=0;i<a.length;i++) {
        	if(b[i]== key1 ) {
        		found1 = true;
        		index1 = i;
        		break;
        	}
        }
        
        if(found1) {
        	System.out.println("Key is present at index 0." + index1);
        }
        else {
        	System.out.println("Key is not present.");
        }
        
        sc.close();

	}

}
