package Contact;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class ContactTest extends BaseTests {
    @Test
    public void testContact(){
        HomePage homePage = new HomePage(driver);
        homePage.clickContactLink();
    }
}
