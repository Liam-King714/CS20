package mastery;

import java.text.DecimalFormat;

public class PiggyBank 
{
	//Declare variables for instance
	private int quarters, dimes, nickels, pennies;
	private float total, quarterValue, dimeValue, nickelValue, pennyValue;
	private DecimalFormat twoDecimal = new DecimalFormat("0.00");
	
	//Default constructor
	public PiggyBank()
	{
		quarters = 0;
		quarterValue = 0.00f;
		
		dimes = 0;
		dimeValue = 0.00f;
		
		nickels = 0;
		nickelValue = 0.00f;
		
		pennies = 0;
		pennyValue = 0.00f;
		
		total = 0.00f;
	}
	
	//Overload construtor
	public PiggyBank(int startQuarters, int startDimes, int startNickels, int startPennies)
	{
		quarters = startQuarters;
		quarterValue = (float) (quarters * 0.25);
		
		dimes = startDimes;
		dimeValue = (float) (dimes * 0.10);
		
		nickels = startNickels;
		nickelValue = (float) (nickels * 0.05);
		
		pennies = startPennies;
		pennyValue = (float) (pennies * 0.01);
		
		total = (float) ((quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01));
	}
	
	//Display total amount of money in the bank, how much of each coin the user has, and how much value each coin contributes
	public void showTotalInBank()
	{
		System.out.println("You have $" + twoDecimal.format(quarterValue) + " in quarters, which is " + quarters + " quarter(s).");
		System.out.println("You have $" + twoDecimal.format(dimeValue) + " in dimes, which is " + dimes + " dime(s).");
		System.out.println("You have $" + twoDecimal.format(nickelValue) + " in nickels, which is " + nickels + " nickel(s).");
		System.out.println("You have $" + twoDecimal.format(pennyValue) + " in pennies, which is " + pennies + " penny(ies).");
		System.out.println("You have a total of $" + twoDecimal.format(total) + " in your bank.");
	}
	
	//Add a quarter to the user's bank, and display how many total quarters they have now.
	public void addAQuarter()
	{
		//Add a quarter to the users bank and add to the total value of quarters
		quarters = quarters + 1;
		quarterValue = (float) (quarterValue + 0.25);
		
		//Add the quarter to the total money and round total to 2 decimals incase of minor errors
		total = (float) (total + 0.25);
		total = (float) (Math.round(total * 100.0) / 100.0);
		
		//Display to the user how many quarters they now have
		System.out.println("You put 1 quarter into your bank. You now have " + quarters + " quarter(s).");
	}
	
	//Add a dime to the user's bank, and display how many total dimes they have now.
	public void addADime()
	{
		//Add a dime to the users bank and add to the total value of dimes
		dimes = dimes + 1;
		dimeValue = (float) (dimeValue + 0.10);
			
		//Add the dime to the total money and round total to 2 decimals incase of minor errors
		total = (float) (total + 0.10);
		total = (float) (Math.round(total * 100.0) / 100.0);
		
		//Display to the user how many dimes they now have
		System.out.println("You put 1 dime into your bank. You now have " + dimes + " dime(s).");
	}
	
	//Add a nickel to the user's bank, and display how many total nickels they have now.
	public void addANickel()
	{
		//Add a nickel to the users bank and add to the total value of nickel
		nickels = nickels + 1;
		nickelValue = (float) (nickelValue + 0.05);
		
		//Add the nickel to the total money and round total to 2 decimals incase of minor errors
		total = (float) (total + 0.05);
		total = (float) (Math.round(total * 100.0) / 100.0);
		
		//Display to the user how many nickels they now have
		System.out.println("You put 1 nickel into your bank. You now have " + nickels + " nickel(s).");
	}
	
	//Add a penny to the user's bank, and display how many total pennies they have now.
	public void addAPenny()
	{
		//Add a penny to the users bank and add to the total value of pennies
		pennies = pennies + 1;
		pennyValue = (float) (pennyValue + 0.01);
		
		//Add the penny to the total money and round total to 2 decimals incase of minor errors
		total = (float) (total + 0.01);
		total = (float) (Math.round(total * 100.0) / 100.0);
		
		//Display to the user how many pennies they now have
		System.out.println("You put 1 penny into your bank. You now have " + pennies + " penny(ies).");
	}
	
	//Take away coins from the user's bank
	public void takeCoinsOutOfBank(int quartersTakenOut, int dimesTakenOut, int nickelsTakenOut, int penniesTakenOut)
	{
		float totalTakenOut = 0.00f, quarterValueTakenOut = 0.00f, dimeValueTakenOut = 0.00f, nickelValueTakenOut = 0.00f, pennyValueTakenOut = 0.00f;
		boolean validQuartersTakenOut = false, validDimesTakenOut = false, validNickelsTakenOut = false, validPenniesTakenOut = false;
		
		//Check if the user took out more quarters than they have in their bank
		if(quarters >= quartersTakenOut)
		{
			//Change the validQuartersTakenOut variable to true for later implementation
			validQuartersTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more quarters than they have
		else if(quarters < quartersTakenOut)
		{
			//Set the validQuartersTakenOut variable to false for later implementation
			validQuartersTakenOut = false;
		}
		
		//Check if the user took out more dimes than they have in their bank
		if(dimes >= dimesTakenOut)
		{
			//Change the validDimesTakenOut variable to true for later implementation
			validDimesTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more dimes than they have
		else if(dimes < dimesTakenOut)
		{
			//Set the validDimesTakenOut variable to false for later implementation
			validDimesTakenOut = false;
		}
		
		//Check if the user took out more nickels than they have in their bank
		if(nickels >= nickelsTakenOut)
		{
			//Change the validNickelsTakenOut variable to true for later implementation
			validNickelsTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more nickels than they have
		else if(nickels < nickelsTakenOut)
		{
			//Set the validNickelsTakenOut variable to false for later implementation
			validNickelsTakenOut = false;
		}
				
		//Check if the user took out more pennies than they have in their bank
		if(pennies >= penniesTakenOut)
		{
			//Change the validPenniesTakenOut variable to true for later implementation
			validPenniesTakenOut = true;
		}
		//Use an else if statement for if the user wants to take out more pennies than they have
		else if(pennies < penniesTakenOut)
		{
			//Set the validPenniesTakenOut variable to false for later implementation
			validPenniesTakenOut = false;
		}
		
		//Check if the user removed a valid amount of quarters
		if(validQuartersTakenOut == true)
		{
			//Calculate the value of the quarters taken out, and subtract it from the total quarter value in the user's bank
			quarterValueTakenOut = (float) (quartersTakenOut * 0.25);
			quarterValue = (float) (quarterValue - quarterValueTakenOut);
			
			//Add the value of the quarter the user took out to the total amount of money taken out
			totalTakenOut += quarterValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many quarters they took out, and the value of all the quarters taken out
			System.out.println("You took out " + quartersTakenOut + " quarter(s) for a value of $" + twoDecimal.format(quarterValueTakenOut) + ".");
		}
		
		//If the user did NOT take out a valid amount of quarters, display to the user they will not be counted to the amount removed and how many quarters they have
		else if(validQuartersTakenOut == false)
		{
			//Output to the user they can't take out as many quarters as they wanted to, tell them how many quarters they have, and they will not be included in the amount removed
			System.out.println("You weren't able to take out " + quartersTakenOut + " quarter(s). You still have " + quarters + " quarter(s).");
			System.out.println("And they will not be included in the amount removed.");
		}
		
		//Check if the user removed a valid amount of dimes
		if(validDimesTakenOut == true)
		{
			//Calculate the value of the dimes taken out, and subtract it from the total dime value in the user's bank
			dimeValueTakenOut = (float) (dimesTakenOut * 0.10);
			dimeValue = (float) (dimeValue - dimeValueTakenOut);
			
			//Add the value of the dimes the user took out to the total amount of money taken out
			totalTakenOut += dimeValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many dimes they took out, and the value of all the dimes taken out
			System.out.println("You took out " + dimesTakenOut + " dime(s) for a value of $" + twoDecimal.format(dimeValueTakenOut) + ".");
		}
		
		//If the user did NOT take out a valid amount of dimes, display to the user they will not be counted to the amount removed and how many dimes they have
		else if(validDimesTakenOut == false)
		{
			//Output to the user they can't take out as many dimes as they wanted to, tell them how many dimes they have, and they will not be included in the amount removed
			System.out.println("You weren't able to take out " + dimesTakenOut + " dime(s). You still have " + dimes + " dime(s).");
			System.out.println("And they will not be included in the amount removed.");
		}
		
		//Check if the user removed a valid amount of nickels
		if(validNickelsTakenOut == true)
		{
			//Calculate the value of the nickels taken out, and subtract it from the total nickel value in the user's bank
			nickelValueTakenOut = (float) (nickelsTakenOut * 0.05);
			nickelValue = (float) (nickelValue - nickelValueTakenOut);
			
			//Add the value of the nickels the user took out to the total amount of money taken out
			totalTakenOut += nickelValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many nickels they took out, and the value of all the nickels taken out
			System.out.println("You took out " + nickelsTakenOut + " nickel(s) for a value of $" + twoDecimal.format(nickelValueTakenOut) + ".");
		}
		
		//If the user did NOT take out a valid amount of nickels, display to the user they will not be counted to the amount removed and how many nickels they have
		else if(validNickelsTakenOut == false)
		{
			//Output to the user they can't take out as many nickels as they wanted to, tell them how many nickels they have, and they will not be included in the amount removed
			System.out.println("You weren't able to take out " + nickelsTakenOut + " nickel(s). You still have " + nickels + " nickel(s).");
			System.out.println("And they will not be included in the amount removed.");
		}
		
		//If the user took out a value amount of pennies, take them away from the user's bank
		if(validPenniesTakenOut == true)
		{
			//Calculate the value of the pennies taken out, and subtract it from the total penny value in the user's bank
			pennyValueTakenOut = (float) (penniesTakenOut * 0.01);
			pennyValue = (float) (pennyValue - pennyValueTakenOut);
			
			//Add the value of the pennies the user took out to the total amount of money taken out
			totalTakenOut += pennyValueTakenOut;
			
			//Round the totalTakenOut value to 2 decimals to avoid minor errors
			totalTakenOut = (float) (Math.round(totalTakenOut * 100.0) / 100.0);
			
			//Display to the user how many pennies they took out, and the value of all the pennies taken out
			System.out.println("You took out " + penniesTakenOut + " penny(ies) for a value of $" + twoDecimal.format(pennyValueTakenOut) + ".");
		}
		
		//If the user did NOT take out a valid amount of pennies, display to the user they will not be counted to the amount removed and how many pennies they have
		else if(validPenniesTakenOut == false)
		{
			//Output to the user they can't take out as many pennies as they wanted to, tell them how many pennies they have, and they will not be included in the amount removed
			System.out.println("You weren't able to take out " + penniesTakenOut + " penny(ies). You still have " + pennies + " penny(ies).");
			System.out.println("And they will not be included in the amount removed.");
		}
		
		//Remove the amount of money the user took out from their bank, rounding it to 2 decimal places during this to avoid minor errors
		total = (float) (Math.round((total - totalTakenOut) * 100.0) / 100.0);
		
		//Display to the user how much money they took out and how much money they have remaining
		System.out.println("You took out a total of $" + twoDecimal.format(totalTakenOut) + " and now have $" + twoDecimal.format(total) + " remaining.");
	}
}
