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
	public PiggyBank(int startPennies, int startNickels, int startDimes, int startQuarters)
	{
		pennies = startPennies;
		nickels = startNickels;
		dimes = startDimes;
		quarters = startQuarters;
		total = (float) ((pennies * 0.25) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25));
	}
	
	public void showTotalInBank()
	{
		System.out.println("You have $" + twoDecimal.format(total) + " in your piggy bank.");
	}
	
	public void addAPenny()
	{
		pennies = pennies + 1;
		
		total = (float) (total + 0.01);
	}
	
	public void addANickel()
	{
		nickels = nickels + 1;
		
		total = (float) (total + 0.05);
	}
	
	public void addADime()
	{
		dimes = dimes + 1;
		
		total = (float) (total + 0.10);
	}
	
	public void addAQuarter()
	{
		quarters = quarters + 1;
		
		total = (float) (total + 0.25);
	}
	
	public void takeMoneyOutOfBank(float moneyTakenOut)
	{
		int penniesTakenOut, nickelsTakenOut, dimesTakenOut, quartersTakenOut;
		
		//Remove max amount of quarters from money taken out
		quartersTakenOut = (int) Math.floor(moneyTakenOut / 0.25);
		System.out.println("quarters taken out: " + quartersTakenOut);
		if(quartersTakenOut > 0)
		{
			moneyTakenOut = (float) (Math.round((moneyTakenOut - (quartersTakenOut * 0.25)) * 100.0) / 100.0);
		}
		System.out.println("money remaining to take out: $" + moneyTakenOut);
	
		//Remove max amount of dimes from money taken out
		dimesTakenOut = (int) Math.floor(moneyTakenOut / 0.10);
		System.out.println("dimes taken out: " + dimesTakenOut);
		if(dimesTakenOut > 0)
		{
			moneyTakenOut = (float) (Math.round((moneyTakenOut - (dimesTakenOut * 0.10)) * 100.0) / 100.0);
		}
		System.out.println("money remaining to take out: $" + moneyTakenOut);
		
		//Remove max amount of nickels from money taken out
		nickelsTakenOut = (int) Math.floor(moneyTakenOut / 0.05);
		System.out.println("nickels taken out: " + nickelsTakenOut);
		if(nickelsTakenOut > 0)
		{
			moneyTakenOut = (float) (Math.round((moneyTakenOut - (nickelsTakenOut * 0.05)) * 100.0) / 100.0);
		}
		System.out.println("money remaining to take out: $" + moneyTakenOut);
		
		//Remove max amount of pennies from money taken out
		
	}

}
