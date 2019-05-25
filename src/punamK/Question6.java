package punamK;

public class Question6 {
	public static void main(String [] args){
		new Question6().temperature(45);
	}
	void temperature(float faren){
		float celsius= (faren-32)*5/9;
		System.out.println("Temperature in Farenheit is " +celsius );
	}

}
