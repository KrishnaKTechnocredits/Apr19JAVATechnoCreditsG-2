package nikitaG;

public class TimeConversion {

	String getTime(int seconds) {
		int hh = 0;
		int mm = 0;
		int ss = 0;
		hh = seconds / 3600;
		mm = (seconds % 3600) / 60;
		ss = (seconds % 3600) % 60;
		return hh + " Hour(s) " + mm + " Minute(s) " + ss + " Second(s)";
	}

	public static void main(String[] args) {
		System.out.println(new TimeConversion().getTime(3725));
	}
}
