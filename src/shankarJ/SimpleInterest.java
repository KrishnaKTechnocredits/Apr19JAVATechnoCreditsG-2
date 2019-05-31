package shankarJ;

public class SimpleInterest {
	
	//Write a Java program to compute simple interest

	public static void main(String[] args) {
		double r, t, i, //rate,time,simple interest
		amt = 725000;
		t = 5;
		r = 11.25;
		i = (amt * r * t) / 100;
		System.out.println(i);
	}
}
