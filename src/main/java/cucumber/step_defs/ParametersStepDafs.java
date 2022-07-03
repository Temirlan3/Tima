package cucumber.step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ParametersStepDafs {
    @Given("^user name is \"([^\"]*)\"$")
    public void user_name_is(String arg1) {
        System.out.println("fkalsmf" + arg1);
       
      
    }

    @Given("^user surname is Mask$")
    public void user_surname_is_Mask() {
        System.out.println("admm");
       
      
    }

    @Given("^user age is (\\d+)$")
    public void user_age_is(int userAge) {
        System.out.println("afmlam" + userAge);
       
      
    }

    @Then("^user name is happy$")
    public void user_name_is_happy()  {
     
        
    }



}
