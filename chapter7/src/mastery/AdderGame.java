/*

Program: Adder.java          Last Date of this Revision: 10/29/2026

Purpose: The Adder game prompts a player for the answer to an addition problem. (Just as a note, the original assignment used 999 to quit, but I changed it to -1 in my version because its faster for me to type).

*/
package mastery;

import java.util.Scanner;

public class AdderGame 
{
	
	public static void main(String[] args)
	{
		//Declare variables.
		final int FLAG = -1;
		int points = 0, userGuess = 0, answer = 0, attempts = 3;
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create the loop system for the game.
		while(FLAG != userGuess)
		{
			//Generate an addition problem and display it for the user, and record the answer to the equation.
			Adder.generateEquation();
			answer = Adder.getAnswer();
			
			//Prompt the user to answer the current problem.
			userGuess = input.nextInt();
			
			//Use an if statement to reset the users attempts if they were right.
			if(userGuess != answer && userGuess != FLAG)
			{
				while(userGuess != answer && attempts != 1)
				{
					//Deducts one attempt from the user.
					attempts -= 1;
					
					//Display to the user that they were wrong and prompt them for another answer.
					System.out.print("Wrong answer. Enter another answer: ");
					
					//Record the users new answer
					userGuess = input.nextInt();
				}
				
				//Resets the users attempts if they never got the correct answer.
				if(userGuess != answer)
				{
					attempts = 3;
				}
			}
			
			//Use an if statement that will give points to the user based off how many attempts they had left then reset their attempts.
			if(userGuess == answer)
			{
				//Create the first nested if statement to assign 5 points for getting the answer on the first try.
				if(attempts == 3)
				{
					points += 5;
				}
				
				//Create the second nested if statement to assign 3 points for getting the answer on the second try.
				if(attempts == 2)
				{
					points += 3;
				}
				
				//Create the third nested if statement to assign 1 point for getting the answer on the third try.
				if(attempts == 1)
				{
					points += 1;
				}
				
				//Reset the amount of attempts for the user.
				attempts = 3;
			}
		}
		
		//Display the users score for when they decide to end the game.
		System.out.println("Your score is: " + points);
		System.out.println("Thank you for playing! I hope you enjoyed, have a great day!");

	}

}
/*Screen dump

19 + 17 = 37
Wrong answer. Enter another answer: 36
1 + 10 = 11
2 + 12 = 14
11 + 1 = 12
3 + 17 = 20
19 + 11 = 30
11 + 11 = 22
9 + 13 = 21
Wrong answer. Enter another answer: 22
5 + 0 = 5
6 + 1 = 7
3 + 15 = 17
Wrong answer. Enter another answer: 19
Wrong answer. Enter another answer: 18
0 + 1 = 1
11 + 14 = 3
Wrong answer. Enter another answer: 24
Wrong answer. Enter another answer: 6
9 + 13 = 22
15 + 14 = 29
16 + 11 = -1
Your score is: 62
Thank you for playing! I hope you enjoyed, have a great day!


18 + 3 = 21
11 + 8 = 19
6 + 9 = 15
17 + 10 = 27
1 + 12 = 13
8 + 4 = 12
10 + 1 = 11
2 + 5 = 7
8 + 1 = 9
11 + 11 = 22
10 + 8 = 18
13 + 14 = 27
9 + 13 = 22
9 + 2 = 11
13 + 18 = 31
15 + 6 = 21
9 + 11 = 20
11 + 6 = 17
5 + 7 = 12
17 + 8 = 25
7 + 14 = 21
4 + 7 = 11
9 + 18 = 27
10 + 12 = 22
4 + 14 = 18
14 + 7 = 21
17 + 14 = 31
2 + 9 = 11
7 + 2 = 9
1 + 2 = 3
2 + 17 = -1
Your score is: 150
Thank you for playing! I hope you enjoyed, have a great day!

*/