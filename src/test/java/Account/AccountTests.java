package Account;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;

public class AccountTests extends BaseTests {
    @Test
    public void testAccountPage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAccountLink();
    }

}
