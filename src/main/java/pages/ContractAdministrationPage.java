package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContractAdministrationPage extends BaseClass {
    private WebDriver _driver;

    public ContractAdministrationPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='4.1 Contract Management Implementation']/following-sibling::a")
    private WebElement ContractManagementImplemetationViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    @FindBy(xpath = "//h2[text()='4.2 Contract Renewal']/following-sibling::a")
    private WebElement contractRenewalViewMoreBtn;

    @FindBy(xpath = "//h2[text()='4.3 Contract Termination']/following-sibling::a")
    private WebElement contractTerminationViewMoreBtn;

    @FindBy(xpath = "//h2[text()='4.4 Contract Closeout']/following-sibling::a")
    private WebElement contractCloseoutViewMoreBtn;

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

    public void clickContractManagementImplemetation(){
        scrollToElement(getContractManagementImplemetationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.1 Contract Management Implementation']/following-sibling::a"));
        clickUsingJavaScript(getContractManagementImplemetationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickContractRenewal() {
        scrollToElement(getContractRenewalViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.2 Contract Renewal']/following-sibling::a"));
        clickUsingJavaScript(getContractRenewalViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickContractTermination() {
        scrollToElement(getContractTerminationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.3 Contract Termination']/following-sibling::a"));
        clickUsingJavaScript(getContractTerminationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickContractCloseout() {
        scrollToElement(getContractCloseoutViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='4.4 Contract Closeout']/following-sibling::a"));
        clickUsingJavaScript(getContractCloseoutViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }
}


