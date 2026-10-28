package mastery;

public class Adder 
{
	//Declare instance variables
	private int points = 0, answer = 0, firstNum = 0, secondNum = 0;
	private String equation;
	
	//Default constructor
	public Adder()
	{
		equation = "";
	}
	
	//Overload constructor
	public Adder(String firstEquation)
	{
		equation = firstEquation;
	}
	
	public String generateEquation()
	{
		int num1, num2;
		
		num1 = (int) (Math.random() * 21);
		firstNum = num1;
		
		num2 = (int) (Math.random() * 21);
		secondNum = num2;
		
		equation = num1 + " + " + num2 + " = ";
		return(equation);
	}
	
	public boolean equals(int guess)
	{
		if(answer == guess)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}

}
