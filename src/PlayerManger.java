import java.util.Scanner;

public class PlayerManger {
	Player player;
	Scanner input;
	
	PlayerManger(Scanner input){
		this.input=input;
		}
	public  void addPlayer() {
		player = new Player();
		System.out.print("Player Number:");
		player.number = input.nextInt();
		System.out.print("Player Name:");
		player.name = input.next();
		System.out.print("Player age:");
		player.age = input.nextInt();
		System.out.print("Player wage:");
		player.wage = input.nextLong();
	}
	
	public  void Deleteplayer(){
		System.out.print("Player Name:");
		String playerName = input.next();
		if(player==null) {
			System.out.println("the player has not been registered");
			return;
		}
		if(player.name== playerName) {
			player=null;
			System.out.println("the player is deleted");
		}
		
	}
	
	public  void Editplayer() {
		
		
		System.out.print("Player Name:");
		String playerName = input.next();
		if(player.name== playerName) {			
			System.out.println("the player to be edited is"+playerName);
		}
	}
	
	public  void Viewplayer() {	
		System.out.print("Player Name:");
		String playerName = input.next();
		if(player.name.equals(playerName)) {			
			player.printInfo();
		}
	}
}
