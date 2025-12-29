package inheritance;

public class inheritance_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child7 c = new Child7(100,99);
		System.out.println(c.a+ " "+ c.b);
	}

}


class Parent8{
	int a;
	int b;
	public Parent8() {
		this(99,99);
		a=10;
		b=20;
	}
	public Parent8(int a,int b) {
		this.a = a;
		this.b = b;
	}
}

class Child7 extends Parent8{
	int a;
	int b;
	public Child7() {
		a=30;
		b=40;
	}
	public Child7(int a,int b) {
		this();
		this.a = a;
		this.b = b;
	}
}