import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManger {
	ArrayList<Player> players= new ArrayList<Player>();
	Scanner input;
	
	PlayerManger(Scanner input){
		this.input=input;
		}
	public  void addPlayer() {
		int kind =0;
		Player player;
		while(kind!=1 && kind!=2 && kind!=3 && kind!=4) {
		System.out.println("Select Player League");
		System.out.println("1 for EPL");
		System.out.println("2 for LaLiga");
		System.out.println("3 for SERIE_A");
		System.out.println("4 for BUDESLIGA");
		System.out.print("Select num for Player League: ( 1~ 4 ):");
		kind = input.nextInt();
		
		if (kind==1) {
				 Player.League="EPL";
				 player = new EPL();
				 player.getUserInput(input);
				 players.add(player);			
				 break;
			}
			else if (kind==2) {
				 Player.League="LaLiga";
				 player = new LaLiga();
				 player.getUserInput(input);
				 players.add(player);
				break;
			}
			else if (kind==3) {
				 Player.League="SERIE_A";
				 player = new SERIE_A();
				 player.getUserInput(input);
				 players.add(player);
				break;
			}
			else if (kind==4) {
				 Player.League="BUDESLIGA";
				 player = new BUDESLIGA();
				 player.getUserInput(input);
				 players.add(player);
				break;
			}
			else {
				
			}
		}
	  
	}
	
	public  void Deleteplayer(){
		System.out.print("Player Name:");
		String playerName = input.next();
		int index= -1;
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getName().equals(playerName)) {
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
//				else if (num==5) {
//					System.out.print("Player League:");
//					String League =input.next();
//					player.setleague(League);
//				}
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
