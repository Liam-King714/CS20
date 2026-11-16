package mastery;

public class Adder 
{
	//Declare instance variables
	private static int firstNum, secondNum, answer;
	private static String equation;
	
	//Default constructor
	public Adder()
	{
		firstNum = 0;
		secondNum = 0;
		answer = 0;
	}
	
	//Overload constructor
	public Adder(int startFirstNum, int startSecondNum, int startAnswer)
	{
		firstNum = startFirstNum;
		secondNum = startSecondNum;
		answer = startAnswer;
	}
	
	public static void generateEquation()
	{
		firstNum = (int) (20 * Math.random());
		
		secondNum = (int) (20 * Math.random());
		
		answer = firstNum + secondNum;
		
		equation = firstNum + " + " + secondNum + " = ";
		System.out.print(equation);
	}
	
	public static int getAnswer()
	{
		return(answer);
	}

}
