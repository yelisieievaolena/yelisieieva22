package parentPage;

import libs.ActionWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


    public class ParentPage {

        protected WebDriver webDriver;
        protected Logger logger = Logger.getLogger(getClass());
        protected ActionWithWebElements actionsWithOurElements;



        public ParentPage(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver,this);
            actionsWithOurElements = new ActionWithWebElements(webDriver);
        }


}
