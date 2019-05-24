/* Java Basic Program
 	Q3
 */
package snehaN;

public class SquareCube {
	
	void squareCube(int num)
	{
		int squareNum=0;
		int cubeNum=0;
		if(num>0)
		{
			squareNum=num*num;
			cubeNum=num*num*num;
			System.out.println("square of "+num+" is "+squareNum);
			System.out.println("Cube of "+num+" is "+cubeNum);
		}
	}
	
	public static void main(String args[])
	{
		SquareCube squarecube=new SquareCube();
		squarecube.squareCube(10);
	}
}
