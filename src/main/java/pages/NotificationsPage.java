package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class NotificationsPage extends BaseClass {

    /**
     * Constructor for NotificationsPage.
     *
     * @param driver The WebDriver instance used for interacting with the web page.
     *               Initializes the web elements using PageFactory.
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

    @FindBy(xpath = "//h6[text()='This Week']")
    private WebElement thisWeekheading;

    @FindBy(id = "All")
    private WebElement allBtn;

    @FindBy(id = "Read")
    private WebElement readBtn;

    @FindBy(id = "Unread")
    private WebElement unreadBtn;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private WebElement markAllAsReadBtn;

    public WebElement getYouallcaughtUp() {
        return youallcaughtUp;
    }

    public WebElement getContentDesc() {
        return contentDesc;
    }

    @FindBy(xpath = "//h4[text()='You’re all caught up']")
    private WebElement youallcaughtUp;

    @FindBy(xpath = "//*[text()='Come back later for new notifications, we will inform once we will got any updates']")
    private WebElement contentDesc;


    public WebElement getThisWeekheading() {
        return thisWeekheading;
    }

    public WebElement getAllBtn() {
        return allBtn;
    }

    public WebElement getReadBtn() {
        return readBtn;
    }

    public WebElement getUnreadBtn() {
        return unreadBtn;
    }

    public WebElement getMarkAllAsReadBtn() {
        return markAllAsReadBtn;
    }


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
    public void scrollToTodayHeading() throws InterruptedException {
        Thread.sleep(3000);
        scrollToElement(getTodayheading()); // Scroll to the "Today" heading.
    }

    public void clickReadRadioBtn() {

        try {

            waitForElementToBeClickable(getReadBtn());
            clickUsingJavaScript(getReadBtn());
            List<WebElement> elements = _driver.findElements(By.xpath("//span[text()='read more']"));
            Iterator<WebElement> iterator = elements.iterator();
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
            while (iterator.hasNext()) {
                WebElement next = iterator.next();
                assertTrue(next.isDisplayed());
                //If you want to click on read you can use click() method.
                System.out.println("read more link displayed");
            }
        } catch (Exception e) {
            assertTrue(_driver.findElement(By.xpath("//h4[text()='You’re all caught up']")).isDisplayed());
            System.out.println("You'r all caught up link displayed");
        }


    }

    public void clickUnReadRadioBtn() {
        try {
            waitForElementToBeClickable(getUnreadBtn());
            clickUsingJavaScript(getUnreadBtn());
        } catch (Exception e) {

        }

    }

    public void verifyTodayHeading() {
        scrollToElementAndWait(getTodayheading());
        Assert.assertEquals(getTodayheading().getText(), "Today");
    }

    public void verifyThisweekHeading() {
        scrollToElementAndWait(getThisWeekheading());
        Assert.assertEquals(getThisWeekheading().getText(), "This Week");
    }

    public void verifyMarkAllReadHeading() {
        scrollToElementAndWait(getMarkAllAsReadBtn());
        Assert.assertEquals(getMarkAllAsReadBtn().getText(), "Mark All as read");
    }

    public void verifyyourAllcaughtUpMssg() {
        scrollToElementAndWait(getYouallcaughtUp());
        Assert.assertEquals(getYouallcaughtUp().getText(), "You’re all caught up");
    }

    public void verifyContentMssgDesc() {
        scrollToElementAndWait(getContentDesc());
        Assert.assertEquals(getContentDesc().getText(), "Come back later for new notifications, we will inform once we will got any updates");
    }


  /*  private void checkNotifications() throws InterruptedException {
        Thread.sleep(5000);
        _driver.findElement(By.xpath("(//a[@role='button'])[6]")).click();
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        // Get the total page height
        long pageHeight = (long) js.executeScript("return document.body.scrollHeight");
        // Scroll down 70% of the page
        long scrollHeight = (long) (pageHeight * 0.30);
        js.executeScript("window.scrollTo(0, " + scrollHeight + ");");

        // Add a delay for observation (optional)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            List<WebElement> elements = _driver.findElements(By.xpath("//span[text()='read more']"));
            Iterator<WebElement> iterator = elements.iterator();
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
            while (iterator.hasNext()) {
                WebElement next = iterator.next();
                assertTrue(next.isDisplayed());
                //If you want to click on read you can use click() method.
                System.out.println("read more link displayed");
            }
        } catch (Exception e) {
            assertTrue(_driver.findElement(By.xpath("//h4[text()='You’re all caught up']")).isDisplayed());
            System.out.println("You'r all caught up link displayed");
        }

        Thread.sleep(5000);
        //This week module
        _driver.findElement(By.xpath("//h6[text()='This Week']")).click();
        Thread.sleep(5000);
        try {
            WebElement element = _driver.findElement(By.xpath("//span[text()='read more']"));
//		Iterator<WebElement> iterator = elements.iterator();
//		System.out.println(iterator.hasNext());
//		System.out.println(iterator.next());
            assertTrue(element.isDisplayed());
            System.out.println("Readmore link Visible");
        } catch (Exception e) {
            assertTrue(_driver.findElement(By.xpath("//h4[text()='You’re all caught up']")).isDisplayed());
            System.out.println("You'r all caught up link displayed");
        }
    }*/


}
