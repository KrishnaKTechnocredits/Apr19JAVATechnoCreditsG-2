package nileshS;

public class SqureAndCube {
	
	void squre(int a)
	{
		int sqr = a*a;
		System.out.println("Squre of number is "+sqr);
	}
	
	void cube(int a)
	{
		int cb = a*a*a;
		System.out.println("Cube of number is "+cb);
	}
	
	public static void main(String[] args) {
		SqureAndCube squreAndCube = new SqureAndCube();
		squreAndCube.squre(7);
		squreAndCube.cube(5);
		
	}

}
