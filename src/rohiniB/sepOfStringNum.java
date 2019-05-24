package rohiniB;
//import java.util.Scanner;

public class sepOfStringNum {
	static void decode(String[] mixArray){
		String temp="";
		String[] numberArray = new String[5];
		String[] worldArray = new String[5];
		boolean flag = false;
		
		for(int i=0; i<=mixArray.length-1;i++){
				temp = mixArray[i];
				for(int j=0; j<temp.length(); j++){
					char check =temp.charAt(i);
				//if(check=='0'||check=='1'||check=='2'||check=='3'||check=='4'||check=='5'||check=='6'||check=='7'||check=='8'||check=='9')
					if(check>='0' && check<='9'){
						numberArray[i] = mixArray[i];
						flag = true;
						break;
						}
					else{
						worldArray[i] = mixArray[i];
						flag = false;
						break;
						}		
				}	
				
				if(flag == true)
					System.out.println("Number Array: "+numberArray[i]);
				else
					System.out.println("String Array: "+worldArray[i]);			
				
		}
			

		
	}
	
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Input array size : ");
		//int size = sc.nextInt();
		
		//System.out.println("Input array : ");
		//String[] mixArray = new String[size];
		
		//for(int i = 0; i<=mixArray.length; i++){
		//	mixArray[i] = sc.nextLine(); 
		//}
		
		String[] mixArray = {"abc","sdf","234"};
		
		decode(mixArray);
		//sc.close();
			}
}
