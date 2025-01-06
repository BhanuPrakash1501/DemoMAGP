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
    @FindBy(xpath = "//h2[text()='3.2 Tender Administration']/following-sibling::a")
    private WebElement tenderAdministrationViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.1 Tender Management']/following-sibling::a")
    private WebElement TenderManagementViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.3 Tender Evaluation']/following-sibling::a")
    private WebElement TenderEvaluationViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.4 Abort of Tender']/following-sibling::a")
    private WebElement  AbortofTenderViewMoreBtn;

    @FindBy(xpath = "//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a")
    private WebElement  ClarificationNegotiationpriortoAwardViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    public WebElement getTenderAdministrationViewMoreBtn() {
        return tenderAdministrationViewMoreBtn;
    }

    public WebElement getTenderManagementViewMoreBtn() {
        return TenderManagementViewMoreBtn;
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

    public void clickTenderManagement(){
        scrollToElement(getTenderManagementViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.1 Tender Management']/following-sibling::a"));
        clickUsingJavaScript(getTenderManagementViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickTenderAdministration(){
        scrollToElement(getTenderAdministrationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.2 Tender Administration']/following-sibling::a"));
        clickUsingJavaScript(getTenderAdministrationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickTenderEvaluation(){
        scrollToElement(getTenderEvaluationViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.3 Tender Evaluation']/following-sibling::a"));
        clickUsingJavaScript(getTenderEvaluationViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickAbortofTender(){
        scrollToElement(getAbortofTenderViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.4 Abort of Tender']/following-sibling::a"));
        clickUsingJavaScript(getAbortofTenderViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickClarificationNegotiationpriortoAward(){
        scrollToElement(getClarificationNegotiationpriortoAwardViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='3.5 Clarification / Negotiation prior to Award']/following-sibling::a"));
        clickUsingJavaScript(getClarificationNegotiationpriortoAwardViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }
}
