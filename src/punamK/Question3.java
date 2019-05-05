package punamK;

public class Question3 {
	public static void main(String[] args){
	Question3 question3=new	Question3();
	//question3.square(5);
	//question3.cube(5);
	question3.squareCube(3, 4);
	
	}
	/*void square(int x){
		x=x*x;
		System.out.println("Square of a number is " +x);
				
	}
		void cube(int x){
			x=x*x*x;
			System.out.println("Cube of a number is " +x);
			
		}*/
		void squareCube(int x, int y){
			x=x*x;
			System.out.println("Square of number is " +x);
			y=y*y*y;
			System.out.println("Cube of a number is " +y);
			
		}
}
