import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Scanner;  
  
public class HandlePerformances {  
    private Queue<Performance> performances;  
    private Scanner scanner;  
  
    public HandlePerformances() {  
        this.performances = new LinkedList<>();  
        this.scanner = new Scanner(System.in);  
    }  
  
    public void handlePerformances() {  
        while (true) {  
            System.out.println("Please select an option:");  
            System.out.println("1. Add performances");  
            System.out.println("2. Display all the performances");  
            System.out.println("3. Start the performances");  
            System.out.println("4. QUIT");  
  
            int option = scanner.nextInt();  
            scanner.nextLine(); 
  
            switch (option) {  
                case 1:  
                    addPerformances();  
                    break;  
                case 2:  
                    displayPerformances();  
                    break;  
                case 3:  
                    startPerformance();  
                    break;  
                case 4:  
                    System.out.println("Quitting the program...");  
                    scanner.close();  
                    return;  
                default:  
                    System.out.println("Invalid option. Please try again.");  
            }  
        }  
    }  
  
    private void addPerformances() {  
        System.out.print("Enter the number of performances to add: ");  
        int numPerformances = scanner.nextInt();  
        scanner.nextLine();  
  
        for (int i = 0; i < numPerformances; i++) {  
            System.out.print("Enter performance ID: ");  
            String performanceID = scanner.nextLine();  
  
            System.out.print("Enter performance name: ");  
            String performanceName = scanner.nextLine();  
  
            System.out.print("Enter performance lead name: ");  
            String performanceLeadName = scanner.nextLine();  
  
            Performance performance = new Performance(performanceID, performanceName, performanceLeadName);  
            performances.add(performance);  
        }  
    }  
  
    private void displayPerformances() {  
        System.out.println("All performances:");  
        for (Performance performance : performances) {  
            System.out.println(performance);  
        }  
    }  
  
    private void startPerformance() {  
        if (!performances.isEmpty()) {  
            Performance firstPerformance = performances.remove();  
            System.out.println("Starting the first performance:");  
            System.out.println(firstPerformance);  
        } else {  
            System.out.println("No performances to start.");  
        }  
    }  
  
    public static void main(String[] args) {  
        HandlePerformances handlePerformances = new HandlePerformances();  
        handlePerformances.handlePerformances();  
    }  
}