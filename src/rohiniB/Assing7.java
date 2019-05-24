package rohiniB;

public class Assing7 {

	// convert seconds into hrs, min and seconds
	
	void convertSecHs(double sec){
		double hrs;
		double min;
				
		hrs = sec/3600;
		System.out.print((int)hrs + " Hours: ");
		
		min = (sec%3600)/60; 
		System.out.print((int)min + " Min: ");
		
		min = (sec%3600)%60;
		System.out.print((int)min + " Second ");
					
	}
	
	public static void main(String[] argu){
		Assing7 c = new Assing7(); 
		c.convertSecHs(6530);
	}
}
