package nikitaG;

import java.util.Scanner;

public class LargestSmallestQ4 {


	void display(int[] numArr){
		int max = numArr[0];
		int min = numArr[0];
		for(int i = 0;i<numArr.length;i++){
			if(numArr[i]> max)
				max = numArr[i];
			if(numArr[i]<min)
				min = numArr[i];
		}
		System.out.println("Largest number in an array is "+max);
		System.out.println("Smallest number in an array is "+min);
	}

	int[] readValues(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers : ");
		String[] lineArr = sc.nextLine().split(" ");
		int[] data = new int[lineArr.length];
		for(int i =0; i<data.length;i++)
			data[i] = Integer.parseInt(lineArr[i]); 
		sc.close();
		return data;
	}
	
	
	public static void main(String[] args) {
		LargestSmallestQ4 q4 = new LargestSmallestQ4();
		q4.display(q4.readValues());
	}
}
