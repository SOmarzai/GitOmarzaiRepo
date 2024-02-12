package insurance.framework.base;

import org.openqa.selenium.WebDriver;
import insurance.framework.browsers.ChromeBrowser;
import insurance.framework.browsers.EdgeBrowser;
import insurance.framework.browsers.FirefoxBrowser;
import insurance.framework.browsers.IBrowser;
import insurance.framework.utility.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseSetup {
    public static WebDriver driver;
    public static Map<String, String> recorder = new HashMap<>();

    public void setupBrowser(){
        Properties configs= readProperties();
        String browserType=configs.getProperty("browser");
        boolean isHeadless = Boolean.parseBoolean(configs.getProperty("browser.isHeadless"));
        IBrowser browserInterface;
        switch (browserType.toLowerCase()) {
            case "chrome":
                browserInterface = new ChromeBrowser();
                break;
            case "firefox":
                browserInterface = new FirefoxBrowser();
                break;
            case "edge":
                browserInterface = new EdgeBrowser();
                break;
            default:
                throw new RuntimeException("Wrong browser type failing test");
        }
        driver = browserInterface.setupBrowser(isHeadless);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.WAIT_IN_SECONDS));
        String url=configs.getProperty("insurance.url");
        driver.get(url);

    }
    private Properties readProperties(){
        String propertyFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/dev-env.properties";
        Properties properties = new Properties();
        try{
            FileInputStream inputStream = new FileInputStream(propertyFilePath);
            properties.load(inputStream);
        }catch (IOException ex){
            ex.printStackTrace();
            throw new RuntimeException("Cannot read property file");
        }
        return  properties;
    }
    public void quitBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

}
