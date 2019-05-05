package punamK;

public class Question1 {
	public static void main(String[]args){
		Question1 question1=new Question1();
		question1.operation(100,2);
		
		
	}
	void operation(int a, int b){
		System.out.println("Sum of the Two number is " + (a+b));
		System.out.println("Multiplication of two number is " + (a*b));
		System.out.println("Division of two number is " +(a/b));
		System.out.println("Substraction of two number is " +(a-b));
		System.out.println("Reminder of two number is " +(a%b));
	}
}
