package punamK;

public class Question5 {
	public static void main(String[] args){
		new Question5().simpleInterest(2, 3, 4);
	}
	void simpleInterest(float P, int T, float R){
		float interest= P*T*R/100;
		System.out.println("Simple Interest is " +interest);
	}

}
