package skillBuilders;

import java.util.Scanner;

public class GradeConverter 
{
	public static boolean isValidNumber(int userNum, int minNum, int maxNum)
	{
		if(minNum <= userNum && userNum <= maxNum)
		{
			return(true);
		}
		else
		{
			return(false);
		}
		
	}
	
	
	public static String getLetterGrade(int numGrade)
	{
		if(numGrade < 60)
		{
			return("F");
		}
		
		else if(numGrade < 70)
		{
			if(numGrade == 69)
			{
				return("D+");
			}
			else
			{
				return("D");
			}
		}
		
		else if(numGrade < 80)
		{
			if(numGrade == 79)
			{
				return("C+");
			}
			else
			{
				return("C");
			}
		}
		
		else if(numGrade < 90)
		{
			if(numGrade == 89)
			{
				return("B+");
			}
			else
			{
				return("B");
			}
		}
		
		else if(numGrade < 100)
		{
			return("A");
		}
		
		else
		{
			return("A+");
		}
		
	}
	

	public static void main(String[] args) 
	{
		//Declaration area
		final int FLAG = -1;
		final int minValue = 0;
		final int maxValue = 100;
		
		int numericGrade;
		String letterGrade;
		
		//Prepare for input
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.println("Enter a numeric grade (-1 to quit): ");
		
		//Record user input in numericGrade
		numericGrade = input.nextInt();
		
		while(numericGrade != FLAG)
		{
			if(isValidNumber(numericGrade, minValue, maxValue))
			{
				letterGrade = getLetterGrade(numericGrade);
				System.out.println("The grade " + numericGrade + " is a(n) " + letterGrade + ".");
			}
			else
			{
				System.out.println("Grade entered is not valid.");
			}
			//Get user input
			System.out.println("Enter a numeric grade (-1 to quit): ");
			
			//Record user input in numericGrade
			numericGrade = input.nextInt();
		}
		
		System.out.println("Thank you for using our program");

	}

}
