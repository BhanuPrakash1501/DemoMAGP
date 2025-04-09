package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ForgetPasswordPage extends BaseClass {
    // WebDriver instance for interacting with the browser
    private WebDriver _driver;

    // Constructor to initialize the ForgetPasswordPage class
    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this); // Initializes WebElements using PageFactory
    }

    // WebElement for the MAGP logo on the Forgot Password page
    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    // WebElement for the "Forgot Password" heading text
    @FindBy(xpath = "//h2[text()='Forgot Password']")
    private WebElement forgotPasswordHeadingTxt;

    // WebElement for the email input field
    @FindBy(id = "Email")
    private WebElement emailId;

    // WebElement for the "Send Link" button
    @FindBy(xpath = "//button[text()='Send Link']")
    private WebElement sendlinkbtn;

    // WebElement for the "Go Back to Login" link
    @FindBy(xpath = "//a[text()='Go Back to Login']")
    private WebElement goBackLoginbtn;

    // WebElement for the validation message when an invalid email is entered
    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement validEmailAddressMailTxt;

    // WebElement for the "Forgot Password" text in an image section
    @FindBy(xpath = "//h3[text()='Forgot Password']")
    private WebElement forgotPasswordImgTxt;

    // WebElement for the descriptive text under the "Forgot Password" section
    @FindBy(xpath = "//h5[contains(.,\"worry\")]")
    private WebElement descImgTxt;

    // WebElement for the "Well Done" message after a successful action
    @FindBy(xpath = "//h6[text()='Well Done']")
    private WebElement wellDoneTxt;

    // WebElement for the password reset confirmation message
    @FindBy(xpath = "//p[contains(.,'Password reset email successfully sent to your registered email.')]")
    private WebElement passwordresetMssgTxt;

    // WebElement for the "Back to Login Page" button
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

    // Verifies that the MAGP logo is displayed on the page
    public void verifyMAGPlogo() {
        Assert.assertTrue(getMagpLogo().isDisplayed());
    }

    // Enters an invalid email address and checks if the correct validation message is displayed
    public void verifyInvalidEMailAdressTxt(String un) {
        elementSendKeys(emailId, un); // Inputs the email address
        String validEmailAddressMailTxt = getValidEmailAddressMailTxt().getText();
        Assert.assertEquals(validEmailAddressMailTxt, "Please enter a valid email address");
    }

    // Enters a valid email address (no assertion, just sending input)
    public void verifyValidEMailAdressTxt(String un) {
        elementSendKeys(emailId, un);
    }

    // Verifies that the "Send Link" button is disabled when conditions are not met
    public void verifySendLinkButton() {
        boolean status = getSendlinkbtn().isEnabled();
        Assert.assertFalse(status);
    }

    // Verifies that the "Forgot Password" heading text is correctly displayed
    public void verifyForgetPasswordHeadingtxt() {
        String forgetHeadingtxt = getForgotPasswordHeadingTxt().getText();
        Assert.assertEquals(forgetHeadingtxt, "Forgot Password");
    }

    // Clicks on the "Go Back to Login" button
    public void clickGobackToLoginBtn() {
        elementClick(getGoBackLoginbtn());
    }

    // Clicks on the "Send Link" button
    public void clickBtnSendLink() {
        elementClick(getSendlinkbtn());
    }

    // Verifies that the "Forgot Password" image text is displayed correctly
    public void verifyForgetpasswordimgTxt() {
        String forgetHeadingIMGtxt = getForgotPasswordImgTxt().getText();
        Assert.assertEquals(forgetHeadingIMGtxt, "Forgot Password");
    }

    // Verifies the descriptive text below the "Forgot Password" image
    public void verifyImgDesctxt() {
        String descImgtxt = getDescImgTxt().getText();
        Assert.assertEquals(descImgtxt, "Don’t worry it happens. Please enter the email address associated with your account.");
    }

    // Verifies that the "Well Done" message is displayed after a successful action
    public void verifyWellDonetxt() {
        String wellDonetxt = getWellDoneTxt().getText();
        Assert.assertEquals(wellDonetxt, "Well Done");
    }

    // Verifies the popup message confirming the password reset email has been sent
    public void verifyPopUpdesctxtMssg() {
        String passResettxt = getPasswordresetMssgTxt().getText();
        Assert.assertEquals(passResettxt, "Password reset email successfully sent to your registered email. Please check your inbox and follow the instructions to reset your password.");
    }

    // Clicks on the "Back to Login" button
    public void clickBackToLoginBtn() {
        elementClick(getBackToLoginBtn());
    }

//Forgot Password

}


