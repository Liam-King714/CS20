package skillBuilders;

public class RosterHelper 
{
	public static String capitalizeName(String name)
	{
		//Declare variables
		String lowerName, lowerInitialStr, upperName, upperInitialStr;
		char lowerInitial, upperInitial;
		
		//Convert the name parameter to fully lowercase and fully uppercase and store it in new variables
		lowerName = name.toLowerCase();
		upperName = name.toUpperCase();
		
		//Find the initial of the name in lowercase and uppercase
		lowerInitial = lowerName.charAt(0);
		upperInitial = upperName.charAt(0);
		
		//Convert both lower and upper initial char variables to strings
		lowerInitialStr = String.valueOf(lowerInitial);
		upperInitialStr = String.valueOf(upperInitial);
		
		//Remove the initial letter in the lowerName variable
		lowerName = lowerName.replaceFirst(lowerInitialStr, "");
		
		//Redefine name parameter to be the capitalized version of the name, while removing any extra capital letters that may have been misinputted
		name = upperInitial + lowerName;
		
		//Return the new capitalized name
		return(name);
	}
	
	public static char findInitial(String lastName)
	{
		//Declare variables
		String upperName;
		char initial;
		
		//Convert the lastName parameter to fully uppercase and store it in the upperName variable
		upperName = lastName.toUpperCase();
		
		//Find the initial of the upperName variable, and store it in the initial variable
		initial = upperName.charAt(0);
		
		//Return the initial
		return(initial);
	}

}
