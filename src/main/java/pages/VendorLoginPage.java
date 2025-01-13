package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VendorLoginPage extends BaseClass {
    private WebDriver _driver;
    private final String actualEmailtext = "Email Address *";
    private final String actualPassWordtext = "Password *";
    public String username = "nouloffaufouki-2906@yopmail.com";
    public String password = "Test@321";


    public VendorLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    @FindBy(id = "Email Address")
    private WebElement emailId;

    @FindBy(xpath = "//*[text()='Email Address *']")
    private WebElement emailadressTxt;

    @FindBy(id = "Password")
    private WebElement pswd;

    @FindBy(xpath = "//*[text()='Password *']")
    private WebElement passwordTxt;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgetPassworslink;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitbtn;

    @FindBy(xpath = "//p[text()='Google']")
    private WebElement googlebtn;

    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
    private WebElement facebookbtn;

    @FindBy(xpath = "//a[text()='Register Now']")
    private WebElement registernowLink;

    @FindBy(xpath = "//h3[text()='Welcome']")
    private WebElement welcomeTxt;

    @FindBy(xpath = "//p[text()='Dont have an account? ']")
    private WebElement dontHaveAnAccountTxt;

    @FindBy(xpath = "//h5[contains(.,'Procurement')]")
    private WebElement welcomeNoteParagraphTxt;

    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement pleaseEnterAValidEmailAddressTxt;

    @FindBy(xpath = "//h2[text()='Login']")
    private WebElement loginHeaderTxt;

    @FindBy(xpath = "//div[@class='position-absolute close-icon']//button")
    private WebElement xBtn;

    public WebElement getxBtn() {
        return xBtn;
    }

    public WebElement getMagpLogo() {
        return magpLogo;
    }


    public WebElement getLoginHeaderTxt() {
        return loginHeaderTxt;
    }

    public String getActualPassWordtext() {
        return actualPassWordtext;
    }

    public void verifyMAGPlogo() {
        Assert.assertTrue(getMagpLogo().isDisplayed());
    }

    public WebElement getPleaseEnterAValidEmailAddressTxt() {
        return pleaseEnterAValidEmailAddressTxt;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getPswd() {
        return pswd;
    }

    public WebElement getForgetPassworslink() {
        return forgetPassworslink;
    }

    public WebElement getSubmitbtn() {
        return submitbtn;
    }

    public WebElement getGooglebtn() {
        return googlebtn;
    }

    public WebElement getFacebookbtn() {
        return facebookbtn;
    }

    public WebElement getRegisternowLink() {
        return registernowLink;
    }

    public String getActualEmailtext() {
        return actualEmailtext;
    }

    public WebElement getEmailadressTxt() {
        return emailadressTxt;
    }

    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    public WebElement getWelcomeTxt() {
        return welcomeTxt;
    }

    public WebElement getDontHaveAnAccountTxt() {
        return dontHaveAnAccountTxt;
    }

    public WebElement getWelcomeNoteParagraphTxt() {
        return welcomeNoteParagraphTxt;
    }

    public void performLogin() {
        elementSendKeys(getEmailId(), username);
        elementSendKeys(getPswd(), password);
        elementClick(getSubmitbtn());
    }

    public void clickForgetPassworslink() {
        elementClick(getForgetPassworslink());
    }

    public void clickRegisterNowlink() {
        elementClick(getRegisternowLink());
    }

    public void verifyEmailTxt() {
//		String emailText = getEmailadressTxt().getText();
//		Assert.assertEquals(emailText, actualEmailtext);
        boolean actualStatus = getEmailadressTxt().isDisplayed();
        Assert.assertTrue(actualStatus);
    }

    public void verifyPasswordTxt() {
        String passText = getPasswordTxt().getText();
        Assert.assertEquals(passText, actualPassWordtext);
    }

    public void verifyForgetPasswordTxt() {
        String forgetPasswordText = getForgetPassworslink().getText();
        Assert.assertEquals(forgetPasswordText, "Forgot Password?");
    }

    public void verifyGooglebtn() {
        String Googlebtn = getGooglebtn().getText();
        Assert.assertEquals(Googlebtn, "Google");
    }

    public void verifyFacebookbtn() {
        String facebookbtn = getFacebookbtn().getText();
        Assert.assertEquals(facebookbtn, "Facebook");
    }

    public void verifyRegisterNowLnk() {
        String registerNowlink = getRegisternowLink().getText();
        Assert.assertEquals(registerNowlink, "Register Now");
    }

    public void verifyWelcomeTxt() {
        String welcomeTxt = getWelcomeTxt().getText();
        Assert.assertEquals(welcomeTxt, "Welcome");
    }

    public void verifyWelcomeParagraphTxt() {
        String welcomeparaTxt = getWelcomeNoteParagraphTxt().getText();
        Assert.assertEquals(welcomeparaTxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines");
    }

    public void verifyDonthaveAnAccountTxt() {
        String dontHaveAnAccountTxt = getDontHaveAnAccountTxt().getText();
        boolean status = dontHaveAnAccountTxt.contains("Dont have an account? ");
        Assert.assertTrue(status);

    }

    public void verifyInvalidEmail(String un) {
        elementSendKeys(getEmailId(), un);
        String emailErrorTxt = getPleaseEnterAValidEmailAddressTxt().getText();
        Assert.assertEquals(emailErrorTxt, "Please enter a valid email address");
    }

    public void verifyForgetPasswordlink() {
        elementClick(getForgetPassworslink());
    }

    public void verifyLoginHeaderTxt() {
        String logintxt = getLoginHeaderTxt().getText();
        Assert.assertEquals(logintxt, "Login");
    }

    public void xbutton() {
        elementClick(xBtn);
    }

    public void clickbtnGoogle() {
        elementClick(getGooglebtn());
    }

}


