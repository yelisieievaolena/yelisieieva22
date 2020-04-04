package pageElements;

import libs.ActionWithWebElements;
import org.openqa.selenium.WebDriver;

public class CommonActionsWithElements {
    private WebDriver webDriver;
    ActionWithWebElements actionsWithOurElements;


    public void setWebDriver(WebDriver driver) {
        this.webDriver = driver;
        actionsWithOurElements = new ActionWithWebElements(driver);

    }

}
