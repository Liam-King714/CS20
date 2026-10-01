package skillBuilders;

public class Evens 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int repeat = 20;
		int number = 1;
		
		//Create a loop that will check if a number is even then display it if it is even
		while (repeat > 0)
		{
			switch (number % 2)
			{
			case 0:
				System.out.println(number);
				repeat--;
				number++;
				break;
			case 1:
				repeat--;
				number++;
				break;
			}
			
		}

	}

}
