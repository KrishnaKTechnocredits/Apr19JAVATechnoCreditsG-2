package nikitaG;

public class StudentsInfo {

	void displayStudentsData(int rNo, String studentName, int marks) {
		System.out.println(rNo + "           " + studentName + "         " + marks);
	}

	public static void main(String[] args) {
		StudentsInfo q2 = new StudentsInfo();
		System.out.println("Roll Number " + "Student Name         " + "Marks   ");
		System.out.println("------------------------------------------------");
		q2.displayStudentsData(1, "Nikita Garad", 75);
		q2.displayStudentsData(2, "John Jacob", 100);
		q2.displayStudentsData(3, "Smith Wayne", 80);
		q2.displayStudentsData(4, "Taylor Swift", 96);
		q2.displayStudentsData(2, "Enrique Igelesias", 65);
	}
}
