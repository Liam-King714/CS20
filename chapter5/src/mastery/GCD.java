/*

Program: GCD.java          Last Date of this Revision: October 2, 2026

Purpose: Create a GCD application that prompts the user for two non-negative integers then displays the greatest common divisor (GCD) of the two numbers.

*/
package mastery;

import java.util.Scanner;

public class GCD 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int num1, num2, temp, gcd = 0;

		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the first and second number and record the inputs
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter a second number: ");
		num2 = input.nextInt();
		
		//Calculate the GCD between the two numbers the user entered
		while (num2 > 0)
		{
			temp = num1 % num2;
			num1 = num2;
			num2 = temp;
			if (temp != 0)
			{
				gcd = temp;
			}

		}
		
		//Display the GCD to the user
		System.out.print("The GCD is " + gcd);

	}

}
/*Screen dump

Enter a number: 32
Enter a second number: 40
The GCD is 8


Enter a number: 48
Enter a second number: 29
The GCD is 1

*/
