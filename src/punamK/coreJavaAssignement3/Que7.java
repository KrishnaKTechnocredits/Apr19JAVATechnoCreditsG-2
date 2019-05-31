package punamK.coreJavaAssignement3;

import java.util.Scanner;

public class Que7 {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter \n C for Circle, \n R for rectangle, \n T for Triangle ");
		String choice= sc.next();
		double area=0;
		switch(choice){
		case "R" :
			float l; 
			float b; 
			System.out.println("Enter length and breadth of rectangle");
			l=sc.nextFloat();
			b= sc.nextFloat();
			area= l * b;
			System.out.println("Area of rectangle is : "+area);
			break;
			
		case "C" :
			float r;
			System.out.println("Enter radius of Circle");
			r= sc.nextFloat();
			area= 3.14* r*r;
			System.out.println("Area of Circle is : "+area);
			break;
			
		case "T" :
			float br;
			float h;
			System.out.println("Enter base and height of Triangle");
			br= sc.nextFloat();
			h= sc.nextFloat();
			area= 0.5 * br* h;
			System.out.println("Area of Triangle : "+area);
			break;
		}
	}
}
