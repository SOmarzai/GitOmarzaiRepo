package insurance.framework.pages;

import org.openqa.selenium.By;

public class UserProfilePage {
    public static final By PROFILE_BUTTON = By.xpath("//div/div/div/button");
    public static final By STATUS = By.xpath("//div/div/div[1]/p[2]/span/span");
    public static final By USER_TYPE = By.xpath("//div/div/div[2]/p[2]");
    public static final By FULL_NAME = By.xpath("//div/div/div[3]/p[2]");
    public static final By USER_NAME = By.xpath("//div/div/div[4]/p[2]");
    public static final By AUTHORITIES = By.xpath("//div/div/div[5]/ul/li");
    public static final By LOGOUT_BUTTON = By.xpath("//footer/div/button[1]");
}
