package Hovering;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.HoverPage;
import pages.StorePage;

public class ViewCartTest extends BaseTests {
    @Test
    public void testViewCart(){
        HomePage home = new HomePage(driver);
        StorePage store = home.clickStoreLink();
        store.clickAddToCartButton();

        HoverPage hover = new HoverPage(driver);
        if(!hover.isCartEmpty()){
            CartPage cart = hover.clickViewCartButton();
            Assert.assertTrue(cart.cartTitle().contains("Cart"), "Did not reach there");
        }else{
            System.out.println("Cart is empty");
        }
    }
}
