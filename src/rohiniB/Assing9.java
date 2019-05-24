package rohiniB;

public class Assing9 {
	// swap the number using third variable
	void swapNumber(int a, int b){
		
		System.out.println("Values before swapping :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		 
		 a = a + b;
		 b = a - b;
		 a = a - b;
		
		System.out.println("Values after swapping :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static void main(String[] argu){
		Assing8 s = new Assing8();
		s.swapNumber(4,6);
	}
}
