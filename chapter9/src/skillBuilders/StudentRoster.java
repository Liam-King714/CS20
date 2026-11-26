package skillBuilders;

import java.util.Scanner;

public class StudentRoster 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int studentAmount = -1, addToListNum = 0;
		String studentFirstName, studentLastName, nameAndInitial;
		char lastNameInitial;
		
		//Create the array that will store every students name
		String[] nameList = null;
		
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
			//since you can't have negative students or 0 students to use the program
			else if(studentAmount < 1)
			{
				System.out.println("You must enter a number above 0.");
			}
		}
		
		//Create a while loop that prompts the user for the current student's name, and adds it to the list of names until all the students names in the class have been entered
		while(studentAmount != 0)
		{
			//Display a blank line that separates the initial prompt for students in the class, or from the last prompt for a students name, to reduce console clutter
			System.out.println();
			
			//Prompt the user for a student's first name and record it
			System.out.print("Enter a student's first name: ");
			studentFirstName = input.next();
			
			//Capitalize the name the user entered
			studentFirstName = RosterHelper.capitalizeName(studentFirstName);
			
			//Prompt the user for the last name of the student and record it
			System.out.print("Enter that student's last name: ");
			studentLastName = input.next();
			
			//Find the initial of the student's last name and assign it to the lastNameInitial variable
			lastNameInitial = RosterHelper.findInitial(studentLastName);
			
			//Combine the student's first name and the intial of their last name into the nameAndInitial variable
			nameAndInitial = studentFirstName + " " + lastNameInitial + ".";
			
			//Add the current student's name to the nameList array
			nameList[addToListNum] = nameAndInitial;
			
			//Increase addToListNum by 1 to prevent adding two names to the same position in the array, canceling out a name
			addToListNum++;
			
			//Decrease studentAmount by one so that the loop gets closer to finishing
			studentAmount--;
		}
		
		//Create a line to separate the prompts for student names from the final roster display
		System.out.println();
		
		//Display the title "Student Roster" to the user
		System.out.println("Student Roster:");
		
		//Create a for loop that will display every name that the user entered, back to the user
		for(int i = 0; i < nameList.length; i++)
		{
			System.out.println("• " + nameList[i]);
		}

	}

}
