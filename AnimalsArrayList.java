import java.util.ArrayList;
import java.util.Iterator;

public class AnimalsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>Animals = new ArrayList<String>();
		
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Cow");
		Animals.add("Horse");
		Animals.add("Leopard");
		
		System.out.println(Animals.get(3));//Gets  
		System.out.println(Animals.size());
		System.out.println(Animals.set(2, "Buffalo"));
		System.out.println(Animals.set(4, "Tiger"));
		Animals.remove(0);// Removes Cat, and Dog becomes element 0
		Animals.remove(0);// removes Dog, and Buffalo becomes element 0
		
		for(String i : Animals)
		{
			System.out.println(i);
		}
		
		//Get the iterator
		
		Iterator<String> it = Animals.iterator();
		//Printing the first item
		System.out.println(it.next());
		
		while(it.hasNext())//Prints out all the elements
		{
			System.out.println(it.next());
		}
		
		
	}

}
