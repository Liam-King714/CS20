package skillBuilders;

import java.util.Scanner;

public class StudentRoster 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int studentAmount;
		String studentFirstName, firstNameClone, studentLastName, studentNameAndInitial;
		char firstNameInitial;
		String firstInitial;
		char lastNameInitial; //how to find last name studentLastName.charAt(0);
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the amount of students in the class and record it
		System.out.print("Enter amount of students in the class: ");
		studentAmount = input.nextInt();
		
		//Create an Array that will later store all the names of each student
		String[] allNames = new String[studentAmount];
		System.out.println("Student Amount: " + allNames.length);
		//Create a loop that will prompt the user for a students first, then last name and record both adding the students full first name and last name initial to the list as one element
		
			//Prompt for the first name of the student and record it
			System.out.print("Enter the student's first name: ");
			studentFirstName = input.nextLine();
			firstNameClone = studentFirstName;
			//Make the first letter of the students first name an upper case in case user entered it as a lower case
			firstNameClone = studentFirstName.substring(0, 1).toUpperCase() + studentFirstName.substring(1);
			
			//Prompt for the last name of the student and record it
			System.out.print("Enter the student's last name: ");
			studentLastName = input.nextLine();
			
			//Find the student's last name initial, set it to upper case in case the user entered it as lower case, then record it
		
	
	}

}
