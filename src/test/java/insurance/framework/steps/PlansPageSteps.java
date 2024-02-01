package insurance.framework.steps;

import insurance.framework.pages.PlansPage;
import insurance.framework.utility.DateTimeUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import insurance.framework.utility.SeleniumUtilities;

import java.util.*;

public class PlansPageSteps extends SeleniumUtilities {

    @When("click on plans link")
    public void clickOnPlansLink() {
       clickElement(PlansPage.PLANS_LINK);

    }
    @Then("validate table row count to be {int}")
    public void validateTableRowCountToBe(int expectedRows) {
        List<WebElement> tableRows = getElements(PlansPage.TABLE_ROW_ELEMENTS);
        Assert.assertEquals(expectedRows,tableRows.size());

    }
    @Then("validate create date is today's date EST Time Zone")
    public void validateCreateDate() {

        List<WebElement> elements = getElements(PlansPage.CREATED_DATE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateTimeUtility.getCurrentDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }
    }
    @Then("validate expire date is day after EST Time Zone")
    public void validateExpireDate() {

        List<WebElement> elements = getElements(PlansPage.EXPIRED_DATE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = DateTimeUtility.getExpiredDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }

    }

}
