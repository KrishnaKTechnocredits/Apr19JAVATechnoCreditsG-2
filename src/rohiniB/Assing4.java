package rohiniB;

public class Assing4 {
	
	// calculate perimeter of a Reactangle
	static void calReactPer(int leng, int width){
		int peri;
		peri = 2 * (leng*width);
		System.out.println("Perimeter of reactangle is: "+ peri);
	}
	
	//Calculate perimeter of a circle
	static void calCirPeri(int radius){
		double pi = 3.14;
		double circu;
		
		circu = 2 * pi * radius;
		System.out.println("Perimeter of Circle is :"+ (circu));
	}
	
	public static void main(String[] argu){
		//calReactPer c1 = new calReactPer();
		calReactPer(10, 10);
		calCirPeri(10);
	}

}
