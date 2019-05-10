package nikhilD;

public class SimpleInterest {
	public static void main(String[] args) {
		SimpleInterest s = new SimpleInterest();
		s.interest(200000,2,8.5);
		//int principle = 200000;
		//int t = 5;
		//double r = 8.5d;
	}		
		public double interest (int p,int t, double r){
		double interest  = (p*t*r)/100; //(principle *tenure*rate = simple interest)
		System.out.println("Simple Interest is : " + interest);
		return interest;
		
	}
}

