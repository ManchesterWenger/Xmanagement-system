import java.util.Scanner;

public class Player{

	static protected String League;
	protected String name;
	protected int number;
	protected int age;
	protected long wage;	
	
	public Player() {}
	
	public Player(String League,String name, int number,int age, long wage){
		this.League=League;
		this.name=name;
		this.number=number;
		this.age=age;
		this.wage=wage;
		}
	
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
	public String getleague() {
		return  League;
	}


	public void setleague(String League) {
		this. League =  League;
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
	String sLeague="none";
	
	public void printInfo() {
		switch(this.League) {
		case "EPL":
			sLeague="Epl Player";
			break;
			
		case "LaLiga":
			sLeague="LaLiga Player";
			break;
			
		case "SERIE_A":
			sLeague="SERIE_A Player";
			break;
			
		case  "BUDESLIGA" :
			sLeague="BUDESLIGA Player";
			break;
			
		default:
			
		}
		System.out.println("League:" + sLeague + "\n" + "name:" + name + "\n" +"number:" +  number + "¹ø"  + "\n" +"age:" + age+ "\n"+"wage:" + wage);
 }
	
	public void getUserInput(Scanner input) {
		System.out.print("Player Number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Player Name:");
		String name = input.next();
		this.setName(name);
		
//		System.out.print("Player League:");
//		String League = input.next();
//		this.setleague(League);
		System.out.print("Player age:");
		int age = input.nextInt();
		this.setAge(age);
		
		System.out.print("Player wage:");
		long wage = input.nextLong();
		this.setWage(wage);
		 
		
	}
}
