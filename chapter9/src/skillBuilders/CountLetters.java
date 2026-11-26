package skillBuilders;

import java.util.Scanner;

public class CountLetters 
{

	public static void main(String[] args) 
	{
		//Declare variables
		final int LOW = 'A';
		final int HIGH = 'Z';
		int offset;
		String word;
		
		//Create the letterCounts array and wordLetters array
		int[] letterCounts = new int[HIGH - LOW + 1];
		char[] wordLetters;
		
		//Introduce the Scanner Class.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for any word, and record it
		System.out.print("Enter a word: ");
		word = input.nextLine();
		
		//Make the word the user entered fully uppercase, then convert the word to a char array
		word = word.toUpperCase();
		wordLetters = word.toCharArray();
		
		//Create a for loop that will count how often each letter appears
		for(int letter = 0; letter < wordLetters.length; letter++)
		{
			offset = wordLetters[letter] - LOW;
			letterCounts[offset] += 1;
		}
		
		//Display how often each letter appears in the word the user entered
		for(int i = LOW; i <= HIGH; i++)
		{
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}

	}

}
