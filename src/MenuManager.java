import java.util.Scanner;
public class MenuManager {
	
	public static void addPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number:");
		int playerNumber = input.nextInt();
		System.out.print("Player Name:");
		String playerName = input.next();
		System.out.print("Player age:");
		int playerAge = input.nextInt();
	}
	
	public static void Deleteplayer(){
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number:");
		int playerNumber = input.nextInt();
		System.out.print("Player Name:");
		String playerName = input.next();
		System.out.print("Player age:");
		int playerAge = input.nextInt();
		
	}
	
	public static void Editplayer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number:");
		int playerNumber = input.nextInt();
		System.out.print("Player Name:");
		String playerName = input.next();
		System.out.print("Player age:");
		int playerAge = input.nextInt();
	}
	
	public static void Viewplayer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number:");
		int playerNumber = input.nextInt();
		System.out.print("Player Name:");
		String playerName = input.next();
		System.out.print("Player age:");
		int playerAge = input.nextInt();
	}
	
	

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		while(num!=6) {

		System.out.println("1. Add player");
		System.out.println("2. Delete player");
		System.out.println("3. Edit player");
		System.out.println("4. View player");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1 - 6:");
		num = input.nextInt();
		if (num==1) {
			 addPlayer();
					}
		else if (num==2) {
			
			Deleteplayer();
					}
		else if (num==3) {
			Editplayer();
					}
		else if (num==4) {
			Viewplayer();
					}
		else if (num==5) {
			continue;
					}
		else if (num==6) {
			System.out.print("management System over");
			
					}
		
		
			}
		
		
		}
	}


