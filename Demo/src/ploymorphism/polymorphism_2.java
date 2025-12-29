package ploymorphism;

public class polymorphism_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t;
		t = new JavaTrainer();
		t = new ApiTrainer();
		t = new TestTrainer();
		
		System.out.println("---------JAVA------------");
		t.Teach();
		
		System.out.println("----------API-----------");
		t.Teach();
		
		System.out.println("----------TESTING-----------");
		t.Teach();

	}

}

class Trainer{
	void Teach() {
		System.out.println("Trainer teches.");
	}
}

class JavaTrainer extends Trainer {
	void Teach() {
		System.out.println("Trainer teches Java.");
	}
}

class ApiTrainer extends Trainer{
	void Teach() {
		System.out.println("Trainer teches Api.");
	}
}

class TestTrainer extends Trainer{
	void Teach() {
		System.out.println("Trainer teches Testing.");
	}
}