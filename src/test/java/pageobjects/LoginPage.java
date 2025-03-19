package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailInputLoc = By.id("email");
    private By passowrdInputLoc = By.xpath("//input[@name='login[password]']");
    private By submitButtonLoc = By.xpath("(//button[@id='send2'])[1]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String userName){
        driver.findElement(emailInputLoc).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passowrdInputLoc).sendKeys(password);
    }

    public void hitSubmit(){
        driver.findElement(submitButtonLoc).click();
    }
}
