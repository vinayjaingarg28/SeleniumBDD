package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    private By firstNameInputLoc = By.id("firstname");
    private By lastNameInputLoc = By.id("lastname");
    private By emailInputLoc = By.id("email_address");
    private By passwordInputLoc = By.xpath("(//input[@name='password'])[1]");
    private By confirmPasswordInputLoc = By.id("password-confirmation");
    private By submitButtonLoc = By.xpath("//button[@title='Create an Account']");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(String firstName){
        driver.findElement(firstNameInputLoc).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(lastNameInputLoc).sendKeys(lastName);
    }

    public void enterEmail(String userName){
        driver.findElement(emailInputLoc).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passwordInputLoc).sendKeys(password);
    }

    public void confirmPassword(String password){
        driver.findElement(confirmPasswordInputLoc).sendKeys(password);
    }

    public void hitSubmit(){
        driver.findElement(submitButtonLoc).click();
    }

}
