package padmajaD;

public class Swappingofnumbers1 {
	static int x = 10;
	static int y = 20;
	
	static void swapping(int x, int y)
	{
		int temp = x;
		 x =  y;
		 y = temp;
		 
		 System.out.println("Value of x is :" + x);
		 System.out.println("Value of y is :" + y);
		
	}
public static void main(String[] args) {
	swapping(x, y);
}
}
