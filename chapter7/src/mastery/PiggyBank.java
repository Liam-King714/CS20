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
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
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
	
	public void showTotalInBank()
	{
		System.out.println("You have $" + twoDecimal.format(total) + " in your piggy bank.");
		System.out.println("You have " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies in your piggy bank.");
	}
	
	public void addAQuarter()
	{
		quarters = quarters + 1;
		
		total = (float) (total + 0.25);
		
		System.out.println("You put 1 quarter into your piggy bank.");
	}
	
	public void addADime()
	{
		dimes = dimes + 1;
		
		total = (float) (total + 0.10);
		
		System.out.println("You put 1 dime into your piggy bank.");
	}
	
	public void addANickel()
	{
		nickels = nickels + 1;
		
		total = (float) (total + 0.05);
		
		System.out.println("You put 1 nickel into your piggy bank.");
	}
	
	public void addAPenny()
	{
		pennies = pennies + 1;
		
		total = (float) (total + 0.01);
		
		System.out.println("You put 1 penny into your piggy bank.");
	}
	
	public void takeCoinsOutOfBank(int quartersTakenOut, int dimesTakenOut, int nickelsTakenOut, int penniesTakenOut)
	{
		float totalTakenOut = 0;
		boolean validQuartersTakenOut = false, validDimesTakenOut = false, validNickelsTakenOut = false, validPenniesTakenOut = false;
		
		//Check if the user took out more quarters than they have in their piggy bank
		if(quarters >= quartersTakenOut)
		{
			//Calculate how much the user took out in quarters and add it to the total amount of money taken out
			totalTakenOut += (float) (quartersTakenOut * 0.25);
			validQuartersTakenOut = true;
		}
		//Tell the user they can't take out more quarters than they have
		else if(quarters < quartersTakenOut)
		{
			System.out.println("You are not able to take out " + quartersTakenOut + " quarters. They will not be included in how much money you have removed.");
			validQuartersTakenOut = false;
		}
		System.out.println("Total taken out so far: $" + totalTakenOut);
		//Check if the user took out more dimes than they have in their piggy bank
		if(dimes >= dimesTakenOut)
		{
			//Calculate how much the user took out in dimes and add it to the total amount of money taken out
			totalTakenOut += (float) (dimesTakenOut * 0.10);
			validDimesTakenOut = true;
		}
		//Tell the user they can't take out more dimes than they have
		else if(dimes < dimesTakenOut)
		{
			System.out.println("You are not able to take out " + dimesTakenOut + " dimes. They will not be included in how much money you have removed.");
			validDimesTakenOut = false;
		}
		System.out.println("Total taken out so far: $" + totalTakenOut);
		//Check if the user took out more nickels than they have in their piggy bank
		if(nickels >= nickelsTakenOut)
		{
			//Calculate how much the user took out in nickels and add it to the total amount of money taken out
			totalTakenOut += (float) (nickelsTakenOut * 0.05);
			validNickelsTakenOut = true;
		}
		//Tell the user they can't take out more nickels than they have
		else if(nickels < nickelsTakenOut)
		{
			System.out.println("You are not able to take out " + nickelsTakenOut + " nickels. They will not be included in how much money you have removed.");
			validNickelsTakenOut = false;
		}
		System.out.println("Total taken out so far: $" + totalTakenOut);
		//Check if the user took out more pennies than they have in their piggy bank
		if(pennies >= penniesTakenOut)
		{
			//Calculate how much the user took out in pennies and add it to the total amount of money taken out
			totalTakenOut += (float) (penniesTakenOut * 0.01);
			validPenniesTakenOut = true;
		}
		//Tell the user they can't take out more pennies than they have
		else if(pennies < penniesTakenOut)
		{
			System.out.println("You are not able to take out " + penniesTakenOut + " pennies. They will not be included in how much money you have removed.");
			validPenniesTakenOut = false;
		}
		System.out.println("Total taken out so far: $" + totalTakenOut);
		//Check if the total amount of money that the coins add up to is larger than the amount of money the user has
		if(total >= totalTakenOut)
		{
			
		}
		//Display to the user they didn't have enough money to take out how much they entered
		else if(total < totalTakenOut)
		{
			System.out.println("You don't have enough to take out $" + totalTakenOut + " out of your bank.");
		}
	}
}
