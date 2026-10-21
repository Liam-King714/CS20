/*

Program: Nim.java          Last Date of this Revision: (date)

Purpose: Create a Nim application that allows the user to play against the computer.

*/

package mastery;

import java.util.Scanner;

public class Nim 
{
	public static boolean isValidEntry(int stones, int minNum, int maxNum, int userNum)
	{
		if(minNum <= userNum && userNum <= maxNum && userNum <= stones)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public static int drawStones(int stones, int minNum, int maxNum)
	{
		int stonesDrawn;
		stonesDrawn = (int) ((maxNum - minNum + 1) * Math.random() + minNum);
		return(stonesDrawn);
	}
	
	public static int getStartingStones(int max, int min)
	{
		int stones;
		stones = (int) ((max - min + 1) * Math.random() + min);
		return(stones);
	}
	
	public static String getWinnerOrLoserMessage(boolean userWin)
	{
		if(userWin == true)
		{
			return("The computer wins! Better luck next time!");
		}
		else
		{
			return("Congratulations you win!");
		}
	}

	public static void main(String[] args) 
	{
		//Declare variables
		int stones = 0, minDraw = 1, maxDraw = 3, minStones = 15, maxStones = 30, userDraw, computerDraw;
		boolean validUserNum, userWin = false, userTurn = true, userPlaying = true;
		String endMessage;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Generate the amount of stones the game will start with
		stones = getStartingStones(maxStones, minStones);
		
		//Create the loop system that will be the game the user plays against the computer
		while(userPlaying == true)
		{
			//Create an if statement for the users turn
			if(stones != 0)
			{
				//Create a loop for the users turn
				while(userTurn == true)
				{
					//Display the amount of stones to the user then ask how many they would like to take out
					System.out.print("There are " + stones + " stones. How many would you like? ");
				
					//Get the user input for how many stones they want to take and record it
					userDraw = input.nextInt();
				
					//Check if the amount of stones the user withdrew is a valid number
					validUserNum = isValidEntry(stones, minDraw, maxDraw, userDraw);
				
					//Use if and else if statements to determine how the program will continue based on the validUserNum variable being true or false
					if(validUserNum == false)
					{
						System.out.println("Enter a valid number (1-3)");
					}
					else if(validUserNum == true && stones > 0)
					{
						//Change to the computers turn and subtract the stones the user took
						stones -= userDraw;
						userTurn = false;
					}
				}
				
				//Create an if statement for the computers turn
				if(stones != 0)
				{
					//Move onto the computers turn and generate the number of stones the computer will take
					computerDraw = drawStones(stones, minDraw, maxDraw);
			
					//Use an if statement to check if the computer is taking more stones than available
					if(computerDraw > stones)
					{
						while(computerDraw > stones)
						{
							computerDraw = drawStones(stones, minDraw, maxDraw);
						}
					}
				
					//Display the amount of stones the computer drew too the user
					System.out.println("There are " + stones + " stones. The computer takes " + computerDraw + " stone(s)");
			
					//remove the amount of stones the computer drew from the total amount of stones and change back to the users turn if there are still stones remaining
					stones -= computerDraw;
					if(stones > 0)
					{
					userTurn = true;
					}
				}
				//Use an else if statement to confirm whether the user won or lost
				else if(stones == 0)
				{
					if(userTurn == true)
					{
						userWin = false;
					}
					else if(userTurn == false)
					{
						userWin = true;
					}
				}
			
			}
			//Use an else if statement to determine which message to output to the user if there are no more stones, and ask the user if they wish to play again
			else if(stones == 0)
			{
				//Use the getWinnerOrLoserMessage method to output the correct message
				endMessage = getWinnerOrLoserMessage(userWin);
				System.out.println(endMessage);
				userPlaying = false;
			}
		}
		System.out.println("Thank you for playing my program! Please play again later!");

	}

}
/*Screen dump

There are 22 stones. How many would you like? 3
There are 19 stones. The computer takes 2 stone(s)
There are 17 stones. How many would you like? 2
There are 15 stones. The computer takes 1 stone(s)
There are 14 stones. How many would you like? 3
There are 11 stones. The computer takes 1 stone(s)
There are 10 stones. How many would you like? 2
There are 8 stones. The computer takes 2 stone(s)
There are 6 stones. How many would you like? 3
There are 3 stones. The computer takes 1 stone(s)
There are 2 stones. How many would you like? 1
There are 1 stones. The computer takes 1 stone(s)
Congratulations you win!
Thank you for playing my program! Please play again later!


There are 18 stones. How many would you like? 3
There are 15 stones. The computer takes 3 stone(s)
There are 12 stones. How many would you like? 3
There are 9 stones. The computer takes 1 stone(s)
There are 8 stones. How many would you like? 2
There are 6 stones. The computer takes 3 stone(s)
There are 3 stones. How many would you like? 1
There are 2 stones. The computer takes 1 stone(s)
There are 1 stones. How many would you like? 1
The computer wins! Better luck next time!
Thank you for playing my program! Please play again later!


*/