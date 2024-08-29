package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		int randomNumber = random.nextInt(100)+ 1;
		
//		System.out.println("This is your random number " + randomNumber);
		
		System.out.println("Pick a number between 1 and 100 ");
		System.out.println("You only get 5 chances. Good Luck!");
		
		
		int maxAttempts = 5;
	
		for (int i = 0; i < maxAttempts; i++) {
			int playerGuess = 0;
			boolean validInput = false;
			
			while (true) {
				if (scanner.hasNextInt()) {
					playerGuess = scanner.nextInt();
				if (playerGuess >= 1 && playerGuess <= 100) {
					validInput = true; // Valid guess ){
					break;	
				} else {
					System.out.println("Your guess is not between 1 and 100, please try again.");
					}
//				} else {
//					System.out.println("Invalid input. Please enter a valid number.");
//					scanner.next();
			}
			}
			if(playerGuess == randomNumber) {
				System.out.println("You Win!");	 
				return; // Exit the loop if the guess is correct
			} else if (playerGuess < randomNumber) {
			System.out.println("Please pick a higher number.");
			} else {
				System.out.println("Please pick a lower number.");
			} 
	}
		System.out.println("You Lose!");
		System.out.println("The number to guess was: " + randomNumber);
		scanner.close();
	}
}
	

