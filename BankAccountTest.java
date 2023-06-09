public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();


        account1.deposit("checking", 7);
        account1.deposit("savings", 23.52);

        account2.deposit("checking", 12.34);
        account2.deposit("savings", 25);

        account1.withdraw("checking", 1);
        account1.withdraw("savings", .52);

        account2.withdraw("checking", 5);
        account2.withdraw("savings", 20);

        System.out.println("Account1: Checking balance: $" + account1.getCheckingBalance());
        System.out.println("Account1: Savings balance: $" + account1.getSavingsBalance());

        System.out.println("Account2: Checking balance: $" + account2.getCheckingBalance());
        System.out.println("Account2: Savings balance: $" + account2.getSavingsBalance());

        System.out.println("Account1 total balance: $" +account1.getTotal());
        System.out.println("Account2 Total balance: $" +account2.getTotal());

        System.out.println("Number of Accounts: " + BankAccount.getNumberOfAccounts());

    }
}