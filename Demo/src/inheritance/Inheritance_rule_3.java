package inheritance;

public class Inheritance_rule_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		// the child is calling parent class constructor with help of constructor chaining not by  inheritance.
		// here same this is Occuring child calling 

	}
}

class Parent2{
	public Parent2() {
		System.out.println("This is parent constructor.");
	}
}

class Child2 extends Parent2{
	public Child2() {
		System.out.println("This is child constructor.");
	}
}