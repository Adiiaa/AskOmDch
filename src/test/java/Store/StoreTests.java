package Store;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.HomePage;
import pages.StorePage;

public class StoreTests extends BaseTests {
    @Test
    public void testStore(){
        HomePage homePage = new HomePage(driver);
       var storePage =  homePage.clickStoreLink();
       storePage.clickAddToCartButton();

    }

}
