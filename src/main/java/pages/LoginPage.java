package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {
    private WebDriver driver;

    private By loginUsername = By.id("username");
    private By loginPassword = By.id("password");
    private By loginButton = By.name("login");
    private By message = By.cssSelector("div.woocommerce-MyAccount-content p");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginInfo(String name, String password){
        driver.findElement(loginUsername).sendKeys(name);
        driver.findElement(loginPassword).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public String greetingMessages(){
        return driver.findElement(message).getText();
    }
}
