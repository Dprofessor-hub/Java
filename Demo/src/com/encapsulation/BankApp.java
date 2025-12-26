package com.encapsulation;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter the amount to deposite :-");
		Bank b  =new Bank();
		int bal = sc.nextInt();
		b.setBalance(bal);
		System.out.println("Your current balance :" + b.getBalance());
		
		System.out.println("Please enter amount to widraw");
		int w = sc.nextInt();
		int upd_bal = b.getBalance()-w;
		b.setBalance(upd_bal);
		System.out.println("Your current balance :-" + b.getBalance());
		
		sc.close();
	}

}

class Bank{
	private int balance;
	public void setBalance(int bal) {
		if(bal>0) {
			balance=bal;
		}
		else {
			System.out.println("Invalid Inputs.");
		}
	}
	public int getBalance() {
		return balance;
	}
}