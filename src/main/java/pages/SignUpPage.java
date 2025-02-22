package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SignUpPage extends BaseClass {

    // WebDriver instance to interact with the browser
    private WebDriver _driver;

    /**
     * Constructor to initialize the SignUpPage with the WebDriver instance.
     * @param driver WebDriver instance
     */
    public SignUpPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

// Web elements for various fields and buttons on the Signup page

    /** Logo displayed on the signup page */
    @FindBy(xpath = "//img[@src='/MAGP/home/logo.png']")
    private WebElement magpLogo;

    /** Input field for entering the email ID */
    @FindBy(id = "Email")
    private WebElement enterEmailId;

    /** Input field for entering the mobile number */
    @FindBy(id = "Mobile Number")
    private WebElement MobileNo;

    /** Input field for entering the password */
    @FindBy(id = "Password")
    private WebElement pwd;

    /** Input field for entering the first name */
    @FindBy(id = "First Name")
    private WebElement firstName;

    /** Input field for entering the last name */
    @FindBy(id = "Last Name")
    private WebElement lastName;

    /** Input field for entering apartment, suite, or building details */
    @FindBy(id = "Apartment, Suite, Building...")
    private WebElement aptsuitebldg;

    /** Input field for entering street, city, and address details */
    @FindBy(id = "Street City and Address")
    private WebElement streetcityadd;

    /** Input field for entering postcode */
    @FindBy(id = "Postcode")
    private WebElement postcode;

    /** Submit button for form submission */
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitbtn;

    /** Link to navigate to the login page */
    @FindBy(xpath = "//a[text()='Login Here']")
    private WebElement loginhereLink;

    /** Header text displayed on the signup page */
    @FindBy(xpath = "//h2[text()='Signup']")
    private WebElement signUpHeaderTxt;

// Labels for various fields

    /** Label for email address field */
    @FindBy(xpath = "//*[text()='Email *']")
    private WebElement emailadressTxt;

    /** Label for mobile number field */
    @FindBy(xpath = "//*[text()='Mobile Number *']")
    private WebElement mobileNoTxt;

    /** Label for password field */
    @FindBy(xpath = "//*[text()='Password *']")
    private WebElement passwordTxt;

    /** Label for first name field */
    @FindBy(xpath = "//*[text()='First Name *']")
    private WebElement firstNameTxt;

    /** Label for last name field */
    @FindBy(xpath = "//*[text()='Last Name *']")
    private WebElement lastNameTxt;

    /** Label for apartment, suite, and building field */
    @FindBy(xpath = "//*[text()='Apartment, Suite, Building... *']")
    private WebElement aptSuitebuildingTxt;

    /** Label for street, city, and address field */
    @FindBy(xpath = "//*[text()='Street City and Address *']")
    private WebElement streetCityaddressTxt;

    /** Label for postcode field */
    @FindBy(xpath = "//*[text()='Postcode *']")
    private WebElement postcodeTxt;

// Error messages for validation

    /** Error message for invalid email address */
    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement emailAdressErrorMssgTxt;

    /** Error message for invalid mobile number */
    @FindBy(xpath = "//div[text()='Please enter a valid 4-16 digit mobile number']")
    private WebElement mobileNoErrorMssgTxt;

    /** Error message for password not meeting the minimum length requirement */
    @FindBy(xpath = "//div[text()='Password must be at least 8 characters long.']")
    private WebElement password8charslongErrorMssgTxt;

    /** Error message for password missing an uppercase letter */
    @FindBy(xpath = "//div[text()='Password must contain at least one uppercase letter.']")
    private WebElement passwordUpperCaseErrorMssgTxt;

    /** Error message for password missing a number */
    @FindBy(xpath = "//div[text()='Password must contain at least one number.']")
    private WebElement atLeastOneNumberErrorMssgTxt;

    /** Error message for password missing a special character */
    @FindBy(xpath = "//div[text()='Password must contain at least one special character.']")
    private WebElement atLeastOneSpecialcharErrorMssgTxt;

    /** Error message for invalid first name */
    @FindBy(xpath = "//div[text()='Please enter a valid first name']")
    private WebElement fieldCharLengthErrorMssgTxt;

    /** Error message for short field length validation */
    @FindBy(xpath = "//div[text()='This field must be at least 2 characters long']")
    private WebElement fieldErrorMssgTxt;

    /**
     * Getter method for the general field error message.
     * @return WebElement representing the error message
     */
    public WebElement getFieldErrorMssgTxt() {
        return fieldErrorMssgTxt;
    }

    /** Error message for invalid postcode */
    @FindBy(xpath = "//div[text()='Please enter a valid 4-6 pincode']")
    private WebElement postCodeErrorMssgTxt;

// Social login buttons

    /** Button for signing up using Google */
    @FindBy(xpath = "(//img[contains(@class, 'icon')])[1]")
    private WebElement googleBtn;

    /** Button for signing up using Facebook */
    @FindBy(xpath = "(//img[contains(@class, 'icon')])[2]")
    private WebElement facebookBtn;

// Additional text elements

    /** Welcome message displayed on the signup page */
    @FindBy(xpath = "//h3[text()='WELCOME (SIGNUP)']")
    private WebElement welcomeTxt;

    /** Description text for login information */
    @FindBy(xpath = "//h5[text()='Procurement Manual of Procurement Policies, Procedures & Guidelines(Signup)']")
    private WebElement loginDescTxt;

    /** Text displaying the message "Already have an account?" */
    @FindBy(xpath = "//p[@class='auth-bottom-text my-4 text-center']")
    private WebElement alreadyHaveAnAccount;


    /**
     * Getter method for the application logo.
     * @return WebElement representing the MAGP logo
     */
    public WebElement getMagpLogo() {
        return magpLogo;
    }

    /**
     * Getter method for the login description text.
     * @return WebElement representing the login description text
     */
    public WebElement getLoginDescTxt() {
        return loginDescTxt;
    }

    /**
     * Getter method for the "Already have an account?" text.
     * @return WebElement representing the text
     */
    public WebElement getAlreadyHaveAnAccount() {
        return alreadyHaveAnAccount;
    }

    /**
     * Verifies that the "Already have an account?" text is displayed on the page.
     */
    public void verifyAlreadyHaveAnAccountTxt() {
        Assert.assertTrue(getAlreadyHaveAnAccount().isDisplayed());
    }

    /**
     * Getter method for the welcome text displayed on the signup page.
     * @return WebElement representing the welcome text
     */
    public WebElement getWelcomeTxt() {
        return welcomeTxt;
    }

// Getters for error messages

    /**
     * Getter method for the email address error message.
     * @return WebElement representing the email error message
     */
    public WebElement getEmailAdressErrorMssgTxt() {
        return emailAdressErrorMssgTxt;
    }

    /**
     * Getter method for the mobile number error message.
     * @return WebElement representing the mobile number error message
     */
    public WebElement getMobileNoErrorMssgTxt() {
        return mobileNoErrorMssgTxt;
    }

    /**
     * Getter method for the password length error message.
     * @return WebElement representing the password length error message
     */
    public WebElement getPassword8charslongErrorMssgTxt() {
        return password8charslongErrorMssgTxt;
    }

    /**
     * Getter method for the uppercase letter requirement error message.
     * @return WebElement representing the uppercase letter requirement error message
     */
    public WebElement getPasswordUpperCaseErrorMssgTxt() {
        return passwordUpperCaseErrorMssgTxt;
    }

    /**
     * Getter method for the error message indicating at least one number is required in the password.
     * @return WebElement representing the error message
     */
    public WebElement getAtLeastOneNumberErrorMssgTxt() {
        return atLeastOneNumberErrorMssgTxt;
    }

    /**
     * Getter method for the error message indicating at least one special character is required in the password.
     * @return WebElement representing the error message
     */
    public WebElement getAtLeastOneSpecialcharErrorMssgTxt() {
        return atLeastOneSpecialcharErrorMssgTxt;
    }

    /**
     * Getter method for the field character length validation error message.
     * @return WebElement representing the character length error message
     */
    public WebElement getFieldCharLengthErrorMssgTxt() {
        return fieldCharLengthErrorMssgTxt;
    }

    /**
     * Getter method for the postcode validation error message.
     * @return WebElement representing the postcode error message
     */
    public WebElement getPostCodeErrorMssgTxt() {
        return postCodeErrorMssgTxt;
    }

// Getters for form input fields

    /**
     * Getter method for the email input field.
     * @return WebElement representing the email input field
     */
    public WebElement getEnterEmailId() {
        return enterEmailId;
    }

    /**
     * Getter method for the mobile number input field.
     * @return WebElement representing the mobile number input field
     */
    public WebElement getMobileNo() {
        return MobileNo;
    }

    /**
     * Getter method for the password input field.
     * @return WebElement representing the password input field
     */
    public WebElement getPwd() {
        return pwd;
    }

    /**
     * Getter method for the first name input field.
     * @return WebElement representing the first name input field
     */
    public WebElement getFirstName() {
        return firstName;
    }

    /**
     * Getter method for the last name input field.
     * @return WebElement representing the last name input field
     */
    public WebElement getLastName() {
        return lastName;
    }

    /**
     * Getter method for the apartment/suite/building input field.
     * @return WebElement representing the apartment/suite/building input field
     */
    public WebElement getAptsuitebldg() {
        return aptsuitebldg;
    }

    /**
     * Getter method for the street/city/address input field.
     * @return WebElement representing the street/city/address input field
     */
    public WebElement getStreetcityadd() {
        return streetcityadd;
    }

    /**
     * Getter method for the postcode input field.
     * @return WebElement representing the postcode input field
     */
    public WebElement getPostcode() {
        return postcode;
    }

    /**
     * Getter method for the submit button.
     * @return WebElement representing the submit button
     */
    public WebElement getSubmitbtn() {
        return submitbtn;
    }

    /**
     * Getter method for the "Login Here" link.
     * @return WebElement representing the login link
     */
    public WebElement getLoginhereLink() {
        return loginhereLink;
    }

    /**
     * Getter method for the signup header text.
     * @return WebElement representing the signup header
     */
    public WebElement getSignUpHeaderTxt() {
        return signUpHeaderTxt;
    }

// Getters for form labels

    /**
     * Getter method for the email address label.
     * @return WebElement representing the email label
     */
    public WebElement getEmailadressTxt() {
        return emailadressTxt;
    }

    /**
     * Getter method for the mobile number label.
     * @return WebElement representing the mobile number label
     */
    public WebElement getMobileNoTxt() {
        return mobileNoTxt;
    }

    /**
     * Getter method for the password label.
     * @return WebElement representing the password label
     */
    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    /**
     * Getter method for the first name label.
     * @return WebElement representing the first name label
     */
    public WebElement getFirstNameTxt() {
        return firstNameTxt;
    }

    /**
     * Getter method for the last name label.
     * @return WebElement representing the last name label
     */
    public WebElement getLastNameTxt() {
        return lastNameTxt;
    }

    /**
     * Getter method for the apartment/suite/building label.
     * @return WebElement representing the apartment/suite/building label
     */
    public WebElement getAptSuitebuildingTxt() {
        return aptSuitebuildingTxt;
    }

    /**
     * Getter method for the street/city/address label.
     * @return WebElement representing the street/city/address label
     */
    public WebElement getStreetCityaddressTxt() {
        return streetCityaddressTxt;
    }

    /**
     * Getter method for the postcode label.
     * @return WebElement representing the postcode label
     */
    public WebElement getPostcodeTxt() {
        return postcodeTxt;
    }

// Getters for social login buttons

    /**
     * Getter method for the Google sign-in button.
     * @return WebElement representing the Google button
     */
    public WebElement getGoogleBtn() {
        return googleBtn;
    }

    /**
     * Getter method for the Facebook sign-in button.
     * @return WebElement representing the Facebook button
     */
    public WebElement getFacebookBtn() {
        return facebookBtn;
    }


    /**
     * Verifies that the welcome text is displayed correctly.
     * Asserts that the text retrieved matches the expected "Welcome" message.
     */
    public void verifyWelcometxt() {
        String weltxt = elementGetText(getWelcomeTxt());
        Assert.assertEquals(weltxt, "WELCOME (SIGNUP)");
    }

    /**
     * Verifies that the description text below the welcome message is correct.
     * Asserts that the text matches the expected procurement manual description.
     */
    public void verifyDesctxt() {
        String desctxt = elementGetText(getLoginDescTxt());
        Assert.assertEquals(desctxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines(Signup)");
    }

    /**
     * Verifies that the sign-up header text is displayed correctly.
     * Asserts that the text retrieved matches the expected "Signup" header.
     */
    public void verifySignUpHeaderTxt() {
        String signuptxt = getSignUpHeaderTxt().getText();
        Assert.assertEquals(signuptxt, "Signup");
    }

    /**
     * Verifies that the email field label text is displayed correctly.
     * Asserts that the text retrieved matches the expected "Email *" label.
     */
    public void verifyemailHeaderTxt() {
        String emailtxt = getEmailadressTxt().getText();
        Assert.assertEquals(emailtxt, "Email *");
    }

    /**
     * Verifies that the mobile number field label text is displayed correctly.
     * Asserts that the text retrieved matches the expected "Mobile Number *" label.
     */
    public void verifymobileNoHeaderTxt() {
        String mobileNotxt = getMobileNoTxt().getText();
        Assert.assertEquals(mobileNotxt, "Mobile Number *");
    }

    /**
     * Verifies that the "First Name" field label is displayed correctly.
     * Asserts that the retrieved text matches the expected "First Name *".
     */
    public void verifyfirstNameHeaderTxt() {
        String firstNametxt = getFirstNameTxt().getText();
        Assert.assertEquals(firstNametxt, "First Name *");
    }

    /**
     * Verifies that the "Password" field label is displayed correctly.
     * Asserts that the retrieved text matches the expected "Password *".
     */
    public void verifypasswordHeaderTxt() {
        String passwordtxt = getPasswordTxt().getText();
        Assert.assertEquals(passwordtxt, "Password *");
    }

    /**
     * Verifies that the "Last Name" field label is displayed correctly.
     * Asserts that the retrieved text matches the expected "Last Name *".
     */
    public void verifylastNameHeaderTxt() {
        String lastNametxt = getLastNameTxt().getText();
        Assert.assertEquals(lastNametxt, "Last Name *");
    }

    /**
     * Verifies that the "Apartment, Suite, Building..." field label is displayed correctly.
     * Scrolls inside the sign-up popup before retrieving the text.
     * Asserts that the retrieved text matches the expected label.
     */
    public void verifyaptSuiteBuildingHeaderTxt() {
        scrollInsideSignUpPopup();
        String aptSuiteBuildingtxt = getAptSuitebuildingTxt().getText();
        Assert.assertEquals(aptSuiteBuildingtxt, "Apartment, Suite, Building... *");
    }

    /**
     * Verifies that the "Street City and Address" field label is displayed correctly.
     * Asserts that the retrieved text matches the expected "Street City and Address *".
     */
    public void verifystreetCityAddressHeaderTxt() {
        String streetCityAddresstxt = getStreetCityaddressTxt().getText();
        Assert.assertEquals(streetCityAddresstxt, "Street City and Address *");
    }


    /**
     * Verifies that the "Postcode" field label is displayed correctly.
     * Asserts that the retrieved text matches the expected "Postcode *".
     */
    public void verifypostCodeHeaderTxt() {
        String postCodetxt = getPostcodeTxt().getText();
        Assert.assertEquals(postCodetxt, "Postcode *");
    }

    /**
     * Verifies that the "Sign Up" button is initially disabled.
     * Asserts that the button is not enabled before entering valid inputs.
     */
    public void verifySignUpBtn() {
        boolean status = getSubmitbtn().isEnabled();
        Assert.assertFalse(status);
    }

    /**
     * Verifies that the Google login button is displayed on the page.
     * Asserts that the Google button is visible.
     */
    public void verifyGoogleBtn() {
        boolean googleIcon = getGoogleBtn().isDisplayed();
        Assert.assertTrue(googleIcon);
    }

    /**
     * Verifies that the Facebook login button is displayed on the page.
     * Asserts that the Facebook button is visible.
     */
    public void verifyFacebookBtn() {
        boolean facebookIcon = getFacebookBtn().isDisplayed();
        Assert.assertTrue(facebookIcon);
    }

    /**
     * Performs email validation by entering an invalid email and checking the error message.
     * Scrolls to the email input field, enters the email, and verifies the error message.
     *
     * @param email The email string to be tested.
     */
    public void performEmailValidations(String email) {
        scrollToElement(enterEmailId);
        elementSendKeys(enterEmailId, email);
        String emailErrortxt = getEmailAdressErrorMssgTxt().getText();
        Assert.assertEquals(emailErrortxt, "Please enter a valid email address");
    }

    /**
     * Performs validation for the mobile number field.
     * Enters a provided mobile number and verifies the expected error message.
     *
     * @param mobileNo The mobile number to be tested.
     */
    public void performMobileNoValidation(String mobileNo) {
        elementSendKeys(getMobileNo(), mobileNo);
        String mobileNoErrortxt = getMobileNoErrorMssgTxt().getText();
        Assert.assertEquals(mobileNoErrortxt, "Please enter a valid 4-16 digit mobile number");
    }

    /**
     * Performs validation for password length.
     * Enters a password with less than 8 characters and checks for the expected error message.
     *
     * @param ps The password to be tested.
     */
    public void performPassword8CharsValidation(String ps) {
        elementSendKeys(getPwd(), ps);
        String pass8charsLongErrortxt = getPassword8charslongErrorMssgTxt().getText();
        Assert.assertEquals(pass8charsLongErrortxt, "Password must be at least 8 characters long.");
    }

    /**
     * Performs validation for uppercase character requirement in the password.
     * Enters a password without uppercase letters and verifies the expected error message.
     *
     * @param ps The password to be tested.
     */
    public void performPasswordUpperCaseValidation(String ps) {
        elementSendKeys(getPwd(), ps);
        String passUpperCaseErrortxt = getPasswordUpperCaseErrorMssgTxt().getText();
        Assert.assertEquals(passUpperCaseErrortxt, "Password must contain at least one uppercase letter.");
    }

    /**
     * Performs validation for the special character requirement in the password.
     * Enters a password with only numbers and verifies the expected error message.
     */
    public void performPasswordSpecialcharValidation() {
        getPwd().sendKeys("1"); // Entering a password without special characters
        String passOneSpecialCharErrortxt = getAtLeastOneSpecialcharErrorMssgTxt().getText();
        Assert.assertEquals(passOneSpecialCharErrortxt, "Password must contain at least one special character.");
    }


    /**
     * Performs validation to check if the password contains at least one number.
     * Enters a password without numbers and verifies the expected error message.
     */
    public void performPasswordOneNumberValidation() {
        elementSendKeys(getPwd(), "U"); // Entering a password without numbers
        String passOneNumberErrortxt = getAtLeastOneNumberErrorMssgTxt().getText();
        Assert.assertEquals(passOneNumberErrortxt, "Password must contain at least one number.");
    }

    /**
     * Performs validation for the first name field.
     * Scrolls inside the signup popup, enters an invalid first name, and verifies the expected error message.
     *
     * @param fn The first name to be tested.
     */
    public void performFirstNameValidation(String fn) {
        scrollInsideSignUpPopup();
        elementSendKeys(getFirstName(), fn);
        String firstNameErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(firstNameErrortxt, "Please enter a valid first name");
    }

    /**
     * Performs validation for the last name field.
     * Enters an invalid last name and verifies the expected error message.
     *
     * @param ln The last name to be tested.
     */
    public void performlastNameValidation(String ln) {
        elementSendKeys(getLastName(), ln);
        String lastNameErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(lastNameErrortxt, "Please enter a valid first name"); // Possible issue: Error message should be for last name
    }


    /**
     * Performs validation for the "Apartment, Suite, Building" field.
     * Enters an invalid input and verifies if the expected error message is displayed.
     *
     * @param aptsutbldg The input value to be tested for the field.
     */
    public void performAptSuiteBldgValidation(String aptsutbldg) {
        elementSendKeys(getAptsuitebldg(), aptsutbldg); // Entering test value
        String aptSuiteBldgErrortxt = getFieldErrorMssgTxt().getText();
        Assert.assertEquals(aptSuiteBldgErrortxt, "This field must be at least 2 characters long");
    }

    /**
     * Performs validation for the "Street, City, and Address" field.
     * Enters an invalid input and verifies if the expected error message is displayed.
     *
     * @param streetCityAdd The input value to be tested for the field.
     */
    public void performStreetCityAddressValidation(String streetCityAdd) {
        elementSendKeys(getStreetcityadd(), streetCityAdd); // Entering test value
        String streetCityAddressBldgErrortxt = getFieldErrorMssgTxt().getText();
        Assert.assertEquals(streetCityAddressBldgErrortxt, "This field must be at least 2 characters long");
    }


    /**
     * Validates the "Postcode" field.
     *
     * This method inputs a test value into the postcode field and checks if the
     * expected error message appears when the input does not meet the required format.
     *
     * @param no The test input for the postcode field.
     */
    public void performPostCodeValidation(String no) {
        elementSendKeys(getPostcode(), no); // Entering test value
        String postCodeErrortxt = getPostCodeErrorMssgTxt().getText(); // Retrieving error message
        Assert.assertEquals(postCodeErrortxt, "Please enter a valid 4-6 pincode"); // Assertion
    }

    /**
     * Generates and inputs a random email address.
     *
     * Clears the email field and enters a randomly generated email address.
     */
    public void randmEmail() {
        getEnterEmailId().clear(); // Clearing existing input
        getEnterEmailId().sendKeys(randomString(4) + "@gmail.com"); // Generating and entering a random email
    }

    /**
     * Generates and inputs a random mobile number.
     *
     * Clears the mobile number field and enters a randomly generated number.
     */
    public void randomMobileNumbers() {
        getMobileNo().clear(); // Clearing existing input
        getMobileNo().sendKeys(randomNumber(9)); // Generating and entering a random 9-digit mobile number
    }

    /**
     * Generates and inputs a random password.
     *
     * Clears the password field and enters a randomly generated password
     * consisting of a mix of characters and numbers.
     */
    public void randomPassword() {
        getPwd().clear(); // Clearing existing input
        getPwd().sendKeys(randomString(4) + "@" + randomNumber(3)); // Generating and entering a random password
    }

    /**
     * Generates and inputs a random first name.
     *
     * Scrolls inside the signup popup, clears the first name field,
     * and enters a randomly generated first name.
     */
    public void randomFirstName() {
        scrollInsideSignUpPopup(); // Ensuring visibility of the field
        getFirstName().clear(); // Clearing existing input
        getFirstName().sendKeys(randomString(4)); // Generating and entering a random first name
    }

    /**
     * Generates and inputs a random last name.
     *
     * Clears the last name field and enters a randomly generated last name.
     */
    public void randomLastName() {
        getLastName().clear(); // Clearing existing input
        getLastName().sendKeys(randomString(4)); // Generating and entering a random last name
    }

    /**
     * Generates and inputs a random apartment, suite, or building name.
     *
     * Clears the respective field and enters a randomly generated value.
     */
    public void randomAptSuiteBldgName() {
        getAptsuitebldg().clear(); // Clearing existing input
        getAptsuitebldg().sendKeys(randomString(5)); // Generating and entering a random value
    }

    /**
     * Generates and inputs a random street, city, and address name.
     *
     * Clears the respective field and enters a randomly generated value.
     */
    public void randomStreetCityAddressName() {
        getStreetcityadd().clear(); // Clearing existing input
        getStreetcityadd().sendKeys(randomString(5)); // Generating and entering a random value
    }

    /**
     * Generates and inputs a random postcode.
     *
     * Clears the postcode field and enters a randomly generated number.
     */
    public void randomPostCode() {
        getPostcode().clear(); // Clearing existing input
        getPostcode().sendKeys(randomNumber(6)); // Generating and entering a random 6-digit postcode
    }

    /**
     * Verifies the "Login Here" link.
     *
     * Scrolls down the page and checks if the text of the login link matches the expected value.
     */
    public void verifyLoginHereLink() {
        scrollPageToDown(); // Scrolling to ensure visibility
        String loginHereTxt = getLoginhereLink().getText(); // Retrieving the link text
        Assert.assertEquals(loginHereTxt, "Login Here"); // Assertion
    }

    /**
     * Clicks on the "Login Here" link.
     *
     * This method simulates a user clicking on the login link.
     */
    public void clickLoginHereLink() {
        elementClick(getLoginhereLink()); // Clicking the login link
    }

    /**
     * Verifies the presence of the MAGP logo on the page.
     *
     * This method asserts that the logo is displayed as expected.
     */
    public void verifyMAGPlogo() {
        Assert.assertTrue(getMagpLogo().isDisplayed()); // Checking if the logo is displayed
    }

}


