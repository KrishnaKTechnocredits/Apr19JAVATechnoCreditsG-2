package navjeetK;

public class Area {
	
	void area(int length)
	{
		int squareArea=length*length;
		System.out.println(squareArea);
	}
	
	void area(int length, int breadth)
	{
		int rectangleArea=length*breadth;
		System.out.println(rectangleArea);
	}
	
	void area(double radius)
	{
		double circleArea=3.14*radius*radius;
		System.out.println(circleArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a1=new Area();
		
		a1.area(10); //square
		
		a1.area(10.0);  //circle
		
		a1.area(10, 20);  //rectangle

	}

}
