import java.util.Scanner;
public class MenuManager {

	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlayerManger playerManger = new PlayerManger(input);
		int num = -1;
		
		while(num!=5) {

		System.out.println("1. Add player");
		System.out.println("2. Delete player");
		System.out.println("3. Edit player");
		System.out.println("4. View players");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5:");
		num = input.nextInt();
		if (num==1) {
			playerManger.addPlayer();
					}
		else if (num==2) {
			
			playerManger.Deleteplayer();
					}
		else if (num==3) {
			playerManger.Editplayer();
					}
		else if (num==4) {
			playerManger.Viewplayers();
					}
		
		else if (num==5) {
			System.out.print("management System over");
			break;
					}
		
		
			}
		
		
		}
	}


