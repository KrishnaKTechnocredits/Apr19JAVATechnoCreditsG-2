package navjeetK;

public class MeetingRoom1 {
	
	    void bookMeetingRoom()
	    {
	        System.out.println("Nalanda meeting room is booked for 1 hr");
	    }

	    void bookMeetingRoom(String meetingroom, int hr)
	    {
	        if (meetingroom=="Takshashila" && hr==2)
	        {
	            System.out.println("Takshashila meeting room is booked for 2 hrs");
	        }
	        else if (meetingroom=="AgraFort" && hr==3)
	        {
	            System.out.println("AgraFort meeting room is booked for 3 hrs");
	        }
	        else if(meetingroom=="PratapGadh" && hr==4)
	        {
	            System.out.println("PratapGadh meeting room is booked for 3 hrs");
	        }
	        else
	        {
	            System.out.println("Please provide proper meeting room details");
	        }
	    }

	    public static void main(String[] args)
	    {
	        MeetingRoom1 m1=new MeetingRoom1();

	        m1.bookMeetingRoom("AgraFort",5);


	    }
	}
	


