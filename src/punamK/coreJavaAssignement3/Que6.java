package punamK.coreJavaAssignement3;

import java.util.Scanner;

//input student marks by condition
public class Que6 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks");
		int marks= sc.nextInt();
		grade(marks);
	}
	static void grade(int marks){
		if(marks>0 & marks<50){
			System.out.println("Failed");
		}
			else if(marks>50 & marks<75){
				System.out.println("Fitst class");
				
			}
			else if(marks > 75 & marks <100){
				System.out.println("Distinction");	
		}
			else if(marks==50){
				System.out.println("Condtion not provided");
			}
			else if(marks==75){
				System.out.println("Not provided");
			}
	}
}
