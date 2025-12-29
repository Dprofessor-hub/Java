package com.string;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10,5);
		System.out.println("Area of triangle is :- "+ t.disp());

	}

}

class Triangle{
	int b;
	int h;
	static float half= 0.5f;
	
	public Triangle(int h,int b) {
		this.h = h;
		this.b = b;
	}
	
	float disp() {
		float area = half*b*h;
		return area;
	}
}