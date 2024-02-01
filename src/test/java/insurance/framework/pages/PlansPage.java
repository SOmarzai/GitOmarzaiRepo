package insurance.framework.pages;

import org.openqa.selenium.By;

public class PlansPage {
    public static final By PLANS_LINK= By.linkText("Plans");
    public static final By TABLE_ROW_ELEMENTS = By.xpath("//table/tbody/tr");
    public static final By CREATED_DATE = By.xpath("//table/tbody/tr/td[4]");
    public static final By EXPIRED_DATE = By.xpath("//table/tbody/tr/td[5]");
}
