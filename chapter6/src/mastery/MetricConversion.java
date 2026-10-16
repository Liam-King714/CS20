/*

Program: MetricConversion.java          Last Date of this Revision: (date)

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

*/

package mastery;

import java.util.Scanner;

public class MetricConversion 
{
	public static float inToCm(int inches, float centimeters)
	{
		return(centimeters);
	}
	
	public static float ftToCm(int feet, float centimeters)
	{
		return(centimeters);
	}
	
	public static float ydToM(int yards, float meters)
	{
		return(meters);
	}
	
	public static float miToKm(int miles, float kilometers)
	{
		return(kilometers);
	}
	
	public static float cmToIn(int centimeters, float inches)
	{
		return(inches);
	}
	
	public static float cmToFt(int centimeters, float feet)
	{
		return(feet);
	}
	
	public static float mToYd(int meters, float yards)
	{
		return(yards);
	}
	
	public static float kmToMi(int kilometers, float miles)
	{
		return(miles);
	}

	public static void main(String[] args) 
	{
		//Declare variables
		final int FLAG = -1;
		int userInput = 0, conversionType = 0;
		float conversionOutput = 0;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Create a loop for the user to continue using conversions until they wish to quit
		while(conversionType != FLAG)
		{
			//Display the conversion options to the user
			System.out.println("Convert:");
			System.out.println("1. Inches to Centimeters	5. Centimeters to Inches");
			System.out.println("2. Feet to Centimeters		6. Centimeters to Feet");
			System.out.println("3. Yards to Meters		7. Meters to Yards");
			System.out.println("4. Miles to Kilometers		8. Kilometers to Miles");
			System.out.println();
			
			//Prompt the user to enter which conversion they wish to use while giving them the option to quit and record their answer
			System.out.print("Enter your Choice (-1 to quit): ");
			conversionType = input.nextInt();
			
			//Use an if statement for the inches to centimeters conversion
			if(conversionType == 1)
			{
				
			}
			//Use an else if statement for the feet to centimeters conversion
			else if(conversionType == 2)
			{
				
			}
			//Use an else if statement for the yards to meters conversion
			else if(conversionType == 3)
			{
				
			}
			//Use an else if statement for the miles to kilometers conversion
			else if(conversionType == 4)
			{
				
			}
			//Use an else if statement for the centimeters to inches conversion
			else if(conversionType == 5)
			{
				
			}
			//Use an else if statement for the centimeters to feet conversion
			else if(conversionType == 6)
			{
				
			}
			//Use an else if statement for the meters to yards conversion
			else if(conversionType == 7)
			{
				
			}
			//Use an else if statement for the kilometers to centimeters conversion
			else if(conversionType == 8)
			{
				
			}
		}
		System.out.println("Thank you for using my program!");

	}

}
/*Screen dump



*/