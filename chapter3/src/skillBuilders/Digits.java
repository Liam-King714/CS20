package skillBuilders;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int number;
		String numberString;
		char onesPlace;
		char tensPlace;
		char hundredsPlace;
		
		//Create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt user for a two digit number and assign it to number variable
		System.out.print("Enter a 3 digit number: ");
		number = userinput.nextInt();
		
		//Convert number variable to string and assign onesPlace and tensPlace variables their respective digits
		numberString = String.valueOf(number);
		onesPlace = numberString.charAt(2);
		tensPlace = numberString.charAt(1);
		hundredsPlace = numberString.charAt(0);
		
		//Display the ones and tens place value that the user entered separately
		System.out.println("The hundreds place value is: " + hundredsPlace);
		System.out.println("The tens place value is: " + tensPlace);
		System.out.println("The ones place value is: " + onesPlace);

	}

}
