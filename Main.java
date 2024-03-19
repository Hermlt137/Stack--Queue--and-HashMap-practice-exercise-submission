import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) throws ParseException {  
        Scanner scanner = new Scanner(System.in);  
        event event = new event();  
  
        System.out.print("Enter the event ID: ");  
        event.setEventVenue(scanner.nextLine());  
  
        System.out.print("Enter the event name: ");  
        event.setEventName(scanner.nextLine());  
  
        System.out.print("Enter the event venue: ");  
        event.setEventVenue(scanner.nextLine());  
  
        System.out.print("Enter the event date (yyyy-MM-dd): ");  
        String dateString = scanner.nextLine();  
        event.setEventID(new SimpleDateFormat("yyyy-MM-dd").parse(dateString));  
  
        System.out.println("Enter details of the attendees :");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            Attendees attendee = new Attendees(name, email, address);
            event.addEventAttendee(attendee);
            System.out.print("Add another attendee? (yes/no): ");
            String addAnother = scanner.nextLine();
            if (addAnother.equalsIgnoreCase("no")) {
                break;
            }
}

  
        System.out.println("Event Details:");  
        System.out.println("Event ID: " + event.getEventID());  
        System.out.println("Event Name: " + event.getEventName());  
        System.out.println("Event Venue: " + event.getEventVenue());  
        System.out.println("Event Date: " + (event.getEventDate()));  
        System.out.println("Total Attendees: " + event.getTotalAttendees());  

        System.out.println("Attendees:\n");
        for (Attendees attendee : event.getEventAttendees()) {
            System.out.println("Name: " + attendee.getName());
            System.out.println("Email: " + attendee.getEmail());
            System.out.println("Address: " + attendee.getAddress());
            System.out.println();
        }  
  
        scanner.close();  
    }  
}  
