package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreLoginPage extends BaseClass {
    /**
     * Represents the PreLoginPage of the application.
     * This class initializes and provides access to web elements present on the pre-login screen.
     */
    private WebDriver _driver;

    /**
     * Constructor for PreLoginPage.
     *
     * @param driver The WebDriver instance used to interact with the web page.
     *               Initializes web elements using PageFactory.
     */
    public PreLoginPage(WebDriver driver) {
        super(driver); // Calls the parent class constructor.
        this._driver = driver; // Assigns the WebDriver instance.
        PageFactory.initElements(driver, this); // Initializes web elements using PageFactory.
    }

    /**
     * WebElement representing the MAGP logo on the pre-login page.
     */
    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    /**
     * WebElement representing the "Login" header text on the pre-login page.
     */
    @FindBy(xpath = "//h2[text()='Login']")
    private WebElement loginHeaderTxt;

    /**
     * WebElement representing the "Welcome" text on the pre-login page.
     */
    @FindBy(xpath = "//h3[text()='Welcome']")
    private WebElement welcomeTxt;

    /**
     * WebElement representing the login description text on the pre-login page.
     */
    @FindBy(xpath = "//h5[text()='Procurement Manual of Procurement Policies, Procedures & Guidelines']")
    private WebElement loginDescTxt;

    /**
     * WebElement representing the "Staff Login" button on the pre-login page.
     */
    @FindBy(xpath = "//button[normalize-space()='Staff Login']")
    private WebElement staffLoginbtn;

    /**
     * WebElement representing the "Vendor Login" button on the pre-login page.
     */
    @FindBy(xpath = "//a[text()='Vendor Login']")
    private WebElement vendorLoginbtn;

    /**
     * WebElement representing the "Guest Login" button on the pre-login page.
     */
    @FindBy(xpath = "//button[text()='Guest Login']")
    private WebElement guestbtn;


    /**
     * Returns the WebElement representing the MAGP logo on the pre-login page.
     *
     * @return WebElement for the MAGP logo.
     */
    public WebElement getMagpLogo() {
        return magpLogo;
    }

    /**
     * Returns the WebElement representing the "Welcome" text on the pre-login page.
     *
     * @return WebElement for the welcome text.
     */
    public WebElement getWelcomeTxt() {
        return welcomeTxt;
    }

    /**
     * Returns the WebElement representing the login description text.
     *
     * @return WebElement for the login description text.
     */
    public WebElement getLoginDescTxt() {
        return loginDescTxt;
    }

    /**
     * Returns the WebElement representing the "Login" header text.
     *
     * @return WebElement for the login header.
     */
    public WebElement getLoginHeaderTxt() {
        return loginHeaderTxt;
    }

    /**
     * Returns the WebElement representing the "Staff Login" button.
     *
     * @return WebElement for the staff login button.
     */
    public WebElement getStaffLoginbtn() {
        return staffLoginbtn;
    }

    /**
     * Returns the WebElement representing the "Vendor Login" button.
     *
     * @return WebElement for the vendor login button.
     */
    public WebElement getVendorLoginbtn() {
        return vendorLoginbtn;
    }

    /**
     * Returns the WebElement representing the "Guest Login" button.
     *
     * @return WebElement for the guest login button.
     */
    public WebElement getGuestbtn() {
        return guestbtn;
    }

    /**
     * Verifies that the MAGP logo is displayed on the pre-login page.
     */
    public void verifyMAGPlogo() {
        BaseClass.getLogger().info("Verify MAGP Logo is Displayed");
        Assert.assertTrue(getMagpLogo().isDisplayed());

    }

    /**
     * Verifies that the "Welcome" text is correctly displayed.
     */
    public void verifyWelcometxt() {
        BaseClass.getLogger().info("Verify Welcome text is displayed");
        String weltxt = elementGetText(getWelcomeTxt());
        Assert.assertEquals(weltxt, "Welcome");
    }

    /**
     * Verifies that the description text matches the expected procurement manual description.
     */
    public void verifyDesctxt() {
        BaseClass.getLogger().info("Verify Description text is displayed");
        String desctxt = elementGetText(getLoginDescTxt());
        Assert.assertEquals(desctxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines");
    }

    /**
     * Verifies that the current URL matches the expected pre-login page URL.
     */
    public void verifyPreLoginPage() {
        BaseClass.getLogger().info("Verify URL ");
        String actUrl = _driver.getCurrentUrl();
        Assert.assertEquals(actUrl, "https://magp-nprod-fe.myairports.com.my/auth");
    }

    /**
     * Verifies that the "Vendor Login" button is correctly displayed with the expected text.
     */
    public void verifyVendorLoginButton() {
        BaseClass.getLogger().info("Verify Vendor Login Button");
        String vendorTxt = elementGetText(getVendorLoginbtn());
        Assert.assertEquals(vendorTxt, "Vendor Login");
    }

    /**
     * Verifies that the "Staff Login" button is correctly displayed with the expected text.
     */
    public void verifyStaffLoginButton() {
        BaseClass.getLogger().info("Verify Staff Login Button");
        String staffTxt = elementGetText(getStaffLoginbtn());
        Assert.assertEquals(staffTxt, "Staff Login");
    }

    /**
     * Verifies that the "Guest Login" button is correctly displayed with the expected text.
     */
    public void verifyGuestLoginButton() {
        BaseClass.getLogger().info("Verify Guest Login Button");
        String guestTxt = elementGetText(getGuestbtn());
        Assert.assertEquals(guestTxt, "Guest Login");
    }

    /**
     * Clicks the "Staff Login" button to proceed with staff login.
     */
    public void clickBtnstaffLogin() {
        BaseClass.getLogger().info("Click on staff Button");
        elementClick(getStaffLoginbtn());

    }

    /**
     * Clicks the "Vendor Login" button to proceed with vendor login.
     */
    public void clickBtnvendorLogin() {
        BaseClass.getLogger().info("Click on Vendor Button");
        elementClick(getVendorLoginbtn());
    }

    /**
     * Clicks the "Guest Login" button to proceed with guest login.
     */
    public void clickBtnguestLogin() {

        BaseClass.getLogger().info("Click on Guest Button");
        elementClick(getGuestbtn());
    }

    /**
     * Verifies that the login header text is displayed correctly as "Login".
     */
    public void verifyLoginHeaderTxt() {

        BaseClass.getLogger().info("Verifying the Login header text...");

        String logintxt = elementGetText(getLoginHeaderTxt());
        BaseClass.getLogger().info("Actual login header text: " + logintxt);

        Assert.assertEquals(logintxt, "Login");
        BaseClass.getLogger().info("Assertion passed: Login header text is correct.");
    }

}




