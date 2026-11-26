package skillBuilders;

public class Squares 
{

	public static void main(String[] args) 
	{
		//Declare variables
		int index = 0, indexSquared;
		
		//Create the int array
		int[] squares = new int[5];
		
		//Create a loop that will set each index in the squares array to the square of the index
		for(int i = 0; i < squares.length; i++)
		{
			squares[i] = (int) Math.pow(i, 2);
			System.out.println("Current index: " + i);
			System.out.println(i + " index value: " + squares[i]);
		}

	}

}
