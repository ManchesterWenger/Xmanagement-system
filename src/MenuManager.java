import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;
public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		PlayerManger playerManger = getObject("playerManager.ser");
		if(playerManger==null) {
			 playerManger = new PlayerManger(input);
		}
		else {
			 playerManger.input=input;
		}
				
		 selectMenu(playerManger,input );	
		 putObject(playerManger,"playerManager.ser");
	}
	
	public static void selectMenu(PlayerManger playerManger, Scanner input) {
		int num=-1;
		while( num!=5) {
			try {
			showMenu();
		num = input.nextInt();
		switch(num) {
		case 1:
			playerManger.addPlayer();
			logger.log("add a Player");
			break;
			
		case 2:
			playerManger.Deleteplayer();
			logger.log("delete a Player");
			break;
			
		case 3:
			playerManger.Editplayer();
			logger.log("edit a Player");
			break;
			
		case 4:
			playerManger.Viewplayers(); 
			logger.log("view a Player");
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
	
	public static PlayerManger getObject(String filename) {
		PlayerManger playerManger=null;
		
		
		try {
			FileInputStream file= new FileInputStream (filename);
			ObjectInputStream in= new ObjectInputStream(file);
			
			playerManger=(PlayerManger)in.readObject();
			
			in.close();
			file.close();
			
			
			
		} catch (FileNotFoundException e) {
			return playerManger;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerManger;	
	}
	
	public static void putObject(PlayerManger playerManger,String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream (filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			out.writeObject(playerManger);
			
			out.close();
			file.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	}


