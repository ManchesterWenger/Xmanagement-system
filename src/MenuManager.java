import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlayerManger playerManger = new PlayerManger(input);
		
		
		 selectMenu(input,playerManger );
		
	}
	
	public static void selectMenu(Scanner input, PlayerManger playerManger) {
		int num = -1;
		while(num!=5) {
			try {
			showMenu();
		num = input.nextInt();
		switch(num) {
		case 1:playerManger.addPlayer();
			break;
			
		case 2:playerManger.Deleteplayer();
			break;
			
		case 3:playerManger.Editplayer();
			break;
			
		case 4:playerManger.Viewplayers(); 
			break;
			
		case 5:System.out.print("management System over");
			break;
			
		default:
			continue;
		
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5 !");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}
	
	
	
	public static void showMenu() {
		System.out.println("1. Add player");
		System.out.println("2. Delete player");
		System.out.println("3. Edit player");
		System.out.println("4. View players");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5:");
	}
	
	
	}


