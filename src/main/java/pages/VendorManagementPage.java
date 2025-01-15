package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VendorManagementPage extends BaseClass {

    private WebDriver _driver;
    public VendorManagementPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='5.1 Vendor Registration']/following-sibling::a")
    private WebElement VendorRegistrationviewBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart - Renewal']")
    private WebElement processFlowCharttabRen;

    @FindBy(xpath = "//h6[text()='Process Flow Chart - New Registration']")
    private WebElement processFlowCharttabNReg;

    @FindBy(xpath = "//h2[text()='5.2 Potential Vendor Screening']/following-sibling::a")
    private WebElement potentialVendorScreeningviewBtn;

    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowCharttab;

    @FindBy(xpath = "//h2[text()='5.3 Vendor Performance Management']/following-sibling::a")
    private WebElement VendorPerformanceManagementviewBtn;

    @FindBy(xpath = "//h6[text()='Process Flow Chart (Unscheduled)']")
    private WebElement processFlowCharttabUnsch;

    @FindBy(xpath = "//h6[text()='Process Flow Chart (Schedule)']")
    private WebElement processFlowCharttabSched;

    public WebElement getProcessFlowCharttabSched() {
        return processFlowCharttabSched;
    }

    public WebElement getProcessFlowCharttabUnsch() {
        return processFlowCharttabUnsch;
    }

    public WebElement getVendorPerformanceManagementviewBtn() {
        return VendorPerformanceManagementviewBtn;
    }

    public WebElement getVendorRegistrationviewBtn() {
        return VendorRegistrationviewBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    public WebElement getProcessFlowCharttabRen() {
        return processFlowCharttabRen;
    }

    public WebElement getProcessFlowCharttabNReg() {
        return processFlowCharttabNReg;
    }

    public WebElement getPotentialVendorScreeningviewBtn() {
        return potentialVendorScreeningviewBtn;
    }

    public WebElement getProcessFlowCharttab() {
        return processFlowCharttab;
    }

    public void clickVendorRegistration(){
        scrollToElement(getVendorRegistrationviewBtn());
        waitForVisibility(By.xpath("//h2[text()='5.1 Vendor Registration']/following-sibling::a"));
        clickUsingJavaScript(getVendorRegistrationviewBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickprocessFlowChartRen() {
        clickUsingJavaScript(getProcessFlowCharttabRen());
        String tabTxt = elementGetText(getProcessFlowCharttabRen());
        Assert.assertEquals(tabTxt, "Process Flow Chart - Renewal");
    }

    public void clickprocessFlowChartNReg() {
        clickUsingJavaScript(getProcessFlowCharttabNReg());
        String tabTxt = elementGetText(getProcessFlowCharttabNReg());
        Assert.assertEquals(tabTxt, "Process Flow Chart - New Registration");
    }

    public void clickPotentialVendorScreening(){
        scrollToElement(getPotentialVendorScreeningviewBtn());
        waitForVisibility(By.xpath("//h2[text()='5.2 Potential Vendor Screening']/following-sibling::a"));
        clickUsingJavaScript(getPotentialVendorScreeningviewBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowCharttab());
        String tabTxt = elementGetText(getProcessFlowCharttab());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickVendorPerformanceManagement(){
        scrollToElement(getVendorPerformanceManagementviewBtn());
        waitForVisibility(By.xpath("//h2[text()='5.3 Vendor Performance Management']/following-sibling::a"));
        clickUsingJavaScript(getVendorPerformanceManagementviewBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickprocessFlowChartUnsch() {
        clickUsingJavaScript(getProcessFlowCharttabUnsch());
        String tabTxt = elementGetText(getProcessFlowCharttabUnsch());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Unscheduled)");
    }

    public void clickprocessFlowChartSched() {
        clickUsingJavaScript(getProcessFlowCharttabSched());
        String tabTxt = elementGetText(getProcessFlowCharttabSched());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Schedule)");
    }
}
