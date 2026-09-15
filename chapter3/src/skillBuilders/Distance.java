package skillBuilders;

import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{
		//Declare variables and create DecimalFormat for rounding
		float firstSegment;
		float secondSegment;
		float thirdSegment;
		float totalDistance;
		double totalDistanceRounded;
		
		//Create scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get first, second, and third segment distances from keyboard/user in KM
		System.out.println("Enter first segment distance (KM): ");
		firstSegment = userinput.nextFloat();
		System.out.println("Enter second segment distance (KM): ");
		secondSegment = userinput.nextFloat();
		System.out.println("Enter third segment distance (KM): ");
		thirdSegment = userinput.nextFloat();
		
		//Calculate the total distance of all segments and round it to at least 2 decimal places
		totalDistance = firstSegment + secondSegment + thirdSegment;
		totalDistanceRounded = Math.round(totalDistance * 100.0) / 100.0;
		
		//Display the total distance to the user
		System.out.print("The total distance of the race is: " + totalDistanceRounded + "KM");

	}

}
