package cucumber.POJO1;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.bankApp.Account;


import java.util.List;

public class BankMetothodsPOJO {
    Account testAccount;
    Account testAccount2;
    @Given("^the following account are created$")
    public void the_following_account_are_created(List<BankPOJO> userAccount)  {

        testAccount = new Account(userAccount.get(0).getAccountNumber(),userAccount.get(0).getEmail(),
                userAccount.get(0).getBalance(),userAccount.get(0).getBankName());
        testAccount2 = new Account(userAccount.get(1).getAccountNumber(),userAccount.get(1).getEmail(),
                userAccount.get(1).getBalance(),userAccount.get(1).getBankName());

    }

    @When("^the following transfers are executed$")
    public void the_following_transfers_are_executed(List<AccountPOJO> transfers)  {
        testAccount.transferViaElcard(testAccount2.getEmail(),transfers.get(0).g)

    }

    @Then("^the accounts should have the following balance amounts$")
    public void the_accounts_should_have_the_following_balance_amounts(DataTable arg1)  {

       
    }

}
