//Ferdinand Yeke
//Bellarmine University
//CS130-2
//9/2/2022
//WholeNumbandDecimlNumbMultiplication.java

//This program multiplies both an Integer & Double using arguments

public class WholeNumbandDecimlNumbMultiplication
{
	public static void main(String []args)
	{
		/*This creates arguments with the first input being a double, and the second input
			being an integer
		*/
		double a = Double.parseDouble(args[0]);
		int b = Integer.parseInt(args[1]);
	
			double product = a*b;
	
		System.out.println(product);
	}
}