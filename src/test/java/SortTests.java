import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SortPage;

public class SortTests extends BasePage {
    private SortPage SortPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SortPage = new SortPage(driver);

    }
    @Test
    public void SelectSortValueFromAToZAndCheckResult(){
        SortPage.SelectATypeOfSort();
        SortPage.SelectFirstOption();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/1']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));
    }
    @Test
    public void SelectSortValueFromZToAAndCheckResult(){
        SortPage.SelectATypeOfSort();
        SortPage.SelectSecondOption();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/0']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));
    }
    @Test
    public void SelectSortValueFromLowToHighAndCheckResult(){
        SortPage.SelectATypeOfSort();
        SortPage.SelectForthOption();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/6']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));
    }
    @Test
    public void SelectSortValueFromHighToLowAndCheckResult(){
        SortPage.SelectATypeOfSort();
        SortPage.SelectThirdOption();
        String actualResult = driver.findElement(By.cssSelector("a[href='#/product/5']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));
    }
}
