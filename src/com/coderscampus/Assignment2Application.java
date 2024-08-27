package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random ();
		int randomNumber = random.nextInt(100)+ 1;
		
		System.out.println("This is your random number " + randomNumber);
		
		System.out.println("Pick a number between 1 and 100 ");
		System.out.println("You only get 5 chances. Good Luck!");
		
		int playerGuess = scanner.nextInt();
		
		int attempts = 0;
		while (attempts < 5) {
            System.out.println(attempts + 1);
            attempts++;
		}
		
		if(playerGuess == randomNumber) {
			System.out.println("You Win!");	
		
		} else if (randomNumber > playerGuess) {
			System.out.println("Please pick a higher number.");
		} else {
			System.out.println("Please pick a lower number.");
		}
		
		
	}}