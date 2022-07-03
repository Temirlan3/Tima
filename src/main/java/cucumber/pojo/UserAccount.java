package cucumber.pojo;

public class UserAccount {

    private int accountNumber;
    private String email;
    private double balance;

    public UserAccount(int accountNumber, String email, double balance) {
        this.accountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    @Override
    public String toString() {
        return "UserAccount{" +
                "accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}
