package parentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.Utils;
import org.apache.log4j.Logger;
import org.apache.log4j.Appender;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;





    public class AbstractParentTest {
        WebDriver webDriver;
        protected LoginPage loginPage;
        protected HomePage homePage;
        protected Utils utils;
        private String pathToScreenShot;
        Logger log = Logger.getLogger(getClass());

        Properties props = new Properties();
        //props.load(new FileInputStream("src/log4j.properties"));
      // PropertyConfigurator.configure(props);


        @Rule
        public TestName testName = new TestName();

        @Before
        public void setUp() throws Exception {

            pathToScreenShot = "..\\yelisieieva\\target\\screenshot\\" + this.getClass().getPackage().getName() + "\\" + this.getClass().getSimpleName()
                    + this.testName.getMethodName() + ".jpg";

            webDriver = driverInit();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            loginPage = new LoginPage(webDriver);
            homePage = new HomePage(webDriver);
            utils = new Utils();

        }

         private WebDriver driverInit()  {

            WebDriverManager.chromedriver().setup();
            log.info("lalala");
            return new ChromeDriver();

        }


        @After
        public void tearDown() {
            webDriver.quit();
        }

        protected void checkExpectedResult(String message, boolean actualResult) {

            if (!actualResult== true) {
                utils.screenShot(pathToScreenShot, webDriver);
            }
            Assert.assertEquals(message, true, actualResult);
        }

}
