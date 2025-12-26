//1package com.demo;
//
//public class Reverse_Word_By_Word {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s ="I am Iron Man";
//		System.out.println("Original String :-");
//		System.out.println(s);
//		
//		String[] Words = s.split(" ");
//
//		String result = "";
//		
//		for(String word : Words) {
//			String rewords = "";
//			
//			for(int i=word.length()-1;i>=0;i--) {
//				rewords = rewords + word.charAt(i);
//			}
//			result = result + rewords + " ";
//		}
//		
//		System.out.println("Word wise reversed String :- ");
//		System.out.println(result);
//		
//	}
//
//}
