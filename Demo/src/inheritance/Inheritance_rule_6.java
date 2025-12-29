package inheritance;

public class Inheritance_rule_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child5 c = new Child5();
	}

}

class Parent6 extends Child5{
	int b =20;
}

class Child5 extends Parent6{
	
}
// cyclic inheritance is not allowed in java because parent is acessing child and child acess parent.
// The loop never ends that why it is not valid.