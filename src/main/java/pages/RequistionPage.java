package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RequistionPage extends BaseClass {

    private WebDriver _driver;

    public RequistionPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='2.1 Purchase Requisition']/following-sibling::a")
    private WebElement purchaseRequistionViewMoreBtn;

    @FindBy(xpath = "//h6[text()='Overview']")
    private WebElement Overviewtabname;

    @FindBy(xpath = "//h6[text()='Policies']")
    private WebElement Policiestabname;

    @FindBy(xpath = "//h6[text()='Process Flow Chart']")
    private WebElement processFlowChartabname;

    public WebElement getPurchaseRequistionViewMoreBtn() {
        return purchaseRequistionViewMoreBtn;
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

    public WebElement getProcessingofPurchaseRequisitionViewMoreBtn() {
        return ProcessingofPurchaseRequisitionViewMoreBtn;
    }

    @FindBy(xpath = "//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a")
    private WebElement ProcessingofPurchaseRequisitionViewMoreBtn;

    public void clickPurchaseRequisition() {
        scrollToElement(getPurchaseRequistionViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='2.1 Purchase Requisition']/following-sibling::a"));
        clickUsingJavaScript(getPurchaseRequistionViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickPurchaseRequisitionpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickPurchaseRequisitionprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");
    }

    public void clickProcessingofPurchaseRequisition() {
        scrollToElement(getProcessingofPurchaseRequisitionViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a"));
        clickUsingJavaScript(getProcessingofPurchaseRequisitionViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");
    }

    public void clickProcessingofPurchaseRequisitionpolicies() {
        clickUsingJavaScript(getPoliciestabname());
        String tabTxt = elementGetText(getPoliciestabname());
        Assert.assertEquals(tabTxt, "Policies");
    }

    public void clickProcessingofPurchaseRequisitionprocessFlowChart() {
        clickUsingJavaScript(getProcessFlowChartabname());
        String tabTxt = elementGetText(getProcessFlowChartabname());
        Assert.assertEquals(tabTxt, "Process Flow Chart");

    }


}

