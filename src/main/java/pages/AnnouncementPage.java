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
    // WebDriver instance for managing browser interactions
    private WebDriver _driver;

    // Constructor to initialize the AnnouncementPage with WebDriver
    public AnnouncementPage(WebDriver driver) {
        super(driver); // Call parent class constructor
        this._driver = driver; // Assign driver to the instance variable
        PageFactory.initElements(driver, this); // Initialize elements using PageFactory
    }

    // Locate the General tab using XPath
    @FindBy(xpath = "//h6[normalize-space()='General']")
    private WebElement generalTab;

    // Locate the Circular tab using XPath
    @FindBy(xpath = "//h6[normalize-space()='Circular']")
    private WebElement circularTab;

    // Locate the search input field using XPath
    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement search;

    // Getter method to retrieve the search input field
    public WebElement getSearch() {
        return search;
    }

    // Getter method to retrieve the Circular tab
    public WebElement getCircularTab() {
        return circularTab;
    }

    // Getter method to retrieve the General tab
    public WebElement getGeneralTab() {
        return generalTab;
    }

    // Method to click on the General tab and perform search operation
    public void clickGeneralTab() throws InterruptedException {

        scrollToElementAndWait(getSearch()); // Scroll to the search input field and wait

        // Retrieve a list of tender elements from the page
        List<WebElement> tendersList = _driver.findElements(By.xpath("//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1"));

        // Find the first tender title element using XPath
        WebElement tenderTitleName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)[9]");

        // Get the text of the first tender title
        String title = tenderTitleName.getText();

        // Split the title text using ": " as the delimiter
//        String[] str = title.split(": ");

        // Enter the extracted text into the search input field
        getSearch().sendKeys(title);

        // Retrieve the entered value from the search field
        String value = getSearch().getAttribute("value");

//        Thread.sleep(6000);
        waitForVisibility(By.xpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)"));


        // Print the entered search value
        System.out.println(value);

        WebElement firstResponseName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)");
//        waitForVisibility(By.xpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)"));

        if(value.contains(firstResponseName.getText())){
            System.out.println("Matched");
            System.out.println(firstResponseName.getText());
        }else{
            System.out.println("Not Mached");
        }
//
//        for (WebElement nameOfTender : tendersList) {
//            try {
//                if (value.contains(nameOfTender.getText())) {
//                    System.out.println("Matched");
//                    break;
////                    Assert.assertTrue(true);
//
//                } else {
////                    System.out.println("Failed");
//                    Assert.assertFalse(false);
//                }
//            } catch (Exception e) {
//            }
//        }
    }

    // Method to click on the Circular tab
    public void clickCircularTab() {
        scrollToElement(getCircularTab()); // Scroll to the Circular tab
        clickUsingJavaScript(getCircularTab()); // Click the Circular tab using JavaScript
    }


}
