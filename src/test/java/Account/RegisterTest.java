package Account;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.RegisteringPage;

public class RegisterTest extends BaseTests {
    @Test
    public void testRegister() {
        HomePage homePage = new HomePage(driver);

        AccountPage account = homePage.clickAccountLink();

        RegisteringPage register = account.goFillRegisterInfo();
        register.registerInfo("part7", "part7@ex.com", "testing123");
        String greeting = register.greetingMessage().trim();

        Assert.assertTrue(greeting.contains("Hello") && greeting.contains("part7"),
                "Dashboard greeting message not displayed correctly!");

    }
}
