package skillBuilders;

public class Reverse 
{

	public static void main(String[] args) 
	{
		//Declare the reverse array
		int[] reverse = new int[10];
		
		//Set the element of each index using a for loop
		for(int i = 0; i < reverse.length; i++)
		{
			//Set each index's element as the number of the index (ex: index 1 has an element of 1)
			reverse[i] = i;
		}
		
		//Display the "Countdown" title to the user
		System.out.println("Countdown");
		
		//Create the for loop that will display each element ordered highest to lowest
		for(int y = 9; y >= 0; y--)
		{
			System.out.println(reverse[y]);
		}

	}

}
