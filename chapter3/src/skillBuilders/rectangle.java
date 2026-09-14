package skillBuilders;

import java.util.Scanner;

public class rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		int area;
		int perimeter;
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get width from the keyboard
		System.out.print("Enter the width: ");
		width = userinput.nextInt();
		
		//Get length from the keyboard
		System.out.print("Enter the length: ");
		length = userinput.nextInt();
		
		//Calculate the area and perimeter
		area = length * width;
		perimeter = (2 * width) + (2 * length);
		
		//Display the width, length, area, and perimiter on the console/screen
		System.out.println("The width is: " + width);
		System.out.println("The length is: " + length);
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
		
	}

}
