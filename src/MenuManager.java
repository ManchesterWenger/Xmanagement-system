import java.util.Scanner;
public class MenuManager {

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
		System.out.print("Select one number between 1 - 5:");
		num = input.nextInt();
		if (num==1) {
			System.out.print("Player Number:");
			int playerNumber = input.nextInt();
			System.out.print("Player Name:");
			String playerName = input.next();
					}
		else if (num==2) {
			System.out.print("Player Number:");
			int playerNumber = input.nextInt();
			System.out.print("Player Name:");
			String playerName = input.next();
					}
		else if (num==3) {
			System.out.print("Player Number:");
			int playerNumber = input.nextInt();
			System.out.print("Player Name:");
			String playerName = input.next();
					}
		else if (num==4) {
			System.out.print("Player Number:");
			int playerNumber = input.nextInt();
			System.out.print("Player Name:");
			String playerName = input.next();
					}
		else if (num==5) {
			System.out.print("Player Number:");
			int playerNumber = input.nextInt();
			System.out.print("Player Name:");
			String playerName = input.next();
					}
		else if (num==6) {
			System.out.print("프로그램 종료");
			
					}
		
		
			}
		}
	}


