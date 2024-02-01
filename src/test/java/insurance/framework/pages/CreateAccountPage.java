package insurance.framework.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By ACCOUNT_FORM_TITLE = By.xpath("//h2[text()='Create Primary Account Holder']");
    public static final By CREATE_PRIMARY_ACCOUNT_LINK = By.linkText("Create Primary Account");
    public static final By ACCOUNT_EMAIL_INPUT= By.id("email");
    public static final By ACCOUNT_PREFIX_SELECT = By.id("title");
    public static final By ACCOUNT_FIRSTNAME_INPUT =By.name("firstName");
    public static final By ACCOUNT_LASTNAME_INPUT = By.name("lastName");
    public static final By ACCOUNT_GENDER_SELECT=By.id("gender");
    public static final By ACCOUNT_MARITAL_STATUS_SELECT=By.id("maritalStatus");
    public static final By ACCOUNT_EMPLOYMENT_STATUS_INPUT=By.name("employmentStatus");
    public static final By ACCOUNT_DATE_OF_BIRTH_INPUT = By.id("dateOfBirth");
    public static final By ACCOUNT_CREATE_BUTTON=By.xpath("//div/button[text()='Create Account']");
    public static final By SIGN_UP_PAGE_TITLE= By.xpath("//div/h2[text()='Sign up your account']");
    public static final By EMAIL_TITLE = By.xpath("//div[@id='root']/div/div[2]//div[contains(@class, 'chakra-stack')]/h2[3]");
    public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");

}
