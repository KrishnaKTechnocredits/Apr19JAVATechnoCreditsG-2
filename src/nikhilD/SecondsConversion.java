package nikhilD;

public class SecondsConversion {
	public static void main(String []args){
		SecondsConversion s = new SecondsConversion();
		s.SecondstoHour();
	}
	
	public void SecondstoHour(){
			int seconds = 78595;
			int sec = seconds % 60;
	        int hrs = seconds / 60;
	        int min = hrs % 60;
	        hrs = hrs / 60;
	        System.out.print( hrs + "hr"+ "." + min + "m"+ "." + sec+ "s");
	        
	}
}
	 	