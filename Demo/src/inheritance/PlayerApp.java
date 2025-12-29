package inheritance;

public class PlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football f = new Football("Dipanshu",12,22,12,"India",25,20);
		System.out.println("Name is :- "+ f.getName());
		System.out.println("Age is :- "+ f.getAge());
		System.out.println("Goals are :- "+ f.getGoals());
		System.out.println("bestScore is :- "+ f.getBestScore());
		System.out.println("Country :- "+ f.getCountry());
		System.out.println("Mom are :- "+ f.getMOM());
		System.out.println("Total assists are :- "+ f.getAssists());
	}

}
