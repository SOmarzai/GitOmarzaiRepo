package insurance.framework.steps;

import insurance.framework.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import insurance.framework.pages.LoginPage;

public class LoginPageSteps extends SeleniumUtilities {

    @Then("validate login button is available")
    public void validateLoginButton() {
      boolean loginButton = isElementExist(LoginPage.LOGIN_BUTTON);
        Assert.assertTrue(loginButton);
    }
    @Then("validate sign in form title")
    public void validateSignInFormTitle() {
        String actualSignInFormTitle = getElementText(LoginPage.SIGN_IN_FORM_TITLE);
        Assert.assertEquals("Sign in to your Account",actualSignInFormTitle);

    }

    @When("click on login button")
    public void clickOnLoginButton() {
        clickElement(LoginPage.LOGIN_BUTTON);

    }

    @When("enter username {string}")
    public void enterUserName(String username) {
        sendText(LoginPage.USERNAME_INPUT,username);

    }
    @When("enter password {string}")
    public void enterPassword(String password) {
        sendText(LoginPage.PASSWORD_INPUT,password);

    }
    @When("click on sign in button")
    public void clickOnSignInButton() {
        clickElement(LoginPage.SIGN_IN_BUTTON);

    }
    @Then("validate customer service portal title")
    public void validateCustomerServicePortalTitle()  {

        String actualCustomerPortalTitle = getElementText(LoginPage.CUSTOMER_SERVICE_PORTAL_TITLE);
        Assert.assertEquals("Customer Service Portal",actualCustomerPortalTitle);

    }

    @When("enter username {string} and {string}")
    public void enterCredentials(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT,username);
        sendText(LoginPage.PASSWORD_INPUT,password);

    }
    @Then("validate error message {string}")
    public void displayErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        String actualErrorMessage1 = actualErrorMessage.substring(0,5);
        String actualErrorMessage2= actualErrorMessage.substring(6);
        String actualErrorMessage3 = actualErrorMessage1 + " " + actualErrorMessage2;
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage3);


    }
}
