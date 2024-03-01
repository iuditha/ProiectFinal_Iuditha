import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.OrderPage;

public class OrderTests extends BasePage {
    private OrderPage OrderPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        OrderPage = new OrderPage(driver);
    }
    @Test
    public void AddAProductToCartAndCompleteTheOrder(){
        OrderPage.AddAwesomeGraniteChipsToCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.InsertNameInFirstNameField("iuditha");
        OrderPage.InsertLastNameInLastNameField("Bigiu");
        OrderPage.InsertAddressInAddressField("Bulgarus 108");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
   @Test
    public void AddProductsToChartPressPlusSignAndCompleteTheOrder (){
        OrderPage.AddAwesomeGraniteChipsToCart();
        OrderPage.AddAwesomeSoftShirtInChart();
        OrderPage.AddAwesomeMetalChairInChart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnPlusSignButtonToAddAnotherAwesomeGraniteChipsProduct();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.InsertNameInFirstNameField("iuditha");
        OrderPage.InsertLastNameInLastNameField("Bigiu");
        OrderPage.InsertAddressInAddressField("Bulgarus 108");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
    @Test
    public void AddProductsToCartAndRemoveProductFromCartAndCompleteTheOrder (){
        OrderPage.AddPracticalWoodenBaconToCart();
        OrderPage.AddRefinedFrozenMouseToCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnBinButtonToRemoveRefinedFrozenMouseFromCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.InsertNameInFirstNameField("iuditha");
        OrderPage.InsertLastNameInLastNameField("Bigiu");
        OrderPage.InsertAddressInAddressField("Bulgarus 108");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    }

