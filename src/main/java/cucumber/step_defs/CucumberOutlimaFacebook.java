package cucumber.step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberOutlimaFacebook {

    @Given("^user clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String arg1)  {
        System.out.println("user clicks on" + arg1);
      
        
    }

    @Then("^user see Sign Up$")
    public void user_see_Sign_Up()  {
        System.out.println("user see sign Up" );
      
        
    }

    @When("^user enter \"([^\"]*)\" in first name input field$")
    public void user_enter_in_first_name_input_field(String arg1)  {
        System.out.println("user enter in first name input field" + arg1);
      
        
    }

    @When("^user enter \"([^\"]*)\" in last name input field$")
    public void user_enter_in_last_name_input_field(String arg1)  {
        System.out.println("user enter in last name input fields" + arg1);
      
        
    }

    @When("^user enter \"([^\"]*)\" in email input field$")
    public void user_enter_in_email_name_input_field(String arg1)  {
        System.out.println("user enter in email input field" + arg1);
      
        
    }

    @When("^user enter \"([^\"]*)\" in password input fieldd$")
    public void user_enter_in_password_input_fieldd(String arg1)  {
        System.out.println("user enter in password input field" + arg1);
      
        
    }

    @Then("^user sees the Birthday$")
    public void user_sees_the_Birthday()  {
        System.out.println("user sees the Birthday");
      
        
    }

    @Then("^user enter \"([^\"]*)\" in month input field$")
    public void user_enter_in_month_input_field(String arg1)  {
        System.out.println("user enter in month input field" + arg1);
      
        
    }

    @Then("^user enter (\\d+) in day input field$")
    public void user_enter_in_day_input_field(int arg1)  {
        System.out.println("user enter in day input field" + arg1);
      
        
    }

    @Then("^user entre (\\d+) in year input field$")
    public void user_entre_in_year_input_field(int arg1)  {
        System.out.println("user enter in year input field" + arg1);
      
        
    }

    @Then("^user sees the Gender$")
    public void user_sees_the_Gender()  {
        System.out.println("user sees thr Gender");
      
        
    }

    @Then("^user enter \"([^\"]*)\" in Gender input field$")
    public void user_enter_in_Gender_input_field(String arg1)  {
        System.out.println("user enter in Gender input field" + arg1);
      
        
    }

    @Then("^user clicks on Sign Up$")
    public void user_clicks_on_Sign_Up()  {
        System.out.println("user clicks on Sign Up");
      
        
    }
    }
