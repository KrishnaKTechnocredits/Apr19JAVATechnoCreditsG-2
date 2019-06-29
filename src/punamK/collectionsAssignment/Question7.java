package punamK.collectionsAssignment;

import java.util.ArrayList;

public class Question7 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int sum = 0;
		// ArrayList <Integer>al= new ArrayList<Integer>();
		// for(int i=0; i<b; i++){
		// al.add(a);
		// }
		// System.out.println(al);
		// for( int multiplication : al){
		// sum= sum + multiplication;
		// }System.out.println(sum);

		// another way

		for (int i = 0; i < b; i++) {
			sum = sum + a;
		}System.out.println(sum);
	}
}