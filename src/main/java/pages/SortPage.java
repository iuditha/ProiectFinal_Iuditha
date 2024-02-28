package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortPage extends BasePage{
    public SortPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = ".sort-products-select")
    private WebElement TypeOfSort;
    public void SelectATypeOfSort (){
        TypeOfSort.click();
    }
    @FindBy ( css = "option[value=az]")
    private WebElement SortFromAToZ;
    public void SelectFirstOption (){
        SortFromAToZ.click();
    }
    @FindBy ( css = "option[value=za]")
    private WebElement SortFromZToA;
    public void SelectSecondOption (){
        SortFromZToA.click();
    }
    @FindBy ( css = "option[value=hilo]")
    private WebElement SortFromHighToLow;
    public void SelectThirdOption (){
        SortFromHighToLow.click();
    }
    @FindBy ( css = "option[value=lohi]")
    private WebElement SortFromLowToHigh;
    public void SelectForthOption (){
        SortFromLowToHigh.click();
    }
}
