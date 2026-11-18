/*

Program: MySavings.java          Last Date of this Revision: (date)

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy back and then prompts the user to make a selection.

*/

package mastery;

import java.util.Scanner;

public class MySavings
{

	public static void main(String[] args) 
	{
		//Declare variables, and create a new PiggyBank instance
		final int FLAG = 0;
		int choice = -1, quartersRemoved = 0, dimesRemoved = 0, nickelsRemoved = 0, penniesRemoved = 0;
		PiggyBank bank = new PiggyBank(0,0,0,0);
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create the game loop for the user
		while(FLAG != choice)
		{
			//Display the choices the user has
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a quarter.");
			System.out.println("3. Add a dime.");
			System.out.println("4. Add a nickel.");
			System.out.println("5. Add a penny.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit.");
			
			//Prompt the user for their choice and record it
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
		}

	}

}
/*Screen dump



*/
