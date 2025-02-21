package pages;


import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StaffLoginPage extends BaseClass {
    /**
     * StaffLoginPage class represents the login page for staff members.
     * It initializes the WebDriver and locates web elements required for login actions.
     */
    private WebDriver _driver;

    /**
     * Constructor to initialize the StaffLoginPage with the given WebDriver.
     *
     * @param driver WebDriver instance for interacting with the browser.
     */
    public StaffLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

// Locating elements on the Staff Login page

    /** WebElement for the email input field on the login page. */
    @FindBy(id = "i0116")
    private WebElement signEmail;

    /** WebElement for the "Next" button after entering the email. */
    @FindBy(id = "idSIButton9")
    private WebElement nextbtn;

    /** WebElement for the password input field. */
    @FindBy(id = "passwordInput")
    private WebElement pdwbtn;

    /** WebElement for the "Sign In" button after entering the password. */
    @FindBy(id = "submitButton")
    private WebElement signInbtn;

    /** WebElement for the "No" button on the additional sign-in prompt. */
    @FindBy(id = "idBtn_Back")
    private WebElement nobtn;

// Getter methods for web elements

    /**
     * Returns the WebElement for the email input field.
     *
     * @return WebElement for email input.
     */
    public WebElement getSignEmail() {
        return signEmail;
    }

    /**
     * Returns the WebElement for the "Next" button.
     *
     * @return WebElement for "Next" button.
     */
    public WebElement getNextbtn() {
        return nextbtn;
    }

    /**
     * Returns the WebElement for the password input field.
     *
     * @return WebElement for password input.
     */
    public WebElement getPdwbtn() {
        return pdwbtn;
    }

    /**
     * Returns the WebElement for the "Sign In" button.
     *
     * @return WebElement for "Sign In" button.
     */
    public WebElement getSignInbtn() {
        return signInbtn;
    }

    /**
     * Returns the WebElement for the "No" button.
     *
     * @return WebElement for "No" button.
     */
    public WebElement getNobtn() {
        return nobtn;
    }

// Methods for performing login actions

    /**
     * Performs the first step of login by entering the email and clicking the "Next" button.
     */
    public void performLogin() {
        elementSendKeys(getSignEmail(), "uday@malaysiaairports.com.my"); // Enter email
        elementClick(getNextbtn()); // Click "Next" button
    }

    /**
     * Performs the password entry step of login and confirms the sign-in process.
     */
    public void performPassword() {
        elementSendKeys(getPdwbtn(), "Apss@042024"); // Enter password
        elementClick(getSignInbtn()); // Click "Sign In" button
        elementClick(getNobtn()); // Click "No" button to bypass additional sign-in
    }

}



