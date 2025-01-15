package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SourcingPage extends BaseClass {

    private WebDriver _driver;

    public SourcingPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='3.1 Tender Management']/following-sibling::a")
    private WebElement TenderManagementViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    @FindBy(xpath = "//h2[text()='3.2 Tender Administration']/following-sibling::a")
    private WebElement tenderAdministrationViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Process Flow Chart - above RM50,000.00']")
    private WebElement processFlowChartabABRMname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart - below RM50,000.00']")
    private WebElement processFlowChartabBERMname;

    @FindBy(xpath = "//h2[text()='3.3 Tender Evaluation']/following-sibling::a")
    private WebElement TenderEvaluationViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.4 Abort of Tender']/following-sibling::a")
    private WebElement  AbortofTenderViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a")
    private WebElement  ClarificationNegotiationpriortoAwardViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart Negotiation']")
    private WebElement processFlowChartabNego;

    @FindBy(xpath = "//h6[text()='Process Flow Chart Clarification Prior to Award']")
    private WebElement processFlowChartabCPA;

    public WebElement getTenderManagementViewMoreBtn() {
        return TenderManagementViewMoreBtn;
    }

    public WebElement getPoliciestabname() {
        return Policiestabname;
    }

    public WebElement getProcessFlowChartabname() {
        return processFlowChartabname;
    }

    public WebElement getTenderAdministrationViewMoreBtn() {
        return tenderAdministrationViewMoreBtn;
    }

    public WebElement getProcessFlowChartabABRMname() {
        return processFlowChartabABRMname;
    }

    public WebElement getProcessFlowChartabBERMname() {
        return processFlowChartabBERMname;
    }

    public WebElement getTenderEvaluationViewMoreBtn() {
        return TenderEvaluationViewMoreBtn;
    }

    public WebElement getAbortofTenderViewMoreBtn() {
        return AbortofTenderViewMoreBtn;
    }

    public WebElement getClarificationNegotiationpriortoAwardViewMoreBtn() {
        return ClarificationNegotiationpriortoAwardViewMoreBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getProcessFlowChartabCPA() {
        return processFlowChartabCPA;
    }

    public WebElement getProcessFlowChartabNego() {
        return processFlowChartabNego;
    }

    public void clickTenderManagement(){
        scrollToElement(getTenderManagementViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.1 Tender Management']/following-sibling::a"));
        clickUsingJavaScript(getTenderManagementViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickTenderManagementpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickTenderManagementprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickTenderAdministration(){
        scrollToElement(getTenderAdministrationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.2 Tender Administration']/following-sibling::a"));
        clickUsingJavaScript(getTenderAdministrationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickTenderAdministrationpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickTenderAdministrationprocessFlowChartABRM() {
        clickUsingJavaScript(getProcessFlowChartabABRMname());
        String tabTxt = elementGetText(getProcessFlowChartabABRMname());
        Assert.assertEquals(tabTxt, "Process Flow Chart - above RM50,000.00");
    }

    public void clickTenderAdministrationprocessFlowChartBERM() {
        clickUsingJavaScript(getProcessFlowChartabBERMname());
        String tabTxt = elementGetText(getProcessFlowChartabBERMname());
        Assert.assertEquals(tabTxt, "Process Flow Chart - below RM50,000.00");
    }

    public void clickTenderEvaluation(){
        scrollToElement(getTenderEvaluationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.3 Tender Evaluation']/following-sibling::a"));
        clickUsingJavaScript(getTenderEvaluationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickTenderEvaluationpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickTenderEvaluationprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickAbortofTender(){
        scrollToElement(getAbortofTenderViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.4 Abort of Tender']/following-sibling::a"));
        clickUsingJavaScript(getAbortofTenderViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickAbortofTenderpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickAbortofTenderprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickClarificationNegotiationpriortoAward(){
        scrollToElement(getClarificationNegotiationpriortoAwardViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a"));
        clickUsingJavaScript(getClarificationNegotiationpriortoAwardViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickClarificationNegotiationpriortoAwardpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickClarificationNegotiationpriortoAwardprocessFlowChartabNego() {
        clickUsingJavaScript(getProcessFlowChartabNego());
        String tabTxt = elementGetText(getProcessFlowChartabNego());
        Assert.assertEquals(tabTxt, "Process Flow Chart Negotiation");
    }

    public void clickClarificationNegotiationpriortoAwardprocessFlowChartabCPA() {
        clickUsingJavaScript(getProcessFlowChartabCPA());
        String tabTxt = elementGetText(getProcessFlowChartabCPA());
        Assert.assertEquals(tabTxt, "Process Flow Chart Clarification Prior to Award");
    }
}
