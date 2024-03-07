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
    }
    @Test
    public void AddSixProductsToWishlistCart (){
        WishlistPage.AddAwesomeMetalChairToWishlistCart();
        WishlistPage.AddAwesomeSoftShirtToWishlistCart();
        WishlistPage.AddAwesomeGraniteChipsToWishlistCart();
        WishlistPage.AddGorgeousSoftPizzaToWishlistCart();
        WishlistPage.AddIncredibleConcreteHatToWishlistCart();
        WishlistPage.AddLicensedSteelGlovesToWishlistCart();
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
    }
}
