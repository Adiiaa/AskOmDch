package Checkout;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.StorePage;

public class CheckoutTest extends BaseTests {
    @Test
    public void testCheckoutProcess(){
        HomePage home = new HomePage(driver);
        StorePage store = home.clickStoreLink();
        CartPage cart = store.clickAddToCartButton().clickViewCartLink();
        CheckoutPage checkout = cart.clickCheckOutButton();
        checkout.findRegion("Rwanda");

        checkout.setBillingInfo(
                "Testing",
                "Web",
                "RDB",
                "KG 29 Ave No 16",
                "Kigali",
                "Rwanda",
                "00000",
                "testing@Web.com"
                );
        checkout.clickPlaceOrderButton();
        String confirmation = checkout.getThankYouMessage();
        Assert.assertTrue(confirmation.contains("Thank you"), "order was not placed");

    }
}
