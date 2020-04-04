package pages;

import libs.ActionWithWebElements;
import libs.ConfigClass;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {

        @FindBy(name = "_username")
        private WebElement  inputLoginName;

        @FindBy(name = "_password")
        private WebElement    inputPasswordName;

        @FindBy(xpath = ".//button[@type = 'submit']")
        private WebElement inputButtonXpath;

       @FindBy(xpath = ".//div[@class='login-box-body']")
       private WebElement loginBox;


        public LoginPage(WebDriver webDriver){
            super(webDriver);

        }



    public void openPageLogin() {
        try
        {
            webDriver.get(ConfigClass.getCfgValue("base_url")+ "/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }
        public void openPage(){
            try{
                webDriver.get("http://v3.test.itpmgroup.com");
            }
            catch (Exception e){
                e.printStackTrace();
                Assert.fail("Can't work with browser");
            }

        }

        public void inputLogin(String text){
            actionsWithOurElements.enterTextToTextField(inputLoginName, text);
        }

        public void inputPassword(String text){
            actionsWithOurElements.enterTextToTextField(inputPasswordName, text);

        }

        public void clickSubmitButton(){
            actionsWithOurElements.clickButton(inputButtonXpath);
        }

    public boolean isLoginBoxRefreshed() {
        return actionsWithOurElements.isElementDisplay(loginBox);
    }

        public void loginToPage(String login, String pass){
            inputLogin(login);
            inputPassword(pass);
            clickSubmitButton();
        }

}
