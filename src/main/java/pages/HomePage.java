package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By accountLink = By.cssSelector("#menu-item-1237 > a");
    private By storeLink = By.cssSelector("#menu-item-1227 > a");
    private By menLink = By.cssSelector("#menu-item-1228 > a");
    private By accessoriesLink = By.cssSelector("#menu-item-1230 > a");
    private By womenLink = By.cssSelector("#menu-item-1229 > a");
    private By contactLink = By.cssSelector("#menu-item-1233 > a");

    public  HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public AccountPage clickAccountLink(){
        driver.findElement(accountLink).click();
        return new AccountPage(driver);
    }
    public StorePage clickStoreLink(){
        driver.findElement(storeLink).click();
        return new StorePage(driver);
    }
    public MenPage clickMenPage(){
        driver.findElement(menLink).click();
        return new MenPage(driver);
    }
    public AccessoriesPage clickAccessoriesPage(){
        driver.findElement(accessoriesLink).click();
        return new AccessoriesPage(driver);
    }
    public WomenPage clickWomenPage(){
        driver.findElement(womenLink).click();
        return new WomenPage(driver);
    }
    public ContactPage clickContactLink(){
        driver.findElement(contactLink).click();
        return new ContactPage(driver);
    }


}
