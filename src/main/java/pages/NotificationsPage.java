package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage extends BaseClass {

    public NotificationsPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Today']")
    private WebElement todayheading;

    public WebElement getTodayheading() {
        return todayheading;
    }

    public void notifications(){
        scrollToElement(getTodayheading());

    }

}
