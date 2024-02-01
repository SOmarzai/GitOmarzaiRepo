package insurance.framework.utility;

import insurance.framework.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumUtilities extends BaseSetup {

    public WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(Constants.WAIT_IN_SECONDS));
    }
    public WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public String getElementText(By locator){

        WebElement element=waitForVisibility(locator);
        return element.getText();
    }
    public boolean isElementExist(By locator){
        return waitForVisibility(locator).isDisplayed();
    }
    public void clickElement(By locator){
        waitForVisibility(locator).click();
    }
    public void sendText(By locator,String text){
        waitForVisibility(locator).sendKeys(text);
    }

    public void selectFromDropDown(By locator, String visibleText){
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
    public void selectFromDropDown(By locator, int index){
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public List<WebElement> getElements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }


}
