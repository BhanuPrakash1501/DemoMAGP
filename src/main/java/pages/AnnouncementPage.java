package pages;

import baseClass.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
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

    @FindBy(xpath = "//div[@class='w-75']//h1")
    private WebElement firstCirculartitlename;

    @FindBy(xpath = "(//button[contains(text(), 'View')])[1]")
    private WebElement viewIconButton;

    @FindBy(xpath = "(//button[contains(text(), 'PDF')])[1]")
    private WebElement pdfButtontxt;

    @FindBy(xpath = "(//button[@class='btn-close'])[2]")
    private WebElement viewPopUpXbtn;

    @FindBy(xpath = "(//div[@class='card-body an-card'])[1]")
    private WebElement tenderDetails;

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
        WebElement tenderTitleName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)[1]");

        // Get the text of the first tender title
        String title = tenderTitleName.getText();

        // Split the title text using ": " as the delimiter
//        String[] str = title.split(": ");

        // Enter the extracted text into the search input field
        getSearch().sendKeys(title);

        // Retrieve the entered value from the search field
        String value = getSearch().getAttribute("value");

        Thread.sleep(6000);
        waitForVisibility(By.xpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)"));


        // Print the entered search value
        System.out.println(value);

        WebElement firstResponseName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)");
//        waitForVisibility(By.xpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)"));

        if (value.contains(firstResponseName.getText())) {
            System.out.println("Matched");
            System.out.println(firstResponseName.getText());
        } else {
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

    /// /div[@class='w-75']

    public void seachCurcularTitles() throws InterruptedException {
        Thread.sleep(6000);

        scrollToElementAndWait(firstCirculartitlename);


        WebElement circulartitle = findElementByXpath("(//div[@class='w-75']//h1)[2]");

        elementSendKeys(getSearch(), circulartitle.getText());
        Thread.sleep(6000);


        // Retrieve the entered value from the search field
        String value = getSearch().getAttribute("value");

//        Thread.sleep(6000);
        waitForVisibility(By.xpath("//div[@class='w-75']//h1"));


        // Print the entered search value
        System.out.println(value);

        WebElement firstResponseName = findElementByXpath("//div[@class='w-75']//h1");


        if (value.contains(firstResponseName.getText())) {
            System.out.println("Matched");
            System.out.println(firstResponseName.getText());
        } else {
            System.out.println("Not Mached");
        }


    }

    public void verifyViewAndPdfIcons() throws InterruptedException {
        Thread.sleep(2000);
        scrollToElementAndWait(pdfButtontxt);
        Assert.assertEquals(viewIconButton.getText(), "View");
        Assert.assertEquals(pdfButtontxt.getText(), "PDF");
    }

    public void clickPdfbtn() throws AWTException, InterruptedException {
        waitForElementToBeClickable(pdfButtontxt);
        clickUsingJavaScript(pdfButtontxt);
        Thread.sleep(3000);
        Robot robot = new Robot();

        // Simulate pressing Enter (if "Save" is the default button)
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickViewBtn() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementToBeClickable(viewIconButton);
        WebElement firstResponseName = findElementByXpath("//div[@class='w-75']//h1");
        clickUsingJavaScript(viewIconButton);
        WebElement popUpPDFName = findElementByXpath("//div[@class='modal-header']//div");

        if (firstResponseName.getText().contains(popUpPDFName.getText())) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        elementClick(viewPopUpXbtn);


    }

    public void clickOnTender() {
        try {
            Thread.sleep(3000);
            scrollToElementAndWait(tenderDetails);
            waitForElementToBeClickable(tenderDetails);
            WebElement tenderTitleName = findElementByXpath("(//div[@class='d-flex mb-2 justify-content-between align-items-start']//h1)[1]");
            String title = tenderTitleName.getText();
//            System.out.println(title);
//            System.out.println(tenderDetails.getText());
            clickUsingJavaScript(tenderDetails);
            Thread.sleep(3000);
            WebElement tenderHeadingName = findElementByXpath("//h5[@class='mb-3']");
            scrollToElementAndWait(tenderHeadingName);


            Assert.assertEquals(title, tenderHeadingName.getText());
        } catch (Exception e) {
            System.out.println(" Test Case Failed");
            System.out.println(e);
        }
    }

    public void markAsFavourite() throws InterruptedException {
        waitForElementToBeClickable(_driver.findElement(By.xpath("//*[@class='btn btn-primary mb-4']//span")));
        WebElement markAsFavBtn = findElementByXpath("//*[@class='btn btn-primary mb-4']//span");
        String favTxt = markAsFavBtn.getText();

        if (!favTxt.equalsIgnoreCase("Mark as Favourite")) {
            clickUsingJavaScript(markAsFavBtn);
            System.out.println(favTxt);
        } else {
            WebElement markedAsFavBtn = findElementByXpath("//*[@class='btn btn-primary mb-4']//span");
            String MarkedAsFavTxt = markedAsFavBtn.getText();
            clickUsingJavaScript(markedAsFavBtn);
            System.out.println(MarkedAsFavTxt);
        }
    }

}
