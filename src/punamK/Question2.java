package punamK;

public class Question2 {
	public static void main(String[] args){
		Question2 question2=new Question2();
		question2.student(5, "Punam", 675);
	}
	void student(int rollNo,String name, float marks ){
		System.out.println("Roll number of Student is " +rollNo);
		System.out.println("Name of Student is "+name);
		System.out.println("Marks of Student is "+marks);
	}
}
