/* Java Basic Program
 	Q9
 */
package snehaN;

public class SwapWithoutThirdVar {
	
	void swap(int x,int y)
	{
		x=x+y;  //5+10=15
		y=x-y;  //15-10=5
		x=x-y;	//15-5=10
		System.out.println("After swapping valu of x: "+x+" and value of y: "+y);
	}

	public static void main(String args[])
	{
		SwapWithoutThirdVar swap2=new SwapWithoutThirdVar();
		swap2.swap(5, 10);
	}
}
