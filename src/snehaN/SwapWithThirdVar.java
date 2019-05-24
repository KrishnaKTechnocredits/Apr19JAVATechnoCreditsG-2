/* Java Basic Program
 	Q8
 */
package snehaN;

public class SwapWithThirdVar {

	void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping value of x is "+x+" and value of y is "+y);
	}
	
	public static void main(String args[])
	{
	SwapWithThirdVar swap1=new SwapWithThirdVar();
	swap1.swap(10, 20);
	}
}
