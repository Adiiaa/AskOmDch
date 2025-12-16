package Women;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class WomenTest extends BaseTests {
    @Test
    public void testWomenpage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickWomenPage();
    }
}
