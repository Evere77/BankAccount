public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double totalAmountOfMoney = 0;


    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++;
    }


    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }


    // DEPOSITS
    public void deposit(String account, double amount) {
        if(account == "checking" || account== "Checking") {
            checkingBalance += amount;
        }
        if(account == "savings" || account == "Savings") {
            savingsBalance += amount;

        }
    }


    // WITHDRAWS
    public void withdraw(String account, double amount) {
        if(account == "checking" || account == "Checking") {
            if(getCheckingBalance() < amount) {
                System.out.println("Insufficient funds.");
            } else {
                checkingBalance -= amount;
            }
        }
        if(account == "savings" || account == "Savings") {
            if(getSavingsBalance() < amount) {
                System.out.println("Insufficient funds.");
            } else {
                savingsBalance -= amount;
            }
        }
    }


    // TOTAL
    public double getTotal() {
        return checkingBalance + savingsBalance;
    }

    // NUMBER OF ACCOUNTS
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

}