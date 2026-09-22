/*

Program: Order.java          Last Date of this Revision: September 21, 2026

Purpose: Create an Order application that prompts the employee for the number of burgers, fries, and sodas then displays the total, the tax (6.5%), and the final cost.

*/
package mastery;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Order 
{

	public static void main(String[] args) 
	{
		
		//Declare variables and create decimal format
		int burgers, fries, sodas;
		float burgerPrice = 1.69f;
		float friesPrice = 1.09f;
		float sodasPrice = 0.99f;
		float burgerCost, friesCost, sodasCost, totalBeforeTax = 0, finalTotal = 0, tenderedCash;
		double burgerCostFinal, friesCostFinal, sodasCostFinal, tax, roundedTax;
		BigDecimal change = new BigDecimal(0.00);
		
		//Create a scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt user to enter amount of burgers they are ordering and assign it to the respective variable, then calculate the cost of the burgers and add it to the total
		System.out.print("Enter the number of burgers: ");
		burgers = userinput.nextInt();
		burgerCost = (float) burgers * burgerPrice;
		burgerCostFinal = (float) Math.round(burgerCost * 100.0) / 100.0;
		totalBeforeTax += (float) burgerCostFinal;
		finalTotal += (float) burgerCostFinal;
		
		//Prompt user to enter amount of fries they are ordering and assign it to the respective variable, then calculate the cost of the fries and add it to the total
		System.out.print("Enter the number of fries: ");
		fries = userinput.nextInt();
		friesCost = (float) fries * friesPrice;
		friesCostFinal = (float) Math.round(friesCost * 100.0) / 100.0;
		totalBeforeTax += (float) friesCostFinal;
		finalTotal += (float) friesCostFinal;
		
		//Prompt user to enter amount of sodas they are ordering and assign it to the respective variable, then calculate the cost of the sodas and add it to the total
		System.out.print("Enter the number of sodas: ");
		sodas = userinput.nextInt();
		sodasCost = (float) sodas * sodasPrice;
		sodasCostFinal = (float) Math.round(sodasCost * 100.0) / 100.0;	
		totalBeforeTax += (float) sodasCostFinal;
		finalTotal += (float) sodasCostFinal;
		
		//Calculate tax (6.5%) and add it to the final total
		tax = (float) ((float) totalBeforeTax * 0.065);
		BigDecimal taxDecimal = new BigDecimal(Double.toString(tax));
		taxDecimal = taxDecimal.setScale(2, RoundingMode.HALF_UP);
		BigDecimal totalBeforeTaxDecimal = new BigDecimal(Float.toString(totalBeforeTax));
		totalBeforeTaxDecimal = totalBeforeTaxDecimal.setScale(2, RoundingMode.HALF_UP);
		BigDecimal finalTotalDecimal = totalBeforeTaxDecimal.add(taxDecimal);
		finalTotalDecimal = finalTotalDecimal.setScale(2, RoundingMode.HALF_UP);
		
		//Display the total before tax, amount taxed, and final after tax to user
		System.out.println("Total before tax: $" + totalBeforeTaxDecimal);
		System.out.println("Tax: $" + taxDecimal);
		System.out.println("Final Total: $" + finalTotalDecimal);
		
		//Prompt user to enter amount of cash tendered then calculate the change to be given to the customer
		System.out.print("Enter amount tendered: $");
		tenderedCash = userinput.nextFloat();
		BigDecimal tenderedCashDecimal = new BigDecimal(Float.toString(tenderedCash));
		change = tenderedCashDecimal.subtract(finalTotalDecimal);
		System.out.print("Change: $" + change);

	}

}

/*Screen dump

Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Tax: $0.90
Final Total: $14.68
Enter amount tendered: $20
Change: $5.32



Enter the number of burgers: 7
Enter the number of fries: 9
Enter the number of sodas: 3
Total before tax: $24.61
Tax: $1.60
Final Total: $26.21
Enter amount tendered: $30
Change: $3.79

*/