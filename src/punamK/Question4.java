package punamK;

public class Question4 {
	public static void main(String[] args){
		Question4 question4=new Question4();
		question4.circle(5);
		question4.rectangle(3, 4);
		
	}
	void circle(float radius){
		double perimeter= 2* 3.14*radius;
		double area= 3.14 * radius * radius;
		System.out.println("Perimeter of circle is " + perimeter);
		System.out.println("Area of a circle is " +area);
		
	}
	void rectangle(float length, float breadth){
		float perimeter= 2* (length+breadth);
		float area= length * breadth;
		System.out.println("Perimeter of rectangle is " + perimeter);
		System.out.println("Area of a rectangle is " +area);
	}
		
}
