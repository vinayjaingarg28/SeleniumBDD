package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public WebDriver driver;
    public String baseUrl;
    private static Base base;
    private static final String propertyFilePath= "src/test/resources/configs/config.properties";

    private Base(){}

    public static Base getBase(){
        if(base==null) {
            base = new Base();
            base.setup();
        }

        return base;
    }

    public void setup(){
        Properties prop = Base.ConfigFileReader();
        baseUrl = prop.getProperty("baseUrl");
        String browser = prop.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }

    public void visitUrl(){
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public static Properties ConfigFileReader(){
        BufferedReader reader;
        Properties properties;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
        return properties;
    }

}
