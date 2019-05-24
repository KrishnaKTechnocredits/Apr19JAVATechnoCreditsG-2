package punamK;

import java.util.Scanner;

public class Class6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer array");
		int[] array1 = new int[6];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("enter second integer array");
		int[] array2 = new int[6];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}

		arrayEqual(array1, array2);

	}

	static void arrayEqual(int[] num1, int[] num2){
                                boolean flag=false;
                                if(num1.length==num2.length){
                                   for (int i=0;i<num1.length;i++){
                                         if(num1[i]==num2[i]){
                                           flag=true;
                                           break;
                                         }
                                   }if(flag==false){
                                   System.out.println("Equal");
                                }else{
                                	System.out.println("Not equal");
                                }

                                }else{
                                	System.out.println("Not Equal");
                                	}


							}
		}
