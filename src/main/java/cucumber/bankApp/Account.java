package cucumber.bankApp;

public class Account {

    private int AccountNumber;
    private String email;
    private double balance;
    private double amountOfSentToday;


    public Account(int accountNumber, String email, double balance) {
        AccountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        if (balance < amount){
            System.err.println("insufficient funds");
            return;
        }
        balance -= amount;
    }

    public void transferViaElcard(String emailOfReceiver, double amount, Bank bank){
        if (amountOfSentToday + amount > 2000 ){
            System.err.println("Daily Amount Exceeded");
            return;
        }
        withDraw(amount);
        bank.getAccounts().get(emailOfReceiver).deposit(amount);
        amountOfSentToday += amount;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountOfSentToday() {
        return amountOfSentToday;
    }

    public void setAmountOfSentToday(double amountOfSentToday) {
        this.amountOfSentToday = amountOfSentToday;
    }
}

