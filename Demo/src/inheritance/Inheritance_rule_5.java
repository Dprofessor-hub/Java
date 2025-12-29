package inheritance;

public class Inheritance_rule_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 c = new Child4();
		
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
class GrandParent{
	int a =10;
}

class Parent5 extends GrandParent{
	int b =20;
}

class Child4 extends Parent5{
	
}
