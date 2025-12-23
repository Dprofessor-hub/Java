package com.demo;

public class String_Mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		StringBuffer sb = new StringBuffer("Md ");
//		sb.append("Arsh");
//		System.out.println(sb); 
		
		StringBuffer sb = new StringBuffer("");
		System.out.println(sb.capacity()); // to check the initial capacity of sb string.
		
		sb.append("Ronaldo"); 
		System.out.println(sb.capacity()); 
		
		sb.append("is a great Footballer"); // only increase capacity of string when string size became small. 
		System.out.println(sb.capacity());
		
		StringBuffer sa = new StringBuffer(10);  // we can set string capacity by declaring 10 or 20.
		System.out.println(sa.capacity());
		
		StringBuffer se = new StringBuffer();
		System.out.println(se.capacity());
		se.ensureCapacity(31); // telling that our data will be in this range so it will set capacity near this value.
		System.out.println(se.capacity()); // like here it is 34 size because our range was 31.
		
		StringBuffer sf = new StringBuffer();
		System.out.println(sf.capacity());
		sf.append("Ronaldo");
		sf.trimToSize(); // to reduce the size of string if not needed.
		System.out.println(sf.capacity());
		
	}

}
