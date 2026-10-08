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
		return((float) days);
	}
	
	public static void getHrsToMins()
	{
		
	}
	
	public static void getMinsToHrs()
	{
		
	}
	
	public static void main(String[] args) 
	{
		//Declare variables
		final int FLAG = -1;
		int choice = 0;
		int intDays = 0, intHours = 0, intminutes = 0;
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
				floatDays = (float) getHrsToDays(intHours, 0);
				
				//Convert the amount of days calculated to a separate string value for later calculations
				String stringDays = String.valueOf(floatDays);
				int decimalCheck = stringDays.indexOf('.');
				
				//Part 1 of determining if the number of days calculated is a full number by checking the tenths place value of the amount of days calculated
				char tenthsPlace = stringDays.charAt(decimalCheck + 1);
				String stringTenths = String.valueOf(tenthsPlace);
				boolean tenthsCheck = stringTenths.equals("0");
				System.out.println(tenthsPlace);
				System.out.println(tenthsCheck);
				
				//Part 2 of determining if the number of days calculated is a full number by checking the hundredths place value of the amount of days calculated
				char hundredthsPlace = stringDays.charAt(decimalCheck + 2);
				String stringHundredths = String.valueOf(hundredthsPlace);
				boolean hundredthsCheck = stringHundredths.equals("0");
				System.out.println(hundredthsPlace);
				System.out.println(hundredthsCheck);
				
				//Convert the amount of days to an integer if both the hundreths and tenths place values are equal to 0
				if(tenthsCheck == true && hundredthsCheck == true)
				{
					intDays = (int) floatDays;
				}
				//Convert the amount of days to just 2 decimal places if either the hundredths or tenths is not equal to 0
				else if(tenthsCheck == false || hundredthsCheck == false)
				{
					BigDecimal daysDecimal = new BigDecimal(Float.toString(floatDays));
					daysDecimal = daysDecimal.setScale(2, RoundingMode.HALF_UP);
					floatDays = daysDecimal.floatValue();
				}
				
				//Display the amount of days are in how many hours the user entered
				System.out.println();
				if(tenthsCheck == true && hundredthsCheck == true)
				{
					System.out.println("There is " + intDays + " day(s) in " + intHours + " hour(s).");
				}
				else if (tenthsCheck == false || hundredthsCheck == false)
				{
					System.out.println("There is " + floatDays + " day(s) in " + intHours + " hour(s).");
				}
				System.out.println();
			}
			
		}
		System.out.println("Thank you for using my program!");

	}

}
