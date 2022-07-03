package cucumber.step_defs;

import cucumber.api.java.en.Given;
import cucumber.bankApp.Account;
import cucumber.pojo.UserAccount;

import java.util.List;

public class BankAppSteps {
    @Given("^following account is created$")
    public void following_account_is_created(List<UserAccount> userAccount)  {
        System.out.println("User email is " + userAccount.get(0).getEmail());
        Account johnAcc = new Account(userAccount.get(0).getAccountNumber(),userAccount.get(0).getEmail(),userAccount.get(0).getBalance());

        System.out.println(johnAcc);

    }
}
