import java.util.Date;
import java.util.ArrayList;
public class event {
   private Date eventID;  
    private String eventName;  
    private String eventVenue;  
    private Date eventDate;  
    private ArrayList<Attendees> eventAttendees;
  
    public event() {  
        eventAttendees = new ArrayList<>();  
    }  
  
    public Date getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(Date string) {  
        this.eventID = string;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public Date getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(java.util.Date date) {  
        this.eventDate = date;  
    }  
  
    public ArrayList<Attendees> getEventAttendees() {
        return eventAttendees;  
    }  
  
    public void addEventAttendee(Attendees attendee) {
        eventAttendees.add(attendee);  
    }  
  
    public int getTotalAttendees() {  
        return eventAttendees.size();  
    }  
  
    public void organizeEvent() {  
         System.out.println("Total Attendees: " + getTotalAttendees());  
    }  
  

}
