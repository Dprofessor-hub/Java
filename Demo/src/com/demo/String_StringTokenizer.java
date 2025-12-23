package com.demo;

import java.util.StringTokenizer;

public class String_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Department of Computer technology";
		
		StringTokenizer st = new StringTokenizer(s," "); //stringTokenzer breaks the sentances into words.
		
		//hasMoreToken checks whether the sentance has more words after that words or not.
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());	//nextToken print next words since default st StringTokenizer is before sentacne.
			// the array starts from 0 and st starts before 0 so position is not define that's way we use stringTokenizer. 
		}
	
	}
}
