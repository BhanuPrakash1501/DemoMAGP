package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProcurementPlanningPage extends BaseClass {

    private WebDriver _driver;

    public ProcurementPlanningPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='1.1 Business Case']/following-sibling::a")
    private WebElement businesscaseViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowCharttabname;

    public WebElement getAnnualProcurementPlanningViewMoreBtn() {
        return AnnualProcurementPlanningViewMoreBtn;
    }

    public WebElement getBusinesscaseViewMoreBtn() {
        return businesscaseViewMoreBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getpoliciestabname() {
        return Policiestabname;
    }

    public WebElement getprocessFlowCharttabname() {
        return processFlowCharttabname;
    }

    public WebElement getStrategyPaperViewMoreBtn() {
        return StrategyPaperViewMoreBtn;
    }

    @FindBy(xpath = "//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a")
    private WebElement AnnualProcurementPlanningViewMoreBtn;

    @FindBy(xpath = "//h2[text()='1.3 Strategy Paper']/following-sibling::a")
    private WebElement StrategyPaperViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Process Flow Chart (Direct Appointment)']")
    private WebElement processFlowChartDAtabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart (Open Tender / Invitation To Bid)']")
    private WebElement processFlowChartOTtabname;

    public WebElement getProcessFlowChartDAtabname() {
        return processFlowChartDAtabname;
    }

    public WebElement getProcessFlowChartOTtabname() {
        return processFlowChartOTtabname;
    }

    public void clickbusinessCase() {
        scrollToElement(getBusinesscaseViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.1 Business Case']/following-sibling::a"));
        clickUsingJavaScript(getBusinesscaseViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickbusinessCasepolicies() {
        clickUsingJavaScript(getpoliciestabname());
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickbusinessCaseprocessFlowChart() {
        clickUsingJavaScript(getprocessFlowCharttabname());
        String tabTxt = elementGetText(getprocessFlowCharttabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickAnnualProcurementplanning() {
        scrollToElement(getAnnualProcurementPlanningViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a"));
        clickUsingJavaScript(getAnnualProcurementPlanningViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickAnnualProcurementpolicies() {
        clickUsingJavaScript(getpoliciestabname());
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickAnnualProcurementProcessFlowChart() {
        clickUsingJavaScript(getprocessFlowCharttabname());
        String tabTxt = elementGetText(getprocessFlowCharttabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickStrategypaper() {
        scrollToElement(getStrategyPaperViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.3 Strategy Paper']/following-sibling::a"));
        clickUsingJavaScript(getStrategyPaperViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickStrategypaperpolicies() {
        clickUsingJavaScript(getpoliciestabname());
        String tabTxt = elementGetText(getpoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickStrategypaperProcessFlowChartDA() {
        clickUsingJavaScript(getProcessFlowChartDAtabname());
        String tabTxt = elementGetText(getProcessFlowChartDAtabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Direct Appointment)");
    }

    public void clickStrategypaperProcessFlowChartOT() {
        clickUsingJavaScript(getProcessFlowChartOTtabname());
        String tabTxt = elementGetText(getProcessFlowChartOTtabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart (Open Tender / Invitation To Bid)");
    }
}