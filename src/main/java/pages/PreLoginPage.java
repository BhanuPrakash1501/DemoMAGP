package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreLoginPage extends BaseClass {
    private WebDriver _driver;


    public PreLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    @FindBy(xpath = "//h2[text()='Login']")
    private WebElement loginHeaderTxt;

    @FindBy(xpath = "//h3[text()='Welcome']")
    private WebElement welcomeTxt;

    @FindBy(xpath = "//h5[text()='Procurement Manual of Procurement Policies, Procedures & Guidelines']")
    private WebElement loginDescTxt;

    @FindBy(xpath = "//button[normalize-space()='Staff Login']")
    private WebElement staffLoginbtn;

    @FindBy(xpath = "//a[text()='Vendor Login']")
    private WebElement vendorLoginbtn;

    @FindBy(xpath = "//button[text()='Guest Login']")
    private WebElement guestbtn;


    public WebElement getMagpLogo() {
        return magpLogo;
    }

    public WebElement getWelcomeTxt() {
        return welcomeTxt;
    }

    public WebElement getLoginDescTxt() {
        return loginDescTxt;
    }

    public WebElement getLoginHeaderTxt() {
        return loginHeaderTxt;
    }

    public WebElement getStaffLoginbtn() {
        return staffLoginbtn;
    }

    public WebElement getVendorLoginbtn() {
        return vendorLoginbtn;
    }

    public WebElement getGuestbtn() {
        return guestbtn;
    }

    public void verifyMAGPlogo() {
        Assert.assertTrue(getMagpLogo().isDisplayed());
    }

    public void verifyWelcometxt() {
        String weltxt = elementGetText(getWelcomeTxt());
        Assert.assertEquals(weltxt, "Welcome");
    }


    public void verifyDesctxt() {
        String desctxt = elementGetText(getLoginDescTxt());
        Assert.assertEquals(desctxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines");
    }

    public void verifyPreLoginPage() {
        String actUrl = _driver.getCurrentUrl();
        Assert.assertEquals(actUrl, "https://magp-nprod-fe.myairports.com.my/auth");
    }

    public void verifyVendorLoginButton() {
        Assert.assertTrue(getVendorLoginbtn().isDisplayed());

    }

    public void verifyStaffLoginButton() {

        Assert.assertTrue(getStaffLoginbtn().isDisplayed());
    }

    public void verifyGuestLoginButton() {
        Assert.assertTrue(getGuestbtn().isDisplayed());
    }


    public void clickBtnstaffLogin() {
        elementClick(getStaffLoginbtn());
    }

    public void clickBtnvendorLogin() {
        elementClick(getVendorLoginbtn());
    }

    public void clickBtnguestLogin() {
        elementClick(getGuestbtn());
    }

    public void verifyLoginHeaderTxt() {
        String logintxt = elementGetText(getLoginHeaderTxt());
        Assert.assertEquals(logintxt, "Login");
    }


}
