import java.util.Stack;
import java.util.Scanner;

public class HandleComplementaryPasses {
    private Stack<String> complementaryPassesStack;
    Scanner sc = new Scanner(System.in);

    public HandleComplementaryPasses() {
        complementaryPassesStack = new Stack<>();
    }

    public void handleComplementaryPasses() {
        
        int choice = 0;
        do {
            System.out.println("Please select an action:");
            System.out.println("1. Redeem supplementary pass");
            System.out.println("2. Show all redeemed complementary passes");
            System.out.println("3. Display the last redeemed supplementary ticket");
            System.out.println("4. Revoke any redeemed supplementary passes");
            System.out.println("5. Quit");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Please enter the number of passes to redeem:");
                    int numPasses = sc.nextInt();
                    sc.nextLine();

                    redeemComplementaryPasses(numPasses);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 4:
                    undoRedeemedComplementaryPass();
                    break;
                case 5:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Invalid operation, please reselect");
                    break;
            }
        } while (choice != 5);
    }

    private void redeemComplementaryPasses(int numPasses) {
        if (complementaryPassesStack.size() >= 10) {
            System.out.println("Invalid operation. All passes have been redeemed");
        } else {
            for (int i = 0; i < numPasses; i++) {
                System.out.println("Please enter your passport ID:");
                String passId = sc.nextLine();
                complementaryPassesStack.push(passId);
            }
            System.out.println("Redemption successful");
        }
    }

    private void displayComplementaryPasses() {
        System.out.println("All redeemed complementary passes:");
        for (String passId : complementaryPassesStack) {
            System.out.println(passId);
        }
    }

    private void displayLastRedeemedComplementaryPass() {
        if (!complementaryPassesStack.isEmpty()) {
            System.out.println("Last redeemed supplementary ticket:" + complementaryPassesStack.peek());
        } else {
            System.out.println("Additional tickets that have not been redeemed");
        }
    }

    private void undoRedeemedComplementaryPass() {
        if (!complementaryPassesStack.isEmpty()) {
            System.out.println("Please enter the ID of the passport to be revoked:");
            String passId = sc.nextLine();
            if (complementaryPassesStack.contains(passId)) {
                complementaryPassesStack.remove(passId);
                System.out.println("Revoke successful");
            } else {
                System.out.println("The pass ID was not found");
            }
        } else {
            System.out.println("Additional tickets that have not been redeemed");
        }
    }
}