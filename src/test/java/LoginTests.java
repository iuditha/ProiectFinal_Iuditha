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
    @Test
    public void LoginTurtleUserAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("turtle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }
    @Test
    public void LoginBeetleUserAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("beetle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("beetle"));
    }
    @Test
    public void LoginLockedUserAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("locked");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("The user has been locked out."));
    }
    @Test
    public void LoginIncorrectUserAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("iuditha");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector(" body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));
    }
    @Test
    public void LoginDinoUserAndWrongPasswordAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("choocho");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector(" body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));
    }
    @Test
    public void LoginWrongUserAndWrongPasswordAndCheckResult() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("din");
        LoginPage.EnterTextInPasswordField("choocho");
        LoginPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector(" body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));
    }
}
