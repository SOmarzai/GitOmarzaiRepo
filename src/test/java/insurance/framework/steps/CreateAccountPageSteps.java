package insurance.framework.steps;

import insurance.framework.base.BaseSetup;
import insurance.framework.pages.CreateAccountPage;
import insurance.framework.utility.RandomData;
import insurance.framework.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CreateAccountPageSteps extends SeleniumUtilities {

    @Then("Validate Account Form Title")
    public void ValidateAccountFormTitle() {
        String actualAccountFormTitle = getElementText(CreateAccountPage.ACCOUNT_FORM_TITLE);
        Assert.assertEquals("Create Primary Account Holder",actualAccountFormTitle);

    }
    @Then("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccountButton() {
        clickElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_LINK);
    }
    @When("Fill up account form with DataTable")
    public void fillUpAccountForm(DataTable dataTable) {
        Map<String,String> data = dataTable.asMap();

        String firstName = data.get("lastName");
        String lastName = data.get("firstName");
        String email = data.get("email").equals("random") ? RandomData.emailAddress(firstName, lastName) :
                data.get("email");

        //Store email address to recoder map
        BaseSetup.recorder.put("email", email);

        BaseSetup.recorder.put("fullName", firstName + " " + lastName);
        sendText(CreateAccountPage.ACCOUNT_EMAIL_INPUT, email);


       // sendText(CreateAccountPage.ACCOUNT_PREFIX_SELECT,data.get("title"));
        selectFromDropDown(CreateAccountPage.ACCOUNT_PREFIX_SELECT,data.get("prefix"));
        sendText(CreateAccountPage.ACCOUNT_FIRSTNAME_INPUT,data.get("firstName"));
        sendText(CreateAccountPage.ACCOUNT_LASTNAME_INPUT,data.get("lastName"));

       // sendText(CreateAccountPage.ACCOUNT_GENDER_INPUT,data.get("gender"));
        selectFromDropDown(CreateAccountPage.ACCOUNT_GENDER_SELECT, data.get("gender"));
        //sendText(CreateAccountPage.ACCOUNT_MARITAL_STATUS_INPUT,data.get("maritalStatus"));
        selectFromDropDown(CreateAccountPage.ACCOUNT_MARITAL_STATUS_SELECT, data.get("maritalStatus"));
        sendText(CreateAccountPage.ACCOUNT_EMPLOYMENT_STATUS_INPUT,data.get("employmentStatus"));
        sendText(CreateAccountPage.ACCOUNT_DATE_OF_BIRTH_INPUT,data.get("dob"));


    }
    @When("Click on Create Account Button")
    public void clickOnCreateAccountButton() {
        clickElement(CreateAccountPage.ACCOUNT_CREATE_BUTTON);

    }
    @Then("Validate sign up account page title")
    public void validateSignUpPageTitle() {
        String actualTitle= getElementText(CreateAccountPage.SIGN_UP_PAGE_TITLE);
        Assert.assertEquals("Sign up your account",actualTitle);


    }
    @Then("validate created email")
    public void validateCreatedEmail() {
        String expectedEmail = BaseSetup.recorder.get("email");
        String actualEmail = getElementText(CreateAccountPage.EMAIL_TITLE);
        Assert.assertEquals("Validate created account", expectedEmail, actualEmail);
    }
    @Then("Validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {

        String actualErrorMessageBeforeStringManipulation = getElementText(CreateAccountPage.ERROR_MESSAGE);
        String SubstringActualErrorMessageFirstPart = actualErrorMessageBeforeStringManipulation.substring(0,5);
        String SubstringActualErrorMessageSecondPart = actualErrorMessageBeforeStringManipulation.substring(6);
        String actualErrorMessage = SubstringActualErrorMessageFirstPart +" "+ SubstringActualErrorMessageSecondPart;

        Assert.assertEquals("Validate error message",expectedErrorMessage,actualErrorMessage);
    }
}
