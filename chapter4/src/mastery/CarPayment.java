/*

Program: CarPayment.java          Last Date of this Revision: September 28, 2026

Purpose: Create a CarPayment application that calculates a monthly car payment after prompting the user for the principal owing (P), the interest rate (r), and the number of monthly payments (m).

*/
package mastery;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CarPayment 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int principalOwing, monthlyPayments;
		float interestRate;
		float monthlyPayment1, monthlyPayment2, monthlyPaymentTotal;
		
		//Introduce the Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the principal owing and record it
		System.out.print("Principal: ");
		principalOwing = input.nextInt();
		
		//Prompt user for the interest rate and record it
		System.out.print("Interest Rate: ");
		interestRate = input.nextFloat();
		
		//Prompt user for the number of monthly payments and record it
		System.out.print("Number of monthly payments: ");
		monthlyPayments = input.nextInt();
		
		//Calculate the amount the user must pay monthly and round it to 2 decimal places
		monthlyPayments = -monthlyPayments;
		monthlyPayment1 = principalOwing * (interestRate /12);
		monthlyPayment2 = (float) (1 - Math.pow((1 + interestRate / 12), monthlyPayments));
		monthlyPaymentTotal = monthlyPayment1 / monthlyPayment2;
		BigDecimal monthlyPaymentDecimal = new BigDecimal(Float.toString(monthlyPaymentTotal));
		monthlyPaymentDecimal = monthlyPaymentDecimal.setScale(2, RoundingMode.HALF_UP);
		
		//Display the value of each monthly payment to the user
		System.out.print("The monthly payment is: $" + monthlyPaymentDecimal);
		
	}

}

/*Screen dump

Principal: 20000
Interest Rate: .06
Number of monthly payments: 48
The monthly payment is: $469.70


Principal: 23325
Interest Rate: 4.99
Number of monthly payments: 60
The monthly payment is: $9699.31

*/
