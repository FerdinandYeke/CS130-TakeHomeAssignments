enum Food{
	Rice_With_Umbaba, Jute_Leaf_Soup, Ahbamedesi_SpinachStew, Peanut_Stew, Okra_Stew;
}


public class Enum_Food_PracticeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f1 = Food.Ahbamedesi_SpinachStew;
		System.out.println(f1);
		System.out.println(f1.ordinal());
		
		Food f2 = Food.Rice_With_Umbaba;
		System.out.println(f2);
		System.out.println(f2.ordinal());
		
		
	}

}
