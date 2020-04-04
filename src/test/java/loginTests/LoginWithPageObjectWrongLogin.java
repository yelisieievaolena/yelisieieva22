package loginTests;

import org.junit.Test;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectWrongLogin extends AbstractParentTest {

    @Test
    public void wrongLogin() {
        loginPage.openPageLogin();
        loginPage.inputLogin("Studeeent");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();

        checkExpectedResult("Login page hasn't loaded", loginPage.isLoginBoxRefreshed());
    }


}
