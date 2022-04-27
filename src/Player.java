
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
		System.out.println("name:" + name + "number:" + number + "age:" + age + "wage:" + wage);
 }
}
