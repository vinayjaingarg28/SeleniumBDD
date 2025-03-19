package stepdefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginStepDef {

    private LoginPage loginPage;
    WebDriver driver;

    @Before
    public void setup(){
        Base base = Base.getBase();
        this.driver = base.driver;
        base.visitUrl();
    }

    @After
    public void teardown(){
        driver.close();
    }

    @Given("Navigate to login page")
    public void navToLoginPage() {
        new HomePage(driver).clickOnSignIn();
        loginPage = new LoginPage(driver);
    }

    @When("Enter the username and password")
    public void enterCredentials() {
        loginPage.enterEmail("cxxqcvskqq@mkzaso.com");
        loginPage.enterPassword("ALkXq8@3zZHP8Ui");
    }

    @And("Click on submit button")
    public void hitEnter() {
        loginPage.hitSubmit();
    }

    @Then("Verify the successful login")
    public void verifySuccess() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "My Account");
    }
}
