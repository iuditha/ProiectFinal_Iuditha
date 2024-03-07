import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;

public class CartTests extends BasePage {
    private CartPage CartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        CartPage = new CartPage(driver);
    }
    @Test
    public void AddAwesomeGraniteChipsToCartAndCheckTheResult(){
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.AddAwesomeGraniteChipsToCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Test
    public void AddAwesomeGraniteChipsToCartThreeTimesAndCheckTheResult(){
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeGraniteChipsToCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));
    }
    @Test
    public void AddThreeItemsToCartAndCheckTheResult(){
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeMetalChairToCart();
        CartPage.AddAwesomeSoftShirtToCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3"));
    }
    @Test
    public void LoginDinoUserAddTwoItemsInTheCartDeleteOneAndDoubleTheRemainingItem (){
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeMetalChairToCart();
        CartPage.ClickOnShoppingCart();
        CartPage.AwesomeMetalChairClickOnBinButton();
        CartPage.AwesomeGraniteChipsClickOnPlusButton();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));
    }
    @Test
    public void LoginDinoUserAddFiveItemsInTheCartUsingAlsoPlusButton (){
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeGraniteChipsToCart();
        CartPage.AddAwesomeMetalChairToCart();
        CartPage.ClickOnShoppingCart();
        CartPage.AwesomeGraniteChipsClickOnPlusButton();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));
    }
}
