package skillBuilders;

import java.util.Scanner;

public class PerfectSquare 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int userNumber;
		double squareRootNumber, squareRootSquared;
		boolean perfectSquareCheck;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for an integer and record it
		System.out.print("Enter an integer: ");
		userNumber = input.nextInt();
		
		//Calculate the square root of the number the user entered, then square the square root to determine whether its a perfect square or not
		squareRootNumber = (double) Math.sqrt(userNumber);
		squareRootSquared = (double) Math.pow(squareRootNumber, 2);
		perfectSquareCheck = squareRootSquared == userNumber;
		
		//Display whether the number is a perfect square or not
		if (perfectSquareCheck == true)
		{
			System.out.print(userNumber + " is a perfect square.");
			
		}
		
		else 
		{
			System.out.print(userNumber + " is not a perfect square.");
			
		}

	}

}
