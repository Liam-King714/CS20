package skillBuilders;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TimeConverter 
{
	public static int getDaysToHrs(int days, int hours)
	{
		hours = days * 24;
		return(hours);
	}
	
	public static float getHrsToDays(int hours, float days)
	{
		days = (float) hours / 24;
		return(days);
	}
	
	public static int getHrsToMins(int hours, int minutes)
	{
		minutes = hours * 60;
		return(minutes);
	}
	
	public static float getMinsToHrs(int minutes, float hours)
	{
		hours = (float) minutes / 60;
		return(hours);
	}
	
	public static void main(String[] args) 
	{
		//Declare variables
		final int FLAG = -1;
		int choice = 0;
		int intDays = 0, intHours = 0, intMinutes = 0;
		float floatDays = 0, floatHours = 0;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Create a loop that will prompt the user for their conversion choice then convert determine which conversion to use and then convert the numbers based on what the user entered
		while(choice != FLAG)
		{
			//Display the conversion choices to the user
			System.out.println("1. Days to Hours conversion.");
			System.out.println("2. Hours to Days conversion.");
			System.out.println("3. Hours to Minutes conversion.");
			System.out.println("4. Minutes to Hours conversion.");
			
			//Prompt the user for their time conversion choice and record it
			System.out.print("Enter your conversion (-1 to quit): ");
			choice = input.nextInt();
			
			//Create an if statement for the days to hours conversion.
			if(choice == 1)
			{
				//Prompt user for number of days then record it
				System.out.println();
				System.out.print("Enter number of days: ");
				intDays = input.nextInt();
				
				//Call on the days to hours conversion method and get the amount of hours in how many days the user entered
				intHours = getDaysToHrs(intDays, 0);
				
				//Display the amount of hours are in how many days the user entered
				System.out.println();
				System.out.println("There are " + intHours + " hours in " + intDays + " day(s).");
				System.out.println();
			}
			//Create an else if statement for the hours to days conversion
			else if(choice == 2)
			{
				//Prompt user for number of hours then record it
				System.out.println();
				System.out.print("Enter number of hours: ");
				intHours = input.nextInt();
				
				//Call on the hours to days conversion method and get the amount of days are in how many hours the user entered
				floatDays = getHrsToDays(intHours, 0);
				
				//Round the amount of days to just 2 decimal places
				BigDecimal daysDecimal = new BigDecimal(Float.toString(floatDays));
				daysDecimal = daysDecimal.setScale(2, RoundingMode.HALF_UP);
				floatDays = daysDecimal.floatValue();
				
				//Display the amount of days are in the amount of hours the user entered
				System.out.println();
				System.out.println("There are " + floatDays + " day(s) in " + intHours + " hour(s).");
				System.out.println();
			}
			//Create an else if statement for the hours to minutes conversion
			else if(choice == 3)
			{
				//Prompt user for number of hours then record it
				System.out.println();
				System.out.print("Enter number of hours: ");
				intHours = input.nextInt();
				
				//Call on the hours to minutes conversion method and get the amount of minutes in how many hours the user entered
				intMinutes = getHrsToMins(intHours, 0);
				
				//Display the amount of minutes are in how many hours the user entered
				System.out.println();
				System.out.println("There are " + intMinutes + " minutes in " + intHours + " hour(s).");
				System.out.println();
			}
			//Create an else if statement for the minutes to hours conversion
			else if(choice == 4)
			{
				//Prompt user for number of minutes then record it
				System.out.println();
				System.out.print("Enter number of minutes: ");
				intMinutes = input.nextInt();
				
				//Call on the hours to days conversion method and get the amount of days are in how many hours the user entered
				floatHours = getMinsToHrs(intMinutes, 0);
				
				//Round the amount of days to just 2 decimal places
				BigDecimal hoursDecimal = new BigDecimal(Float.toString(floatHours));
				hoursDecimal = hoursDecimal.setScale(2, RoundingMode.HALF_UP);
				floatHours = hoursDecimal.floatValue();
				
				//Display the amount of days are in the amount of hours the user entered
				System.out.println();
				System.out.println("There are " + floatHours + " hour(s) in " + intMinutes + " minute(s).");
				System.out.println();
			}
			//Create an else statement for if the user doesn't enter 1-4
			else if(choice != -1 && choice != 1 && choice != 2 && choice != 3 && choice != 4)
			{
				System.out.println();
				System.out.println("Please enter a valid integer (1-4).");
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("Thank you for using my program!");

	}

}
