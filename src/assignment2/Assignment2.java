package assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing variables
		int high = 100;
		int low = 1;
		int numGuess = 0;
		Random ran = new Random();
		
		Scanner cin = new Scanner(System.in);

		System.out.println("Pick a number between 1 and 100");

		// Guessing user's number
		System.out.println("Is the number you picked " + 50 + "?");
		String answer = cin.nextLine();
		numGuess++;
		//if guess = 50 or != 50
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("I WIN!!" + "\nNumber of guesses: " + numGuess);
			System.exit(0);
		} else {
			System.out.println("Is it less than " + 50 + "?");
			answer = cin.nextLine();
		//if guess < 50 or > 50
			if (answer.equalsIgnoreCase("yes")) {
				high = 50;
				System.out.println("Is the number you picked " + 25 + "?");
				answer = cin.nextLine();
				numGuess++;
				//if guess = 25 or != 25
				if (answer.equalsIgnoreCase("yes")) {
					System.out.println("I WIN!!" + "\nNumber of guesses: " + numGuess);
				}
				// checking if guess is < 25 or > 25
				else {
					System.out.println("Is it less than " + 25 + "?");
					answer = cin.nextLine();
					// if guess < 25
					if (answer.equalsIgnoreCase("yes")) {
					high = 25;
					while (numGuess < 5) {
						numGuess += 1;
					
					System.out.println("Is the number you picked " + (ran.nextInt(25) + low) + "?");
					answer = cin.nextLine();
					if (answer.equalsIgnoreCase("yes")) {
						System.out.println("I WIN!!" + "\nNumber of guesses: " + numGuess);
					}
					}
					System.out.println("Aaah OK you win :(" + "\nNumber of guesses: " + numGuess);
					System.exit(0);
					}
			 //else {
				low = 50;
				System.out.println("Is the number you picked " + 75 + "?");

			}

		}

	}

	}
}

