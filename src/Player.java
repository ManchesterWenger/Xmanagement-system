
public class Player {
	protected PlayerLeague League = PlayerLeague.PrimierLeague;
	protected String name;
	protected int number;
	protected int age;
	protected long wage;	
	
	public Player() {}
	
	
	public Player(String name,int number,int age, long wage){
		this.name=name;
		this.number=number;
		this.age=age;
		this.wage=wage;
	}
	public Player(String name,int number){
		this.name=name;
		this.number=number;
		
	}
	public Player(String name,int number,int age){ 
		this.name=name;
		this.number=number;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getWage() {
		return wage;
	}


	public void setWage(long wage) {
		this.wage = wage;
	}
	public PlayerLeague getLeague() {
		return League;
	}


	public void setLeague(PlayerLeague league) {
		League = league;
	}
	public void printInfo() {
		System.out.println("name:" + name +"\n"+"number:" + number+"번" + "\n"+"age:" + "만"+age+"세" + "\n"+"wage:" + wage+"만원");
 }
}
