/* Java Basic Program
 	Q2
 */
package snehaN;

public class StudentDetails {
	
	void showDetails(int rollNo,String name,int marks)
	{
		System.out.println("Student details are : \n Roll No :"+rollNo+"\n Name :"+name+"\n Marks :"+marks);
	}
	
	public static void main(String args[])
	{
		StudentDetails stud=new StudentDetails();
		stud.showDetails(15, "Jasmin", 90);
		stud.showDetails(16, "Rutuja", 85);
	}
}
