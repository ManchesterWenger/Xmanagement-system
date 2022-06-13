import java.io.Serializable;
import java.util.Scanner;

public class Player implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 949368191062847874L;
	
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
	
	
}
