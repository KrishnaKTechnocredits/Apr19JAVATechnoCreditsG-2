package shankarJ;

public class StudentDetails {
	
	// WAP to print the details of Student As Roll No, Name and Marks by taking input from the user.
	
	int rollnumber = 12;
	String name = "Shankar";
	int marksobtained = 65;
	
	void display(){
		/*System.out.println(rollnumber);
		System.out.println(name);
		System.out.println(marksobtained);*/
		System.out.println(rollnumber+" "+name +" "+ marksobtained);
	}
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		//System.out.println(args[0]);
		sd.display();
	}

}
