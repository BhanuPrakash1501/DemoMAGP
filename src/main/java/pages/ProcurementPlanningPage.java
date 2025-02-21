package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProcurementPlanningPage extends BaseClass {
    // WebDriver instance to interact with the browser
    private WebDriver _driver;

    /**
     * Constructor for ProcurementPlanningPage.
     * Initializes the WebElements on the page using PageFactory.
     *
     * @param driver WebDriver instance to interact with the web elements.
     */
    public ProcurementPlanningPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElement representing the "View More" button for Business Case section
    @FindBy(xpath = "//h2[text()='1.1 Business Case']/following-sibling::a")
    private WebElement businesscaseViewMoreBtn;

    // WebElement representing the "Overview" tab
    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    // WebElement representing the "Policies" tab
    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    // WebElement representing the "Procurement Planning" tab link in the navigation
    @FindBy(xpath = "//span[text()='procurement-planning']")
    private WebElement procurementPlanningTabLink;

    // WebElement representing the "Process Flow Chart" tab
    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowCharttabname;


    // WebElement representing the "View More" button for the Annual Procurement Planning section
    @FindBy(xpath = "//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a")
    private WebElement AnnualProcurementPlanningViewMoreBtn;

    // WebElement representing the "View More" button for the Strategy Paper section
    @FindBy(xpath = "//h2[text()='1.3 Strategy Paper']/following-sibling::a")
    private WebElement StrategyPaperViewMoreBtn;

    // WebElement representing the "Process Flow Chart" tab for Direct Appointment
    @FindBy(xpath = "//h6[text()='Process Flow Chart (Direct Appointment)']")
    private WebElement processFlowChartDAtabname;

    // WebElement representing the "Process Flow Chart" tab for Open Tender / Invitation to Bid
    @FindBy(xpath = "//h6[text()='Process Flow Chart (Open Tender / Invitation To Bid)']")
    private WebElement processFlowChartOTtabname;

    /**
     * Returns the WebElement for the Procurement Planning tab link in the navigation.
     *
     * @return WebElement representing the Procurement Planning tab link.
     */
    public WebElement getProcurementPlanningTabLink() {
        return procurementPlanningTabLink;
    }

    /**
     * Returns the WebElement for the "View More" button in the Annual Procurement Planning section.
     *
     * @return WebElement representing the "View More" button.
     */
    public WebElement getAnnualProcurementPlanningViewMoreBtn() {
        return AnnualProcurementPlanningViewMoreBtn;
    }

    /**
     * Returns the WebElement for the "View More" button in the Business Case section.
     *
     * @return WebElement representing the "View More" button.
     */
    public WebElement getBusinesscaseViewMoreBtn() {
        return businesscaseViewMoreBtn;
    }

    /**
     * Returns the WebElement for the Overview tab.
     *
     * @return WebElement representing the Overview tab.
     */
    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    /**
     * Returns the WebElement for the Policies tab.
     *
     * @return WebElement representing the Policies tab.
     */
    public WebElement getpoliciestabname() {
        return Policiestabname;
    }

    /**
     * Returns the WebElement for the Process Flow Chart tab.
     *
     * @return WebElement representing the Process Flow Chart tab.
     */
    public WebElement getprocessFlowCharttabname() {
        return processFlowCharttabname;
    }

    /**
     * Returns the WebElement for the "View More" button in the Strategy Paper section.
     *
     * @return WebElement representing the "View More" button.
     */
    public WebElement getStrategyPaperViewMoreBtn() {
        return StrategyPaperViewMoreBtn;
    }

    /**
     * Returns the WebElement for the Process Flow Chart tab related to Direct Appointment.
     *
     * @return WebElement representing the Direct Appointment Process Flow Chart tab.
     */
    public WebElement getProcessFlowChartDAtabname() {
        return processFlowChartDAtabname;
    }

    /**
     * Returns the WebElement for the Process Flow Chart tab related to Open Tender / Invitation to Bid.
     *
     * @return WebElement representing the Open Tender Process Flow Chart tab.
     */
    public WebElement getProcessFlowChartOTtabname() {
        return processFlowChartOTtabname;
    }

    /**
     * Clicks on the "View More" button for the Business Case section, waits for the Overview tab to be visible,
     * and verifies that the correct tab is displayed.
     */
    public void clickbusinessCase() {
        // Scroll to the Business Case "View More" button
        scrollToElement(getBusinesscaseViewMoreBtn());

        // Wait until the "View More" button for Business Case is visible
        waitForVisibility(By.xpath("//h2[text()='1.1 Business Case']/following-sibling::a"));

        // Click the "View More" button using JavaScript
        clickUsingJavaScript(getBusinesscaseViewMoreBtn());

        // Scroll to the Overview tab and wait for it to load
        scrollToElementAndWait(getOverviewtabname());

        // Get the tab text and verify it is "Overview"
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    /**
     * Clicks on the Policies tab within the Business Case section and verifies that the correct tab is displayed.
     */
    public void clickbusinessCasepolicies() {
        // Click on the Policies tab using JavaScript
        clickUsingJavaScript(getpoliciestabname());

        // Get the tab text and verify it is "Policies"
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    /**
     * Clicks on the Process Flow Chart tab within the Business Case section and verifies that the correct tab is displayed.
     */
    public void clickbusinessCaseprocessFlowChart() {
        // Click on the Process Flow Chart tab using JavaScript
        clickUsingJavaScript(getprocessFlowCharttabname());

        // Get the tab text and verify it is "Process Flow Chart"
        String tabTxt = elementGetText(getprocessFlowCharttabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    /**
     * Clicks on the "View More" button for the Annual Procurement Planning section,
     * waits for the Overview tab to be visible, and verifies that the correct tab is displayed.
     */
    public void clickAnnualProcurementplanning() {
        // Scroll to the Annual Procurement Planning "View More" button
        scrollToElement(getAnnualProcurementPlanningViewMoreBtn());

        // Wait until the "View More" button for Annual Procurement Planning is visible
        waitForVisibility(By.xpath("//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a"));

        // Click the "View More" button using JavaScript
        clickUsingJavaScript(getAnnualProcurementPlanningViewMoreBtn());

        // Scroll to the Overview tab and wait for it to load
        scrollToElementAndWait(getOverviewtabname());

        // Get the tab text and verify it is "Overview"
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    /**
     * Clicks on the Policies tab within the Annual Procurement Planning section
     * and verifies that the correct tab is displayed.
     */
    public void clickAnnualProcurementpolicies() {
        // Click on the Policies tab using JavaScript
        clickUsingJavaScript(getpoliciestabname());

        // Get the tab text and verify it is "Policies"
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    /**
     * Clicks on the Process Flow Chart tab within the Annual Procurement Planning section
     * and verifies that the correct tab is displayed.
     */
    public void clickAnnualProcurementProcessFlowChart() {
        // Click on the Process Flow Chart tab using JavaScript
        clickUsingJavaScript(getprocessFlowCharttabname());

        // Get the tab text and verify it is "Process Flow Chart"
        String tabTxt = elementGetText(getprocessFlowCharttabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }


    /**
     * Clicks on the "View More" button for the Strategy Paper section,
     * waits for the Overview tab to be visible, and verifies that the correct tab is displayed.
     */
    public void clickStrategypaper() {
        // Scroll to the Strategy Paper "View More" button
        scrollToElement(getStrategyPaperViewMoreBtn());

        // Wait until the "View More" button for Strategy Paper is visible
        waitForVisibility(By.xpath("//h2[text()='1.3 Strategy Paper']/following-sibling::a"));

        // Click the "View More" button using JavaScript
        clickUsingJavaScript(getStrategyPaperViewMoreBtn());

        // Scroll to the Overview tab and wait for it to load
        scrollToElementAndWait(getOverviewtabname());

        // Get the tab text and verify it is "Overview"
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    /**
     * Clicks on the Policies tab within the Strategy Paper section
     * and verifies that the correct tab is displayed.
     */
    public void clickStrategypaperpolicies() {
        // Click on the Policies tab using JavaScript
        clickUsingJavaScript(getpoliciestabname());

        // Get the tab text and verify it is "Policies"
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    /**
     * Clicks on the Process Flow Chart (Direct Appointment) tab within the Strategy Paper section
     * and verifies that the correct tab is displayed.
     */
    public void clickStrategypaperProcessFlowChartDA() {
        // Click on the Process Flow Chart (Direct Appointment) tab using JavaScript
        clickUsingJavaScript(getProcessFlowChartDAtabname());

        // Get the tab text and verify it is "Process Flow Chart (Direct Appointment)"
        String tabTxt = elementGetText(getProcessFlowChartDAtabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Direct Appointment)");
    }


    /**
     * Clicks on the Process Flow Chart (Open Tender / Invitation To Bid) tab
     * within the Strategy Paper section and verifies that the correct tab is displayed.
     */
    public void clickStrategypaperProcessFlowChartOT() {
        // Click on the Process Flow Chart (Open Tender / Invitation To Bid) tab using JavaScript
        clickUsingJavaScript(getProcessFlowChartOTtabname());

        // Get the tab text and verify it is "Process Flow Chart (Open Tender / Invitation To Bid)"
        String tabTxt = elementGetText(getProcessFlowChartOTtabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Open Tender / Invitation To Bid)");
    }

    /**
     * Clicks on the Procurement Planning tab link in the navigation menu.
     */
    public void clickProcurementPlanningTabLink() {
        // Click on the Procurement Planning tab link using JavaScript
        clickUsingJavaScript(getProcurementPlanningTabLink());
    }

}