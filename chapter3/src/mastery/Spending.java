/*

Program: Spending.java          Last Date of this Revision: September 22, 2026

Purpose: Create a Spending application to help examine the spending patterns of a user.

*/
package mastery;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		//Declare variables and create a strings for the categories to be used for later formating
		int food, clothing, entertainment, rent, totalBudget = 0;
		double foodBudgetPercent, clothingBudgetPercent, entertainmentBudgetPercent, rentBudgetPercent;
		String stringFoodPercent;
		String stringClothingPercent;
		String stringEntertainmentPercent;
		String stringRentPercent;
		
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
		
		//Calculate the percent of the budget that food, clothing, entertainment, and rent took up while rounding it to 2 decimal places
		foodBudgetPercent = ((double) food / totalBudget) * 100;
		clothingBudgetPercent = ((double) clothing / totalBudget) * 100;
		entertainmentBudgetPercent = ((double) entertainment / totalBudget) * 100;
		rentBudgetPercent = ((double) rent / totalBudget) * 100;
		BigDecimal foodBudgetDecimal = new BigDecimal(Double.toString(foodBudgetPercent));
		BigDecimal clothingBudgetDecimal = new BigDecimal(Double.toString(clothingBudgetPercent));
		BigDecimal entertainmentBudgetDecimal = new BigDecimal(Double.toString(entertainmentBudgetPercent));
		BigDecimal rentBudgetDecimal = new BigDecimal(Double.toString(rentBudgetPercent));
		foodBudgetDecimal = foodBudgetDecimal.setScale(2, RoundingMode.HALF_UP);
		clothingBudgetDecimal = clothingBudgetDecimal.setScale(2, RoundingMode.HALF_UP);
		entertainmentBudgetDecimal = entertainmentBudgetDecimal.setScale(2, RoundingMode.HALF_UP);
		rentBudgetDecimal = rentBudgetDecimal.setScale(2, RoundingMode.HALF_UP);
		
		//Convert the rounded percentage decimals to strings for formatting when outputting budget percents to user
		stringFoodPercent = foodBudgetDecimal.toPlainString();
		stringClothingPercent = clothingBudgetDecimal.toPlainString();
		stringEntertainmentPercent = entertainmentBudgetDecimal.toPlainString();
		stringRentPercent = rentBudgetDecimal.toPlainString();
		
		//Display the percent of the budget that each category takes up
		System.out.println();
		System.out.printf("%-17s %-5s%n", "Category", "Budget");
		System.out.printf("%-17s %-5s%n", "Food", stringFoodPercent + "%");
		System.out.printf("%-17s %-5s%n", "Clothing", stringClothingPercent + "%");
		System.out.printf("%-17s %-5s%n", "Entertainment", stringEntertainmentPercent + "%");
		System.out.printf("%-17s %-5s%n", "Rent", stringRentPercent + "%");
		
	}

}

/*Screen dump

Enter the amount spent last month on the following items:

Food: $350
Clothing: $300
Entertainment: $200
Rent: $1250

Category          Budget
Food              16.67%
Clothing          14.29%
Entertainment     9.52%
Rent              59.52%


Enter the amount spent last month on the following items:

Food: $618
Clothing: $984
Entertainment: $281
Rent: $1383

Category          Budget
Food              18.92%
Clothing          30.13%
Entertainment     8.60%
Rent              42.35%

*/