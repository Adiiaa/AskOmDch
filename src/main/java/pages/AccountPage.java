package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By loginUsername = By.id("username");
    private By loginPassword = By.id("password");
    private By loginButton = By.name("login");

    private By registerName = By.id("reg_username");
    private By registerEmail = By.id("reg_email");
    private By registerPassword = By.id("reg_password");
    private By registerButton = By.name("register");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginInfo(String name, String password){
        driver.findElement(loginUsername).sendKeys(name);
        driver.findElement(loginPassword).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public void registerInfo(String name, String email, String password){
        driver.findElement(registerName).sendKeys(name);
        driver.findElement(registerEmail).sendKeys(email);
        driver.findElement(registerPassword).sendKeys(password);
        driver.findElement(registerButton).click();
    }

}
