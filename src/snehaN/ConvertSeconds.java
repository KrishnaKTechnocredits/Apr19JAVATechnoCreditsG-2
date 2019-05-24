
/* Java Basic Program
 	Q7
 */
package snehaN;

public class ConvertSeconds {
	
	void calSeconds(int seconds)
	{
		int hours=seconds/(60*60);
		int minute=seconds%(60*60);
		int sec=minute%60;
		minute=minute/60;
		
		System.out.println(seconds+" seconds into hour:minute:seconds format "+hours+": "+minute+": "+sec);
		
	}
	
	public static void main(String args[])
	{
		ConvertSeconds sec=new ConvertSeconds();
		sec.calSeconds(127);
	}



}
