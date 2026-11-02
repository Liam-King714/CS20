/*

Program: MySavings.java          Last Date of this Revision: (date)

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy back and then prompts the user to make a selection.

*/

package mastery;

public class MySavings
{

	public static void main(String[] args) 
	{
		//Declare variables
		final int FLAG = 0;
		int choice, amountAdded;
		PiggyBank bank = new PiggyBank(0,0,0,40);
		
		bank.showTotalInBank();
		bank.takeMoneyOutOfBank(0.67f);

	}

}
/*Screen dump



*/
