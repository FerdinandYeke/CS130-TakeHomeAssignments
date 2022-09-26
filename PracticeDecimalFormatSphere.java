import java.util.Scanner;
import java.text.DecimalFormat;

/*This class prints out the surface area and
volume of a sphere
*/

public class PracticeDecimalFormatSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere: ");
		double radius = scan.nextDouble();
		
		double SurfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		
		double Volume = 4/3 * Math.PI * Math.pow(radius, 2);
		
		System.out.println("The Surface Area of the sphere is: "+SurfaceArea);
		System.out.println("The Volume of the Sphere is: "+Volume);
		
		//Formatting the decimal points
		DecimalFormat format2 = new DecimalFormat("0.##");
		
		System.out.println("The Formatted Surface Area of the sphere is: "
				+ ""+format2.format(SurfaceArea));
		System.out.println("The Formatted Volume of the sphere is: "
				+ ""+format2.format(Volume));
		
		
	}

}
