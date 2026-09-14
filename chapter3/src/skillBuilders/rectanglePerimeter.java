package skillBuilders;

import java.util.Scanner;

public class rectanglePerimeter 
{

	public static void main(String[] args) 
	{
		//Declare Variables
				int length;
				int calculateLength;
				int width;
				int calculateWidth;
				int perimeter;
				int area;
				
				//Create a Scanner object
				Scanner userinput = new Scanner(System.in);
				
				//Get width from the keyboard
				System.out.print("Enter the width: ");
				width = userinput.nextInt();
				calculateWidth = width - 2;
				
				//Get length from the keyboard
				System.out.print("Enter the length: ");
				length = userinput.nextInt();
				calculateLength = length;
				
				//Calculate perimeter and area
				perimeter = (2 * width) + (2 * length);
				area = width * length;
				
				//Display the width, length, and perimiter values on the console/screen
				System.out.println("The width is: " + width);
				System.out.println("The length is: " + length);
				System.out.println("Area = " + area);
				System.out.println("Perimeter = " + perimeter);
				
				//Display the top side of rectangle (length) on the console using astrisks (*)
				while (calculateLength > 0)
				{
					if (calculateLength != 1)
					{
						System.out.print("*");
						calculateLength--;
						
					}
					
					else if (calculateLength == 1)
					{
						System.out.println("*");
						calculateLength--;
						
					}
					
				}
				
				//Reset rectangleWidth value and subtract 2 to make it properly formatted for the length
				calculateLength = length - 2;
				
				//Display the left and right sides of the rectangle (width) using astrisks (*)
				while (calculateWidth > 0)
				{
					System.out.print("*");
					while (calculateLength > 0)
					{
						System.out.print(" ");
						calculateLength--;
					}
					System.out.println("*");
					calculateLength = length - 2;
					calculateWidth--;
					
				}
				
				//Reset rectangleWidth value
				calculateLength = length;
				
				//Display the bottom side of rectangle (length) on the console using asterisks (*)
				while (calculateLength > 0)
				{
					if (calculateLength != 1)
					{
						System.out.print("*");
						calculateLength--;
						
					}
					
					else if (calculateLength == 1)
					{
						System.out.println("*");
						calculateLength--;
						
					}
					
				}

	}

}
