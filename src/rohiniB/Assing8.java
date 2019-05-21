package rohiniB;

public class Assing8 {
	
	// swap the number using third variable
	void swapNumber(int a, int b){
		int x;
		System.out.println("Value of a before swapping : " + a);
		System.out.println("Value of b before swapping : " + b);
		x = a;
		a = b;
		b = x;
		
		System.out.println("Value of a before swapping : " + a);
		System.out.println("Value of b before swapping : " + b);
	}
	
	public static void main(String[] argu){
		Assing8 s = new Assing8();
		s.swapNumber(5,10);
	}

}
