package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongPassword extends AbstractParentTest {

    @Test
    public void wrongPassword() {
        loginPage.openPageLogin();
        loginPage.inputLogin("Student");
        loginPage.inputPassword("909090909090909099999");
        loginPage.clickSubmitButton();
        checkExpectedResult("Login page hasn't loaded", loginPage.isLoginBoxRefreshed());
    }

}
