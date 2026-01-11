public class ATM implements ATMOperations {

    private int balance = 10000;

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
