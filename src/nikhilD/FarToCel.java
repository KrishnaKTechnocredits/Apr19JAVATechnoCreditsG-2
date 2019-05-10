package nikhilD;

public class FarToCel {
		public static void main(String[] args) {
		FarToCel fc = new FarToCel();
		fc.temp();
		}
		public void temp(){
		double far = 132;
		double temp = ((far - 32)*5)/9;
		System.out.println("Temperatue value in Celsius is = " + temp);
		}
		

}
