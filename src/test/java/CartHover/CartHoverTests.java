package CartHover;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;

public class CartHoverTests extends BaseTests {
    @Test
    public void testCartHover(){
        HoverPage cartHover = new HoverPage(driver);
            cartHover.hoverOnCartIcon();
    }
}
