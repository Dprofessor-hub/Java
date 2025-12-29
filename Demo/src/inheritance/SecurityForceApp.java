package inheritance;

public class SecurityForceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army();
		a.UseTank();
		a.protect();
		System.out.println("------------------");
		
		Navy n = new Navy();
		n.UseShip();
		n.protect();
		System.out.println("------------------");

		AirForce ai = new AirForce();
		ai.UseJet();
		ai.protect();
	}

}


class SecurityForce{
	void job() {
		System.out.println("To Protech Nation");
	}
	void protect() {
		System.out.println("Protect Country");
	}
	
}

class Army extends SecurityForce{
	void protect() {
		System.out.println("Protech Land.");
	}
	void UseTank() {
		System.out.println("Army uses Tank.");
	}
}

class Navy extends SecurityForce{
	void protect() {
		System.out.println("Protech Ocean.");
	}
	void UseShip() {
		System.out.println("Navy uses Ship.");
	}
}

class AirForce extends SecurityForce{
	void protect() {
		System.out.println("Protech Air.");
	}
	
	void UseJet() {
		System.out.println("Airforce uses Jet.");
	}
}