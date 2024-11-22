package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaqPage extends BaseClass {
    public WebDriver _driver;

    public FaqPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBar;

    public WebElement getSearchBar() {
        return searchBar;
    }


}
