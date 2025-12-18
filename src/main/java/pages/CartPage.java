package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartTitle = By.cssSelector("h1[class='has-text-align-center']");
    private By proceedToCheckoutButton = By.cssSelector("a[href='https://askomdch.com/checkout/']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String cartTitle(){
        return driver.findElement(cartTitle).getText();
    }

    public CheckoutPage clickCheckOutButton(){
        driver.findElement(proceedToCheckoutButton).click();
        return new CheckoutPage(driver);
    }
}
