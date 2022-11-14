package Inheritance;

class Circle extends Shape{

    double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public double Radius()
	{
		double Cir = 2 * Math.PI * radius;
		return Cir;
				
	}
}
