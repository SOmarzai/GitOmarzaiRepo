package insurance.framework.steps;

import insurance.framework.pages.AccountsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import insurance.framework.utility.SeleniumUtilities;

public class AccountsPageSteps extends SeleniumUtilities {
    @When("click on account link")
    public void clickOnAccountLink() {
        clickElement(AccountsPage.ACCOUNTS_LINK);

    }
    @Then("validate card title to be {string}")
    public void validateCardTitleToBe(String expectedCardTitle) {
        String actualCardTitle = getElementText(AccountsPage.ACCOUNT_CARD_TITLE);
        Assert.assertEquals(expectedCardTitle,actualCardTitle);

    }
    @When("change items per page to {string}")
    public void changeItemsPerPageTo(String itemPerPage) {
        selectFromDropDown(AccountsPage.ITEM_PER_PAGE_SELECT, "Show " + itemPerPage);
    }

}
