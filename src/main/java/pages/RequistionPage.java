package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RequistionPage extends BaseClass {

    // WebDriver instance to interact with the web page
    private WebDriver _driver;

    /**
     * Constructor for RequisitionPage.
     * Initializes the web elements using PageFactory and sets the WebDriver instance.
     *
     * @param driver WebDriver instance for interacting with the page
     */
    public RequistionPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElement representing the "View More" button for Purchase Requisition section
    @FindBy(xpath = "//h2[text()='2.1 Purchase Requisition']/following-sibling::a")
    private WebElement purchaseRequistionViewMoreBtn;

    // WebElement for the "Overview" tab in the Purchase Requisition section
    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    // WebElement for the "Policies" tab in the Purchase Requisition section
    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    // WebElement for the "Process Flow Chart" tab in the Purchase Requisition section
    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    // WebElement for the "Requisition" tab link in the navigation menu
    @FindBy(xpath = "//span[text()='Requisition']")
    private WebElement requisitionTabLink;

    // WebElement representing the "View More" button for Processing of Purchase Requisition section
    @FindBy(xpath = "//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a")
    private WebElement ProcessingofPurchaseRequisitionViewMoreBtn;


    /**
     * Getter method to retrieve the "Requisition" tab link element.
     *
     * @return WebElement representing the Requisition tab link
     */
    public WebElement getRequisitionTabLink() {
        return requisitionTabLink;
    }

    /**
     * Getter method to retrieve the "View More" button for the Purchase Requisition section.
     *
     * @return WebElement representing the "View More" button for Purchase Requisition
     */
    public WebElement getPurchaseRequistionViewMoreBtn() {
        return purchaseRequistionViewMoreBtn;
    }

    /**
     * Getter method to retrieve the "Overview" tab element.
     *
     * @return WebElement representing the Overview tab
     */
    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    /**
     * Getter method to retrieve the "Policies" tab element.
     *
     * @return WebElement representing the Policies tab
     */
    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    /**
     * Getter method to retrieve the "Process Flow Chart" tab element.
     *
     * @return WebElement representing the Process Flow Chart tab
     */
    public WebElement getProcessFlowChartabname() {
        return processFlowChartabname;
    }

    /**
     * Getter method to retrieve the "View More" button for Processing of Purchase Requisition section.
     *
     * @return WebElement representing the "View More" button for Processing of Purchase Requisition
     */
    public WebElement getProcessingofPurchaseRequisitionViewMoreBtn() {
        return ProcessingofPurchaseRequisitionViewMoreBtn;
    }


    /**
     * Clicks on the "View More" button for the Purchase Requisition section,
     * waits for the section to be visible, and verifies that the Overview tab is displayed.
     */
    public void clickPurchaseRequisition() {
        // Scroll to the "View More" button for Purchase Requisition
        scrollToElement(getPurchaseRequistionViewMoreBtn());

        // Wait for the button to be visible
        waitForVisibility(By.xpath("//h2[text()='2.1 Purchase Requisition']/following-sibling::a"));

        // Click the "View More" button using JavaScript
        clickUsingJavaScript(getPurchaseRequistionViewMoreBtn());

        // Scroll to and wait for the Overview tab to be visible
        scrollToElementAndWait(getOverviewtabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getOverviewtabname());

        // Assert that the active tab is "Overview"
        Assert.assertEquals(tabTxt, "Overview");
    }

    /**
     * Clicks on the "Policies" tab within the Purchase Requisition section
     * and verifies that the selected tab is "Policies".
     */
    public void clickPurchaseRequisitionpolicies() {
        // Click the "Policies" tab using JavaScript
        clickUsingJavaScript(getPoliciestabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getPoliciestabname());

        // Assert that the active tab is "Policies"
        Assert.assertEquals(tabTxt, "Policies");
    }

    /**
     * Clicks on the "Process Flow Chart" tab within the Purchase Requisition section
     * and verifies that the selected tab is "Process Flow Chart".
     */
    public void clickPurchaseRequisitionprocessFlowChart() {
        // Click the "Process Flow Chart" tab using JavaScript
        clickUsingJavaScript(getProcessFlowChartabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getProcessFlowChartabname());

        // Assert that the active tab is "Process Flow Chart"
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }


    /**
     * Clicks on the "View More" button for Processing of Purchase Requisition,
     * waits for the section to be visible, and verifies that the Overview tab is displayed.
     */
    public void clickProcessingofPurchaseRequisition() {
        // Scroll to the "View More" button for Processing of Purchase Requisition
        scrollToElement(getProcessingofPurchaseRequisitionViewMoreBtn());

        // Wait for the button to be visible
        waitForVisibility(By.xpath("//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a"));

        // Click the "View More" button using JavaScript
        clickUsingJavaScript(getProcessingofPurchaseRequisitionViewMoreBtn());

        // Scroll to and wait for the Overview tab to be visible
        scrollToElementAndWait(getOverviewtabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getOverviewtabname());

        // Assert that the active tab is "Overview"
        Assert.assertEquals(tabTxt, "Overview");
    }

    /**
     * Clicks on the "Policies" tab within the Processing of Purchase Requisition section
     * and verifies that the selected tab is "Policies".
     */
    public void clickProcessingofPurchaseRequisitionpolicies() {
        // Click the "Policies" tab using JavaScript
        clickUsingJavaScript(getPoliciestabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getPoliciestabname());

        // Assert that the active tab is "Policies"
        Assert.assertEquals(tabTxt, "Policies");
    }

    /**
     * Clicks on the "Process Flow Chart" tab within the Processing of Purchase Requisition section
     * and verifies that the selected tab is "Process Flow Chart".
     */
    public void clickProcessingofPurchaseRequisitionprocessFlowChart() {
        // Click the "Process Flow Chart" tab using JavaScript
        clickUsingJavaScript(getProcessFlowChartabname());

        // Retrieve the text of the active tab
        String tabTxt = elementGetText(getProcessFlowChartabname());

        // Assert that the active tab is "Process Flow Chart"
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    /**
     * Clicks on the Requisition tab link.
     */
    public void clickRequisitionTabLink() {
        // Click the "Requisition" tab link using JavaScript
        clickUsingJavaScript(getRequisitionTabLink());
    }

}

