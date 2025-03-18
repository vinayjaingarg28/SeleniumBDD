package runners;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/resources/features",
                    glue = {"stepdefinitions"},
                    plugin = {"pretty", "html:target/cucumber-reports"})
public class TestngBDDRunner extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
