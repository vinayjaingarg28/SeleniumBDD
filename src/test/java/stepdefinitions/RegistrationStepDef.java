package stepdefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegistrationPage;

public class RegistrationStepDef{


    private RegistrationPage regPage;
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

    @Given("Navigate to create an account page")
    public void navigateToCreateAnAccountPage() {
        new HomePage(driver).clickOnSignUp();
        regPage = new RegistrationPage(driver);
    }

    @When("Enter the details")
    public void enterTheDetails() {
        regPage.enterFirstName("Test1");
        regPage.enterLastName("test2");
        regPage.enterEmail("anything@gmail.com");
        regPage.enterPassword("12345678");
        regPage.confirmPassword("12345678");
    }

    @And("Click on Register")
    public void clickOnRegister() {
        regPage.hitSubmit();
    }

    @Then("Verify the successful registration")
    public void verifyTheSuccessfulRegistration() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "My Account");
    }

}
