package Men;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class MenPage extends BaseTests {
    @Test
    public void testMenPage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickMenPage();
    }
}
