package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {
    private WebDriver driver;
    private By imageLink = By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1198.status-publish.first.instock.product_cat-accessories.product_cat-women.has-post-thumbnail.sale.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-thumbnail-wrap > a > img");
    private By addToCartButton = By.cssSelector("a[href='?add-to-cart=1198']");

    public StorePage(WebDriver driver){
        this.driver = driver;
    }
    public ProductDetailPage clickImageLink(){
        driver.findElement(imageLink).click();
        return new ProductDetailPage(driver);
    }
    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }
}
