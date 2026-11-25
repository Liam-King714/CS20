package skillBuilders;

import java.util.Scanner;

public class StudentRoster 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int studentAmount = -1, listNumber;
		String studentFirstName, studentLastName, nameAndInitial;
		char lastNameInitial;
		
		//Create the array that will store every students name
		String[] nameList;
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Create a while loop that prompts the user for the amount of students in the class
		while(studentAmount < 1)
		{
			//Prompt the user for the amount of students in the class and record the answer
			System.out.print("Enter the amount of students in the class: ");
			studentAmount = input.nextInt();
			
			//Use an if statement for if the user entered a valid amount of students
			if(studentAmount > 0)
			{
				//Set the length of the nameList array to the amount of students in the class
				nameList = new String[studentAmount];
			}
			
			//Use an else if statement for if the user entered the a number that's 0 or below, it will display to them that they must enter a number above 0, (continued below)
			//since you can't have negative students or 0 students to use the programs
			else if(studentAmount < 1)
			{
				System.out.println("You must enter a number above 0.");
			}
		}
		
		//Create a while loop that prompts the user for the current student's name, and adds it to the list of names until all the students names in the class have been entered
		while(studentAmount != 0)
		{
			//Prompt the user for a student's first name and record it
			System.out.print("Enter a student's name: ");
			studentFirstName = input.next();
			
			//Capitalize the name the user entered
			studentFirstName = RosterHelper.capitalizeName(studentFirstName);
			
			//Prompt the user for the last name of the student and record it
			System.out.print("Enter that student's last name: ");
			studentLastName = input.next();
			
			//Find the initial of the student's last name and assign it to the lastNameInitial variable
			lastNameInitial = RosterHelper.findInitial(studentLastName);
			
			//Combine the student's first name and the intial of their last name into the nameAndInitial variable
			nameAndInitial = studentFirstName + " " + lastNameInitial;
			
			studentAmount--;
		}

	}

}
