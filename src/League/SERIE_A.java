package League;

import java.util.Scanner;

import Player.Player;
import Player.PlayerInput;

public class SERIE_A extends Player implements PlayerInput {

	public void getUserInput(Scanner input) {
		
		System.out.print("Player League :SERIE_A 입력하세요:");
		String League = input.next();
		this.setleague(League);
		
		
		System.out.print("Player Number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Player Name:");
		String name = input.next();
		this.setName(name);
		
//		System.out.print("Player League:");
//		String League = input.next();
//		this.setleague(League);
		System.out.print("Player age:");
		int age = input.nextInt();
		this.setAge(age);
		
		System.out.print("Player wage:");
		long wage = input.nextLong();
		this.setWage(wage);		
		
	}

}
