package insurance.framework.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By LOGIN_BUTTON = By.xpath("//*[@id='root']/div/div[1]/div/a[2]");
    public static final By SIGN_IN_FORM_TITLE = By.xpath("//div/div[2]/div/div/div/h2");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By SIGN_IN_BUTTON = By.xpath("//div/div[3]/button[1]");
    public static final By CUSTOMER_SERVICE_PORTAL_TITLE = By.xpath("//h2[text()='Customer Service Portal']");
    public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");
}
