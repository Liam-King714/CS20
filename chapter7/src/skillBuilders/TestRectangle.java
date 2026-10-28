package skillBuilders;

public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle box1 = new Rectangle(3, 5);
		Rectangle box2 = new Rectangle(4,6);
		
		if(box1.equals(box2))
		{
			System.out.println("Objects are equal.");
		}
		else
		{
			System.out.println("Objects are not equal.");
		}
		
		System.out.println();
		System.out.println("The first rectangles length: " + box1.getLength());
		System.out.println("The first rectangles width: " + box1.getWidth());
		System.out.println("The first rectangles area: " + box1.area());
		System.out.println("The first rectangles perimeter: " + box1.perimeter());
		System.out.println();
		System.out.println("The second rectangles length: " + box2.getLength());
		System.out.println("The second rectangles width: " + box2.getWidth());
		System.out.println("The second rectangles area: " + box2.area());
		System.out.println("The second rectangles perimeter: " + box2.perimeter());
		System.out.println();
		Rectangle.displayAreaFormula();

	}

}
