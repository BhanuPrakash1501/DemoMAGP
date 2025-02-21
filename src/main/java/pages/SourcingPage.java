package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SourcingPage extends BaseClass {

    // Declares a private WebDriver instance to handle browser interactions
    private WebDriver _driver;

    /**
     * Constructor for the SourcingPage class.
     *
     * Initializes the WebDriver instance and sets up PageFactory to initialize
     * all WebElements in this page class.
     *
     * @param driver The WebDriver instance to be used for the page.
     */
    public SourcingPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

// WebElements representing different elements on the Sourcing Page

    /**
     * "View More" button for the "3.1 Tender Management" section.
     */
    @FindBy(xpath = "//h2[text()='3.1 Tender Management']/following-sibling::a")
    private WebElement TenderManagementViewMoreBtn;

    /**
     * Tab name for "Policies" section.
     */
    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    /**
     * Tab name for "Process Flow Chart" section.
     */
    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    /**
     * "View More" button for the "3.2 Tender Administration" section.
     */
    @FindBy(xpath = "//h2[text()='3.2 Tender Administration']/following-sibling::a")
    private WebElement tenderAdministrationViewMoreBtn;

    /**
     * Tab name for "Process Flow Chart - above RM50,000.00".
     */
    @FindBy(xpath = "//h6[text()='Process Flow Chart - above RM50,000.00']")
    private WebElement processFlowChartabABRMname;

    /**
     * Tab name for "Process Flow Chart - below RM50,000.00".
     */
    @FindBy(xpath = "//h6[text()='Process Flow Chart - below RM50,000.00']")
    private WebElement processFlowChartabBERMname;

    /**
     * "View More" button for the "3.3 Tender Evaluation" section.
     */
    @FindBy(xpath = "//h2[text()='3.3 Tender Evaluation']/following-sibling::a")
    private WebElement TenderEvaluationViewMoreBtn;

    /**
     * "View More" button for the "3.4 Abort of Tender" section.
     */
    @FindBy(xpath = "//h2[text()='3.4 Abort of Tender']/following-sibling::a")
    private WebElement AbortofTenderViewMoreBtn;

    /**
     * "View More" button for the "3.5 Clarification / Negotiation prior to Award" section.
     */
    @FindBy(xpath = "//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a")
    private WebElement ClarificationNegotiationpriortoAwardViewMoreBtn;

    /**
     * Tab name for the "Overview" section.
     */
    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    /**
     * Tab name for the "Process Flow Chart - Negotiation" section.
     */
    @FindBy(xpath = "//h6[text()='Process Flow Chart Negotiation']")
    private WebElement processFlowChartabNego;

    /**
     * Tab name for the "Process Flow Chart - Clarification Prior to Award" section.
     */
    @FindBy(xpath = "//h6[text()='Process Flow Chart Clarification Prior to Award']")
    private WebElement processFlowChartabCPA;

    /**
     * Link for the "Sourcing" tab.
     */
    @FindBy(xpath = "//span[text()='Sourcing']")
    private WebElement SourcingTabLink;


    /**
     * Retrieves the WebElement representing the "Sourcing" tab link.
     *
     * @return WebElement for the Sourcing tab.
     */
    public WebElement getSourcingTabLink() {
        return SourcingTabLink;
    }

    /**
     * Retrieves the WebElement for the "View More" button in the "3.1 Tender Management" section.
     *
     * @return WebElement for the Tender Management View More button.
     */
    public WebElement getTenderManagementViewMoreBtn() {
        return TenderManagementViewMoreBtn;
    }

    /**
     * Retrieves the WebElement representing the "Policies" tab name.
     *
     * @return WebElement for the Policies tab.
     */
    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    /**
     * Retrieves the WebElement for the "Process Flow Chart" tab name.
     *
     * @return WebElement for the Process Flow Chart tab.
     */
    public WebElement getProcessFlowChartabname() {
        return processFlowChartabname;
    }

    /**
     * Retrieves the WebElement for the "View More" button in the "3.2 Tender Administration" section.
     *
     * @return WebElement for the Tender Administration View More button.
     */
    public WebElement getTenderAdministrationViewMoreBtn() {
        return tenderAdministrationViewMoreBtn;
    }

    /**
     * Retrieves the WebElement for the "Process Flow Chart - Above RM50,000.00" tab name.
     *
     * @return WebElement for the Process Flow Chart (Above RM50,000.00) tab.
     */
    public WebElement getProcessFlowChartabABRMname() {
        return processFlowChartabABRMname;
    }

    /**
     * Retrieves the WebElement for the "Process Flow Chart - Below RM50,000.00" tab name.
     *
     * @return WebElement for the Process Flow Chart (Below RM50,000.00) tab.
     */
    public WebElement getProcessFlowChartabBERMname() {
        return processFlowChartabBERMname;
    }

    /**
     * Retrieves the WebElement for the "View More" button in the "3.3 Tender Evaluation" section.
     *
     * @return WebElement for the Tender Evaluation View More button.
     */
    public WebElement getTenderEvaluationViewMoreBtn() {
        return TenderEvaluationViewMoreBtn;
    }

    /**
     * Retrieves the WebElement for the "View More" button in the "3.4 Abort of Tender" section.
     *
     * @return WebElement for the Abort of Tender View More button.
     */
    public WebElement getAbortofTenderViewMoreBtn() {
        return AbortofTenderViewMoreBtn;
    }

    /**
     * Retrieves the WebElement for the "View More" button in the
     * "3.5 Clarification / Negotiation prior to Award" section.
     *
     * @return WebElement for the Clarification/Negotiation Prior to Award View More button.
     */
    public WebElement getClarificationNegotiationpriortoAwardViewMoreBtn() {
        return ClarificationNegotiationpriortoAwardViewMoreBtn;
    }

    /**
     * Retrieves the WebElement for the "Overview" tab name.
     *
     * @return WebElement for the Overview tab.
     */
    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    /**
     * Retrieves the WebElement for the "Process Flow Chart - Clarification Prior to Award" tab name.
     *
     * @return WebElement for the Process Flow Chart Clarification Prior to Award tab.
     */
    public WebElement getProcessFlowChartabCPA() {
        return processFlowChartabCPA;
    }

    /**
     * Retrieves the WebElement for the "Process Flow Chart - Negotiation" tab name.
     *
     * @return WebElement for the Process Flow Chart Negotiation tab.
     */
    public WebElement getProcessFlowChartabNego() {
        return processFlowChartabNego;
    }


    /**
     * Clicks on the "Tender Management" section and verifies that the "Overview" tab is displayed.
     */
    public void clickTenderManagement() {
        scrollToElement(getTenderManagementViewMoreBtn()); // Scrolls to the "Tender Management" section
        waitForVisibility(By.xpath("//h2[text()='3.1 Tender Management']/following-sibling::a")); // Waits for the "View More" button to be visible
        clickUsingJavaScript(getTenderManagementViewMoreBtn()); // Clicks the button using JavaScript executor
        scrollToElementAndWait(getOverviewtabname()); // Scrolls to the "Overview" tab and waits for it to load
        String tabTxt = elementGetText(getOverviewtabname()); // Retrieves the text of the "Overview" tab
        Assert.assertEquals(tabTxt, "Overview"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Policies" tab within the "Tender Management" section and verifies the tab name.
     */
    public void clickTenderManagementpolicies() {
        clickUsingJavaScript(getPoliciestabname()); // Clicks on the "Policies" tab using JavaScript executor
        String tabTxt = elementGetText(getPoliciestabname()); // Retrieves the text of the "Policies" tab
        Assert.assertEquals(tabTxt, "Policies"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart" tab within the "Tender Management" section and verifies the tab name.
     */
    public void clickTenderManagementprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname()); // Clicks on the "Process Flow Chart" tab using JavaScript executor
        String tabTxt = elementGetText(getProcessFlowChartabname()); // Retrieves the text of the "Process Flow Chart" tab
        Assert.assertEquals(tabTxt, "Process Flow Chart"); // Asserts that the correct tab is displayed
    }
    /**
     * Clicks on the "Tender Administration" section and verifies that the "Overview" tab is displayed.
     */
    public void clickTenderAdministration() {
        scrollToElement(getTenderAdministrationViewMoreBtn()); // Scrolls to the "Tender Administration" section
        waitForVisibility(By.xpath("//h2[text()='3.2 Tender Administration']/following-sibling::a")); // Waits for the "View More" button to be visible
        clickUsingJavaScript(getTenderAdministrationViewMoreBtn()); // Clicks the button using JavaScript executor
        scrollToElementAndWait(getOverviewtabname()); // Scrolls to the "Overview" tab and waits for it to load
        String tabTxt = elementGetText(getOverviewtabname()); // Retrieves the text of the "Overview" tab
        Assert.assertEquals(tabTxt, "Overview"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Policies" tab within the "Tender Administration" section and verifies the tab name.
     */
    public void clickTenderAdministrationpolicies() {
        clickUsingJavaScript(getPoliciestabname()); // Clicks on the "Policies" tab using JavaScript executor
        String tabTxt = elementGetText(getPoliciestabname()); // Retrieves the text of the "Policies" tab
        Assert.assertEquals(tabTxt, "Policies"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart - above RM50,000.00" tab within the "Tender Administration" section
     * and verifies the tab name.
     */
    public void clickTenderAdministrationprocessFlowChartABRM() {
        clickUsingJavaScript(getProcessFlowChartabABRMname()); // Clicks on the "Process Flow Chart - above RM50,000.00" tab
        String tabTxt = elementGetText(getProcessFlowChartabABRMname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart - above RM50,000.00"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart - below RM50,000.00" tab within the "Tender Administration" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickTenderAdministrationprocessFlowChartBERM() {
        clickUsingJavaScript(getProcessFlowChartabBERMname()); // Clicks on the "Process Flow Chart - below RM50,000.00" tab
        String tabTxt = elementGetText(getProcessFlowChartabBERMname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart - below RM50,000.00"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Tender Evaluation" section and verifies that the "Overview" tab is displayed.
     */
    public void clickTenderEvaluation() {
        scrollToElement(getTenderEvaluationViewMoreBtn()); // Scrolls to the "Tender Evaluation" section
        waitForVisibility(By.xpath("//h2[text()='3.3 Tender Evaluation']/following-sibling::a")); // Waits for the "View More" button to be visible
        clickUsingJavaScript(getTenderEvaluationViewMoreBtn()); // Clicks the button using JavaScript executor
        scrollToElementAndWait(getOverviewtabname()); // Scrolls to the "Overview" tab and waits for it to load
        String tabTxt = elementGetText(getOverviewtabname()); // Retrieves the text of the "Overview" tab
        Assert.assertEquals(tabTxt, "Overview"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Policies" tab within the "Tender Evaluation" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickTenderEvaluationpolicies() {
        clickUsingJavaScript(getPoliciestabname()); // Clicks on the "Policies" tab
        String tabTxt = elementGetText(getPoliciestabname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Policies"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart" tab within the "Tender Evaluation" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickTenderEvaluationprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname()); // Clicks on the "Process Flow Chart" tab
        String tabTxt = elementGetText(getProcessFlowChartabname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Abort of Tender" section and verifies that the "Overview" tab is displayed.
     */
    public void clickAbortofTender() {
        scrollToElement(getAbortofTenderViewMoreBtn()); // Scrolls to the "Abort of Tender" section
        waitForVisibility(By.xpath("//h2[text()='3.4 Abort of Tender']/following-sibling::a")); // Waits for the "View More" button to be visible
        clickUsingJavaScript(getAbortofTenderViewMoreBtn()); // Clicks the button using JavaScript executor
        scrollToElementAndWait(getOverviewtabname()); // Scrolls to the "Overview" tab and waits for it to load
        String tabTxt = elementGetText(getOverviewtabname()); // Retrieves the text of the "Overview" tab
        Assert.assertEquals(tabTxt, "Overview"); // Asserts that the correct tab is displayed
    }

    /**
     * Clicks on the "Policies" tab within the "Abort of Tender" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickAbortofTenderpolicies() {
        clickUsingJavaScript(getPoliciestabname()); // Clicks on the "Policies" tab
        String tabTxt = elementGetText(getPoliciestabname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Policies"); // Verifies that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart" tab within the "Abort of Tender" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickAbortofTenderprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname()); // Clicks on the "Process Flow Chart" tab
        String tabTxt = elementGetText(getProcessFlowChartabname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart"); // Verifies that the correct tab is displayed
    }

    /**
     * Clicks on the "Clarification / Negotiation prior to Award" section
     * and verifies that the "Overview" tab is displayed.
     */
    public void clickClarificationNegotiationpriortoAward() {
        scrollToElement(getClarificationNegotiationpriortoAwardViewMoreBtn()); // Scrolls to the section
        waitForVisibility(By.xpath("//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a")); // Waits for the "View More" button to be visible
        clickUsingJavaScript(getClarificationNegotiationpriortoAwardViewMoreBtn()); // Clicks the button using JavaScript executor
        scrollToElementAndWait(getOverviewtabname()); // Scrolls to the "Overview" tab and waits for it to load
        String tabTxt = elementGetText(getOverviewtabname()); // Retrieves the text of the "Overview" tab
        Assert.assertEquals(tabTxt, "Overview"); // Verifies that the correct tab is displayed
    }


    /**
     * Clicks on the "Policies" tab within the "Clarification / Negotiation prior to Award" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickClarificationNegotiationpriortoAwardpolicies() {
        clickUsingJavaScript(getPoliciestabname()); // Clicks on the "Policies" tab
        String tabTxt = elementGetText(getPoliciestabname()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Policies"); // Verifies that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart Negotiation" tab within the
     * "Clarification / Negotiation prior to Award" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickClarificationNegotiationpriortoAwardprocessFlowChartabNego() {
        clickUsingJavaScript(getProcessFlowChartabNego()); // Clicks on the "Process Flow Chart Negotiation" tab
        String tabTxt = elementGetText(getProcessFlowChartabNego()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart Negotiation"); // Verifies that the correct tab is displayed
    }

    /**
     * Clicks on the "Process Flow Chart Clarification Prior to Award" tab
     * within the "Clarification / Negotiation prior to Award" section
     * and verifies that the correct tab name is displayed.
     */
    public void clickClarificationNegotiationpriortoAwardprocessFlowChartabCPA() {
        clickUsingJavaScript(getProcessFlowChartabCPA()); // Clicks on the "Process Flow Chart Clarification Prior to Award" tab
        String tabTxt = elementGetText(getProcessFlowChartabCPA()); // Retrieves the text of the tab
        Assert.assertEquals(tabTxt, "Process Flow Chart Clarification Prior to Award"); // Verifies that the correct tab is displayed
    }

    /**
     * Clicks on the "Sourcing" tab link.
     */
    public void clickSourcingTabLink() {
        clickUsingJavaScript(getSourcingTabLink()); // Clicks the "Sourcing" tab link using JavaScript executor
    }

}
