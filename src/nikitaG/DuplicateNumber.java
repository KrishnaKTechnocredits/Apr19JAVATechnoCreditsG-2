package nikitaG;

import java.util.Scanner;

public class DuplicateNumber {

	int[] findDuplicateNo(int[] numArr) {
		int[] dupArr = new int[numArr.length-1];
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] == numArr[j]) {
					for(int k = 0;k<dupArr.length;k++){
						if(numArr[i]==dupArr[k])
							flag = true;
					}
					if(!flag){
						dupArr[count] = numArr[i];
						count++;
						break;
					}
				}
			}
		}
		return dupArr;
	}

	int[] readValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size:");
		int arrLen = sc.nextInt();
		int numArr[] = new int[arrLen];
		System.out.println("Please enter numbers");
		for (int i = 0; i < arrLen; i++)
			numArr[i] = sc.nextInt();

		return numArr;
	}

	public static void main(String[] args) {
		DuplicateNumber se1 = new DuplicateNumber();
		int arr[] = se1.findDuplicateNo(se1.readValues());
		System.out.print("Duplicate Values in array are: ");
		for (int i = 0; i < arr.length; i++){
			if(arr[i]!=0)
				System.out.print(arr[i] + " ");
		}
	}
}
