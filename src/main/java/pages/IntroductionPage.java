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

    @FindBy(xpath = "//h3[@class='banner-title mb-5']")
    private WebElement introbannertxt;

    @FindBy(xpath = "//h2[text()='Preface']")
    private WebElement prefacetxt;

    public WebElement getPrefacetabname() {
        return prefacetabname;
    }

    @FindBy(xpath = "//h6[text()='Preface']")
    private WebElement prefacetabname;

    @FindBy(xpath = "//h2[text()='Procurement Codes of ethics']")
    private WebElement procurementCodesofethicstxt;

    public WebElement getProcCodesofEthicsTab() {
        return procCodesofEthicsTab;
    }

    @FindBy(xpath = "//h2[text()='General Provision']")
    private WebElement generalProvisiontxt;

    @FindBy(xpath = "//h2[text()='Preface']/following-sibling::a")
    private WebElement prefaceViewMorebtn;

    @FindBy(xpath = "(//h3[text()='Introduction'])[1]")
    private WebElement introductionTxt;

    @FindBy(xpath = "//h2[text()='Procurement Codes of ethics']/following-sibling::a")
    private WebElement procurementCodesofethicsviewMorebtn;

    @FindBy(xpath = "//h2[text()='General Provision']/following-sibling::a")
    private WebElement generalProvisionviewMorebtn;

    @FindBy(xpath = "//h6[text()='General Provision']")
    private WebElement generalProvisionTab;

    @FindBy(xpath = "//h2[text()='Terms and Definitions']/following-sibling::a")
    private WebElement termsandDefinitionsviewMorebtn;

    public WebElement getTermsandDefinitionsTab() {
        return termsandDefinitionsTab;
    }

    public WebElement getGeneralProvisionTab() {
        return generalProvisionTab;
    }

    public WebElement getProcessesSymbolsaTab() {
        return processesSymbolsaTab;
    }

    public WebElement getProcurementValueChainTab() {
        return procurementValueChainTab;
    }

    @FindBy(xpath = "//h6[text()='Terms and Definitions']")
    private WebElement termsandDefinitionsTab;

    @FindBy(xpath = "//h2[text()='Processes Symbols']/following-sibling::a")
    private WebElement processesSymbolsviewMorebtn;

    @FindBy(xpath = "//h6[text()='Processes Symbols']")
    private WebElement processesSymbolsaTab;

    @FindBy(xpath = "//h2[contains(.,\"MAHB's Procurement Value Chain\")]/following-sibling::a")
    private WebElement procurementValueChainviewMorebtn;

    @FindBy(xpath = "//h6[text()=\"MAHB's Procurement Value Chain\"]")
    private WebElement procurementValueChainTab;

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

    @FindBy(xpath = "//span[text()='Mark as Favourite']")
    private WebElement favBtn;

    @FindBy(xpath = "//h6[text()='Procurement Codes of ethics']")
    private WebElement procCodesofEthicsTab;

    public WebElement getFavBtn() {
        return favBtn;
    }

    public WebElement getGeneralProvisiontxt() {
        return generalProvisiontxt;
    }

    public WebElement getProcurementCodesofethicstxt() {
        return procurementCodesofethicstxt;
    }

    public WebElement getPrefacetxt() {
        return prefacetxt;
    }

    public WebElement getIntroductionTxt() {
        return introductionTxt;
    }

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
        waitForVisibility(By.xpath("//h2[text()='Preface']/following-sibling::a"));
        clickUsingJavaScript(getPrefaceViewMorebtn());
        scrollToElementAndWait(getPrefacetabname());
        String prefacetabTxt = elementGetText(getPrefacetabname());
        Assert.assertEquals(prefacetabTxt, "Preface");

    }

    public void clickProcurementCodesofethics() {

        scrollToElement(getProcurementCodesofethicsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Procurement Codes of ethics']/following-sibling::a"));
        clickUsingJavaScript(getProcurementCodesofethicsviewMorebtn());
        scrollToElementAndWait(getProcCodesofEthicsTab());
        String tabTxt = elementGetText(getProcCodesofEthicsTab());
        Assert.assertEquals(tabTxt, "Procurement Codes of ethics");

    }

    public void clickGeneralProvisions() {
        scrollToElement(getGeneralProvisionviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='General Provision']/following-sibling::a"));
        clickUsingJavaScript(getGeneralProvisionviewMorebtn());
        scrollToElementAndWait(getGeneralProvisionTab());
        String tabTxt = elementGetText(getGeneralProvisionTab());
        Assert.assertEquals(tabTxt, "General Provision");

    }

    public void clickTermsAndDefinations() {
        scrollToElement(getTermsandDefinitionsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Terms and Definitions']/following-sibling::a"));
        clickUsingJavaScript(getTermsandDefinitionsviewMorebtn());
        scrollToElementAndWait(getTermsandDefinitionsTab());
        String tabTxt = elementGetText(getTermsandDefinitionsTab());
        Assert.assertEquals(tabTxt, "Terms and Definitions");

    }

    public void clickProcessSymbols() {
        scrollToElement(getProcessesSymbolsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Processes Symbols']/following-sibling::a"));
        clickUsingJavaScript(getProcessesSymbolsviewMorebtn());
        scrollToElementAndWait(getProcessesSymbolsaTab());
        String tabTxt = elementGetText(getProcessesSymbolsaTab());
        Assert.assertEquals(tabTxt, "Processes Symbols");

    }

    public void clickvalueChain() {
        scrollToElement(getProcurementValueChainviewMorebtn());
        waitForVisibility(By.xpath("//h2[contains(.,\"MAHB's Procurement Value Chain\")]/following-sibling::a"));
        clickUsingJavaScript(getProcurementValueChainviewMorebtn());
        scrollToElementAndWait(getProcurementValueChainTab());
        String tabTxt = elementGetText(getProcurementValueChainTab());
        Assert.assertEquals(tabTxt, "MAHB's Procurement Value Chain");

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
        Assert.assertEquals(weWillNotifyYouTxt, "We will notify you as soon as this feature becomes available. Thank you for your patience!");

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

    public WebElement getIntrobannertxt() {
        return introbannertxt;
    }

    public void clickBackArrow() {
        scrollPageToDown();
        clickUsingJavaScript(getBackArrowBtn());
    }

    public void verifyIntroductionTxt() {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(60));
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='banner-title mb-5']")));
        String bnnrIntrotxt = elementGetText(getIntrobannertxt());
        Assert.assertEquals(bnnrIntrotxt, "Introduction");

    }

    public void verifyPrefaceTxt() {
        scrollToElement(getPrefacetxt());
        String prefaceIntrotxt = elementGetText(getPrefacetxt());
        Assert.assertEquals(prefaceIntrotxt, "Preface");
    }

    public void verifyProcurementCodesofethicstxt() {
        scrollToElement(getProcurementCodesofethicstxt());
        String proCodeOfEthicsIntrotxt = elementGetText(getProcurementCodesofethicstxt());
        Assert.assertEquals(proCodeOfEthicsIntrotxt, "Procurement Codes of ethics");
    }

    public void verifyGeneralProvisiontxt() {
        scrollToElement(getGeneralProvisiontxt());
        String GeneralProvisiontxtIntrotxt = elementGetText(getGeneralProvisiontxt());
        Assert.assertEquals(GeneralProvisiontxtIntrotxt, "General Provision");
    }

    public void verifyWantToViewMoretxt() {
        scrollToElement(getWantToViewMoreTxt());
        String wantToViewMoreIntrotxt = elementGetText(getWantToViewMoreTxt());
        Assert.assertEquals(wantToViewMoreIntrotxt, "Want to view more?");
    }

    public void verifyWantToViewMoreDesctxt() {
        scrollToElement(getWantToViewMoreContentTxt());
        String wantToViewMoreDescIntrotxt = elementGetText(getWantToViewMoreContentTxt());
        Assert.assertEquals(wantToViewMoreDescIntrotxt, "If you want to view more content please Purchase Login ID");
    }

    public void verifyPurchasedIdTxt() {
        scrollToElement(getPurchaseLoginIDBtn());
        String purchasedIdTxt = elementGetText(getPurchaseLoginIDBtn());
        Assert.assertEquals(purchasedIdTxt, "Purchase Login ID");
    }

    public void clickBtnPurchasedLoginID() {
        scrollToElement(getPurchaseLoginIDBtn());
        waitForVisibility(By.xpath("//a[text()='Purchase Login ID']"));
        clickUsingJavaScript(getPurchaseLoginIDBtn());
    }


}
