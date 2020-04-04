package parentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.*;
import java.util.concurrent.TimeUnit;

    public class AbstractParentTest {
        WebDriver webDriver;
        protected LoginPage loginPage;
        protected HomePage homePage;



        @Before
        public void setUp() throws Exception {

            webDriver = driverInit();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            loginPage = new LoginPage(webDriver);
            homePage = new HomePage(webDriver);

        }

         private WebDriver driverInit()  {

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }


        @After
        public void tearDown() {
            webDriver.quit();
        }

        protected void checkExpectedResult(String message, boolean actualResult) {
            Assert.assertEquals(message, true, actualResult);
        }

}
