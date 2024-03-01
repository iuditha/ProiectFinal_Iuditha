package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeGraniteChipsCart;

    public void AddAwesomeGraniteChipsToCart() {
        AwesomeGraniteChipsCart.click();
    }

    @FindBy(css = ".shopping_cart_badge")
    private WebElement ShoppingCart;

    public void ClickOnShoppingCart() {
        ShoppingCart.click();
    }

    @FindBy(css = ".btn-success")
    private WebElement CheckoutButton;

    public void ClickOnCheckoutButton() {
        CheckoutButton.click();
    }

    @FindBy(id = "first-name")
    private WebElement AddFirstNameInFirstNameField;

    public void InsertNameInFirstNameField(String text) {
        AddFirstNameInFirstNameField.sendKeys(text);
    }

    @FindBy(id = "last-name")
    private WebElement AddLastNameInLastNameField;

    public void InsertLastNameInLastNameField(String text) {
        AddLastNameInLastNameField.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement AddAddressInAddressField;

    public void InsertAddressInAddressField(String text) {
        AddAddressInAddressField.sendKeys(text);
    }

    @FindBy(css = ".btn-success")
    private WebElement ContinueCheckoutButton;

    public void ClickOnContinueCheckoutButton() {

        ContinueCheckoutButton.click();
    }

    @FindBy(css = "a[href='#/checkout-complete']")
    private WebElement CompleteYourOrderButton;

    public void ClickOnCompleteYourOrderButton() {
        CompleteYourOrderButton.click();
    }

    @FindBy(css = ".text-center")
    private WebElement MessageAfterCompleteTheOrder;
    //verifica de aici
    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeMetalChairChart;

    public void AddAwesomeMetalChairInChart() {
        AwesomeMetalChairChart.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeSoftShirtChart;

    public void AddAwesomeSoftShirtInChart() {
        AwesomeSoftShirtChart.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div > div > div:nth-child(1) > div > button:nth-child(2) > svg")
    private WebElement PlusSignButton;

    public void ClickOnPlusSignButtonToAddAnotherAwesomeGraniteChipsProduct() {
        PlusSignButton.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement RefinedFrozenMouse;

    public void AddRefinedFrozenMouseToCart() {
        RefinedFrozenMouse.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalWoodenBaconCart;
    public void AddPracticalWoodenBaconToCart(){
        PracticalWoodenBaconCart.click();
    }
    @FindBy ( css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-1.row-cols-lg-1.row-cols-md-1.row-cols-sm-1.row-cols-1 > div > div:nth-child(1) > div > div:nth-child(5) > button > svg > path")
    private WebElement BinButtonForRefinedFrozenMouse;
    public void ClickOnBinButtonToRemoveRefinedFrozenMouseFromCart (){
        BinButtonForRefinedFrozenMouse.click();
    }
}

