package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By cartIcon = By.cssSelector("span[class='count']");
    private By viewCartButton = By.linkText("View cart");
    private By checkoutButton = By.linkText("Checkout");
    private By emptyCart = By.cssSelector("#ast-site-header-cart > div.ast-site-header-cart-data > div > div > p.woocommerce-mini-cart__buttons.buttons > a.button.checkout.wc-forward");

    public HoverPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void hoverOnCartIcon(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon));
        new Actions(driver).moveToElement(element).pause(Duration.ofSeconds(2)).perform();
    }

    public CartPage clickViewCartButton(){
        hoverOnCartIcon();
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(viewCartButton));
        view.click();
        return new CartPage(driver);
    }

    public CheckoutPage clickCheckoutButton(){
        hoverOnCartIcon();
        WebElement check = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        check.click();
        return new CheckoutPage(driver);
    }

    public boolean isCartEmpty(){
        hoverOnCartIcon();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCart));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
