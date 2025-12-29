package com.demo;

import java.util.Scanner;

public class ar_2d_Jacked{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes:- ");
        int n = sc.nextInt();

        int[][] a = new int[n][];

        // Create jagged array
        for(int i = 0; i < n; i++) {
            System.out.print("Enter number of students in class " + i + ": ");
            int students = sc.nextInt();
            a[i] = new int[students];
        }

        // Enter marks
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print("Enter marks of class " + i + " student " + j + ": ");
                a[i][j] = sc.nextInt();
            }
        }

        // Print marks
        System.out.println("\nMarks:");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
