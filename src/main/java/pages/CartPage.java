package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")
    private WebElement LoginButton;

    public void GetClickOnLoginButton() {
        LoginButton.click();
    }
    @FindBy(id = "user-name")
    private WebElement UserNameField;

    public void EnterTextInUsernameField(String text){
        UserNameField.sendKeys(text);

    }
    @FindBy(id = "password")
    private WebElement PasswordField;

    public void EnterTextInPasswordField(String text) {

        PasswordField.sendKeys(text);
    }

    @FindBy(css = ".btn-primary")
    private WebElement LoginSecondButton;

    public void GetClickOnTheSecondLoginButton() {
        LoginSecondButton.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeGraniteChipsCart;
    public void AddAwesomeGraniteChipsToCart() {
        AwesomeGraniteChipsCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path" )
    private WebElement AwesomeMetalChairCart;
    public void AddAwesomeMetalChairToCart(){
        AwesomeMetalChairCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement AwesomeSoftShirtCart;
    public void AddAwesomeSoftShirtToCart(){
        AwesomeSoftShirtCart.click();
    }
    @FindBy (css ="#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div:nth-child(2) > div > div:nth-child(5) > button > svg > path")
    private WebElement AwesomeMetalChairBinButton;
    public void AwesomeMetalChairClickOnBinButton (){
        AwesomeMetalChairBinButton.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div:nth-child(1) > div > div:nth-child(1) > div > button:nth-child(2) > svg")
    private WebElement AwesomeGraniteChipsPlusButton;
    public void AwesomeGraniteChipsClickOnPlusButton (){
        AwesomeGraniteChipsPlusButton.click();
    }
    @FindBy(css = ".shopping_cart_badge")
    private WebElement ShoppingCart;

    public void ClickOnShoppingCart() {
        ShoppingCart.click();
    }
}
