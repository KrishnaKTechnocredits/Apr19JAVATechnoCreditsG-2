package punamK;

public class Question8 {
	public static void main(String[] arg){
		new Question8().swap(7, 6);
	}
	void swap(int x, int y){
		int a= x;
		x=y;
		y=a;
		System.out.println("Value of x is " +x);
		System.out.println("Value of y is " +y );
	}

}
