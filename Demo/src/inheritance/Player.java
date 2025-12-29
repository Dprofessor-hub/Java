package inheritance;

// parent class
class Player{
	String name;
	int Age;
	int MOM;
	int BestScore;
	String Country;	
}

//child class 1
class Football extends Player{
	int Goals;
	int Assists;
	
	public Football(String name, int age, int mom, 
		int bestscore , String Country,int Goals, int Assists) {
		
		this.name = name;
		this.Age = age;
		this.MOM = mom;
		this.BestScore = bestscore;
		this.Country = Country;
		this.Goals = Goals;
		this.Assists = Assists;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return Age;
	}
	public int getBestScore() {
		return BestScore;
	}
	public String getCountry() {
		return Country;
	}
	public int getMOM() {
		return MOM;
	}
	public int getGoals() {
		return Goals;
	}
	public int getAssists() {
		return Assists;
	}
}

// child class 2
class IPL extends Player{
	int Centuries;
	int HalfCenturies;
	int StrickRate;
	
	public IPL(String name, int age, int mom, 
		int bestscore , String Country,int Centuries, int HalfCenturies, int StrickRate) {
		this.Centuries = Centuries;
		this.HalfCenturies = HalfCenturies;
		this.StrickRate = StrickRate;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return Age;
	}
	public int getBestScore() {
		return BestScore;
	}
	public String getCountry() {
		return Country;
	}
	public int getMOM() {
		return MOM;
	}
	
	public int getGoals() {
		return Centuries;
	}
	public int getAssists() {
		return HalfCenturies;
	}
	public int getStrickRate() {
		return StrickRate;
	}
}
