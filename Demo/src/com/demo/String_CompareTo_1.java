package com.demo;

public class String_CompareTo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to Find unique code value of Characters.
//		char a = 'C';
//		int b = a;
//		char c = 'U';
//		int d =c;
//		System.out.println(b);
//		System.out.println(d);
		
		String S1 = "SACHIN";
		String S2 = "SAURAV";
		
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
