package insurance.framework.pages;

import org.openqa.selenium.By;

public class AccountsPage {
    public static final By ACCOUNTS_LINK = By.linkText("Accounts");
    public static final By TABLE_ROW_ELEMENT = By.xpath("//table/tbody/tr");
    public static final By ITEM_PER_PAGE_SELECT = By.xpath("//table/following-sibling::div//select");
    public static final By ACCOUNT_CARD_TITLE = By.xpath("//*[@id='root']/div/div[3]/div/div/div/h2");
}
