/*

Program: Printing.java          Last Date of this Revision: September 28, 2026

Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and total price for the job.

*/
package mastery;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Printing 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int copiesToPrint;
		float pricePerCopy = 0;
		float totalCost;
				
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for how many copies they want to print and record their answer
		System.out.print("Enter the number of copies to be printed: ");
		copiesToPrint = input.nextInt();
		
		//Display the price per copy to the user based off how many copies they want and set the price per copy to the variable
		if (copiesToPrint >= 0 && copiesToPrint <= 99)
		{
			System.out.println("Price per copy is: $0.30");
			pricePerCopy = 0.30f;
		}
		
		else if (copiesToPrint >= 100 && copiesToPrint <= 499)
		{
			System.out.println("Price per copy is: $0.28");
			pricePerCopy = 0.28f;
		}
		
		else if (copiesToPrint >= 500 && copiesToPrint <= 749)
		{
			System.out.println("Price per copy is: $0.27");
			pricePerCopy = 0.27f;
		}
		
		else if (copiesToPrint >= 750 && copiesToPrint <= 1000)
		{
			System.out.println("Price per copy is: $0.26");
			pricePerCopy = 0.26f;
		}
		
		else if (copiesToPrint > 1000)
		{
			System.out.println("Price per copy is: $0.25");
			pricePerCopy = 0.25f;
		}
		
		//Calculate and Display the total cost to print all the copies to the user
		totalCost = (float) copiesToPrint * pricePerCopy;
		BigDecimal totalCostDecimal = new BigDecimal(Float.toString(totalCost));
		totalCostDecimal = totalCostDecimal.setScale(2, RoundingMode.HALF_UP);
		System.out.print("Total cost is: $" + totalCostDecimal);

	}

}

/*Screen dump

Enter the number of copies to be printed: 1001
Price per copy is: $0.25
Total cost is: $250.25


Enter the number of copies to be printed: 857
Price per copy is: $0.26
Total cost is: $222.82

*/
