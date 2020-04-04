package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectUpperLogin extends AbstractParentTest {


    @Test
    public void uppercaseLogin() {
        loginPage.openPageLogin();
        loginPage.inputLogin("STUDENT");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();

        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
    }

}
