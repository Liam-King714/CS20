/*

Program: Adder.java          Last Date of this Revision: (date)

Purpose: The Adder game prompts a player for the answer to an addition problem. (Just as a note, the original assignment used 999 to quit, but i changed it to -1 because its faster for me to type).

*/
package mastery;

import java.util.Scanner;

public class AdderGame 
{
	
	public static void main(String[] args)
	{
		//Declare variables
		Adder test = new Adder("test");
		final int FLAG = -1;
		String equation;
		int userGuess = 0;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Create the loop system for the game
		while(FLAG != userGuess)
		{
			//Generate an addition problem for the user
			System.out.println(test);
			test.generateEquation();
			System.out.print("enter number: ");
			userGuess = input.nextInt();
		}

	}

}
/*Screen dump



*/