package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By billingFirstName = By.id("billing_first_name");
    private By billingLastName = By.id("billing_last_name");
    private By companyName = By.id("billing_company");
    private By countryDropdown = By.id("billing_country");
    private By streetAddress = By.cssSelector("#billing_address_1");
    private By cityField = By.xpath("//*[@id=\"billing_city\"]");
    private By stateField = By.id("billing_state");
    private By codeField = By.cssSelector("#billing_postcode");
    private By billingEmail = By.cssSelector("#billing_email");
    private By placeOrderButton = By.id("place_order");
    private By thankYouMessage = By.cssSelector("div.woocommerce p");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void findRegion(String text){
        WebElement region = driver.findElement(countryDropdown);
        Select select = new Select(region);
        select.selectByVisibleText(text);
    }

    public void setBillingInfo(String firstName,
                               String lastName,
                               String company,
                               String address,
                               String city,
                               String state,
                               String code,
                               String email)
    {
        driver.findElement(billingFirstName).sendKeys(firstName);
        driver.findElement(billingLastName).sendKeys(lastName);
        driver.findElement(companyName).sendKeys(company);
        driver.findElement(streetAddress).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(codeField).sendKeys(code);
        driver.findElement(billingEmail).sendKeys(email);
    }

    public void clickPlaceOrderButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
    }
    public String getThankYouMessage(){
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouMessage));
        return message.getText();
    }


}
