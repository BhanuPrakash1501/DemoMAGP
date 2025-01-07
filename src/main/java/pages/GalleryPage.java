package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalleryPage extends BaseClass {

    private WebDriver _driver;
    public GalleryPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Gallery']")
    private WebElement galleryHeading;

    public WebElement getGalleryHeading() {
        return galleryHeading;
    }

    public void gallery(){
        scrollToElement(getGalleryHeading());
    }
}
