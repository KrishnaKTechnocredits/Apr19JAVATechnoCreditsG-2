package shankarJ;
public class TimeCalculator {

	//Write a Java program to convert seconds to hour, minute and seconds
	
	public static void main(String[] args) {

		TimeCalculator m1 = new TimeCalculator();
		int seconds;
		seconds = 78595;
		System.out.println(m1.SecondsToHours(seconds));
	}

	public int SecondsToHours(int seconds) {
		int sec = seconds % 60;
		int hrs = seconds / 60;
		int min = hrs % 60;
		hrs = hrs / 60;
		System.out.println(hrs+"hrs" + "." + min +"m"+ "." + sec+"s");
		return (seconds);
	}

}
