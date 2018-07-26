package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {


	@Given("^the browser is validated$")
	public void the_browser_is_validated() throws Throwable {
		System.out.println("browser is validated");
	}
	
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // code to navigate to login url
    	System.out.println("navigated to login url");
    }
    
    @When("^the browser is triggered$")
    public void the_browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }
    
    @When("^User logs in to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_in_to_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @When("^User logs in to the application with username and password$")
    public void user_logs_in_to_the_application_with_username_and_password() throws Throwable {
    	System.out.println("logged in successfully");
    }
    
    @When("^User signs up with following details$")
    public void user_signs_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
    
    @When("^User logs into the application with (.+) and (.+)$")
    public void user_logs_in_to_the_application_with_user_and_Password(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }
    
    @Then("^check if the browser is displayed$")
    public void check_id_the_browser_is_started() throws Throwable {
        System.out.println("browser is displayed");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated home page");
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }

}
