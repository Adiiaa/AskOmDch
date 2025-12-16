package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
@BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://askomdch.com/");
        homePage = new HomePage(driver);

    }
}
