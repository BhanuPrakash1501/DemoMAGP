package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.util.List;

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
    private WebElement calendarHeadingTxt;

    @FindBy(xpath = "//h2[text()='Latest Announcements']")
    private WebElement latestAnnouncementstxt;

    @FindBy(xpath = "//span[text()='2025']")
    private WebElement year;

    @FindBy(xpath = "//span[text()='March']")
    private WebElement monthTxt;

    @FindBy(xpath = "//button[@class='prev-btn']")
    private WebElement prevBtn;

    @FindBy(xpath = "//button[@class='nxt-btn']")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[text()='No records found']")
    private WebElement noRecordsFoundMssg;

    // Getter method to retrieve the Calendar heading element
    public WebElement getCalendarHeading() {
        return calendarHeadingTxt;
    }

    // Method to scroll to the Calendar heading element
    public void verifyUI() throws InterruptedException {
        Thread.sleep(3000);
        scrollToElementAndWait(getCalendarHeading()); // Scroll to the Calendar heading
        Assert.assertEquals(getCalendarHeading().getText(), "Calendar");
        Assert.assertEquals(latestAnnouncementstxt.getText(), "Latest Announcements");
        Assert.assertEquals(monthTxt.getText(), "March 2025");
//        Assert.assertEquals(year.getText(), "2025");
    }

    public void clickPreviousAndNextBtn() throws InterruptedException {
        try {
            Thread.sleep(2000);
            waitForElementToBeClickable(prevBtn);
            clickUsingJavaScript(prevBtn);
            Thread.sleep(2000);
            clickUsingJavaScript(nextBtn);
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void verifytenders() throws InterruptedException {
        Thread.sleep(4000);
        try {
//            WebElement tendertitletxt = findElementByXpath("(//div[@class='d-flex justify-content-between align-items-start']//h2)[1]");


            List<WebElement> elements = _driver.findElements(By.xpath("//div[@class='d-flex justify-content-between align-items-start']//h2"));

            if (!elements.isEmpty()) {
                // If elements are found, click the first one
                elements.get(0).click();
                System.out.println("Clicked on the first element.");

            } else {
                // If no elements are found, get the "No Records Found" text

                String noRecordsText = noRecordsFoundMssg.getText();
                System.out.println("No records message: " + noRecordsText);
                Assert.assertTrue(noRecordsFoundMssg.isDisplayed());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
