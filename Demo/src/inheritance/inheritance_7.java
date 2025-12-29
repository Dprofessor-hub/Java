package inheritance;

public class inheritance_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child6 c = new Child6();
		System.out.println(c.a+ " "+ c.b);
	}

}

class Parent7{
	int a;
	int b;
	public Parent7() {
		a=10;
		b=20;
	}
	public Parent7(int a,int b) {
		this.a = a;
		this.b = b;
	}
}

class Child6 extends Parent7{
	int a;
	int b;
	public Child6() {
		a=30;
		b=40;
	}
	public Child6(int a,int b) {
		this.a = a;
		this.b = b;
	}
}