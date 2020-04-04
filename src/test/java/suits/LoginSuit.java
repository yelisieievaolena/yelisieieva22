package suits;

import loginTests.LoginWithPageObjectTest;
import loginTests.LoginWithPageObjectUpperLogin;
import loginTests.LoginWithPageObjectWrongLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses(
            {
                    LoginWithPageObjectUpperLogin.class,
                    LoginWithPageObjectWrongLogin.class,
                    LoginWithPageObjectTest.class

            }
    )
    public class LoginSuit {

    }



