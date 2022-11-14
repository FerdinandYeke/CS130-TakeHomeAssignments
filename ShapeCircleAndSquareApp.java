package Inheritance;

public class ShapeCircleAndSquareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle shape1 = new Circle(10);
		Square shape2 = new Square(40,103);
		
		shape1.setColor("Red");
		shape2.setColor("Green");
		
		System.out.println("The Color of the Circle is: "+shape1.getColor()
		+". \nThe Perimeter of the circle is: "+shape1.perimeter()+". \nThe"
				+ " Area of the circle is: "+shape1.Area()+".");
		
		System.out.println("");
		
		System.out.println("The Color of the Square is: "+shape2.getColor()
		+". \nThe Perimeter of the square is: "+shape2.perimeter()+". \nThe"
				+ " Area of the square is: "+shape2.Area()+".");


	}

}
