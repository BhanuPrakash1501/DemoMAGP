package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class IntroductionPage extends BaseClass {
    private WebDriver _driver;

    public IntroductionPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Preface']/following-sibling::a")
    private WebElement prefaceViewMorebtn;

    public WebElement getIntroductionTxt() {
        return introductionTxt;
    }

    @FindBy(xpath = "(//h3[text()='Introduction'])[1]")
    private WebElement introductionTxt;

    @FindBy(xpath = "//h2[text()='Procurement Codes of ethics']/following-sibling::a")
    private WebElement procurementCodesofethicsviewMorebtn;

    @FindBy(xpath = "//h2[text()='General Provision']/following-sibling::a")
    private WebElement generalProvisionviewMorebtn;

    @FindBy(xpath = "//h2[text()='Terms and Definitions']/following-sibling::a")
    private WebElement termsandDefinitionsviewMorebtn;

    @FindBy(xpath = "//h2[text()='Processes Symbols']/following-sibling::a")
    private WebElement processesSymbolsviewMorebtn;

    @FindBy(xpath = "//h2[text()=\"MAHB's Procurement Value Chain\"]/following-sibling::a")
    private WebElement procurementValueChainviewMorebtn;

    @FindBy(xpath = "//h5[text()='Want to view more?']")
    private WebElement wantToViewMoreTxt;

    @FindBy(xpath = "//p[text()='If you want to view more content please Purchase Login ID']")
    private WebElement wantToViewMoreContentTxt;

    @FindBy(xpath = "//a[text()='Purchase Login ID']")
    private WebElement purchaseLoginIDBtn;

    @FindBy(xpath = "//b[text()='Coming Soon']")
    private WebElement comingSoonTxt;

    @FindBy(xpath = "//p[text()='We will notify you as soon as this feature becomes available. Thank you for your patience!']")
    private WebElement weWillNotifyYouTxt;

    @FindBy(xpath = "//a[.='Back to Homepage']")
    private WebElement backToHomePageBtn;

    @FindBy(xpath = "//b[text()='Login ID Purchase']")
    private WebElement loginIdPurchasetxt;

    @FindBy(xpath = "//img[@class='icon-lg me-3']")
    private WebElement backArrowBtn;

    public WebElement getWantToViewMoreTxt() {
        return wantToViewMoreTxt;
    }

    public WebElement getWantToViewMoreContentTxt() {
        return wantToViewMoreContentTxt;
    }

    public WebElement getPurchaseLoginIDBtn() {
        return purchaseLoginIDBtn;
    }

    public WebElement getComingSoonTxt() {
        return comingSoonTxt;
    }

    public WebElement getWeWillNotifyYouTxt() {
        return weWillNotifyYouTxt;
    }

    public WebElement getBackToHomePageBtn() {
        return backToHomePageBtn;
    }

    public WebElement getLoginIdPurchasetxt() {
        return loginIdPurchasetxt;
    }

    public WebElement getBackArrowBtn() {
        return backArrowBtn;
    }

    public WebElement getPrefaceViewMorebtn() {
        return prefaceViewMorebtn;
    }

    public WebElement getProcurementCodesofethicsviewMorebtn() {
        return procurementCodesofethicsviewMorebtn;
    }

    public WebElement getGeneralProvisionviewMorebtn() {
        return generalProvisionviewMorebtn;
    }

    public WebElement getTermsandDefinitionsviewMorebtn() {
        return termsandDefinitionsviewMorebtn;
    }

    public WebElement getProcessesSymbolsviewMorebtn() {
        return processesSymbolsviewMorebtn;
    }

    public WebElement getProcurementValueChainviewMorebtn() {
        return procurementValueChainviewMorebtn;
    }

    public void clickPreface() {
        scrollToElement(getPrefaceViewMorebtn());
        clickUsingJavaScript(getPrefaceViewMorebtn());

    }

    public void clickProcurementCodesofethics() {

        scrollToElement(getProcurementCodesofethicsviewMorebtn());
        clickUsingJavaScript(getProcurementCodesofethicsviewMorebtn());

    }

    public void clickGeneralProvisions() {

        scrollToElement(getGeneralProvisionviewMorebtn());
        clickUsingJavaScript(getGeneralProvisionviewMorebtn());
    }

    public void verifyWantToViewMoreTxt() {
        scrollToElement(getPurchaseLoginIDBtn());
        String wantToTxt = getWantToViewMoreTxt().getText();
        Assert.assertEquals(wantToTxt, "Want to view more?");

    }

    public void verifyWantToViewMoreContentTxt() {
        String wantToViewMoreContentTxt = getWantToViewMoreContentTxt().getText();
        Assert.assertEquals(wantToViewMoreContentTxt, "If you want to view more content please Purchase Login ID");

    }

    public void clickPurchaseID() {
        clickUsingJavaScript(getPurchaseLoginIDBtn());

    }

    public void verifyComingSoonTxt() {
        String comingSoonTxt = getComingSoonTxt().getText();
        Assert.assertEquals(comingSoonTxt, "Coming Soon");

    }

    public void verifyloginPurchaseIDTxt() {
        String loginPurchaseIDTxt = getLoginIdPurchasetxt().getText();
        Assert.assertEquals(loginPurchaseIDTxt, "Login ID Purchase");

    }

    public void verifyWeWillNotifyYouTxt() {
        String weWillNotifyYouTxt = getWeWillNotifyYouTxt().getText();
        Assert.assertEquals(weWillNotifyYouTxt,
                "We will notify you as soon as this feature becomes available. Thank you for your patience!");

    }

    public void clickBackToHomePage() {
        WebElement ele = _driver.findElement(By.cssSelector(".btn-primary"));
        while (!ele.isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) _driver;
//			js.executeScript("arguments[0].scrollIntoView()", ele);
            js.executeScript("window.scrollBy(0,400)");
        }
        ele.click();
    }

    public void clickBackArrow() {
        scrollPageToDown();
        clickUsingJavaScript(getBackArrowBtn());
    }

    public void verifyIntroductionTxt() {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(60));
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='banner-title mb-5']")));
        System.out.println(status.isDisplayed());
//        String introTxt = elementGetText(getIntroductionTxt());
//        Assert.assertEquals(introTxt, "Introduction");
    }
}
