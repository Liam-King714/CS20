package skillBuilders;

import java.util.Scanner;

public class NumbersSum 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int userNumber, sum = 0;
		int number = 1;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a number
		System.out.print("Enter a number: ");
		userNumber = input.nextInt();
		
		//Make a loop that will display ever number from 1 to the userNumber and add all the numbers to the sum
		while (number != userNumber + 1)
		{
			System.out.println(number);
			sum += number;
			number++;
		}
		
		//Display the sum of all the numbers from 1 to the userNumber
		System.out.print("The sum is: " + sum);

	}

}
