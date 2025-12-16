package Account;

import Base.BaseTests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void testLogin(){
        HomePage homePage = new HomePage(driver);
        AccountPage account = homePage.clickAccountLink();

        LoginPage login = account.goFillLoginInfo();
        login.loginInfo("part6", "testing123");
        String welcome = login.greetingMessages().trim();
        Assert.assertTrue(welcome.contains("Hello")&&welcome.contains("part6"), "message not displayed correctly");

    }
}
