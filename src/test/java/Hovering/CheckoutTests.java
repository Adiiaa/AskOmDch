package Hovering;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.HoverPage;
import pages.StorePage;

public class CheckoutTests extends BaseTests {
    @Test
    public void testCheckoutTest(){
        HomePage home = new HomePage(driver);
        StorePage store = home.clickStoreLink();
        store.clickAddToCartButton();

        HoverPage hover = new HoverPage(driver);
        hover.hoverOnCartIcon();
        if(!hover.isCartEmpty()){
            CheckoutPage check = hover.clickCheckoutButton();
            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("Checkout"), "did not reach there");
        }else{
            System.out.println("Cart is empty");
        }
    }
}
