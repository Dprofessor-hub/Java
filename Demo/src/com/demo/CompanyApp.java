package com.demo;


class company{
	String name;
}

class useCompany{
	company dispCompany() {
		company c = new company();
		return c;
	}
}

public class CompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useCompany uc = new useCompany();
		company res = uc.dispCompany();
		System.out.println(res);
	}

}

