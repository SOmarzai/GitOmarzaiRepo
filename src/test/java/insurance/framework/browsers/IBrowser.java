package insurance.framework.browsers;

import org.openqa.selenium.WebDriver;

public interface IBrowser {
    WebDriver setupBrowser(boolean isHeadless);
}
