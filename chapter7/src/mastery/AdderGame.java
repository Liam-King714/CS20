/*

Program: Adder.java          Last Date of this Revision: 10/29/2026

Purpose: The Adder game prompts a player for the answer to an addition problem. (Just as a note, the original assignment said to use 999 to quit, but I changed it to -1 in my version because its faster for me to type).

*/
package mastery;

import java.util.Scanner;

public class AdderGame 
{
	
	public static void main(String[] args)
	{
		//Declare variables, and initialize a new Adder instance
		final int FLAG = -1;
		int points = 0, userGuess = 0, answer, attempts = 1, numOne = 0, numTwo = 0;
		boolean correctAnswer = false;
		Adder pointTracker = new Adder(0);
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create the loop system for the game.
		while(FLAG != userGuess)
		{
			//Get the numbers for the current equation
			numOne = Adder.getNewNum();
			numTwo = Adder.getNewNum();
			answer = Adder.getAnswer(numOne, numTwo);
			
			//Display the current equation to the user, and prompt them for the answer and record it, and increase the amount of attempts it took to answer this equation by 1
			Adder.displayEquation(numOne, numTwo);
			userGuess = input.nextInt();
			System.out.println("Attempts: " + attempts);
			//Check if the user got the answer correct or not
			if(answer != userGuess)
			{
				while(answer != userGuess && attempts != 3 && FLAG != userGuess)
				{
					//Display to the user they got the question wrong, and prompt them for another answer and record it
					System.out.print("Wrong answer. Enter another answer: ");
					userGuess = input.nextInt();
					attempts++;
					System.out.println("Attempts: " + attempts);
				}
				
				//If the user still didn't get the correct answer increase attempts by 1 for later point calculation
				if(answer != userGuess)
				{
					correctAnswer = false;
					attempts++;
				}
			}
			else if(answer == userGuess)
			{
				correctAnswer = true;
				attempts = 0;
			}
		}
		//Display the users score for when they decide to end the game.
		System.out.println("Your score is: " + points);
		System.out.println("Thank you for playing! I hope you enjoyed, have a great day!");

	}

}
/*Screen dump



*/