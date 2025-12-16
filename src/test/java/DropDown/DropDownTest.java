package DropDown;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

public class DropDownTest extends BaseTests {
    @Test
    public void testDropDown() {
        homePage.clickStoreLink();

        DropDownPage dropDownPage = new DropDownPage(driver);

        String value = "men";
        dropDownPage.selectCategoryByValue(value);

        Assert.assertTrue(
                dropDownPage.getSelectedCategoryText().startsWith("Men"),
                "Men category was not selected"
        );
    }
}
