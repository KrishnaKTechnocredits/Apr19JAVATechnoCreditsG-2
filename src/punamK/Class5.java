package punamK;

import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number elements");
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		secMax(num);
		secondMax();
	}

	static void secMax(int num5[]) {
		int max = num5[0];
		int sec = max;
		for (int i = 0; i < num5.length; i++) {
			for (int j = i + 1; j < num5.length; j++) {
				if (max < num5[i]) {
					sec = max;
					max = num5[i];

				} else if (sec > max) {
					System.out.println(sec);
				}
			}
		}
		System.out.println("Second highest= " + sec);

	}
	static void secondMax(){
		int[] a={1,23,4,5,6};
		int max=0;
		int secM=0;
		for (int i=0;i<a.length;i++){
			if(a[i]>max){
				secM=max;
				max= a[i];
			}		
			if(a[i]!=max && a[i]>secM){
			secM=a[i];
			}
			System.out.println(max);
		}
	}

}
