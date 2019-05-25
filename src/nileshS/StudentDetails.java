package nileshS;

public class StudentDetails {
	
	void printDetails(int rno, String name, int marks)
	{
		System.out.println("Students Details:" + "\n" +"Roll No:"+rno+ "\n" +"Name: " +name+ "\n" +"Marks: "+marks);
	}
	
	public static void main(String[] args) {
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.printDetails(1, "Nilesh Shirude", 90);
	}

}
