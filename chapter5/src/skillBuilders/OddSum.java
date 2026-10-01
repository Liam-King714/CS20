package skillBuilders;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int userNumber, oddSum = 0, number = 1;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a number and record it
		System.out.print("Enter a number: ");
		userNumber = input.nextInt();
		
		//Create a loop that will check if the numbers in between 1 and the userNumber are odd and if so add it to the sum
		while (number != userNumber + 1)
		{
			switch (number % 2)
			{
			case 0:
				number++;
				break;
			case 1:
				oddSum += number;
				number++;
				break;
			
			}
			
		}
		
		//Display the sum of all the odd numbers
		System.out.println("The sum off all the odd numbers between 1 and " + userNumber + " is " + oddSum);

	}

}
