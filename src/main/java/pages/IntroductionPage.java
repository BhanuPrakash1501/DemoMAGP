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
    // Private WebDriver instance for interacting with the browser
    private WebDriver _driver;

    /**
     * Constructor for the IntroductionPage class.
     * Initializes the WebDriver and sets up the PageFactory for locating elements.
     *
     * @param driver The WebDriver instance used for browser interactions.
     */
    public IntroductionPage(WebDriver driver) {
        super(driver);  // Calls the parent class constructor
        this._driver = driver;  // Assigns the driver to the class variable
        PageFactory.initElements(driver, this);  // Initializes web elements using PageFactory
    }

// WebElement locators using @FindBy annotation for better readability and maintainability

    /**
     * WebElement representing the introduction banner text.
     * Located using the XPath for the banner title.
     */
    @FindBy(xpath = "//h3[@class='banner-title mb-5']")
    private WebElement introbannertxt;

    /**
     * WebElement representing the login button.
     * Located using the XPath that matches a button with text 'Login'.
     */
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtntxt;

    /**
     * WebElement representing the message prompting users to log in for more content.
     * Located using XPath that finds the first occurrence of the specific message.
     */
    @FindBy(xpath = "(//p[text()='If you want to view more content please login'])[1]")
    private WebElement wantToViewMoreLogintxt;

    /**
     * Returns the WebElement representing the description text of the Preface section.
     *
     * @return WebElement for Preface description text.
     */
    public WebElement getPrefaceDesctxt() {
        return prefaceDesctxt;
    }

    /**
     * WebElement representing the description text within the Preface section.
     * Located using XPath that searches for text containing '3rd Edition,'.
     */
    @FindBy(xpath = "//p[contains(.,'3rd Edition,')]")
    private WebElement prefaceDesctxt;

    /**
     * Returns the WebElement representing the "Want to View More?" login prompt text.
     *
     * @return WebElement for the login prompt text.
     */
    public WebElement getWantToViewMoreLogintxt() {
        return wantToViewMoreLogintxt;
    }

    /**
     * Returns the WebElement representing the Login button.
     *
     * @return WebElement for the login button.
     */
    public WebElement getLoginBtntxt() {
        return loginBtntxt;
    }

    /**
     * WebElement representing the Preface section header.
     * Located using XPath that matches the text 'Preface'.
     */
    @FindBy(xpath = "//h2[text()='Preface']")
    private WebElement prefacetxt;

    /**
     * Returns the WebElement representing the Preface tab name.
     *
     * @return WebElement for the Preface tab.
     */
    public WebElement getPrefacetabname() {
        return prefacetabname;
    }

    /**
     * WebElement representing the tab label for the Preface section.
     * Located using XPath that matches 'Preface' in an <h6> tag.
     */
    @FindBy(xpath = "//h6[text()='Preface']")
    private WebElement prefacetabname;

    /**
     * WebElement representing the Procurement Codes of Ethics section header.
     * Located using XPath that matches 'Procurement Codes of ethics'.
     */
    @FindBy(xpath = "//h2[text()='Procurement Codes of ethics']")
    private WebElement procurementCodesofethicstxt;

    /**
     * Returns the WebElement representing the tab label for Procurement Codes of Ethics.
     *
     * @return WebElement for the Procurement Codes of Ethics tab.
     */
    public WebElement getProcCodesofEthicsTab() {
        return procCodesofEthicsTab;
    }

    /**
     * WebElement representing the General Provision section header.
     * Located using XPath that matches 'General Provision'.
     */
    @FindBy(xpath = "//h2[text()='General Provision']")
    private WebElement generalProvisiontxt;

    /**
     * WebElement representing the "View More" button for the Preface section.
     * This button allows users to navigate to the Preface details.
     */
    @FindBy(xpath = "//h2[text()='Preface']/following-sibling::a")
    private WebElement prefaceViewMorebtn;

    /**
     * WebElement representing the Introduction section title.
     * This element identifies the heading "Introduction" on the page.
     */
    @FindBy(xpath = "(//h3[text()='Introduction'])[1]")
    private WebElement introductionTxt;

    /**
     * WebElement representing the "View More" button for the Procurement Codes of Ethics section.
     * Clicking this button expands the Procurement Codes of Ethics details.
     */
    @FindBy(xpath = "//h2[text()='Procurement Codes of ethics']/following-sibling::a")
    private WebElement procurementCodesofethicsviewMorebtn;

    /**
     * WebElement representing the "View More" button for the General Provision section.
     * Clicking this button expands the General Provision details.
     */
    @FindBy(xpath = "//h2[text()='General Provision']/following-sibling::a")
    private WebElement generalProvisionviewMorebtn;

    /**
     * WebElement representing the General Provision tab.
     * This element is used to verify navigation to the General Provision section.
     */
    @FindBy(xpath = "//h6[text()='General Provision']")
    private WebElement generalProvisionTab;

    /**
     * WebElement representing the "View More" button for the Terms and Definitions section.
     * Clicking this button expands the Terms and Definitions details.
     */
    @FindBy(xpath = "//h2[text()='Terms and Definitions']/following-sibling::a")
    private WebElement termsandDefinitionsviewMorebtn;

    /**
     * WebElement representing the tab for the Terms and Definitions section.
     * This element is used to verify that the user has navigated to the Terms and Definitions section.
     */
    @FindBy(xpath = "//h6[text()='Terms and Definitions']")
    private WebElement termsandDefinitionsTab;

    /**
     * WebElement representing the "View More" button for the Processes Symbols section.
     * Clicking this button expands the Processes Symbols details.
     */
    @FindBy(xpath = "//h2[text()='Processes Symbols']/following-sibling::a")
    private WebElement processesSymbolsviewMorebtn;

    /**
     * WebElement representing the tab for the Processes Symbols section.
     * This element is used to verify that the user has navigated to the Processes Symbols section.
     */
    @FindBy(xpath = "//h6[text()='Processes Symbols']")
    private WebElement processesSymbolsaTab;

    /**
     * WebElement representing the "View More" button for MAHB's Procurement Value Chain section.
     * Clicking this button expands the Procurement Value Chain details.
     */
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

    public WebElement getIntroductionTabLink() {
        return introductionTabLink;
    }

    @FindBy(xpath = "//span[text()='introduction']")
    private WebElement introductionTabLink;

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

    /**
     * Clicks on the "Preface" section.
     * - Scrolls to the "Preface" button to ensure visibility.
     * - Waits until the "Preface" button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the "Preface" tab and verifies its text.
     */
    public void clickPreface() {
        scrollToElement(getPrefaceViewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Preface']/following-sibling::a"));
        clickUsingJavaScript(getPrefaceViewMorebtn());
        scrollToElementAndWait(getIntroductionTabLink());
        String prefacetabTxt = elementGetText(getPrefacetabname());
        Assert.assertEquals(prefacetabTxt, "Preface");
    }

    /**
     * Clicks on the "Procurement Codes of Ethics" section.
     * - Scrolls to the button to ensure visibility.
     * - Waits until the button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the tab and verifies its text.
     */
    public void clickProcurementCodesofethics() {
        scrollToElement(getProcurementCodesofethicsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Procurement Codes of ethics']/following-sibling::a"));
        clickUsingJavaScript(getProcurementCodesofethicsviewMorebtn());
        scrollToElementAndWait(getProcCodesofEthicsTab());
        String tabTxt = elementGetText(getProcCodesofEthicsTab());
        Assert.assertEquals(tabTxt, "Procurement Codes of ethics");
    }

    /**
     * Clicks on the "General Provisions" section.
     * - Scrolls to the button to ensure visibility.
     * - Waits until the button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the tab and verifies its text.
     */
    public void clickGeneralProvisions() {
        scrollToElement(getGeneralProvisionviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='General Provision']/following-sibling::a"));
        clickUsingJavaScript(getGeneralProvisionviewMorebtn());
        scrollToElementAndWait(getGeneralProvisionTab());
        String tabTxt = elementGetText(getGeneralProvisionTab());
        Assert.assertEquals(tabTxt, "General Provision");
    }

    /**
     * Clicks on the "Terms and Definitions" section.
     * - Scrolls to the button to ensure visibility.
     * - Waits until the button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the tab and verifies its text.
     */
    public void clickTermsAndDefinations() {
        scrollToElement(getTermsandDefinitionsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Terms and Definitions']/following-sibling::a"));
        clickUsingJavaScript(getTermsandDefinitionsviewMorebtn());
        scrollToElementAndWait(getTermsandDefinitionsTab());
        String tabTxt = elementGetText(getTermsandDefinitionsTab());
        Assert.assertEquals(tabTxt, "Terms and Definitions");
    }

    /**
     * Clicks on the "Process Symbols" section.
     * - Scrolls to the button to ensure visibility.
     * - Waits until the button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the tab and verifies its text.
     */
    public void clickProcessSymbols() {
        scrollToElement(getProcessesSymbolsviewMorebtn());
        waitForVisibility(By.xpath("//h2[text()='Processes Symbols']/following-sibling::a"));
        clickUsingJavaScript(getProcessesSymbolsviewMorebtn());
        scrollToElementAndWait(getProcessesSymbolsaTab());
        String tabTxt = elementGetText(getProcessesSymbolsaTab());
        Assert.assertEquals(tabTxt, "Processes Symbols");
    }

    /**
     * Clicks on the "Procurement Value Chain" section.
     * - Scrolls to the button to ensure visibility.
     * - Waits until the button is visible.
     * - Clicks the button using JavaScript.
     * - Scrolls to the tab and verifies its text.
     */
    public void clickvalueChain() {
        scrollToElement(getProcurementValueChainviewMorebtn());
        waitForVisibility(By.xpath("//h2[contains(.,\"MAHB's Procurement Value Chain\")]/following-sibling::a"));
        clickUsingJavaScript(getProcurementValueChainviewMorebtn());
        scrollToElementAndWait(getProcurementValueChainTab());
        String tabTxt = elementGetText(getProcurementValueChainTab());
        Assert.assertEquals(tabTxt, "MAHB's Procurement Value Chain");
    }

    /**
     * Verifies the "Coming Soon" text is displayed correctly.
     */
    public void verifyComingSoonTxt() {
        String comingSoonTxt = getComingSoonTxt().getText();
        Assert.assertEquals(comingSoonTxt, "Coming Soon");
    }

    /**
     * Verifies the "Login Purchase ID" text is displayed correctly.
     */
    public void verifyloginPurchaseIDTxt() {
        String loginPurchaseIDTxt = getLoginIdPurchasetxt().getText();
        Assert.assertEquals(loginPurchaseIDTxt, "Login ID Purchase");
    }

    /**
     * Verifies the "We will notify you" text is displayed correctly.
     */
    public void verifyWeWillNotifyYouTxt() {
        String weWillNotifyYouTxt = getWeWillNotifyYouTxt().getText();
        Assert.assertEquals(weWillNotifyYouTxt,
                "We will notify you as soon as this feature becomes available. Thank you for your patience!");
    }

    /**
     * Clicks the "Back to Home Page" button.
     * - Scrolls down the page until the button is visible.
     * - Clicks the button.
     */
    public void clickBackToHomePage() {
        WebElement ele = _driver.findElement(By.cssSelector(".btn-primary"));
        while (!ele.isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) _driver;
            js.executeScript("window.scrollBy(0,400)");
        }
        ele.click();
    }

    /**
     * Clicks the back arrow button.
     */
    public void clickBackArrow() {
        scrollPageToDown();
        clickUsingJavaScript(getBackArrowBtn());
    }

    /**
     * Verifies the "Introduction" banner text.
     */
    public void verifyIntroductionTxt() {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(60));
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[@class='banner-title mb-5']")));
        String bnnrIntrotxt = elementGetText(getIntroductionTxt());
        Assert.assertEquals(bnnrIntrotxt, "Introduction");
    }

    /**
     * Verifies the "Preface" section text.
     */
    public void verifyPrefaceTxt() {
        scrollToElement(getPrefacetxt());
        String prefaceIntrotxt = elementGetText(getPrefacetxt());
        Assert.assertEquals(prefaceIntrotxt, "Preface");
    }

    /**
     * Verifies the "Procurement Codes of Ethics" section text.
     */
    public void verifyProcurementCodesofethicstxt() {
        scrollToElement(getProcurementCodesofethicstxt());
        String proCodeOfEthicsIntrotxt = elementGetText(getProcurementCodesofethicstxt());
        Assert.assertEquals(proCodeOfEthicsIntrotxt, "Procurement Codes of ethics");
    }

    /**
     * Verifies the "General Provision" section text.
     */
    public void verifyGeneralProvisiontxt() {
        scrollToElement(getGeneralProvisiontxt());
        String GeneralProvisiontxtIntrotxt = elementGetText(getGeneralProvisiontxt());
        Assert.assertEquals(GeneralProvisiontxtIntrotxt, "General Provision");
    }

    /**
     * Verifies the "Want to view more?" text.
     */
    public void verifyWantToViewMoretxt() {
        waitForVisibility(By.xpath("(//h5[text()='Want to view more?'])[1]"));
        scrollToElement(getWantToViewMoreTxt());
        String wantToViewMoreIntrotxt = elementGetText(getWantToViewMoreTxt());
        Assert.assertEquals(wantToViewMoreIntrotxt, "Want to view more?");
    }

    /**
     * Verifies the description text for "Want to view more?".
     */
    public void verifyWantToViewMoreDesctxt() {
        scrollToElement(getWantToViewMoreContentTxt());
        String wantToViewMoreDescIntrotxt = elementGetText(getWantToViewMoreContentTxt());
        Assert.assertEquals(wantToViewMoreDescIntrotxt,
                "If you want to view more content please Purchase Login ID");
    }

    /**
     * Clicks the "Purchase Login ID" button.
     */
    public void clickBtnPurchasedLoginID() {
        scrollToElement(getPurchaseLoginIDBtn());
        waitForVisibility(By.xpath("//a[text()='Purchase Login ID']"));
        clickUsingJavaScript(getPurchaseLoginIDBtn());
    }

    /**
     * Verifies the "Preface" description text.
     */
    public void verifyPrefaceDesctxt() {
        String prefaceDesctxt = elementGetText(getPrefaceDesctxt());
        Assert.assertEquals(prefaceDesctxt,
                "This Procurement Manual is a new edition of the Procurement Policies, Procedures & Guidelines (3rd Edition, January 2008) or widely known as 3Ps.");
    }

    /**
     * Verifies that the "Login" button text is displayed correctly.
     * Steps:
     * 1. Scrolls to the "Login" button element.
     * 2. Retrieves the text of the "Login" button.
     * 3. Asserts that the text matches "Login".
     */
    public void verifyLoginBtntxt() {
        scrollToElement(getLoginBtntxt()); // Ensure the element is in view.
        String loginbtntxt = elementGetText(getLoginBtntxt()); // Fetch the button text.
        Assert.assertEquals(loginbtntxt, "Login"); // Validate the expected text.
    }

    /**
     * Verifies that the "If you want to view more" message is displayed correctly.
     * Steps:
     * 1. Waits for the visibility of the message element.
     * 2. Scrolls to the message element.
     * 3. Retrieves the text from the element.
     * 4. Asserts that the text matches the expected message.
     */
    public void verifyIfWantToViewMoretxt() {
        waitForVisibility(By.xpath("(//p[text()='If you want to view more content please login'])[1]")); // Wait for the element to be visible.
        scrollToElement(getWantToViewMoreLogintxt()); // Ensure the element is in view.
        String ifwantToViewMoreIntrotxt = elementGetText(getWantToViewMoreLogintxt()); // Fetch the message text.
        Assert.assertEquals(ifwantToViewMoreIntrotxt, "If you want to view more content please login"); // Validate the expected message.
    }

    /**
     * Clicks on the "Login" button.
     * Steps:
     * 1. Waits for the "Login" button to be clickable.
     * 2. Clicks the button using JavaScript.
     */
    public void clickloginBtn() {
        waitForElementToBeClickable(getLoginBtntxt()); // Wait for the button to become clickable.
        clickUsingJavaScript(getLoginBtntxt()); // Click the button using JavaScript.
    }

    public void clickIntroductionTabLink() {
        // Click the "Requisition" tab link using JavaScript
        scrollToElementAndWait(getIntroductionTabLink());
        clickUsingJavaScript(getIntroductionTabLink());
    }

}
