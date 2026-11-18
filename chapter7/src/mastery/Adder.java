package mastery;

public class Adder 
{
	//Declare instance variables
	private static int firstTryRight, secondTryRight, thirdTryRight, totalWrong, points, answer;;
	
	//Default constructor
	public Adder()
	{
		firstTryRight = 0;
		secondTryRight = 0;
		thirdTryRight = 0;
		totalWrong = 0;
		points = 0;
		answer = 0;
	}
	
	//overload constructor
	public Adder(int startFirstRight, int startSecondRight, int startThirdRight, int startTotalWrong, int startPoints, int startAnswer)
	{
		firstTryRight = startFirstRight;
		secondTryRight = startSecondRight;
		thirdTryRight = startThirdRight;
		totalWrong = startTotalWrong;
		points = startPoints;
		answer = startAnswer;
	}
	
	public static int getNewNum()
	{
		int num;
		
		num = (int) (20 * Math.random());
		
		return(num);
	}
	
	public static void displayEquation(int numOne, int numTwo)
	{
		System.out.print(numOne + " + " + numTwo + " = ");
	}
	
	public int getAnswer(int numOne, int numTwo)
	{
		answer = numOne + numTwo;
		
		return(answer);
	}
	
	public int getPoints()
	{
		return(points);
	}
	
	public int getFirstRight()
	{
		return(firstTryRight);
	}
	
	public int getSecondRight()
	{
		return(secondTryRight);
	}
	
	public int getThirdRight()
	{
		return(thirdTryRight);
	}
	
	public int getTotalWrong()
	{
		return(totalWrong);
	}
	
	public void addPoints(int attemptsTaken, boolean answerIsCorrect)
	{
		if(attemptsTaken == 1)
		{
			points = points + 5;
			firstTryRight = firstTryRight + 1;
		}
		
		if(attemptsTaken == 2)
		{
			points = points + 3;
			secondTryRight = secondTryRight + 1;
		}
		
		if(attemptsTaken == 3 && answerIsCorrect == true)
		{
			points = points + 1;
			thirdTryRight = thirdTryRight + 1;
		}
		
		if(attemptsTaken == 3 && answerIsCorrect == false)
		{
			points = points + 0;
			totalWrong = totalWrong + 1;
		}
	}

}
