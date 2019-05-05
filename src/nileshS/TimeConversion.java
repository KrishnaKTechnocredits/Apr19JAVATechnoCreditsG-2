package nileshS;

public class TimeConversion {
	
	void minToSec(int min)
	{
		int sec = 60;	
		int x;
		x= min*sec;
		System.out.println(min + " Minute is " +x+ " Seconds ");
	}
	
	void secToHour(int sec)
	{
		double hour = (double) sec/(60*60);
		System.out.println(sec + " Seconds is "+hour+" hour ");
		
	}
	
	public static void main(String[] args) {
		TimeConversion timeConversion1 = new TimeConversion();
		timeConversion1.minToSec(15);
		timeConversion1.secToHour(1800);
	}

}
