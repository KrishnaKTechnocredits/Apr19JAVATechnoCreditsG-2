package nikitaG;

import java.util.Scanner;

public class A3Q10CharOccurance {
	String str;
	char ch;
	
	void readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
	}
	
	void charOccurance(){
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == ch)
				count++;
		}
		System.out.println("Char is :"+ch+". No of occurances of "+ch+" are :"+count);
	}

	public static void main(String[] args) {
		A3Q10CharOccurance a1 = new A3Q10CharOccurance();
		a1.readValues();
		a1.charOccurance();
	}
}
