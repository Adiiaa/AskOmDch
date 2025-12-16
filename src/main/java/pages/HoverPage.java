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

    public HoverPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void hoverOnCartIcon(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon));
        new Actions(driver).moveToElement(element).perform();
    }
}
