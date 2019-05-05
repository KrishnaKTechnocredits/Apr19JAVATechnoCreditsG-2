package punamK;

public class Question7 {
	public static void main(String[] args){
		new Question7().timeConversion(3800);
	}
	void timeConversion(int seconds){
		int time = seconds/(60*60);
		System.out.print(time + "hr ");
		int min = seconds%(60*60);
		System.out.print(min/60 +"min");	
		int sec =min%60;
		System.out.println(" " +sec + "sec");
		
	}
	
}
