package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VendorManagementPage extends BaseClass {

    // WebDriver instance to interact with the browser.
    private WebDriver _driver;

    // Constructor to initialize the WebDriver and WebElements using PageFactory.
    public VendorManagementPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locates the "View More" button for Vendor Registration.
    @FindBy(xpath = "//h2[text()='5.1 Vendor Registration']/following-sibling::a")
    private WebElement VendorRegistrationviewBtn;

    // Locates the "Overview" tab under Vendor Management.
    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    // Locates the "Policies" tab under Vendor Management.
    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    // Locates the "Process Flow Chart - Renewal" tab under Vendor Registration.
    @FindBy(xpath = "//h6[text()='Process Flow Chart - Renewal']")
    private WebElement processFlowCharttabRen;

    // Locates the "Process Flow Chart - New Registration" tab under Vendor Registration.
    @FindBy(xpath = "//h6[text()='Process Flow Chart - New Registration']")
    private WebElement processFlowCharttabNReg;

    // Locates the "View More" button for Potential Vendor Screening.
    @FindBy(xpath = "//h2[text()='5.2 Potential Vendor Screening']/following-sibling::a")
    private WebElement potentialVendorScreeningviewBtn;

    // Locates the "Process Flow Chart" tab under Potential Vendor Screening.
    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowCharttab;

    // Locates the "View More" button for Vendor Performance Management.
    @FindBy(xpath = "//h2[text()='5.3 Vendor Performance Management']/following-sibling::a")
    private WebElement VendorPerformanceManagementviewBtn;

    // Locates the "Process Flow Chart (Unscheduled)" tab under Vendor Performance Management.
    @FindBy(xpath = "//h6[text()='Process Flow Chart (Unscheduled)']")
    private WebElement processFlowCharttabUnsch;

    // Locates the "Process Flow Chart (Schedule)" tab under Vendor Performance Management.
    @FindBy(xpath = "//h6[text()='Process Flow Chart (Schedule)']")
    private WebElement processFlowCharttabSched;

    // Locates the "Vendor Management" tab link in the navigation menu.
    @FindBy(xpath = "//span[text()='Vendor Management']")
    private WebElement vendorManagementTabLink;

    // Getter method to return the Vendor Management tab link WebElement.
    public WebElement getVendorManagementTabLink() {
        return vendorManagementTabLink;
    }

    // Returns the "Process Flow Chart (Schedule)" tab element, used for scheduled vendor performance management processes.
    public WebElement getProcessFlowCharttabSched() {
        return processFlowCharttabSched;
    }

    // Returns the "Process Flow Chart (Unscheduled)" tab element, used for unscheduled vendor performance management processes.
    public WebElement getProcessFlowCharttabUnsch() {
        return processFlowCharttabUnsch;
    }

    // Returns the "View More" button element for the Vendor Performance Management section.
    public WebElement getVendorPerformanceManagementviewBtn() {
        return VendorPerformanceManagementviewBtn;
    }

    // Returns the "View More" button element for the Vendor Registration section.
    public WebElement getVendorRegistrationviewBtn() {
        return VendorRegistrationviewBtn;
    }

    // Returns the "Overview" tab element, which provides general information about vendor management.
    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    // Returns the "Policies" tab element, which contains procurement policies related to vendor management.
    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    // Returns the "Process Flow Chart - Renewal" tab element, which outlines the renewal process for vendors.
    public WebElement getProcessFlowCharttabRen() {
        return processFlowCharttabRen;
    }

    // Returns the "Process Flow Chart - New Registration" tab element, which outlines the process for new vendor registrations.
    public WebElement getProcessFlowCharttabNReg() {
        return processFlowCharttabNReg;
    }

    // Returns the "View More" button element for the Potential Vendor Screening section.
    public WebElement getPotentialVendorScreeningviewBtn() {
        return potentialVendorScreeningviewBtn;
    }

    // Returns the "Process Flow Chart" tab element, which provides a graphical representation of the vendor screening process.
    public WebElement getProcessFlowCharttab() {
        return processFlowCharttab;
    }


    // Clicks on the "Vendor Registration" section after ensuring visibility and scrolling to it.
    public void clickVendorRegistration() {
        // Scroll to the "Vendor Registration" view button to make it visible in the viewport.
        scrollToElement(getVendorRegistrationviewBtn());

        // Wait until the "Vendor Registration" button is visible before interacting with it.
        waitForVisibility(By.xpath("//h2[text()='5.1 Vendor Registration']/following-sibling::a"));

        // Click the "Vendor Registration" button using JavaScript to ensure compatibility with all browsers.
        clickUsingJavaScript(getVendorRegistrationviewBtn());

        // Scroll to the "Overview" tab and wait for it to be visible.
        scrollToElementAndWait(getOverviewtabname());

        // Retrieve the text of the "Overview" tab to verify successful navigation.
        String tabTxt = elementGetText(getOverviewtabname());

        // Assert that the displayed tab text matches "Overview" to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on the "Policies" tab and verifies that it is successfully opened.
    public void clickpolicies() {
        // Click the "Policies" tab using JavaScript to ensure proper interaction.
        clickUsingJavaScript(getPoliciestabname());

        // Retrieve the text of the "Policies" tab to verify successful navigation.
        String tabTxt = elementGetText(getPoliciestabname());

        // Assert that the displayed tab text matches "Policies" to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Policies");
    }


    // Clicks on the "Process Flow Chart - Renewal" tab and verifies successful navigation.
    public void clickprocessFlowChartRen() {
        // Click the "Process Flow Chart - Renewal" tab using JavaScript for compatibility.
        clickUsingJavaScript(getProcessFlowCharttabRen());

        // Retrieve the text of the "Process Flow Chart - Renewal" tab to verify navigation.
        String tabTxt = elementGetText(getProcessFlowCharttabRen());

        // Assert that the displayed tab text matches "Process Flow Chart - Renewal"
        // to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Process Flow Chart - Renewal");
    }

    // Clicks on the "Process Flow Chart - New Registration" tab and verifies successful navigation.
    public void clickprocessFlowChartNReg() {
        // Click the "Process Flow Chart - New Registration" tab using JavaScript.
        clickUsingJavaScript(getProcessFlowCharttabNReg());

        // Retrieve the text of the "Process Flow Chart - New Registration" tab to verify navigation.
        String tabTxt = elementGetText(getProcessFlowCharttabNReg());

        // Assert that the displayed tab text matches "Process Flow Chart - New Registration"
        // to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Process Flow Chart - New Registration");
    }


    // Clicks on the "Potential Vendor Screening" section and verifies successful navigation.
    public void clickPotentialVendorScreening() {
        // Scroll to the "Potential Vendor Screening" button to ensure it's visible.
        scrollToElement(getPotentialVendorScreeningviewBtn());

        // Wait for the "Potential Vendor Screening" button to be visible before interacting with it.
        waitForVisibility(By.xpath("//h2[text()='5.2 Potential Vendor Screening']/following-sibling::a"));

        // Click the "Potential Vendor Screening" button using JavaScript for better compatibility.
        clickUsingJavaScript(getPotentialVendorScreeningviewBtn());

        // Scroll to the "Overview" tab and wait to ensure the page loads properly.
        scrollToElementAndWait(getOverviewtabname());

        // Retrieve the text of the "Overview" tab to verify successful navigation.
        String tabTxt = elementGetText(getOverviewtabname());

        // Assert that the displayed tab text matches "Overview" to confirm the correct section is open.
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on the "Process Flow Chart" tab and verifies successful navigation.
    public void clickprocessFlowChart() {
        // Click the "Process Flow Chart" tab using JavaScript for compatibility.
        clickUsingJavaScript(getProcessFlowCharttab());

        // Retrieve the text of the "Process Flow Chart" tab to verify navigation.
        String tabTxt = elementGetText(getProcessFlowCharttab());

        // Assert that the displayed tab text matches "Process Flow Chart"
        // to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }


    // Clicks on the "Vendor Performance Management" section and verifies successful navigation.
    public void clickVendorPerformanceManagement() {
        // Scroll to the "Vendor Performance Management" button to ensure it's visible.
        scrollToElement(getVendorPerformanceManagementviewBtn());

        // Wait for the "Vendor Performance Management" button to be visible before interacting with it.
        waitForVisibility(By.xpath("//h2[text()='5.3 Vendor Performance Management']/following-sibling::a"));

        // Click the "Vendor Performance Management" button using JavaScript for better compatibility.
        clickUsingJavaScript(getVendorPerformanceManagementviewBtn());

        // Scroll to the "Overview" tab and wait to ensure the page loads properly.
        scrollToElementAndWait(getOverviewtabname());

        // Retrieve the text of the "Overview" tab to verify successful navigation.
        String tabTxt = elementGetText(getOverviewtabname());

        // Assert that the displayed tab text matches "Overview" to confirm the correct section is open.
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on the "Process Flow Chart (Unscheduled)" tab and verifies successful navigation.
    public void clickprocessFlowChartUnsch() {
        // Click the "Process Flow Chart (Unscheduled)" tab using JavaScript for compatibility.
        clickUsingJavaScript(getProcessFlowCharttabUnsch());

        // Retrieve the text of the "Process Flow Chart (Unscheduled)" tab to verify navigation.
        String tabTxt = elementGetText(getProcessFlowCharttabUnsch());

        // Assert that the displayed tab text matches "Process Flow Chart (Unscheduled)"
        // to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Process Flow Chart (Unscheduled)");
    }

    // Clicks on the "Process Flow Chart (Schedule)" tab and verifies successful navigation.
    public void clickprocessFlowChartSched() {
        // Click the "Process Flow Chart (Schedule)" tab using JavaScript for compatibility.
        clickUsingJavaScript(getProcessFlowCharttabSched());

        // Retrieve the text of the "Process Flow Chart (Schedule)" tab to verify navigation.
        String tabTxt = elementGetText(getProcessFlowCharttabSched());

        // Assert that the displayed tab text matches "Process Flow Chart (Schedule)"
        // to confirm the correct tab is open.
        Assert.assertEquals(tabTxt, "Process Flow Chart (Schedule)");
    }

    // Clicks on the "Vendor Management" tab link.
    public void clickVendorManagementTabLink() {
        // Click the "Vendor Management" tab link using JavaScript for better compatibility.
        clickUsingJavaScript(getVendorManagementTabLink());
    }

}
