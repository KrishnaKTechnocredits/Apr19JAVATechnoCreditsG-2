package rohiniB;

public class Assing5 {
	
// calcualte simple interest 
	static void calSimInter(int prin, int term, float rate){
		float cal;
		cal = (prin * term * rate) / 100;
		System.out.println("Simple Interest = " + cal);
		
	}
	
	public static void main(String[] argu){
	
		calSimInter(100000,6,9.15f);
	}
}
