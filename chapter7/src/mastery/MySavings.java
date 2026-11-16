/*

Program: MySavings.java          Last Date of this Revision: (date)

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy back and then prompts the user to make a selection.

*/

package mastery;

public class MySavings
{

	public static void main(String[] args) 
	{
		//Declare variables, and create a new PiggyBank instance
		final int FLAG = 0;
		int choice, quartersRemoved = 0, dimesRemoved = 0, nickelsRemoved = 0, penniesRemoved = 0;
		PiggyBank bank = new PiggyBank(40,5,20,35);
		
		bank.showTotalInBank();
		bank.takeCoinsOutOfBank(9,6,4,5);
		bank.showTotalInBank();

	}

}
/*Screen dump



*/
