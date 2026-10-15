package skillBuilders;

public class SpanishNumbers 
{
	public static String getSpanishNumber(int number)
	{
		if(number == 1)
		{
			return("uno");
		}
		else if(number == 2)
		{
			return("dos");
		}
		else if(number == 3)
		{
			return("tres");
		}
		else if(number == 4)
		{
			return("cuatro");
		}
		else if(number == 5)
		{
			return("cinco");
		}
		else if(number == 6)
		{
			return("seis");
		}
		else if(number == 7)
		{
			return("siete");
		}
		else if(number == 8)
		{
			return("ocho");
		}
		else if(number == 9)
		{
			return("nueve");
		}
		else
		{
			return("diez");
		}
	}

	public static void main(String[] args) 
	{
		//Declare variables
		int number = 1;
		String spanishNum, stringNum;
		
		//Create a loop that will display the Spanish number for every number 1-10
		while(number < 11)
		{
			spanishNum = getSpanishNumber(number);
			stringNum = String.valueOf(number);
			System.out.printf("%-3s %-5s%n", stringNum, spanishNum);
			number++;
		}
		
	}

}
