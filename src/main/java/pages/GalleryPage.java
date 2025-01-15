package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GalleryPage extends BaseClass {

    private WebDriver _driver;

    public GalleryPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Gallery']")
    private WebElement galleryHeading;

    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement searchBar;

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getGalleryHeading() {
        return galleryHeading;
    }

    public void gallery() {
        scrollToElement(getGalleryHeading());
    }

    public void searchGaller() throws InterruptedException {
        scrollToElement(getSearchBar());
        Thread.sleep(3000);
        waitForVisibility(By.xpath("(//input[@placeholder='Search'])[2]"));
        getSearchBar().sendKeys("Airport Alor Star");
        Thread.sleep(3000);
        WebElement ele = findElementByXpath("//div[@class='image-overlay']//h6");
        String txt = ele.getText();
        if (txt.equals("Airport Alor Star")) {
            Assert.assertEquals(txt, "Airport Alor Star");
        } else {
            Assert.fail();

        }
    }
}
