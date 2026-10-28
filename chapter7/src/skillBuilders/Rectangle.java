package skillBuilders;

public class Rectangle 
{
	private double length, width;
	
	/*
	 * constructor
	 * pre: none
	 * post: A Rectangle object created. Length and width initialized to 1.
	 */
	public Rectangle()
	{
		//Declare the default width and length
		length = 1;
		width = 1;
	}
	
	/*
	 * constructor
	 * pre: none
	 * post: none
	 */
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	/*
	 * Changed the length of the rectangle.
	 * pre: none
	 * post: Length of the rectangle has been changed.
	 */
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	/*
	 * Changed the width of the rectangle.
	 * pre: none
	 * post: Width of the rectangle has been changed.
	 */
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	/**
	 * Returns the length of the rectangle.
	 * pre: none
	 * post: The length of the rectangle has been returned.
	 */
	public double getLength()
	{
		return(length);
	}
	
	/**
	 * Returns the width of the rectangle.
	 * pre: none
	 * post: The width of the rectangle has been returned.
	 */
	public double getWidth()
	{
		return(width);
	}
	
	/**
	 * Calculates the area of the rectangle.
	 * pre: none
	 * post: The area of the rectangle has been returned.
	 */
	public double area()
	{
		double rectangleArea;
		
		rectangleArea = length * width;
		return(rectangleArea);
	}
	
	/**
	 * Calculates the perimeter of the rectangle.
	 * pre: none
	 * post: The perimeter of the rectangle has been returned.
	 */
	public double perimeter()
	{
		double rectanglePerimeter;
		
		rectanglePerimeter = ((2 * length) + (2 * width));
		return(rectanglePerimeter);
	}
	
	/**
	 * Display the forumla area
	 * pre: none
	 * post: forumla for the area of a rectangle is displayed.
	 */
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a rectangle is a=l*w");
	}
	
	/**
	 * Determines if the object is equal to another Rectangle object.
	 * pre: r is a Rectangle object.
	 * post: True has been returned if the objects have the same length and width. false has been returned otherwise
	 */
	public boolean equals(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		if(testObj.getLength() == length && testObj.getWidth() == width)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	/**
	 * Returns a String that represents the Rectangle object.
	 * pre: none
	 * post: A string representing the Rectangle object has been returned.
	 */
	public String toString()
	{
		String rectangleString = "Rectangle has a length of " + length + " and a width of " + width;
		return(rectangleString);
	}

}
