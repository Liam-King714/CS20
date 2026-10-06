/*

Program: Password.java          Last Date of this Revision: October 2, 2026

Purpose: Create a Password application that stores a secret password of your choice.

*/
package mastery;

import java.util.Scanner;

public class Password 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int attempts = 3;
		String password = "Cyberpunk3dgeRunnersIsth3Be5t";
		String userAttempt;
		boolean passwordCheck;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Create a loop that will give the user 3 tries to guess the password, if they get it right on any try output "Welcome." if they get it wrong on the first two output "The password you typed is incorrect." and if it is wrong on the third attempt output "Access denied."
		while (attempts != 0)
		{
			//Prompt the user for the password and record it
			System.out.print("Enter the password: ");
			userAttempt = input.nextLine();
			
			//Check if the password the user entered is the correct password and assign it to a boolean variable
			passwordCheck = userAttempt.equals(password);
			
			//Based on the boolean variable output the correct message to the user based on the password they entered
			if(passwordCheck == true)
			{
				System.out.print("Welcome.");
				attempts = 0;
			}
			
			else if(attempts > 1 && passwordCheck == false)
			{
				System.out.println("The password you typed is incorrect.");
				attempts--;
			}
			
			else if(attempts == 1 && passwordCheck == false)
			{
				System.out.println("Access denied.");
				attempts--;
			}
			
		}

	}

}
/*Screen dump

Enter the password: isthisthepassword?
The password you typed is incorrect.
Enter the password: password
The password you typed is incorrect.
Enter the password: correctpassword
Access denied.


Enter the password: Cyberpunk3dgeRunnersIsth3Be5t
Welcome.


Enter the password: bestpassword
The password you typed is incorrect.
Enter the password: Cyberpunk3dgeRunnersIsth3Be5t
Welcome.


Enter the password: letmeinplease
The password you typed is incorrect.
Enter the password: givemeaccess
The password you typed is incorrect.
Enter the password: Cyberpunk3dgeRunnersIsth3Be5t
Welcome.

*/
