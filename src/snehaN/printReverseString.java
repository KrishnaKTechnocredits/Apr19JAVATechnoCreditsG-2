/* String program assignments
 	Q2
 */
package snehaN;
import java.util.Scanner;
public class printReverseString 
{
	void reverseString(String strR)
    {
        String strR2="";
        for(int i=strR.length()-1;i>=0;i--)
        {
            strR2=strR2+strR.charAt(i);
        }
        	System.out.print(strR2);
    }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String ");
	    String line=sc.nextLine();
	    printReverseString s1=new printReverseString();
	    s1.reverseString(line);
	    sc.close();
	}
}
