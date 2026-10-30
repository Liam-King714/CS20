package mastery;

public class Adder 
{
	//Declare instance variables
	private static int firstNum, secondNum, answer;
	private static String equation;
	
	//Default constructor
	public Adder()
	{
		answer = 0;
		firstNum = 0;
		secondNum = 0;
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
