package insurance.framework.steps;

import insurance.framework.pages.UserProfilePage;
import insurance.framework.utility.CommonUtilities;
import insurance.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfilePageSteps extends SeleniumUtilities {

    @When("click on profile button")
    public void clickOnProfileButton() throws InterruptedException {
        CommonUtilities.waitTime(2000);
        clickElement(UserProfilePage.PROFILE_BUTTON);

    }
    @Then("validate status {string} user type {string} fullName {string} username {string} authorities {string}")
    public void validateFormData(String status, String userType, String fullName, String userName, String authorities) {
        String actualStatus = getElementText(UserProfilePage.STATUS);
        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        String actualFullName = getElementText(UserProfilePage.FULL_NAME);
        String actualUserName = getElementText(UserProfilePage.USER_NAME);
        String actualAuthorities = getElementText(UserProfilePage.AUTHORITIES);

        Assert.assertEquals(status,actualStatus);
        Assert.assertEquals(userType,actualUserType);
        Assert.assertEquals(fullName,actualFullName);
        Assert.assertEquals(userName,actualUserName);
        Assert.assertEquals(authorities,actualAuthorities);

    }
    @When("click on logout button")
    public void clickOnLogOutButton() {
      clickElement(UserProfilePage.LOGOUT_BUTTON);
    }
}
