package rohiniB;
import java.util.Scanner;
public class seprationOfcharNum {
	
	static void separationOfDigitChar(String charNum){
		
		String intstring="", worldstring="";
		
		//separating number and char
		for(int i=0 ; i<=charNum.length()-1; i++){
			char temp = charNum.charAt(i);
			
			if(temp=='0'||temp =='1'||temp =='2'||temp =='3'||temp =='4'||temp =='5'||temp=='6'||temp =='7'||temp =='8'||temp =='9'){
				intstring += temp; 
		} else {
			    worldstring += temp; }
		
		}
		
		//printing digit string and char string  
		System.out.println("Integr given in a string are: "+intstring);
		System.out.println("Character given in a string are: "+worldstring);
}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String charNum;
		
		System.out.println("Enter String...");
		charNum = sc.nextLine();
		
		separationOfDigitChar(charNum);
		sc.close();

}
}
