package cucumber.POJO1;

public class BankPOJO {
    private int accountNumber;
    private String email;
    private int balance;
    private  String bankName;

    public BankPOJO(int accountNumber, String email, int balance, String bankName) {
        this.accountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getBalance() {
        return balance;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
