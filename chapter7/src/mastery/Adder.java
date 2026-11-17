package mastery;

public class Adder 
{
	//Declare instance variables
	private static int points, num, answer;
	
	//Default constructor
	public Adder()
	{
		points = 0;
	}
	
	//overload constructor
	public Adder(int startPoints)
	{
		points = startPoints;
	}
	
	public static int getNewNum()
	{
		num = (int) (20 * Math.random());
		
		return(num);
	}
	
	public static void displayEquation(int numOne, int numTwo)
	{
		System.out.print(numOne + " + " + numTwo + " = ");
	}
	
	public static int getAnswer(int numOne, int numTwo)
	{
		answer = numOne + numTwo;
		
		return(answer);
	}
	
	public static void addPoints(int attemptsTaken, boolean correctOrNot)
	{
		if(attemptsTaken == 1)
		{
			points = points + 5;
		}
		
		if(attemptsTaken == 2)
		{
			points = points + 3;
		}
		
		if(attemptsTaken == 3)
		{
			points = points + 1;
		}
		
		if(attemptsTaken == 4)
		{
			points = points + 0;
		}
	}
	
	public static int getPoints()
	{
		return(points);
	}

}
