package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContractAdministrationPage extends BaseClass {

    // WebDriver instance to manage browser interactions
    private WebDriver _driver;

    // Constructor to initialize the ContractAdministrationPage with WebDriver
    public ContractAdministrationPage(WebDriver driver) {
        super(driver); // Call parent class constructor
        this._driver = driver; // Assign driver to the instance variable
        PageFactory.initElements(driver, this); // Initialize elements using PageFactory
    }

    // Locate the "View More" button for Contract Management Implementation section
    @FindBy(xpath = "//h2[text()='4.1 Contract Management Implementation']/following-sibling::a")
    private WebElement ContractManagementImplemetationViewMoreBtn;

    // Locate the Overview tab
    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    // Locate the Policies tab
    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    // Locate the Process Flow Chart tab
    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    // Locate the "View More" button for Contract Renewal section
    @FindBy(xpath = "//h2[text()='4.2 Contract Renewal']/following-sibling::a")
    private WebElement contractRenewalViewMoreBtn;

    // Locate the "View More" button for Contract Termination section
    @FindBy(xpath = "//h2[text()='4.3 Contract Termination']/following-sibling::a")
    private WebElement contractTerminationViewMoreBtn;

    // Locate the "View More" button for Contract Closeout section
    @FindBy(xpath = "//h2[text()='4.4 Contract Closeout']/following-sibling::a")
    private WebElement contractCloseoutViewMoreBtn;

    // Locate the Contract Administration tab link
    @FindBy(xpath = "//span[text()='Contract Administration']")
    private WebElement contractAdministrationTabLink;

    // Getter methods for WebElements
    public WebElement getContractAdministrationTabLink() {
        return contractAdministrationTabLink;
    }

    public WebElement getContractManagementImplemetationViewMoreBtn() {
        return ContractManagementImplemetationViewMoreBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    public WebElement getProcessFlowChartabname() {
        return processFlowChartabname;
    }

    public WebElement getContractRenewalViewMoreBtn() {
        return contractRenewalViewMoreBtn;
    }

    public WebElement getContractTerminationViewMoreBtn() {
        return contractTerminationViewMoreBtn;
    }

    public WebElement getContractCloseoutViewMoreBtn() {
        return contractCloseoutViewMoreBtn;
    }

    // Clicks on "View More" for Contract Management Implementation and verifies Overview tab
    public void clickContractManagementImplemetation(){
        scrollToElement(getContractManagementImplemetationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.1 Contract Management Implementation']/following-sibling::a"));
        clickUsingJavaScript(getContractManagementImplemetationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on Policies tab and verifies it
    public void clickpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    // Clicks on Process Flow Chart tab and verifies it
    public void clickprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    // Clicks on "View More" for Contract Renewal and verifies Overview tab
    public void clickContractRenewal() {
        scrollToElement(getContractRenewalViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.2 Contract Renewal']/following-sibling::a"));
        clickUsingJavaScript(getContractRenewalViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on "View More" for Contract Termination and verifies Overview tab
    public void clickContractTermination() {
        scrollToElement(getContractTerminationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.3 Contract Termination']/following-sibling::a"));
        clickUsingJavaScript(getContractTerminationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on "View More" for Contract Closeout and verifies Overview tab
    public void clickContractCloseout() {
        scrollToElement(getContractCloseoutViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.4 Contract Closeout']/following-sibling::a"));
        clickUsingJavaScript(getContractCloseoutViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    // Clicks on the Contract Administration tab link
    public void clickcontractAdministrationTabLink(){
        clickUsingJavaScript(getContractAdministrationTabLink());
    }

}


