package insurance.framework.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import insurance.framework.pages.HomePage;
import insurance.framework.utility.SeleniumUtilities;

public class HomePageSteps extends SeleniumUtilities {

    @Then("validate home page title")
    public void validateHomePageTitle() {
        String actualTitle = getElementText(HomePage.HOME_PAGE_TITLE);
        Assert.assertEquals("TEK Insurance App",actualTitle);

    }
    @Then("validate create primary account button is exist")
    public void validateCreatePrimaryAccountLink() {
       boolean primaryAccountLinkExist = isElementExist(HomePage.CREATE_PRIMARY_ACCOUNT_LINK);
       Assert.assertTrue(primaryAccountLinkExist);
    }
    @Then("Click on Create Primary Account Link")
    public void clickOnCreatePrimaryAccountLink() {
       clickElement(HomePage.CREATE_PRIMARY_ACCOUNT_LINK);
    }
}
