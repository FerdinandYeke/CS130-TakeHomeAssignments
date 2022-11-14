package Inheritance;

class Circle extends Shape{

    double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	public double perimeter()
	{
		double Peri_Cir = 2 * Math.PI * radius;
		return Peri_Cir;
				
	}
	
	public double Area()
	{
		double Area_Cir = Math.PI * Math.pow(radius, 2);
		return Area_Cir;
	}
}
