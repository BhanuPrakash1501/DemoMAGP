package pages;

import baseClass.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class VendorLoginPage extends BaseClass {
    /**
     * VendorLoginPage class represents the login page for vendors.
     * It initializes the WebDriver and defines login credentials.
     */
    private WebDriver _driver;

    /**
     * Expected text for the email input field label.
     */
    private final String actualEmailtext = "Email Address *";

    /**
     * Expected text for the password input field label.
     */
    private final String actualPassWordtext = "Password *";


    /**
     * Constructor to initialize the VendorLoginPage with the given WebDriver.
     *
     * @param driver WebDriver instance for interacting with the browser.
     */
    public VendorLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Represents the logo of the MAGP application on the login page.
    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    // Input field for entering the email address.
    @FindBy(id = "Email Address")
    private WebElement emailId;

    // Label text displayed above the email address input field.
    @FindBy(xpath = "//*[text()='Email Address *']")
    private WebElement emailadressTxt;

    // Input field for entering the password.
    @FindBy(id = "Password")
    private WebElement pswd;

    // Label text displayed above the password input field.
    @FindBy(xpath = "//*[text()='Password *']")
    private WebElement passwordTxt;

    // Link to navigate to the "Forgot Password" page.
    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgetPassworslink;

    // Submit button for login authentication.
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitbtn;

    // Button for signing in using a Google account.
    @FindBy(xpath = "//p[text()='Google']")
    private WebElement googlebtn;

    // Button for signing in using a Facebook account.
    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
    private WebElement facebookbtn;

    // Link to navigate to the "Register Now" page for new users.
    @FindBy(xpath = "//a[text()='Register Now']")
    private WebElement registernowLink;

    // Text displaying "WELCOME" on the login page.
    @FindBy(xpath = "//h3[text()='WELCOME']")
    private WebElement welcomeTxt;

    // Text indicating that the user does not have an account.
    @FindBy(xpath = "//p[text()='Dont have an account? ']")
    private WebElement dontHaveAnAccountTxt;

    // Paragraph text displaying a welcome note related to procurement.
    @FindBy(xpath = "//h5[contains(.,'Procurement')]")
    private WebElement welcomeNoteParagraphTxt;

    // Error message displayed when the user enters an invalid email address.
    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement pleaseEnterAValidEmailAddressTxt;

    // Header text displaying "Login" on the login page.
    @FindBy(xpath = "//h2[text()='Login']")
    private WebElement loginHeaderTxt;

    // Close button (X) to exit the login page or popup.
    @FindBy(xpath = "//div[@class='position-absolute close-icon']//button")
    private WebElement xBtn;

    // Returns the close button (X) element, which is used to exit the login page or popup.
    public WebElement getxBtn() {
        return xBtn;
    }

    // Returns the MAGP logo element displayed on the login page.
    public WebElement getMagpLogo() {
        return magpLogo;
    }

    // Returns the "Login" header text element on the login page.
    public WebElement getLoginHeaderTxt() {
        return loginHeaderTxt;
    }

    // Returns the actual password label text used for validation purposes.
    public String getActualPassWordtext() {
        return actualPassWordtext;
    }

    // Verifies if the MAGP logo is displayed on the login page.
    public void verifyMAGPlogo() {
        Assert.assertTrue(getMagpLogo().isDisplayed());
    }

    // Returns the error message element displayed for invalid email input.
    public WebElement getPleaseEnterAValidEmailAddressTxt() {
        return pleaseEnterAValidEmailAddressTxt;
    }

    // Returns the email input field element where users enter their email address.
    public WebElement getEmailId() {
        return emailId;
    }

    // Returns the password input field element where users enter their password.
    public WebElement getPswd() {
        return pswd;
    }

    // Returns the "Forgot Password?" link element to navigate to password recovery.
    public WebElement getForgetPassworslink() {
        return forgetPassworslink;
    }

    // Returns the submit button element used to log in.
    public WebElement getSubmitbtn() {
        return submitbtn;
    }

    // Returns the Google sign-in button element for logging in with Google.
    public WebElement getGooglebtn() {
        return googlebtn;
    }

    // Returns the Facebook sign-in button element for logging in with Facebook.
    public WebElement getFacebookbtn() {
        return facebookbtn;
    }

    // Returns the "Register Now" link element for users who want to create a new account.
    public WebElement getRegisternowLink() {
        return registernowLink;
    }

    // Returns the actual email label text used for validation purposes.
    public String getActualEmailtext() {
        return actualEmailtext;
    }

    // Returns the email label text element displayed above the email input field.
    public WebElement getEmailadressTxt() {
        return emailadressTxt;
    }

    // Returns the password label text element displayed above the password input field.
    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    // Returns the "WELCOME" text element displayed on the login page.
    public WebElement getWelcomeTxt() {
        return welcomeTxt;
    }

    // Returns the text element that indicates users don't have an account.
    public WebElement getDontHaveAnAccountTxt() {
        return dontHaveAnAccountTxt;
    }

    // Returns the paragraph text element displaying a welcome note related to procurement.
    public WebElement getWelcomeNoteParagraphTxt() {
        return welcomeNoteParagraphTxt;
    }


    // Performs the login action by entering the username and password, then clicking the submit button.
    public void performLogin() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Mind-Graph\\IdeaProjects\\DemoMAGP\\src\\test\\resources\\config.properties");

        // Creates a Properties object to load key-value pairs from the configuration file.
        Properties prop = new Properties();
        prop.load(fis);
        // Enters the username into the email input field.
        elementSendKeys(getEmailId(), prop.getProperty("username"));

        // Enters the password into the password input field.
        elementSendKeys(getPswd(), prop.getProperty("password"));

        // Clicks the submit button to initiate the login process.
        elementClick(getSubmitbtn());
    }

    // Clicks on the "Forgot Password?" link to navigate to the password recovery page.
    public void clickForgetPassworslink() {
        elementClick(getForgetPassworslink());
    }

    // Clicks on the "Register Now" link to navigate to the registration page.
    public void clickRegisterNowlink() {
        elementClick(getRegisternowLink());
    }

    // Verifies that the email address text label is displayed on the login page.
    public void verifyEmailTxt() {
        // Retrieves the text from the email label and compares it with the expected value (commented out for now).
        // String emailText = getEmailadressTxt().getText();
        // Assert.assertEquals(emailText, actualEmailtext);

        // Checks if the email label is displayed and asserts that it is visible.
        boolean actualStatus = getEmailadressTxt().isDisplayed();
        Assert.assertTrue(actualStatus);
    }


    // Verifies that the password label text is displayed correctly on the login page.
    public void verifyPasswordTxt() {
        String passText = getPasswordTxt().getText();  // Retrieves the displayed password label text.
        Assert.assertEquals(passText, actualPassWordtext);  // Asserts that it matches the expected value.
    }

    // Verifies that the "Forgot Password?" link text is displayed correctly.
    public void verifyForgetPasswordTxt() {
        String forgetPasswordText = getForgetPassworslink().getText();  // Retrieves the text from the "Forgot Password?" link.
        Assert.assertEquals(forgetPasswordText, "Forgot Password?");  // Asserts that it matches the expected text.
    }

    // Verifies that the Google login button text is displayed correctly.
    public void verifyGooglebtn() {
        String Googlebtn = getGooglebtn().getText();  // Retrieves the text from the Google login button.
        Assert.assertEquals(Googlebtn, "Google");  // Asserts that it matches the expected value.
    }


    // Verifies that the Facebook login button text is displayed correctly.
    public void verifyFacebookbtn() {
        String facebookbtn = getFacebookbtn().getText();  // Retrieves the text from the Facebook login button.
        Assert.assertEquals(facebookbtn, "Facebook");  // Asserts that it matches the expected value.
    }

    // Verifies that the "Register Now" link text is displayed correctly.
    public void verifyRegisterNowLnk() {
        String registerNowlink = getRegisternowLink().getText();  // Retrieves the text from the "Register Now" link.
        Assert.assertEquals(registerNowlink, "Register Now");  // Asserts that it matches the expected value.
    }

    // Verifies that the "WELCOME" text is displayed correctly on the login page.
    public void verifyWelcomeTxt() {
        String welcomeTxt = getWelcomeTxt().getText();  // Retrieves the text from the welcome message.
        Assert.assertEquals(welcomeTxt, "WELCOME");  // Asserts that it matches the expected value.
    }


    // Verifies that the welcome paragraph text is displayed correctly on the login page.
    public void verifyWelcomeParagraphTxt() {
        String welcomeparaTxt = getWelcomeNoteParagraphTxt().getText();  // Retrieves the text from the welcome paragraph.
        Assert.assertEquals(welcomeparaTxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines");  // Asserts that it matches the expected value.
    }

    // Verifies that the "Don't have an account?" text is displayed correctly.
    public void verifyDonthaveAnAccountTxt() {
        String dontHaveAnAccountTxt = getDontHaveAnAccountTxt().getText();  // Retrieves the text from the "Don't have an account?" message.
        boolean status = dontHaveAnAccountTxt.contains("Dont have an account? ");  // Checks if the text contains the expected phrase.
        Assert.assertTrue(status);  // Asserts that the expected phrase is present.
    }

    // Verifies the error message for invalid email input.
    public void verifyInvalidEmail(String un) {
        elementSendKeys(getEmailId(), un);  // Enters the given invalid email into the email input field.
        String emailErrorTxt = getPleaseEnterAValidEmailAddressTxt().getText();  // Retrieves the error message text.
        Assert.assertEquals(emailErrorTxt, "Please enter a valid email address");  //
    }

    // Clicks on the "Forgot Password?" link to navigate to the password recovery page.
    public void verifyForgetPasswordlink() {
        elementClick(getForgetPassworslink());
    }

    // Verifies that the login header text is displayed correctly on the login page.
    public void verifyLoginHeaderTxt() {
        String logintxt = getLoginHeaderTxt().getText();  // Retrieves the text from the login header.
        Assert.assertEquals(logintxt, "Login");  // Asserts that it matches the expected "Login" text.
    }

    // Clicks on the close (X) button to exit the login page or pop-up window.
    public void xbutton() {
        clickUsingJavaScript(xBtn);  // Uses JavaScript to click the close button.
    }

    // Clicks on the "Google" login button to initiate Google sign-in.
    public void clickbtnGoogle() {
        elementClick(getGooglebtn());  // Clicks on the Google sign-in button.
    }

}


