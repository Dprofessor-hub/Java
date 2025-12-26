package com.encapsulation;

import java.util.Scanner;

public class EmployeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Employe Id :-");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter the Employe Name :-");
		String ag = sc.nextLine();
		
		sc.nextLine();
		System.out.println("Please Enter the student Salary :-");
		int sy = sc.nextInt();
		
		Employe e = new Employe(id,ag,sy);
		System.out.println("Employe Id is :- "+ e.getId());
		System.out.println("Employe Name is :- "+ e.getName());
		System.out.println("Employe Salary is :- "+ e.getSalary());
		
		
		sc.close();
	}

}

class Employe{
	private int ID;
	private String Name;
	private int Salary;
	
	//constructor method instead of setter method.
	public Employe(int i, String n,int s) {
		ID = i;
		Name = n;
		Salary = s;
	}
	
	public int getId() {
		return ID;
	}
	
	public String getName() {
		return Name;
	}
	public int getSalary() {
		return Salary;
	}
}