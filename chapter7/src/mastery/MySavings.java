/*

Program: MySavings.java          Last Date of this Revision: 11/19/2026

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
		int choice = -1, quartersRemoved, dimesRemoved, nickelsRemoved, penniesRemoved;
		PiggyBank bank = new PiggyBank(0,0,0,0);
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create the game loop for the user
		while(FLAG != choice)
		{
			//Create a space between the last choice for an easier way to keep up with output so that it isn't cluttered
			if(choice != -1 && FLAG != choice)
			{
				System.out.println();
			}
			
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
			
			//Separate the choice selection menu from the choice the user chose to reduce clutter
			System.out.println();
			
			//Create the if statement for the first choice, show total money in the bank
			if(choice == 1 && FLAG != choice)
			{
				//Display the total amount of money in the user's bank, how much of each coin they have, and the amount of money each coin contributes to the total
				bank.showTotalInBank();
			}
			
			//Create the else if statement for the second choice, add a quarter
			else if(choice == 2 && FLAG != choice)
			{
				//Add a quarter to the user's bank
				bank.addAQuarter();
			}
			
			//Create the else if statement for the third choice, add a dime
			else if(choice == 3 && FLAG != choice)
			{
				//Add a dime to the user's bank
				bank.addADime();
			}
			
			//Create the else if statement for the fourth choice, add a nickel
			else if(choice == 4 && FLAG != choice)
			{
				//Add a nickel to the user's bank
				bank.addANickel();
			}
			
			//Create the else if statement for the fifth choice, add a penny
			else if(choice == 5 && FLAG != choice)
			{
				//Add a penny to the user's bank
				bank.addAPenny();
			}
			
			//Create the else if statement for the sixth choice, remove money from bank
			else if(choice == 6 && FLAG != choice)
			{
				//Prompt the user for how many quarters they want to remove, and record their answer
				System.out.print("Enter the amount of quarters you want to remove: ");
				quartersRemoved = input.nextInt();
				
				//Prompt the user for how many dimes they want to remove, and record their answer
				System.out.print("Enter the amount of dimes you want to remove: ");
				dimesRemoved = input.nextInt();
				
				//Prompt the user for how many nickels they want to remove, and record their answer
				System.out.print("Enter the amount of nickels you want to remove: ");
				nickelsRemoved = input.nextInt();
				
				//Prompt the user for how many pennies they want to remove, and record their answer
				System.out.print("Enter the amount of pennies you want to remove: ");
				penniesRemoved = input.nextInt();
				
				//Separate the coin removal prompts from the amount taken out displays
				System.out.println();
				
				/*
				* If the user took out more coins than they have (ex: they have 20 quarters and tried to remove 25), display to them that
				* they couldn't take out that many, and the value won't be removed from their total money.
				* 
				* If the user takes out as many coins that they have or less coins than they have, (ex: they have 30 dimes and take out 19, or take out 30),
				* display to them how many of the coin they took out and how much the coin removed contributed to the total money removed
				* (ex: took out 2 quarters, contributed $0.50 to the total removed).
				* 
				* Finally display to the user the total amount of money removed, and how much money they how have total.
				*/
				bank.takeCoinsOutOfBank(quartersRemoved, dimesRemoved, nickelsRemoved, penniesRemoved);
				
				//Reset coins removed values back to 0
				quartersRemoved = 0;
				dimesRemoved = 0;
				nickelsRemoved = 0;
				penniesRemoved = 0;
			}
			
			//Create an else if statement for if the user does NOT choose to enter 1 of the 6 choices, or does NOT choose to quit
			else if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && FLAG != choice)
			{
				System.out.println("Please enter a valid choice (1-6), and if you with to quit enter 0.");
			}
		}
		
		//Thank the user for playing when they decide to quit
		System.out.println("Thank you for playing, have a great day!");

	}

}
/*Screen dump

Screen dump #1:
1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1

You have $0.00 in quarters, which is 0 quarter(s).
You have $0.00 in dimes, which is 0 dime(s).
You have $0.00 in nickels, which is 0 nickel(s).
You have $0.00 in pennies, which is 0 penny(ies).
You have a total of $0.00 in your bank.

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2

You put 1 quarter into your bank. You now have 1 quarter(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 3

You put 1 dime into your bank. You now have 1 dime(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 4

You put 1 nickel into your bank. You now have 1 nickel(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

You put 1 penny into your bank. You now have 1 penny(ies).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2

You put 1 quarter into your bank. You now have 2 quarter(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 3

You put 1 dime into your bank. You now have 2 dime(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 4

You put 1 nickel into your bank. You now have 2 nickel(s).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5

You put 1 penny into your bank. You now have 2 penny(ies).

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 6

Enter the amount of quarters you want to remove: 3
Enter the amount of dimes you want to remove: 1
Enter the amount of nickels you want to remove: 2
Enter the amount of pennies you want to remove: 4

You weren't able to take out 3 quarter(s). You still have 2 quarter(s).
And they will not be included in the amount removed.
You took out 1 dime(s) for a value of $0.10.
You took out 2 nickel(s) for a value of $0.10.
You weren't able to take out 4 penny(ies). You still have 2 penny(ies).
And they will not be included in the amount removed.
You took out a total of $0.20 and now have $0.62 remaining.

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 
1

You have $0.50 in quarters, which is 2 quarter(s).
You have $0.10 in dimes, which is 2 dime(s).
You have $0.00 in nickels, which is 2 nickel(s).
You have $0.02 in pennies, which is 2 penny(ies).
You have a total of $0.62 in your bank.

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0

Thank you for playing, have a great day!

Screen dump #2:
1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 9

Please enter a valid choice (1-6), and if you with to quit enter 0.

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 6

Enter the amount of quarters you want to remove: 1
Enter the amount of dimes you want to remove: 1
Enter the amount of nickels you want to remove: 1
Enter the amount of pennies you want to remove: 1

You weren't able to take out 1 quarter(s). You still have 0 quarter(s).
And they will not be included in the amount removed.
You weren't able to take out 1 dime(s). You still have 0 dime(s).
And they will not be included in the amount removed.
You weren't able to take out 1 nickel(s). You still have 0 nickel(s).
And they will not be included in the amount removed.
You weren't able to take out 1 penny(ies). You still have 0 penny(ies).
And they will not be included in the amount removed.
You took out a total of $0.00 and now have $0.00 remaining.

1. Show total in bank.
2. Add a quarter.
3. Add a dime.
4. Add a nickel.
5. Add a penny.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0

Thank you for playing, have a great day!


*/
