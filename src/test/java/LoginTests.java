import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginTests extends BasePage {
    private LoginPage LoginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        LoginPage = new LoginPage(driver);

    }
    @Test
    public void LoginDinoUserAndCheckResult(){
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
}