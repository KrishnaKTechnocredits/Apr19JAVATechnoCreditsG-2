package navjeetK;


	
	import java.util.Scanner;

	public class WeekDay {

	    String dayString;

	    void weekDayName(int a)
	    {
	        switch (a) {
	            case 1:
	                dayString = "Monday";
	                break;
	            case 2:
	                dayString = "Tuesday";
	                break;
	            case 3:
	                dayString = "Wednesday";
	                break;
	            case 4:
	                dayString = "Thursday";
	                break;
	            case 5:
	                dayString = "Friday";
	                break;
	            case 6:
	                dayString = "Saturday";
	                break;
	            case 7:
	                dayString = "Sunday";
	                break;
	            default:
	                dayString = "Invalid day";
	                break;
	        }

	        System.out.println(dayString);
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Please enter the number");

	        int a=sc.nextInt();

	        WeekDay w1=new WeekDay();

	        w1.weekDayName(a);
	    }
	}
	 


