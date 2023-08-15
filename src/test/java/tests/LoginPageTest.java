package tests;

import base.BaseTest;
import base.Constatns;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageNavigationTest() throws InterruptedException {
     loginPage =    homePage.navigateToLoginPage();
     loginPage.doLogin(Constatns.USER_EMAIL,Constatns.USER_PASSWORD);
     Assert.assertEquals(loginPage.getLoginPageTitle(),"My Account");
     Thread.sleep(5000);
    }

}
