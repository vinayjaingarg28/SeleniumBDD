package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

    @Given("Navigate to login page")
    public void navToLoginPage(){
        System.out.println("Hello World!");
    }

    @When("Enter the username and password")
    public void enterCredentials(){
        System.out.println("in the credentials");
    }

    @And("Click on submit button")
    public void hitEnter(){
        System.out.println("hitting enter");
    }

    @Then("Verify the successful login")
    public void verifySuccess(){
        System.out.println("logged in");
    }
}
