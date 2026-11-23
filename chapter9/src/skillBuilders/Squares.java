package skillBuilders;

import java.util.Scanner;

public class Squares 
{

	public static void main(String[] args) 
	{
		String name, uppercaseName;
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		name = input.nextLine();
		
		System.out.println("name: " + name);
		uppercaseName = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println("name: " + uppercaseName);
		
	}

}
