package punamK.coreJavaAssignement3;

public class Que6Addition {
	void que6Addition(int a, int b){
		int sum= a +b;
		System.out.println("Sum of integers = "+ sum);
		}
		void que6Addition(float a, float b){
		double sum = a + b;
		System.out.println("Sum of floats = " + sum);

		}
		void que6Addition(String a, String b){
		String sum = a + b;
		System.out.println("Sum of Strings = "+sum);
		}

		public static void main(String[] args) {
		Que6Addition Q6 = new Que6Addition();
		Q6.que6Addition(10,5);
		Q6.que6Addition(10.0f,5);
		Q6.que6Addition("abc","10");
		}

}
