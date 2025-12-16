package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    public RegisteringPage goFillRegisterInfo(){
        return new RegisteringPage(driver);
    }
    public LoginPage goFillLoginInfo(){
        return new LoginPage(driver);
    }

}
