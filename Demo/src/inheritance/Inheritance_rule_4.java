package inheritance;

public class Inheritance_rule_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 c = new Child3();

		
	}

}
class Parent3{
	public Parent3() {
		System.out.println("This is parent constructor.");
	}
}
class Parent4{
	public Parent4() {
		System.out.println("This is parent constructor.");
	}
}

class Child3 extends Parent3,Parent4{
	public Child3() {
		System.out.println("This is child constructor.");
	}
}
// syntax error.

// this is diamond shaped problem. because it is the super method is confussed where to go.
// it can go to parent1 or parent2 and then parent has parent method also the object method.
// super method of parent1 and parent2 will face same problem.