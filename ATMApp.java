import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATMOperations atm = new ATM();
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    atm.deposit(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    atm.withdraw(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
