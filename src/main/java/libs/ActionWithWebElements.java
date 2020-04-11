package libs;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionWithWebElements {

        WebDriver webDriver;
        Logger logger = Logger.getLogger(getClass());
        WebDriverWait webDriverWait_10, webDriverWait_15;

        public ActionWithWebElements(WebDriver webDriver) {
            this.webDriver = webDriver;
            webDriverWait_10 = new WebDriverWait(webDriver,10);
            webDriverWait_15 =new WebDriverWait(webDriver,15);
        }

        public void enterTextToTextField(WebElement element, String text){
            try {
                element.clear();
                element.sendKeys(text);
                logger.info("it is inputed");
            }
            catch (Exception e){
                e.printStackTrace();
                logger.error("something wrong");
            }

        }

        public void clickButton(WebElement element){
            try {
                webDriverWait_10.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
                logger.info("");

            }
            catch (Exception e){
                e.printStackTrace();
                logger.error("");

            }

        }

        public boolean isElementDisplay(WebElement element){
            try {
                webDriverWait_15.until(ExpectedConditions.visibilityOf(element));
                element.click();

                return element.isDisplayed();
            }
            catch (Exception e){
                e.printStackTrace();
                logger.error("");
                return false;
            }

        }

        public void SetCheckBox(WebElement element, boolean state){
            try {
                if(element.isSelected() == state){

                }
                else {

                    element.click();
                }

                logger.info("The check box is "+state);

            }
            catch (Exception e){
                e.printStackTrace();
                logger.error("");

            }

        }

        private void selectElementFromDD(WebElement element, String itemName){
            Select dropDownValue = new Select(element);
            try {
                dropDownValue.selectByVisibleText(itemName);
            }
            catch(Exception ex){
                ex.printStackTrace();
                logger.error("");

            }


        }


    }
