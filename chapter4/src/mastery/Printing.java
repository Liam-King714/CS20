/*

Program: Printing.java          Last Date of this Revision: September 24, 2026

Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and total price for the job.

*/
package mastery;

import java.util.Scanner;

public class Printing 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int copiesToPrint;
		float pricePerCopy1 = 0.30f, pricePerCopy2 = 0.28f, pricePerCopy3 = 0.27f, pricePerCopy4 = 0.26f, pricePerCopy5 = 0.25f;
		float totalCost;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for how many copies they want to print and record their answer
		System.out.print("Enter the number of copies to be printed: ");
		copiesToPrint = input.nextInt();
		
		//Display the price per copy to the user based off how many copies they want
		if (copiesToPrint >= 0 && copiesToPrint <= 99)
		{
			System.out.print("Price per copy is: $0.30");
		}
		
		else if (copiesToPrint >= 100 && copiesToPrint <= 499)
		{
			System.out.print("Price per copy is: $0.28");
		}
		
		else if (copiesToPrint >= 500 && copiesToPrint <= 749)
		{
			System.out.print("Price per copy is: $0.27");
		}
		
		else if (copiesToPrint >= 750 && copiesToPrint <= 1000)
		{
			System.out.print("Price per copy is: $0.26");
		}
		
		else if (copiesToPrint > 1000)
		{
			System.out.print("Price per copy is: $0.25");
		}

	}

}

/*Screen dump



*/
