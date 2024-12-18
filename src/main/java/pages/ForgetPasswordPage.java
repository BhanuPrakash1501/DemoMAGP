package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ForgetPasswordPage extends BaseClass {
    private WebDriver _driver;

    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    @FindBy(xpath = "//h2[text()='Forgot Password']")
    private WebElement forgotPasswordHeadingTxt;

    @FindBy(id = "Email")
    private WebElement emailId;

    @FindBy(xpath = "//button[text()='Send Link']")
    private WebElement sendlinkbtn;

    @FindBy(xpath = "//a[text()='Go Back to Login']")
    private WebElement goBackLoginbtn;

    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement validEmailAddressMailTxt;

    @FindBy(xpath = "//h3[text()='Forgot Password']")
    private WebElement forgotPasswordImgTxt;

    @FindBy(xpath = "//h5[contains(.,\"worry\")]")
    private WebElement descImgTxt;

    @FindBy(xpath = "//h6[text()='Well Done']")
    private WebElement wellDoneTxt;



    @FindBy(xpath = "//p[contains(.,'Password reset email successfully sent to your registered email.')]")
    private WebElement passwordresetMssgTxt;

    @FindBy(xpath = "//button[text()='Back To Login Page']")
    private WebElement backToLoginBtn;

    public WebElement getForgotPasswordImgTxt() {
        return forgotPasswordImgTxt;
    }

    public WebElement getDescImgTxt() {
        return descImgTxt;
    }

    public WebElement getMagpLogo() {
        return magpLogo;
    }

    public WebElement getForgotPasswordHeadingTxt() {
        return forgotPasswordHeadingTxt;
    }

    public WebElement getWellDoneTxt() {
        return wellDoneTxt;
    }

    public WebElement getPasswordresetMssgTxt() {
        return passwordresetMssgTxt;
    }

    public WebElement getBackToLoginBtn() {
        return backToLoginBtn;
    }

    public WebElement getValidEmailAddressMailTxt() {
        return validEmailAddressMailTxt;
    }

    public WebElement getEmailId() {
        return emailId;
    }

    public WebElement getSendlinkbtn() {
        return sendlinkbtn;
    }

    public WebElement getGoBackLoginbtn() {
        return goBackLoginbtn;
    }

    public void verifyMAGPlogo(){
        Assert.assertTrue(getMagpLogo().isDisplayed());
    }

    public void verifyInvalidEMailAdressTxt(String un) {
        elementSendKeys(emailId, un);
        String validEmailAddressMailTxt = getValidEmailAddressMailTxt().getText();
        Assert.assertEquals(validEmailAddressMailTxt, "Please enter a valid email address");

    }

    public void verifyValidEMailAdressTxt(String un) {
        elementSendKeys(emailId, un);

    }

    public void verifySendLinkButton() {
        boolean status = getSendlinkbtn().isEnabled();
        Assert.assertFalse(status);
    }

    public void verifyForgetPasswordHeadingtxt() {
        String forgetHeadingtxt = getForgotPasswordHeadingTxt().getText();
        Assert.assertEquals(forgetHeadingtxt, "Forgot Password");
    }

    public void clickGobackToLoginBtn() {
        elementClick(getGoBackLoginbtn());

    }

    public void clickBtnSendLink() {
        elementClick(getSendlinkbtn());

    }

    public void verifyForgetpasswordimgTxt(){
        String forgetHeadingIMGtxt = getForgotPasswordImgTxt().getText();
        Assert.assertEquals(forgetHeadingIMGtxt, "Forgot Password");
    }

    public void verifyImgDesctxt(){
        String descImgtxt = getDescImgTxt().getText();
        Assert.assertEquals(descImgtxt, "Don’t worry it happens. Please enter the email address associated with your account.");
    }

    public void verifyWellDonetxt(){
        String wellDonetxt = getWellDoneTxt().getText();
        Assert.assertEquals(wellDonetxt, "Well Done");
    }

    public void verifyPopUpdesctxtMssg(){
        String passResettxt = getPasswordresetMssgTxt().getText();
        Assert.assertEquals(passResettxt, "Password reset email successfully sent to your registered email. Please check your inbox and follow the instructions to reset your password.");
    }
    public void clickBackToLoginBtn() {
        elementClick(getBackToLoginBtn());

    }






}


