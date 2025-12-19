package com.demo;

class Fan {
	String Brand;
	int Cost;
	String Color;

}

public class FanApp {
	public static void main(String[] args) {
		Fan F1 = new Fan();
		System.out.println("Before Assigning Values");
		System.out.println(F1.Brand);
		System.out.println(F1.Cost);
		System.out.println(F1.Color);
		
		System.out.println("After Assigning the values");
		F1.Brand = "Filips";
		F1.Cost = 2500;
		F1.Color = "Black";
		
		System.out.println(F1.Brand);
		System.out.println(F1.Cost);
		System.out.println(F1.Color);
		
		Fan F2 = new Fan();
		System.out.println("Before Assigning Values");
		System.out.println(F2.Brand);
		System.out.println(F2.Cost);
		System.out.println(F2.Color);
		
		System.out.println("After Assigning the values");
		F2.Brand = "Bajaj";
		F2.Cost = 3500;
		F2.Color = "Metal Black";
		
		System.out.println(F2.Brand);
		System.out.println(F2.Cost);
		System.out.println(F2.Color);


		
		
	}
}
