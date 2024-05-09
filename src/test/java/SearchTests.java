import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;

public class SearchTests extends BasePage {
    private SearchPage SearchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SearchPage = new SearchPage(driver);
    }
    @Test
    public void InsertMetalWordInSearchFieldAndClickOnSearchButton (){
        SearchPage.InsertTextInSearchField("Metal");
        SearchPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/3']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Metal Chair"));
    }
    @Test
    public void InsertFrozenWordInSearchFieldAndClickOnSearchButton (){
        SearchPage.InsertTextInSearchField("Frozen");
        SearchPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/0']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));
    }
    @Test
    public void InsertPizzaWordInSearchFieldAndClickOnSearchButton (){
        SearchPage.InsertTextInSearchField("Pizza");
        SearchPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/9']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Gorgeous Soft Pizza"));
    }
    @Test
    public void InsertBaconWordInSearchFieldAndClickOnSearchButton (){
        SearchPage.InsertTextInSearchField("Bacon");
        SearchPage.ClickOnSearchButton();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/4']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));
        String actualResult2 = driver.findElement(By.cssSelector("a[href='#/product/6']")).getAttribute("innerText");
        System.out.println(actualResult2);
        Assert.assertTrue(actualResult2.contains("Practical Wooden Bacon"));
    }

}
