package com.demo;

public class String_CompareTo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "VIRAT";
		String S2 = "VIRU";
		
		int res = S1.compareTo(S2);

		System.out.println(res);

		if(res>0) {
			System.out.println("S1 is greater.");
		}
		else if (res<0) {
			System.out.println("S2 is greater");
		}
		else {
			System.out.println("Both are Equal");
		}

	}

}
