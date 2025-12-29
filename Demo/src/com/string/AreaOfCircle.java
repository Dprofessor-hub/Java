package com.string;

// Static method we have declare the pie as constant value as it will not change for different circle.
// we use 
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		System.out.println(c.disp());		
	}

}


class Circle{
	static float pi = 3.14f;
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	float disp() {
		float area = pi*r*r;
		return area;
	}
}