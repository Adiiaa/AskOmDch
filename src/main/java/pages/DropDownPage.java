package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By categoryDropdown = By.id("product_cat");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectCategoryByValue(String value){
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(categoryDropdown));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'})",dropdown);
        Select select = new Select(dropdown);
        select.selectByValue(value);
        wait.until(ExpectedConditions.urlContains(value));
    }
    public String getSelectedCategoryText() {
        Select select = new Select(
                wait.until(ExpectedConditions.presenceOfElementLocated(categoryDropdown))
        );
        return select.getFirstSelectedOption().getText().trim();
    }
}
