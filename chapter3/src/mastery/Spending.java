/*

Program: Spending.java          Last Date of this Revision: September 21, 2026

Purpose: Create a Spending application to help examine the spending patterns of a user.

*/
package mastery;

import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int food, clothing, entertainment, rent, totalBudget = 0;
		double foodBudgetPercent, clothingBudgetPercent, entertainmentBudgetPercent, rentBudgetPercent;
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the amount of money they spent on food, clothing, entertainment, and rent last month, and add it to the total budget
		System.out.println("Enter the amount spent last month on the following items:");
		System.out.println();
		System.out.print("Food: $");
		food = input.nextInt();
		totalBudget += food;
		System.out.print("Clothing: $");
		clothing = input.nextInt();
		totalBudget += clothing;
		System.out.print("Entertainment: $");
		entertainment = input.nextInt();
		totalBudget += entertainment;
		System.out.print("Rent: $");
		rent = input.nextInt();
		totalBudget += rent;
		
		//Calculate the percent of the budget that food, clothing, entertainment, and rent took up
		foodBudgetPercent = ((double) food / totalBudget) * 100;
		clothingBudgetPercent = ((double) clothing / totalBudget) * 100;
		entertainmentBudgetPercent = ((double) entertainment / totalBudget) * 100;
		rentBudgetPercent = ((double) rent / totalBudget) * 100;
		
	}

}

/*Screen dump



*/