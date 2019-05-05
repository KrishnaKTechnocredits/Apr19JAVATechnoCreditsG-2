package firstAssignment;

public class AreaPerimeter {
	
	public int area(int x, int y){
		int area = x*y;
		System.out.println("Area of Rectangle : " + area);
		return area;
	}
	public int perimeter(int x, int y){
		int perimeter = 2*(x+y);
		System.out.println("Perimeter of Rectangle : " + perimeter);
		return perimeter;
	}
		public static void main(String []args){
		AreaPerimeter ap = new AreaPerimeter ();
		ap.area(20,10);
		ap.perimeter(20,10);
		
	}
}
