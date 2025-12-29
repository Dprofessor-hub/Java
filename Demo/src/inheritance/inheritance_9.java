package inheritance;

public class inheritance_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child7 c = new Child7(100,99);
		System.out.println(c.a+ " "+ c.b);
	}

}

class Parent9{
	int a;
	int b;
	
	public Parent9() {
		this(99,99);
		a=10;
		b=20;
		System.out.println("0 paramenter parent.");
	}
	public Parent9(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println("2 parameter parent.");
	}
}

class Child8 extends Parent8{
	int a;
	int b;
	public Child8() {
		a=30;
		b=40;
		System.out.println("0 parameter child.");
	}
	public Child8(int a,int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("2 parameter child.");
	}
}