package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BaseClass {

    private WebDriver _driver;


    public CalendarPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Calendar']")
    private WebElement calendarHeading;


    public WebElement getCalendarHeading() {
        return calendarHeading;
    }

    public void Calendar(){
        scrollToElement(getCalendarHeading());


    }


}
