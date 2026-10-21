/*

Program: MetricConversion.java          Last Date of this Revision: (date)

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

*/

package mastery;

import java.util.Scanner;

public class MetricConversion 
{
	public static float inToCm(float inches)
	{
		float centimeters;
		centimeters = (float) (inches * 2.54);
		return(centimeters);
	}
	
	public static float ftToCm(float feet)
	{
		float centimeters;
		centimeters = (float) (feet * 30.48);
		return(centimeters);
	}
	
	public static float ydToM(float yards)
	{
		float meters;
		meters = (float) (yards * 0.9144);
		return(meters);
	}
	
	public static float miToKm(float miles)
	{
		float kilometers;
		kilometers = (float) (miles * 1.609344);
		return(kilometers);
	}
	
	public static float cmToIn(float centimeters)
	{
		float inches;
		inches = (float) (centimeters / 2.54);
		return(inches);
	}
	
	public static float cmToFt(float centimeters)
	{
		float feet;
		feet = (float) (centimeters / 30.48);
		return(feet);
	}
	
	public static float mToYd(float meters)
	{
		float yards;
		yards = (float) (meters * 1.093613298);
		return(yards);
	}
	
	public static float kmToMi(float kilometers)
	{
		float miles;
		miles = (float) (kilometers / 1.609344);
		return(miles);
	}

	public static void main(String[] args) 
	{
		//Declare variables
		final int FLAG = -1;
		int conversionType = 0;
		float userInput = 0, conversionOutput = 0;
		
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
				//Prompt the user for the number of inches and record it
				System.out.println();
				System.out.print("Enter amount of inches: ");
				userInput = input.nextFloat();
				
				//Call on the inches to centimeters method to get the amount of centimeters from inches
				conversionOutput = inToCm(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " inches is equal too " + conversionOutput + " centimeters.");
				System.out.println();
			}
			//Use an else if statement for the feet to centimeters conversion
			else if(conversionType == 2)
			{
				//Prompt the user for the number of feet and record it
				System.out.println();
				System.out.print("Enter amount of feet: ");
				userInput = input.nextFloat();
				
				//Call on the feet to centimeters method to get the amount of centimeters from feet the user entered
				conversionOutput = ftToCm(userInput);
				
				//Display the amount of centimeters are in the amount of feet the user entered
				System.out.println();
				System.out.println(userInput + " feet is equal too " + conversionOutput + " centimeters.");
				System.out.println();
			}
			//Use an else if statement for the yards to meters conversion
			else if(conversionType == 3)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of yards: ");
				userInput = input.nextFloat();
				
				//Call on the yards to meters method to get the amount of meters from yards the user entered
				conversionOutput = ydToM(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " yards is equal too " + conversionOutput + " meters.");
				System.out.println();
			}
			//Use an else if statement for the miles to kilometers conversion
			else if(conversionType == 4)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of miles: ");
				userInput = input.nextFloat();
				
				//Call on the  to  method to get the amount of  from 
				conversionOutput = miToKm(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " miles is equal too " + conversionOutput + " kilometers.");
				System.out.println();
			}
			//Use an else if statement for the centimeters to inches conversion
			else if(conversionType == 5)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of centimeters: ");
				userInput = input.nextFloat();
				
				//Call on the  to  method to get the amount of  from 
				conversionOutput = cmToIn(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " centimeters is equal too " + conversionOutput + " inches.");
				System.out.println();
			}
			//Use an else if statement for the centimeters to feet conversion
			else if(conversionType == 6)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of centimeters: ");
				userInput = input.nextFloat();
				
				//Call on the  to  method to get the amount of  from 
				conversionOutput = cmToFt(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " centimeters is equal too " + conversionOutput + " feet.");
				System.out.println();
			}
			//Use an else if statement for the meters to yards conversion
			else if(conversionType == 7)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of meters: ");
				userInput = input.nextFloat();
				
				//Call on the  to  method to get the amount of  from 
				conversionOutput = mToYd(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " meters is equal too " + conversionOutput + " yards.");
				System.out.println();
			}
			//Use an else if statement for the kilometers to miles conversion
			else if(conversionType == 8)
			{
				//Prompt the user for the number of  and record it
				System.out.println();
				System.out.print("Enter amount of kilometers: ");
				userInput = input.nextFloat();
				
				//Call on the  to  method to get the amount of  from 
				conversionOutput = kmToMi(userInput);
				
				//Display the amount of centimeters are in the amount of inches the user entered
				System.out.println();
				System.out.println(userInput + " kilometers is equal too " + conversionOutput + " miles.");
				System.out.println();
			}
			//Create an else if statement for if the user enters something other than -1, or 1-8
			else if(conversionType != -1 && conversionType != 1 && conversionType != 2 && conversionType != 3 && conversionType != 4 && conversionType != 5 && conversionType != 6 && conversionType != 7 && conversionType != 8)
			{
				System.out.println("Enter a valid number (-1 to quit or 1-8)");
				System.out.println();
			}
		}
		System.out.println("Thank you for using my program!");

	}

}
/*Screen dump

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 8

Enter amount of kilometers: 9

9.0 kilometers is equal too 5.592341 miles.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 8

Enter amount of kilometers: 6.5

6.5 kilometers is equal too 4.038913 miles.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 5

Enter amount of centimeters: 30

30.0 centimeters is equal too 11.811024 inches.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 5

Enter amount of centimeters: 34.14

34.14 centimeters is equal too 13.440945 inches.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): -1
Thank you for using my program!


Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 3

Enter amount of yards: 45

45.0 yards is equal too 41.148 meters.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 4

Enter amount of miles: 12

12.0 miles is equal too 19.312128 kilometers.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 1

Enter amount of inches: 124

124.0 inches is equal too 314.96 centimeters.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 2

Enter amount of feet: 251

251.0 feet is equal too 7650.48 centimeters.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 7

Enter amount of meters: 24

24.0 meters is equal too 26.24672 yards.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): 6

Enter amount of centimeters: 12

12.0 centimeters is equal too 0.39370078 feet.

Convert:
1. Inches to Centimeters	5. Centimeters to Inches
2. Feet to Centimeters		6. Centimeters to Feet
3. Yards to Meters		7. Meters to Yards
4. Miles to Kilometers		8. Kilometers to Miles

Enter your Choice (-1 to quit): -1
Thank you for using my program!


*/