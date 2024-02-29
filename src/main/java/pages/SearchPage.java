package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "input-search")
    private WebElement SearchField;
    public void InsertTextInSearchField (String text){
        SearchField.sendKeys(text);
    }
    @FindBy ( css = ".btn-light")
    private WebElement SearchButton;
    public void ClickOnSearchButton (){
        SearchButton.click();
    }
}
