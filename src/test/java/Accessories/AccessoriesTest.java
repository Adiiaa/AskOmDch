package Accessories;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.HomePage;
import pages.StorePage;

public class AccessoriesTest extends BaseTests {
    @Test
    public void testAccessoriespage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAccessoriesPage();

    }
}
