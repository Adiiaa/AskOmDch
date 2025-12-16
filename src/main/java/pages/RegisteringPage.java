package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisteringPage {
    private WebDriver driver;

    private By registerName = By.id("reg_username");
    private By registerEmail = By.id("reg_email");
    private By registerPassword = By.id("reg_password");
    private By registerButton = By.name("register");
    private By message = By.cssSelector("div.woocommerce-MyAccount-content p");

    public RegisteringPage(WebDriver driver){
        this.driver = driver;
    }

    public void registerInfo(String name, String email, String password){
        driver.findElement(registerName).sendKeys(name);
        driver.findElement(registerEmail).sendKeys(email);
        driver.findElement(registerPassword).sendKeys(password);
        driver.findElement(registerButton).click();
    }
    public String greetingMessage(){
        return driver.findElement(message).getText();
    }
}
