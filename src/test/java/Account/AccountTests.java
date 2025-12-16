package Account;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;

public class AccountTests extends BaseTests {
    @Test
    public void testAccountPage(){
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = homePage.clickAccountLink();
        accountPage.loginInfo("Testing Web", "TestingWeb123");
        accountPage.registerInfo("TestingWeb", "testing@ex.com", "testing123");
    }


}
