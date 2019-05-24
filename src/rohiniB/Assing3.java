package rohiniB;

public class Assing3 {
	
	void square(int num1)
	{
		System.out.println(" Square of " + num1 + " ïs " + (num1*num1));
	}
	
	void cube(int num1)
	{
		System.out.println(" Cube of " + num1 + " ïs " + ((num1*num1)*num1));
	}
	
	
	public static void main (String[] argu)
	{
		Assing3 s = new Assing3();
		
		s.square(4);
		s.cube(2);
	}

}
