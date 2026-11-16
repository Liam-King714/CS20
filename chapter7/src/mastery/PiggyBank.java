package mastery;

import java.text.DecimalFormat;

public class PiggyBank 
{
	//Declare variables for instance
	private int pennies, nickels, dimes, quarters;
	private float total;
	private DecimalFormat twoDecimal = new DecimalFormat("0.00");
	
	//Default constructor
	public PiggyBank()
	{
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;
		total = 0.00f;
	}
	
	//Overload construtor
	public PiggyBank(int startQuarters, int startDimes, int startNickels, int startPennies)
	{
		quarters = startQuarters;
		dimes = startDimes;
		nickels = startNickels;
		pennies = startPennies;
		total = (float) ((quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01));
	}
	
	//Show total amount of money in the bank, and how much of each coin the user has
	public void showTotalInBank()
	{
		System.out.println();
		System.out.println("You have a total of $" + twoDecimal.format(total) + " in your piggy bank.");
		System.out.println("You have " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " penny(ies) in your piggy bank.");
	}
	
	//Add a quarter to the user's piggy bank, and display how many total quarters they have now.
	public void addAQuarter()
	{
		quarters = quarters + 1;
		
		total = (float) (total + 0.25);
		
		System.out.println();
		System.out.println("You put 1 quarter into your piggy bank. You now have " + quarters + " quarter(s).");
	}
	
	//Add a dime to the user's piggy bank, and display how many total dimes they have now.
	public void addADime()
	{
		dimes = dimes + 1;
		
		total = (float) (total + 0.10);
		
		System.out.println();
		System.out.println("You put 1 dime into your piggy bank. You now have " + dimes + " dime(s).");
	}
	
	//Add a nickel to the user's piggy bank, and display how many total nickels they have now.
	public void addANickel()
	{
		nickels = nickels + 1;
		
		total = (float) (total + 0.05);
		
		System.out.println();
		System.out.println("You put 1 nickel into your piggy bank. You now have " + nickels + " nickel(s).");
	}
	
	//Add a penny to the user's piggy bank, and display how many total pennies they have now.
	public void addAPenny()
	{
		pennies = pennies + 1;
		
		total = (float) (total + 0.01);
		
		System.out.println();
		System.out.println("You put 1 penny into your piggy bank. You now have " + pennies + " penny(ies).");
	}
	
	//Take away coins from the user's piggy bank
	public void takeCoinsOutOfBank(int quartersTakenOut, int dimesTakenOut, int nickelsTakenOut, int penniesTakenOut)
	{
		float totalTakenOut = 0.00f, quarterValueTakenOut = 0.00f, dimeValueTakenOut = 0.00f, nickelValueTakenOut = 0.00f, pennyValueTakenOut = 0.00f;
		boolean validQuartersTakenOut = false, validDimesTakenOut = false, validNickelsTakenOut = false, validPenniesTakenOut = false;
		
		System.out.println();
		
		//Check if the user took out more quarters than they have in their piggy bank
		if(quarters >= quartersTakenOut)
		{
			//Change the validQuartersTakenOut variable to true for later implementation
			validQuartersTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more quarters than they have
		else if(quarters < quartersTakenOut)
		{
			//Output to the user they can't take out as many quarters as they wanted to, and tell them how many quarters they have
			System.out.println("You weren't able to take out " + quartersTakenOut + " quarter(s). You still have " + quarters + " quarter(s).");
			
			//Set the validQuartersTakenOut variable to false for later implementation
			validQuartersTakenOut = false;
		}
		
		//Check if the user took out more dimes than they have in their piggy bank
		if(dimes >= dimesTakenOut)
		{
			//Change the validDimesTakenOut variable to true for later implementation
			validDimesTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more dimes than they have
		else if(dimes < dimesTakenOut)
		{
			//Output to the user they can't take out as many dimes as they wanted to, and tell them how many dimes they have
			System.out.println("You weren't able to take out " + dimesTakenOut + " dime(s). You still have " + dimes + " dime(s).");
			
			//Set the validDimesTakenOut variable to false for later implementation
			validDimesTakenOut = false;
		}
		
		//Check if the user took out more nickels than they have in their piggy bank
		if(nickels >= nickelsTakenOut)
		{
			//Change the validNickelsTakenOut variable to true for later implementation
			validNickelsTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more nickels than they have
		else if(nickels < nickelsTakenOut)
		{
			//Output to the user they can't take out as many nickels as they wanted to, and tell them how many nickels they have
			System.out.println("You weren't able to take out " + nickelsTakenOut + " nickel(s). You still have " + nickels + " nickel(s).");
			
			//Set the validNickelsTakenOut variable to false for later implementation
			validNickelsTakenOut = false;
		}
				
		//Check if the user took out more pennies than they have in their piggy bank
		if(pennies >= penniesTakenOut)
		{
			//Change the validPenniesTakenOut variable to true for later implementation
			validPenniesTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more pennies than they have
		else if(pennies < penniesTakenOut)
		{
			//Output to the user they can't take out as many pennies as they wanted to, and tell them how many pennies they have
			System.out.println("You weren't able to take out " + penniesTakenOut + " penny(ies). You still have " + pennies + " penny(ies).");
			
			//Set the validPenniesTakenOut variable to false for later implementation
			validPenniesTakenOut = false;
		}
		
		//Check if the user removed a valid amount of quarters
		if(validQuartersTakenOut == true)
		{
			//Calculate the value of the pennies taken out
			quarterValueTakenOut = (float) (quartersTakenOut * 0.25);
			
			//Add the value of the quarter the user took out to the total amount of money taken out
			totalTakenOut += quarterValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many quarters they took out, and the value of all the quarters taken out
			System.out.println("You took out " + quartersTakenOut + " quarter(s) for a value of $" + twoDecimal.format(quarterValueTakenOut) + ".");
		}
		
		//Check if the user removed a valid amount of dimes
		if(validDimesTakenOut == true)
		{
			//Calculate the value of the dimes taken out
			dimeValueTakenOut = (float) (dimesTakenOut * 0.10);
			
			//Add the value of the dimes the user took out to the total amount of money taken out
			totalTakenOut += dimeValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many dimes they took out, and the value of all the dimes taken out
			System.out.println("You took out " + dimesTakenOut + " dime(s) for a value of $" + twoDecimal.format(dimeValueTakenOut) + ".");
		}
		
		//Check if the user removed a valid amount of nickels
		if(validNickelsTakenOut == true)
		{
			//Calculate the value of the nickels taken out
			nickelValueTakenOut = (float) (nickelsTakenOut * 0.05);
			
			//Add the value of the nickels the user took out to the total amount of money taken out
			totalTakenOut += nickelValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many nickels they took out, and the value of all the nickels taken out
			System.out.println("You took out " + nickelsTakenOut + " nickel(s) for a value of $" + twoDecimal.format(nickelValueTakenOut) + ".");
		}
		
		//Check if the user removed a valid amount of pennies
		if(validPenniesTakenOut == true)
		{
			//Calculate the value of the pennies taken out
			pennyValueTakenOut = (float) (penniesTakenOut * 0.01);
			
			//Add the value of the pennies the user took out to the total amount of money taken out
			totalTakenOut += pennyValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many pennies they took out, and the value of all the pennies taken out
			System.out.println("You took out " + penniesTakenOut + " penny(ies) for a value of $" + twoDecimal.format(pennyValueTakenOut) + ".");
		}
		
		//Remove the amount of money the user took out from their piggy bank, rounding it to 2 decimal places during this to avoid minor errors
		total = (float) (Math.round((total - totalTakenOut) * 100.0) / 100.0);
		
		//Display to the user how much money they took out and how much money they have remaining
		System.out.println("You took out a total of $" + twoDecimal.format(totalTakenOut) + " and now have $" + total + " remaining.");
	}
}
