import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeGraniteChipsWishlist;

    public void AddAwesomeGraniteChipsToWishlistCart() {
        AwesomeGraniteChipsWishlist.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeMetalChairWishlist;

    public void AddAwesomeMetalChairToWishlistCart() {
        AwesomeMetalChairWishlist.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeSoftShirtWishlist;

    public void AddAwesomeSoftShirtToWishlistCart() {
        AwesomeSoftShirtWishlist.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement GorgeousSoftPizzaWishlist;

    public void AddGorgeousSoftPizzaToWishlistCart() {
        GorgeousSoftPizzaWishlist.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement IncredibleConcreteHatWishlist;

    public void AddIncredibleConcreteHatToWishlistCart() {
        IncredibleConcreteHatWishlist.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement LicensedSteelGlovesWishlist;

    public void AddLicensedSteelGlovesToWishlistCart() {
        LicensedSteelGlovesWishlist.click();
    }

    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path")
    private WebElement WishlistCart;
    public void ClickOnWishlistCart (){
        WishlistCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeGraniteChipsBrokenHeart;
    public void RemoveAwesomeGraniteChipsFromWishlistCart (){
        AwesomeGraniteChipsBrokenHeart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")
    private WebElement AwesomeMetalChairBrokenHeart;
    public void RemoveAwesomeMetalChairFromWishlistCart (){
        AwesomeMetalChairBrokenHeart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement IncredibleConcreteHatFromWishlistToCart;
    public void TransferIncredibleConcreteHatFromWishlistCartToShoppingCart (){
        IncredibleConcreteHatFromWishlistToCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeSoftShirtFromWishlistToCart;
    public void TransferAwesomeSoftShirtFromWishlistCartToShoppingCart (){
        AwesomeSoftShirtFromWishlistToCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement LicensedSteelGlovesFromWishlistToCart;
    public void TransferLicensedSteelGlovesFromWishlistCartToShoppingCart (){
        LicensedSteelGlovesFromWishlistToCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement GorgeousSoftPizzaFromWishlistToCart;
    public void TransferGorgeousSoftPizzaFromWishlistCartToShoppingCart (){
        GorgeousSoftPizzaFromWishlistToCart.click();
    }

}