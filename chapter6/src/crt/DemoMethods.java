package crt;

public class DemoMethods 
{

	public static void main(String[] args) 
	{
		//Method1
		displayWelcome();
		
		//Method2
		greetStudent("Liam");
		
		//Method3
		int total = addNumbers(8, 21);
		System.out.println("Total: " + total);
		
		//Method4
		double area = calculateArea(2.75);
		System.out.println("Area: " + area);
		
		//Method5
		boolean result = isPassing(85);
		System.out.println("Passing: " + result);

	}
	
	
	//Method 1: No Parameters, no return value
	public static void displayWelcome()
	{
		System.out.println("Welcome to our class.");
	}
	
	//Method 2: One Parameter, no return value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, " + name);
	}
	
	//Method 3: Two Parameters, return an integer
	public static int addNumbers(int a, int b)
	{
		int sum = a + b;
		return(sum);
	}
	
	//Method 4: One Paramter, returns a decimal number
	public static double calculateArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return(area);
	}
	
	//Method 5: One Paramter, returns a boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}

}
