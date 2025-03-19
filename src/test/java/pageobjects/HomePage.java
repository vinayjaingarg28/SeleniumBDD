package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By signInLinkLoc = By.xpath("(//a[contains(text(), 'Sign In')])[1]");
    private By signUpLinkLoc = By.xpath("(//a[contains(text(), 'Create an Account')])[1]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnSignIn(){
        driver.findElement(signInLinkLoc).click();
    }

    public void clickOnSignUp(){
        driver.findElement(signUpLinkLoc).click();
    }
}
