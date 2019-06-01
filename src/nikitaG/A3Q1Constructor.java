package nikitaG;

public class A3Q1Constructor {

	static int count = 0; 
	
	public A3Q1Constructor(){
		count++;
	}
	
	void display(){
		System.out.println("Construcotr was called "+count+" time(s).");
	}
	
	public static void main(String[] args) {
		A3Q1Constructor a1 = new A3Q1Constructor();
		a1.display();
		A3Q1Constructor a2 = new A3Q1Constructor();
		a2.display();
		A3Q1Constructor a3 = new A3Q1Constructor();
		a3.display();
		A3Q1Constructor a4 = new A3Q1Constructor();
		a4.display();
		A3Q1Constructor a5 = new A3Q1Constructor();
		a5.display();
		A3Q1Constructor a6 = new A3Q1Constructor();
		a6.display();
	}
}
