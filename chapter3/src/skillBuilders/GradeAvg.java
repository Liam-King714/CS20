package skillBuilders;

import java.util.Scanner;

public class GradeAvg 
{

	public static void main(String[] args) 
	{
		//Declare variables (numbers used: 89, 97, 76, 89, 77. avg: 85.6%. total number: 428)
		int numberOfGrades, divisorOfGrades, grade;
		int totalGrade = 0;
		float averageGrade, test;
		
		//Create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask user how many grades they want to input and assign it to a variable
		System.out.print("Enter total amount of grades: ");
		numberOfGrades = userinput.nextInt();
		divisorOfGrades = numberOfGrades;
		
		//Create a loop that continues until the user has inputed all the grades
		while (numberOfGrades > 0)
		{
			//Prompt user to enter their grade then add it to the total grades and decrease loop number value (numberOfGrades) by 1
			System.out.print("Enter grade: ");
			grade = userinput.nextInt();
			totalGrade += grade;
			grade = 0;
			numberOfGrades--;
			
		}
		
		//Calculate the average of the users grades and display it to the user
		averageGrade = (float) totalGrade / divisorOfGrades;
		System.out.println("Your grade average is: " + averageGrade + "%");

	}

}
