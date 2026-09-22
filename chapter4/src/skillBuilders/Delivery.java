package skillBuilders;

import java.util.Scanner;

public class Delivery 
{

	public static void main(String[] args) 
	{
		//Declare variables
		float length, width, height;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the length, width and height of the package and record it
		System.out.print("Enter the length of your package: ");
		length = input.nextFloat();
		System.out.print("Enter the width of your package: ");
		width = input.nextFloat();
		System.out.print("Enter the height of your package: ");
		height = input.nextFloat();
		
		//Use if and else statements to determine if the package is going to be accepted for rejected based of the dimensions of the package
		if (length < 10 && width < 10 && height < 10)
		{
			System.out.print("Accept");
			
		}
		else
		{
			System.out.print("Reject");
			
		}

	}

}
