package insurance.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import insurance.framework.base.BaseSetup;

public class Hooks extends BaseSetup {
    @Before
    public void beforeScenarios(){
        //Open browser
        setupBrowser();
    }

    @After
    public void afterScenarios(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", "screenShot");
        }
        quitBrowser();
    }
}
