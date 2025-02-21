package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BaseClass {

    // WebDriver instance to manage browser interactions
    private WebDriver _driver;

    // Constructor to initialize the CalendarPage with WebDriver
    public CalendarPage(WebDriver driver) {
        super(driver); // Call parent class constructor
        this._driver = driver; // Assign driver to the instance variable
        PageFactory.initElements(driver, this); // Initialize elements using PageFactory
    }

    // Locate the Calendar heading element using XPath
    @FindBy(xpath = "//h2[text()='Calendar']")
    private WebElement calendarHeading;

    // Getter method to retrieve the Calendar heading element
    public WebElement getCalendarHeading() {
        return calendarHeading;
    }

    // Method to scroll to the Calendar heading element
    public void Calendar(){
        scrollToElement(getCalendarHeading()); // Scroll to the Calendar heading
    }



}
