package Store;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccessoriesPage;
import pages.CartPage;
import pages.HomePage;
import pages.StorePage;

public class StoreTests extends BaseTests {
    @Test
    public void testStore(){
        HomePage homePage = new HomePage(driver);
       var storePage =  homePage.clickStoreLink();

        CartPage cartPage = storePage.clickAddToCartButton().clickViewCartLink();
        String title = cartPage.cartTitle();
        Assert.assertTrue(title.contains("Cart"),"The page was not reached");

    }

}
