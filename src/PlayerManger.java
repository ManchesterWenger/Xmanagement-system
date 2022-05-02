import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManger {
	ArrayList<Player> players= new ArrayList<Player>();
	Scanner input;
	
	PlayerManger(Scanner input){
		this.input=input;
		}
	public  void addPlayer() {
		System.out.print("Player Number:");
		int number = input.nextInt();
		System.out.print("Player Name:");
		String name = input.next();
		System.out.print("Player age:");
		int age = input.nextInt();
		System.out.print("Player wage:");
		long wage = input.nextLong();
		Player player = new Player(name,number,age,wage);
		players.add(player);
	}
	
	public  void Deleteplayer(){
		System.out.print("Player Name:");
		String playerName = input.next();
		int index= -1;
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getName()== playerName) {
				index=i;
				break;			
			}
		}
		if(index>=0) {
			players.remove(index);
			System.out.println("the player"+ playerName+ "is deleted");
		}
		else {
			System.out.println("the player has not been registered");
			return;
		}
				
	}
	
	public  void Editplayer() {
		System.out.print("Player Name:");
		String playerName = input.next();
		for(int i=0; i<players.size(); i++) {
		Player player = players.get(i);
		if(player.getName() .equals(playerName)) {			
			int num = -1;
			while (num!= 5) {
				System.out.println("** Player Edit Menu");
				System.out.println("1. Edit Name");
				System.out.println("2. Edit Number");
				System.out.println("3. Edit age");
				System.out.println("4. Edit wage");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1 - 5");
				Scanner input = new Scanner(System.in);
				num=input.nextInt();
				if(num ==1) {
					System.out.print("Player Name:");
					String name=input.next();
					player.setName(name);
				}
				else if (num==2) {
					System.out.print("Player Number:");
					int number = input.nextInt();
					player.setNumber(number);
				}
				else if (num==3) {
					System.out.print("Player age:");
					int age =input.nextInt();
					player.setAge(age);
				}
				else if (num==4) {
					System.out.print("Player wage:");
					long wage =input.nextLong();
					player.setWage(wage);
				}
				else {
					continue;
				}
			}
		break;	
		  }		
		} 		
	}
	
	public  void Viewplayers() {	
//		System.out.print("Player Name:");
//		String playerName = input.next();
		for(int i=0; i<players.size(); i++) {
			players.get(i).printInfo();
		}
//		if(player.name.equals(playerName)) {			
//			player.printInfo();
//		}
	}
}
