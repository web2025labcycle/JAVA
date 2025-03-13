// BankAccount class definition
package cycle2;

class BankAccount {
    // Fields
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize all fields
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Main class to test BankAccount functionality
public class BankAccountTest {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.0);

        // Performing deposit operation
        myAccount.deposit(500.0);

        // Performing withdrawal operation
        myAccount.withdraw(300.0);

        // Displaying account information
        myAccount.displayAccountInfo();
    }
}
