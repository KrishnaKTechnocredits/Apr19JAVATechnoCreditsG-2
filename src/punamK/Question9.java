package punamK;

public class Question9 {
	public static void main(String[] arg){
		new Question9().swapNumber(10, 20);
			
	}
	void swapNumber(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is " +b);
	}

}
