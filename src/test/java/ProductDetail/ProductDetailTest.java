package ProductDetail;

import Base.BaseTests;
import org.testng.annotations.Test;

public class ProductDetailTest extends BaseTests {
    @Test
    public void testImage(){
        var storePage = homePage.clickStoreLink();
        storePage.clickImageLink();
    }
}
