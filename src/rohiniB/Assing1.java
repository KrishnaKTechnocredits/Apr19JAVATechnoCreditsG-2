package rohiniB;

public class Assing1 {
	int num1;
	int num2;
	
	void add(int num1,int num2){
		System.out.println("Sum is :"+ (num1+num2));
		
	}
	
	void subtract(int num1,int num2){
		System.out.println("Subtraction is :"+ (num1-num2));
	}

	void multiply(int num1, int num2){
		System.out.println("Mutliplication is :"+ (num1*num2));
	}

	void divide(int num1, int num2){
		System.out.println("Division is :"+ (num1*num2));
	}

	void reminder(int num1, int num2){
		System.out.println("Reminder is :"+ (num1/num2));
	}

	public static void main (String[] argu){
		
		Assing1 a = new Assing1();
		
		a.add(10, 11);
		a.subtract(12, 13);
		a.multiply(14, 15);
		a.divide(16, 17);
		a.reminder(18, 19);
	}
	
}
