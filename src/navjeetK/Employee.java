package navjeetK;


	
	public class Employee {

	    int empid;

	    String empName;

	    Employee(int empid, String empName  )
	    {
	        this.empid=empid;

	        this.empName=empName;
	    }

	    void display()
	    {
	        System.out.println("Employee Id is:- " + empid + " Employee Name is:- " + empName);
	    }

	    public static void main(String[] args)
	    {
	        Employee[] arr1=new Employee[2];

	        arr1[0]=new Employee(101,"Navjeet");

	       //Employee e1=new Employee(101,"Navjeet");

	        arr1[0].display();

	        String str1=arr1[0].empName;

	        Employee e2=new Employee(102,"Ajay");

	        e2.display();
	    }
	}
	 




