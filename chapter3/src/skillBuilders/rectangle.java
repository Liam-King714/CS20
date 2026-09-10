package skillBuilders;

import java.util.Scanner;

public class rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		
		//Liam K
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get width from the keyboard
		System.out.print("Enter the width: ");
		width = userinput.nextInt();
		
		//Get length from the keyboard
		System.out.print("Enter the length: ");
		length = userinput.nextInt();
		
		
		//Display the width and length on the console/screen
		System.out.println("The width is: " + width);
		System.out.print("The length is: " + length);
		
	}

}
