package Inheritance;

class Square extends Shape {
	
	double length;
	double width;
	
	public void length(double length)
	{
		this.length = 0.0;
	}
	
	public void width(double width)
	{
		this.width = 0.0;
	}
	
	public Square(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
}
