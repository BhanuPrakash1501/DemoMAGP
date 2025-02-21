package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage extends BaseClass {

    /**
     * Constructor for NotificationsPage.
     *
     * @param driver The WebDriver instance used for interacting with the web page.
     * Initializes the web elements using PageFactory.
     */
    public NotificationsPage(WebDriver driver) {
        super(driver); // Calls the parent class constructor.
        this._driver = driver; // Assigns the driver instance.
        PageFactory.initElements(driver, this); // Initializes web elements using PageFactory.
    }

    /**
     * WebElement representing the "Today" heading in the notifications section.
     */
    @FindBy(xpath = "//h6[text()='Today']")
    private WebElement todayheading;

    /**
     * Getter method to retrieve the "Today" heading element.
     *
     * @return WebElement representing the "Today" heading.
     */
    public WebElement getTodayheading() {
        return todayheading;
    }

    /**
     * Scrolls to the "Today" heading in the notifications section.
     * Ensures the element is in view for further interactions.
     */
    public void notifications() {
        scrollToElement(getTodayheading()); // Scroll to the "Today" heading.
    }


}
