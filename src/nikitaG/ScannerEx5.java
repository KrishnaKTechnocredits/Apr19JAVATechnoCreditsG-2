package nikitaG;

import java.util.Scanner;

public class ScannerEx5 {

	void displayMissingNums(int[] numArr){
		System.out.println("consecutive Missing numbers are :");
		for(int i = 0;i<numArr.length;i++){
			if(i>0 && numArr[i]!=numArr[i-1]+1)
				System.out.print(numArr[i-1]+1+" ");
		}	
	}
	
	void display(int[] numArr){
		System.out.println("Missing numbers are:");
		int max = numArr[0];
		int min = numArr[0];
		for(int i = 0;i<numArr.length;i++){
			if(numArr[i]> max)
				max = numArr[i];
			if(numArr[i]<min)
				min = numArr[i];
		}
		for(int j = min; j<=max ;j++){
			boolean flag = true;
			for(int k= 0;k<numArr.length;k++ ){
				if(j== numArr[k]){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(j+" ");
		}
	}

	void display1(int[] numArr){
		System.out.println("Missing numbers are :");
		for(int i = 1;i<=10;i++){
			boolean flag = true;
			for(int j = 0;j<numArr.length;j++){
				if(i == numArr[j]){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(i+" ");
		}
	}
	
	int[] readValues(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size : ");
		int count = sc.nextInt();
		int[] data = new int[count];
		System.out.println("Please enter "+count+" numbers : ");
		for(int i =0; i<count;i++)
			data[i] = sc.nextInt();
		sc.close();
		return data;
	}

	int[] readValues1(){
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
		
		ScannerEx5 se = new ScannerEx5();
		//consecutive nos
		//se.displayMissingNums(se.readValues());
		se.display(se.readValues1());
		
	}
}
