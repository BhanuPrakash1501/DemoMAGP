package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GalleryPage extends BaseClass {

    // WebDriver instance to interact with the web page
    private WebDriver _driver;

    // Constructor to initialize the GalleryPage class
    public GalleryPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this); // Initializes WebElements using PageFactory
    }

    // WebElement representing the "Gallery" heading on the page
    @FindBy(xpath = "//h2[text()='Gallery']")
    private WebElement galleryHeading;

    // WebElement for the search bar in the gallery section
    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement searchBar;

    // Getter method to retrieve the search bar WebElement
    public WebElement getSearchBar() {
        return searchBar;
    }

    // Getter method to retrieve the gallery heading WebElement
    public WebElement getGalleryHeading() {
        return galleryHeading;
    }

    // Method to scroll to the "Gallery" heading
    public void gallery() {
        scrollToElement(getGalleryHeading());
    }

    // Method to search for an image in the gallery and verify the search result
    public void searchGaller() throws InterruptedException {
        // Scroll to the search bar element
        scrollToElement(getSearchBar());

        // Pause execution for 3 seconds (not recommended for production; use explicit waits instead)
        Thread.sleep(3000);

        // Wait until the search bar is visible
        waitForVisibility(By.xpath("(//input[@placeholder='Search'])[2]"));

        // Enter the search query "Airport Alor Star" in the search bar
        getSearchBar().sendKeys("Airport Alor Star");

        // Pause execution for 3 seconds (not recommended for production)
        Thread.sleep(3000);

        // Find the image overlay element containing the search result text
        WebElement ele = findElementByXpath("//div[@class='image-overlay']//h6");

        // Retrieve the text from the element
        String txt = ele.getText();

        // Verify if the retrieved text matches the expected search result
        if (txt.equals("Airport Alor Star")) {
            Assert.assertEquals(txt, "Airport Alor Star"); // Assert that the text is correct
        } else {
            Assert.fail(); // Fail the test if the text does not match
        }
    }

}
