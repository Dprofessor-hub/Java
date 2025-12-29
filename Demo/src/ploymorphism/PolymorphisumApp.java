package ploymorphism;

public class PolymorphisumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTrainer j = new JavaTrainer();
		ApiTrainer a = new ApiTrainer();
		TestTrainer t = new TestTrainer();
		
		System.out.println("---------JAVA------------");
		j.Teach();
		
		System.out.println("----------API-----------");
		a.Teach();
		
		System.out.println("----------TESTING-----------");
		t.Teach();
		
	}

}

// loose coupling without it we can't achive polymorphism.

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