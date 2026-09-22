package skillBuilders;

import java.util.Scanner;

public class Hurricane 
{

	public static void main(String[] args) 
	{
		//Declare variable
		int hurricaneCategory;
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the hurricane category and record it
		System.out.print("What is the hurricanes category (1-5): ");
		hurricaneCategory = input.nextInt();
		
		//Use if, and else if statements to determine which category the user entered and display to the user the proper hurricane wind speeds
		if (hurricaneCategory == 1)
		{
			System.out.print("Category 1: wind speeds of 74-95 mph or 64-82 kt, or 119-153 km/hr");
			
		}
		else if (hurricaneCategory == 2)
		{
			System.out.print("Category 2: wind speeds of 96-110 mph or 83-95 kt, or 154-177 km/hr");
			
		}
		else if (hurricaneCategory == 3)
		{
			System.out.print("Category 3: wind speeds of 111-130 mph or 96-113 kt, or 178-209 km/hr");
			
		}
		else if (hurricaneCategory == 4)
		{
			System.out.print("Category 4: wind speeds of 131-155 mph or 114-135 kt, or 210-249 km/hr");
			
		}
		else if (hurricaneCategory == 5)
		{
			System.out.print("Category 5: wind speeds greater than 155 mph or 135 kt or 249 km/hr");
			
		}

	}

}
