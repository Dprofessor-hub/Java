package inheritance;

public class inheritance_rule_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c = new child1();
		System.out.println(c.a);
		System.out.println("-----------");
		c.disp(); // the filed parent is not visible.
		// because the variable is declared as private.
	}

}

class parent1{
	private int a = 10;
	int b = 20;
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}

class child1 extends parent1{
	
}