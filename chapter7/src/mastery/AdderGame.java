/*

Program: Adder.java          Last Date of this Revision: 11/18/2026

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
		int points = 0, userGuess = 0, answer = 0, attempts = 0, numOne = 0, numTwo = 0, firstTryCorrect = 0, secondTryCorrect = 0, thirdTryCorrect = 0, totalWrong = 0;
		boolean correctAnswer = false;
		Adder userStatsAndAns = new Adder(0,0,0,0,0,0);
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create the loop system for the game.
		while(FLAG != userGuess)
		{
			//Calculate the points added to the user's total points, and change firstTryRight, secondTryRight, thirdTryRight or totalWrong depending on how many attempts the user took and if they got the right answer
			userStatsAndAns.addPoints(attempts, correctAnswer);
			
			//Reset correctAnswer to false, and attempts to 1 for the next equation
			correctAnswer = false;
			attempts = 1;
			
			//Get the numbers for the current equation
			numOne = Adder.getNewNum();
			numTwo = Adder.getNewNum();
			answer = userStatsAndAns.getAnswer(numOne, numTwo);
			System.out.println("Answer: " + answer);
			System.out.println("Attempts: " + attempts);
			//Display the current equation to the user, and prompt them for the answer and record it, and increase the amount of attempts it took to answer this equation by 1
			Adder.displayEquation(numOne, numTwo);
			userGuess = input.nextInt();
			
			//If the user got the answer correct on the first try change correctAnswer to true for later point calculation
			if(answer == userGuess && FLAG != userGuess)
			{
				correctAnswer = true;
			}
			
			//If user got the answer wrong give them 2 more attempts
			else if(answer != userGuess && FLAG != userGuess)
			{
				while(answer != userGuess && attempts < 3 && FLAG != userGuess)
				{
					//Increase the amount of the attempts the user took for later point calculation
					attempts++;
					System.out.println("Attempts: " + attempts);
					//Display to the user they got the question wrong, and prompt them for another answer and record it
					System.out.print("Wrong answer. Enter another answer: ");
					userGuess = input.nextInt();
				}
				
				//If the user got the answer correct on the second or third attempt change correctAnswer to true to for later point calculation
				if(answer == userGuess && FLAG != userGuess)
				{
					correctAnswer = true;
				}
				
				//If the user got the answer wrong after all 3 attempts keep correctAnswer as false
				else if(answer != userGuess && FLAG != userGuess)
				{
					correctAnswer = false;
				}
			}
		}
		//Get the user's stats from userStatsAndAns instance
		firstTryCorrect = userStatsAndAns.getFirstRight();
		secondTryCorrect = userStatsAndAns.getSecondRight();
		thirdTryCorrect = userStatsAndAns.getThirdRight();
		totalWrong = userStatsAndAns.getTotalWrong();
		points = userStatsAndAns.getPoints();
		
		//Display the users score for when they decide to end the game.
		System.out.println();
		System.out.println("Your score is: " + points);
		System.out.println("You got " + firstTryCorrect + " questions correct on your first try!");
		System.out.println("You got " + secondTryCorrect + " questions correct on your second try!");
		System.out.println("You got " + thirdTryCorrect + " questions correct on your third try!");
		System.out.println("You got " + totalWrong + " questions wrong.");
		System.out.println("Thank you for playing! I hope you enjoyed, have a great day!");

	}

}
/*Screen dump



*/