import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishlistPage;

public class WishlistTests extends BasePage {
    private pages.WishlistPage WishlistPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        WishlistPage = new WishlistPage(driver);
    }
    @Test
    public void AddAwesomeGraniteChipsToWishlistCart(){
        WishlistPage.AddAwesomeGraniteChipsToWishlistCart();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/wishlist']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void AddSixProductsToWishlistCart (){
        WishlistPage.AddAwesomeMetalChairToWishlistCart();
        WishlistPage.AddAwesomeSoftShirtToWishlistCart();
        WishlistPage.AddAwesomeGraniteChipsToWishlistCart();
        WishlistPage.AddGorgeousSoftPizzaToWishlistCart();
        WishlistPage.AddIncredibleConcreteHatToWishlistCart();
        WishlistPage.AddLicensedSteelGlovesToWishlistCart();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/wishlist']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("6"));
    }
    @Test
    public void AddSixProductsToWishlistCartAndRemoveGraniteChipsAndMetalChair (){
        WishlistPage.AddLicensedSteelGlovesToWishlistCart();
        WishlistPage.AddAwesomeMetalChairToWishlistCart();
        WishlistPage.AddIncredibleConcreteHatToWishlistCart();
        WishlistPage.AddGorgeousSoftPizzaToWishlistCart();
        WishlistPage.AddAwesomeGraniteChipsToWishlistCart();
        WishlistPage.AddAwesomeSoftShirtToWishlistCart();
        WishlistPage.ClickOnWishlistCart();
        WishlistPage.RemoveAwesomeMetalChairFromWishlistCart();
        WishlistPage.RemoveAwesomeGraniteChipsFromWishlistCart();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/wishlist']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("4"));
    }
    @Test
    public void AddSixProductsToWishlistCartAndTransferFourProductsToShoppingCart (){
        WishlistPage.AddLicensedSteelGlovesToWishlistCart();
        WishlistPage.AddAwesomeMetalChairToWishlistCart();
        WishlistPage.AddIncredibleConcreteHatToWishlistCart();
        WishlistPage.AddGorgeousSoftPizzaToWishlistCart();
        WishlistPage.AddAwesomeGraniteChipsToWishlistCart();
        WishlistPage.AddAwesomeSoftShirtToWishlistCart();
        WishlistPage.ClickOnWishlistCart();
        WishlistPage.TransferGorgeousSoftPizzaFromWishlistCartToShoppingCart();
        WishlistPage.TransferLicensedSteelGlovesFromWishlistCartToShoppingCart();
        WishlistPage.TransferAwesomeSoftShirtFromWishlistCartToShoppingCart();
        WishlistPage.TransferIncredibleConcreteHatFromWishlistCartToShoppingCart();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/wishlist']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("6"));
        String actualResult2 = driver.findElement(By.cssSelector("a[href='#/cart']")).getAttribute("innerText");
        System.out.println(actualResult2);
        Assert.assertTrue(actualResult2.contains("4"));
    }
}
