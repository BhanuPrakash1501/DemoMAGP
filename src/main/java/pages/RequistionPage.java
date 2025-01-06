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

    public WebElement getPurchaseRequistionViewMoreBtn() {
        return purchaseRequistionViewMoreBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getProcessingofPurchaseRequisitionViewMoreBtn() {
        return ProcessingofPurchaseRequisitionViewMoreBtn;
    }

    @FindBy(xpath = "//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a")
    private WebElement ProcessingofPurchaseRequisitionViewMoreBtn;

    public void clickPurchaseRequisition(){
        scrollToElement(getPurchaseRequistionViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='2.1 Purchase Requisition']/following-sibling::a"));
        clickUsingJavaScript(getPurchaseRequistionViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickProcessingofPurchaseRequisition(){
        scrollToElement(getProcessingofPurchaseRequisitionViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='2.2 Processing of Purchase Requisition']/following-sibling::a"));
        clickUsingJavaScript(getProcessingofPurchaseRequisitionViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }
}


