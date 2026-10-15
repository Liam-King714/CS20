package skillBuilders;

import java.util.Scanner;

public class Exponentiation 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int num1, num2, finalNum;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for two numbers and record them
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter a second number: ");
		num2 = input.nextInt();
		
		//Raise the first number the user entered by the power of the second number and record it
		finalNum = (int) Math.pow(num1, num2);
		
		//Display the final number to the user
		System.out.print(num1 + " raised by " + num2 + " is equal to " + finalNum);

	}

}
