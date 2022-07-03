package cucumber.step_defs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;

public class DataTableDemo {

    @Given("^customer name is$")
    public void customer_name_is(DataTable customerName) throws Throwable {

        List<List<String>> listOfCustomer = customerName.raw();


        for (List<String> e: listOfCustomer) {
            for (String i : e) {
                System.out.println("user name is " + i);
            }
        }
        System.out.println("Choose first value in the table " + listOfCustomer.get(1).get(2));
        System.out.println("Get Aidos value " + listOfCustomer.get(3).get(1));
        System.out.println(listOfCustomer);
       
    }

    @Given("^user surname is$")
    public void user_surname_is(DataTable customerSurname) throws Throwable {

        List<List<String>> listOfCustomer = customerSurname.raw();

        for (List<String> e: listOfCustomer) {
            for (String i : e) {
                System.out.println("surname name is " + i);
            }
        }
    }
}
