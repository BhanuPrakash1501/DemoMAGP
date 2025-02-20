package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AnnouncementPage extends BaseClass {
    private WebDriver _driver;

    public AnnouncementPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//h6[normalize-space()='General']")
    private WebElement generalTab;

    @FindBy(xpath = "//h6[normalize-space()='Circular']")
    private WebElement circularTab;

    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement search;

    public WebElement getSearch() {
        return search;
    }


    public WebElement getCircularTab() {
        return circularTab;
    }

    public WebElement getGeneralTab() {
        return generalTab;
    }

    public void clickGeneralTab() throws InterruptedException {

        scrollToElementAndWait(getSearch());

        List<WebElement> tendersList = _driver.findElements(By.xpath("//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1"));

        WebElement tenderTitleName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)[1]");
        String title = tenderTitleName.getText();
       String[] str = title.split(": ");

        getSearch().sendKeys(str);

        String value = getSearch().getAttribute("value");
        System.out.println(value);


    }

    public void clickCircularTab() {
        scrollToElement(getCircularTab());
        clickUsingJavaScript(getCircularTab());

    }


}
