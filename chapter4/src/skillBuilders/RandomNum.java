package skillBuilders;

import java.util.Scanner;

public class RandomNum
{

	public static void main(String[] args) 
	{
		//Declare the min and max variables
		int min, max;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the min number and record it
		System.out.println("Enter the min number: ");
		min = input.nextInt();
		
		//Prompt the user for the max number and record it
		System.out.println("Enter the max number: ");
		max = input.nextInt();
		
		//Generate the random numbers
		System.out.println("Random number: " + (int)((max - min + 1) * Math.random() + min));
		
	}

}


/*Screen Dump

Enter the min number: 
1
Enter the max number: 
15
Random number: 3


Enter the min number: 
3
Enter the max number: 
17
Random number: 5


*/