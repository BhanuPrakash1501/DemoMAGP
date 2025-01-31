package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementPage extends BaseClass {
    private WebDriver _driver;

    public AnnouncementPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }



}
