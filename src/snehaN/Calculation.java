/* Java Basic Program
 	Q1
 */
package snehaN;

	public class Calculation {
		
		void Add(int x,int y)
		{
					System.out.println("Addition of "+x+" and "+y+" is "+(x+y));
		} 
		
		void Sub(int p,int q)
		{
			System.out.println("Substration of "+p+" and "+q+" is "+(p-q));
		} 
		
		void Mult(int s,int t)
		{
			System.out.println("Multiplication of "+s+" and "+t+" is "+s*t);
		} 
		
		void Div(int c,int d)
		{
				System.out.println("Division of "+c+" and "+d+" is "+c/d);
		}
		
		
		void Remainder(int a,int b)
		{
			System.out.println("Remainder of "+a+" and "+b+" is "+a%b);
		} 
		public static void main(String args[])
		{
			
			Calculation cal=new Calculation();
			cal.Add(4, 8);
			cal.Sub(9, 5);
			cal.Mult(8, 7);
			cal.Div(6, 3);
			cal.Remainder(81, 9);
			
		}
	}



