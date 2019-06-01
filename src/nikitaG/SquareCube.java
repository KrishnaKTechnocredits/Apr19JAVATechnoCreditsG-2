package nikitaG;

public class SquareCube {

	int cube(int num) {
		return num * num * num;
	}

	int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		SquareCube q3 = new SquareCube();

		System.out.println("Square :" + q3.square(34));
		System.out.println("Cube   :" + q3.cube(17));
	}
}
