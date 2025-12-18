package Search;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StorePage;

public class SearchTest extends BaseTests {
    @Test
    public void testSearch(){
        HomePage homePage = new HomePage(driver);
        StorePage store = homePage.clickStoreLink();
        store.setSearchField("Green Tshirt");

        String confirm = store.productPage();
        Assert.assertTrue(confirm.contains("Green"),"page not reached");
    }
}
