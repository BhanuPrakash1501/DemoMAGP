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

    public WebElement getAnnualProcurementPlanningViewMoreBtn() {
        return AnnualProcurementPlanningViewMoreBtn;
    }

    public WebElement getBusinesscaseViewMoreBtn() {
        return businesscaseViewMoreBtn;
    }

    public WebElement getOverviewtabname() {
        return Overviewtabname;
    }

    public WebElement getStrategyPaperViewMoreBtn() {
        return StrategyPaperViewMoreBtn;
    }

    @FindBy(xpath = "//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a")
    private WebElement AnnualProcurementPlanningViewMoreBtn;

    @FindBy(xpath = "//h2[text()='1.3 Strategy Paper']/following-sibling::a")
    private WebElement StrategyPaperViewMoreBtn;

    public void clickbusinessCase(){
        scrollToElement(getBusinesscaseViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.1 Business Case']/following-sibling::a"));
        clickUsingJavaScript(getBusinesscaseViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickAnnualProcurementplanning(){
        scrollToElement(getAnnualProcurementPlanningViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.2 Annual Procurement Planning']/following-sibling::a"));
        clickUsingJavaScript(getAnnualProcurementPlanningViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }

    public void clickStrategypaper(){
        scrollToElement(getStrategyPaperViewMoreBtn());
        waitForVisibility(By.xpath("//h2[text()='1.3 Strategy Paper']/following-sibling::a"));
        clickUsingJavaScript(getStrategyPaperViewMoreBtn());
        scrollToElementAndWait(getOverviewtabname());
        String tabTxt = elementGetText(getOverviewtabname());
        Assert.assertEquals(tabTxt, "Overview");

    }


}
