package padmajaD;

public class StudentDetails {

	void display(int rollno, String name, int marks) {

		System.out.println(rollno + name + marks);

	}

	public static void main(String[] arg) {

		new StudentDetails().display(20, "Padmaja", 90);
	}
}
