package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FaqPage extends BaseClass {
    private WebDriver _driver;

    public FaqPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement searchBar;

    @FindBy(xpath = "//h2[text()='Have A Question? Solve your Doubts']")
    private WebElement haveAQuestiontxt;

    public WebElement getHaveAQuestiontxt() {
        return haveAQuestiontxt;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void searchFaq() {
//        scrollToElement(haveAQuestiontxt);
//        waitForVisibility(By.xpath("//h2[text()='Have A Question? Solve your Doubts']"));
//        waitForVisibility(By.xpath("(//input[@placeholder='Search'])[2]"));
        scrollByWindow();
        clickUsingJavaScript(getSearchBar());
        elementSendKeys(getSearchBar(), "Internal process");
//        getSearchBar().sendKeys("Internal process");
    }


}
