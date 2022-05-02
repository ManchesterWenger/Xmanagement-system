
public class Player {

	String name;
	int number;
	int age;
	long wage;	
	
	public Player() {}
	
	
	public Player(String name,int number,int age, long wage){
		this.name=name;
		this.number=number;
		this.age=age;
		this.wage=wage;
	}
	public void printInfo() {
		System.out.println("name:" + name +"\n"+"number:" + number+"번" + "\n"+"age:" + "만"+age+"세" + "\n"+"wage:" + wage+"만원");
 }
}
