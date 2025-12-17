package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartTitle = By.cssSelector("h1[class='has-text-align-center']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String cartTitle(){
        return driver.findElement(cartTitle).getText();
    }
}
