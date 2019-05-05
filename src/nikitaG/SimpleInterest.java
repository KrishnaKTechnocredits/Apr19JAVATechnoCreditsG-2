package nikitaG;

public class SimpleInterest{

	float simpleInterest(float principleAmount,int year, float rate){
		return (principleAmount*year*rate)/100;
	}
	public static void main(String[] args) {
		SimpleInterest q5 = new SimpleInterest();
		System.out.println("Simple Interest is "+q5.simpleInterest(2500000f, 7, 7.8f));
	}
}
