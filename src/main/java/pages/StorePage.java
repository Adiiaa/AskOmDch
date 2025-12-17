package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By imageLink = By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1198.status-publish.first.instock.product_cat-accessories.product_cat-women.has-post-thumbnail.sale.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-thumbnail-wrap > a > img");
    private By addToCartButton = By.cssSelector("a[href='?add-to-cart=1198']");
    private By viewCartLink = By.cssSelector("a[title='View cart']");


    public StorePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public ProductDetailPage clickImageLink(){
        driver.findElement(imageLink).click();
        return new ProductDetailPage(driver);
    }

    public StorePage clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
        return this;
    }
    public CartPage clickViewCartLink(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink));
        driver.findElement(viewCartLink).click();
        return new CartPage(driver);
    }
}
