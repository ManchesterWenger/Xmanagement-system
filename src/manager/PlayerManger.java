package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import League.BUDESLIGA;
import League.EPL;
import League.LaLiga;
import League.SERIE_A;
import Player.Player;
import Player.PlayerInput;

import java.util.ArrayList;
import java.util.Scanner;


public class PlayerManger implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5563899708990124421L;
	transient Scanner input;
	ArrayList<PlayerInput> players= new ArrayList<PlayerInput>();
	
	
	PlayerManger(Scanner input){
		this.input=input;
		}
	public  void addPlayer() {
		int kind =0;
		PlayerInput playerinput;
		while(kind!=1 && kind!=2 && kind!=3 && kind!=4) {
		System.out.println("Select Player League");
		System.out.println("1 for EPL");
		System.out.println("2 for LaLiga");
		System.out.println("3 for SERIE_A");
		System.out.println("4 for BUDESLIGA");
		System.out.print("Select num for Player League: ( 1~ 4 ):");
		kind = input.nextInt();
		
		if (kind==1) {
			
				 playerinput = new EPL();
				 playerinput.getUserInput(input);
				 players.add(playerinput);			
				 break;
			}
			else if (kind==2) {
	
				 playerinput = new LaLiga();
				 playerinput.getUserInput(input);
				 players.add(playerinput);
				break;
			}
			else if (kind==3) {
				
				 playerinput = new SERIE_A();
				 playerinput.getUserInput(input);
				 players.add(playerinput);
				break;
			}
			else if (kind==4) {
			
				 playerinput = new BUDESLIGA();
				 playerinput.getUserInput(input);
				 players.add(playerinput);
				break;
			}
			else {
				System.out.println("Please put an integer between 1 and 4 !");
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
		PlayerInput playerinput = players.get(i);
		if(playerinput.getName() .equals(playerName)) {			
			int num = -1;
			while (num!= 5) {
				 showeditMenu();
				Scanner input = new Scanner(System.in);
				num=input.nextInt();
				switch(num) {
				case 1:
					setPlayerName(playerinput, input);
					break;
				
				case 2:
					setPlayerNumber(playerinput, input);
					break;
					
				case 3:
					setPlayeAge(playerinput, input);
					break;
					
				case 4:
					setPlayerWage(playerinput, input);
					break;
					
				default:
					continue;			
				}			
			}
		break;	
		  }		
		} 		
	}
	
	public  void Viewplayers() {	

		for(int i=0; i<players.size(); i++) {
			players.get(i).printInfo();
		}

	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void setPlayerName(PlayerInput player, Scanner input) {	
		System.out.print("Player Name:");
		String name=input.next();
		player.setName(name);
	}
	
	public void setPlayerNumber(PlayerInput player, Scanner input) {	
		System.out.print("Player Number:");
		int number = input.nextInt();
		player.setNumber(number);
	}
	
	public void setPlayeAge(PlayerInput player, Scanner input) {	
		System.out.print("Player age:");
		int age =input.nextInt();
		player.setAge(age);
	}
	
	public void setPlayerWage(PlayerInput player, Scanner input) {	
		System.out.print("Player wage:");
		long wage =input.nextLong();
		player.setWage(wage);
	}
	
	public void showeditMenu() {
		System.out.println("** Player Edit Menu");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Number");
		System.out.println("3. Edit age");
		System.out.println("4. Edit wage");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
	}
	
	public int size() {
		return players.size();
	}
	
	public PlayerInput get (int index) {
		return (PlayerInput) players.get(index);
	}
}
