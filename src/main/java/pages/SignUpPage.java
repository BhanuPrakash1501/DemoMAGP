package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SignUpPage extends BaseClass {

    public WebDriver _driver;

    public SignUpPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "Email")
    private WebElement enterEmailId;

    @FindBy(id = "Mobile Number")
    private WebElement MobileNo;

    @FindBy(id = "Password")
    private WebElement pwd;

    @FindBy(id = "First Name")
    private WebElement firstName;

    @FindBy(id = "Last Name")
    private WebElement lastName;

    @FindBy(id = "Apartment, Suite, Building...")
    private WebElement aptsuitebldg;

    @FindBy(id = "Street City and Address")
    private WebElement streetcityadd;

    @FindBy(id = "Postcode")
    private WebElement postcode;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitbtn;

    @FindBy(xpath = "//a[text()='Login Here']")
    private WebElement loginhereLink;

    @FindBy(xpath = "//h2[text()='Signup']")
    private WebElement signUpHeaderTxt;

    @FindBy(xpath = "//*[text()='Email *']")
    private WebElement emailadressTxt;

    @FindBy(xpath = "//*[text()='Mobile Number *']")
    private WebElement mobileNoTxt;

    @FindBy(xpath = "//*[text()='Password *']")
    private WebElement passwordTxt;

    @FindBy(xpath = "//*[text()='First Name *']")
    private WebElement firstNameTxt;

    @FindBy(xpath = "//*[text()='Last Name *']")
    private WebElement lastNameTxt;

    @FindBy(xpath = "//*[text()='Apartment, Suite, Building... *']")
    private WebElement aptSuitebuildingTxt;

    @FindBy(xpath = "//*[text()='Street City and Address *']")
    private WebElement streetCityaddressTxt;

    @FindBy(xpath = "//*[text()='Postcode *']")
    private WebElement postcodeTxt;

    @FindBy(xpath = "//div[text()='Please enter a valid email address']")
    private WebElement emailAdressErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Please enter a valid 4-16 digit mobile number']")
    private WebElement mobileNoErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Password must be at least 8 characters long.']")
    private WebElement password8charslongErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Password must contain at least one uppercase letter.']")
    private WebElement passwordUpperCaseErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Password must contain at least one number.']")
    private WebElement atLeastOneNumberErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Password must contain at least one special character.']")
    private WebElement atLeastOneSpecialcharErrorMssgTxt;

    @FindBy(xpath = "//div[text()='This field must be at least 2 characters long']")
    private WebElement fieldCharLengthErrorMssgTxt;

    @FindBy(xpath = "//div[text()='Please enter a valid 4-6 pincode']")
    private WebElement postCodeErrorMssgTxt;

    @FindBy(xpath = "(//img[contains(@class, 'icon')])[1]")
    private WebElement googleBtn;

    @FindBy(xpath = "(//img[contains(@class, 'icon')])[2]")
    private WebElement facebookBtn;

    public WebElement getEmailAdressErrorMssgTxt() {
        return emailAdressErrorMssgTxt;
    }

    public WebElement getMobileNoErrorMssgTxt() {
        return mobileNoErrorMssgTxt;
    }

    public WebElement getPassword8charslongErrorMssgTxt() {
        return password8charslongErrorMssgTxt;
    }

    public WebElement getPasswordUpperCaseErrorMssgTxt() {
        return passwordUpperCaseErrorMssgTxt;
    }

    public WebElement getAtLeastOneNumberErrorMssgTxt() {
        return atLeastOneNumberErrorMssgTxt;
    }

    public WebElement getAtLeastOneSpecialcharErrorMssgTxt() {
        return atLeastOneSpecialcharErrorMssgTxt;
    }

    public WebElement getFieldCharLengthErrorMssgTxt() {
        return fieldCharLengthErrorMssgTxt;
    }

    public WebElement getPostCodeErrorMssgTxt() {
        return postCodeErrorMssgTxt;
    }

    public WebElement getEnterEmailId() {
        return enterEmailId;
    }

    public WebElement getMobileNo() {
        return MobileNo;
    }

    public WebElement getPwd() {
        return pwd;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAptsuitebldg() {
        return aptsuitebldg;
    }

    public WebElement getStreetcityadd() {
        return streetcityadd;
    }

    public WebElement getPostcode() {
        return postcode;
    }

    public WebElement getSubmitbtn() {
        return submitbtn;
    }

    public WebElement getLoginhereLink() {
        return loginhereLink;
    }

    public WebElement getSignUpHeaderTxt() {
        return signUpHeaderTxt;
    }

    public WebElement getEmailadressTxt() {
        return emailadressTxt;
    }

    public WebElement getMobileNoTxt() {
        return mobileNoTxt;
    }

    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    public WebElement getFirstNameTxt() {
        return firstNameTxt;
    }

    public WebElement getLastNameTxt() {
        return lastNameTxt;
    }

    public WebElement getAptSuitebuildingTxt() {
        return aptSuitebuildingTxt;
    }

    public WebElement getStreetCityaddressTxt() {
        return streetCityaddressTxt;
    }

    public WebElement getPostcodeTxt() {
        return postcodeTxt;
    }

    public WebElement getGoogleBtn() {
        return googleBtn;
    }

    public WebElement getFacebookBtn() {
        return facebookBtn;
    }

    public void verifySignUpHeaderTxt() {
        String signuptxt = getSignUpHeaderTxt().getText();
        Assert.assertEquals(signuptxt, "Signup");
    }

    public void verifyemailHeaderTxt() {
        String emailtxt = getEmailadressTxt().getText();
        Assert.assertEquals(emailtxt, "Email *");
    }

    public void verifymobileNoHeaderTxt() {
        String mobileNotxt = getMobileNoTxt().getText();
        Assert.assertEquals(mobileNotxt, "Mobile Number *");
    }

    public void verifyfirstNameHeaderTxt() {
        String firstNametxt = getFirstNameTxt().getText();
        Assert.assertEquals(firstNametxt, "First Name *");
    }

    public void verifypasswordHeaderTxt() {
        String passwordtxt = getPasswordTxt().getText();
        Assert.assertEquals(passwordtxt, "Password *");
    }

    public void verifylastNameHeaderTxt() {
        String lastNametxt = getLastNameTxt().getText();
        Assert.assertEquals(lastNametxt, "Last Name *");
    }

    public void verifyaptSuiteBuildingHeaderTxt() {
        scrollInsideSignUpPopup();
        String aptSuiteBuildingtxt = getAptSuitebuildingTxt().getText();
        Assert.assertEquals(aptSuiteBuildingtxt, "Apartment, Suite, Building... *");
    }

    public void verifystreetCityAddressHeaderTxt() {
        String streetCityAddresstxt = getStreetCityaddressTxt().getText();
        Assert.assertEquals(streetCityAddresstxt, "Street City and Address *");
    }

    public void verifypostCodeHeaderTxt() {
        String postCodetxt = getPostcodeTxt().getText();
        Assert.assertEquals(postCodetxt, "Postcode *");
    }

    public void verifySignUpBtn() {
        boolean status = getSubmitbtn().isEnabled();
        Assert.assertFalse(status);

    }

    public void verifyGoogleBtn() {
        boolean googleIcon = getGoogleBtn().isDisplayed();
        Assert.assertTrue(googleIcon);
    }

    public void verifyFacebookBtn() {
        boolean facebookIcon = getFacebookBtn().isDisplayed();
        Assert.assertTrue(facebookIcon);
    }

    public void performEmailValidations(String email) {
        scrollToElement(enterEmailId);
        elementSendKeys(enterEmailId, email);
        String emailErrortxt = getEmailAdressErrorMssgTxt().getText();
        Assert.assertEquals(emailErrortxt, "Please enter a valid email address");

    }

    public void performMobileNoValidation(String mobileNo) {
        elementSendKeys(getMobileNo(), mobileNo);
        String mobileNoErrortxt = getMobileNoErrorMssgTxt().getText();
        Assert.assertEquals(mobileNoErrortxt, "Please enter a valid 4-16 digit mobile number");

    }

    public void performPassword8CharsValidation(String ps) {
        elementSendKeys(getPwd(), ps);
        String pass8charsLongErrortxt = getPassword8charslongErrorMssgTxt().getText();
        Assert.assertEquals(pass8charsLongErrortxt, "Password must be at least 8 characters long.");

    }

    public void performPasswordUpperCaseValidation(String ps) {
        elementSendKeys(getPwd(), ps);
        String passUpperCaseErrortxt = getPasswordUpperCaseErrorMssgTxt().getText();
        Assert.assertEquals(passUpperCaseErrortxt, "Password must contain at least one uppercase letter.");

    }

    public void performPasswordSpecialcharValidation() {
        getPwd().sendKeys("1");
        String passOneSpecialCharErrortxt = getAtLeastOneSpecialcharErrorMssgTxt().getText();
        Assert.assertEquals(passOneSpecialCharErrortxt, "Password must contain at least one special character.");

    }

    public void performPasswordOneNumberValidation() {
        elementSendKeys(getPwd(), "U");
        String passOneNumberErrortxt = getAtLeastOneNumberErrorMssgTxt().getText();
        Assert.assertEquals(passOneNumberErrortxt, "Password must contain at least one number.");

    }

    public void performFirstNameValidation(String fn) {
        scrollInsideSignUpPopup();
        elementSendKeys(getFirstName(), fn);
        String firstNameErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(firstNameErrortxt, "This field must be at least 2 characters long");

    }

    public void performlastNameValidation(String ln) {
        elementSendKeys(getLastName(), ln);
        String lastNameErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(lastNameErrortxt, "This field must be at least 2 characters long");

    }

    public void performAptSuiteBldgValidation(String aptsutbldg) {
        elementSendKeys(getAptsuitebldg(), aptsutbldg);
        String aptSuiteBldgErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(aptSuiteBldgErrortxt, "This field must be at least 2 characters long");

    }

    public void performStreetCityAddressValidation(String streetCityAdd) {
        elementSendKeys(getStreetcityadd(), streetCityAdd);
        String streetCityAddressBldgErrortxt = getFieldCharLengthErrorMssgTxt().getText();
        Assert.assertEquals(streetCityAddressBldgErrortxt, "This field must be at least 2 characters long");

    }

    public void performPostCodeValidation(String no) {
        elementSendKeys(getPostcode(), no);
        String postCodeErrortxt = getPostCodeErrorMssgTxt().getText();
        Assert.assertEquals(postCodeErrortxt, "Please enter a valid 4-6 pincode");

    }

    public void randmEmail() {
        getEnterEmailId().clear();
        getEnterEmailId().sendKeys(randomString(4) + "@gmail.com");

    }

    public void randomMobileNumbers() {
        getMobileNo().clear();
        getMobileNo().sendKeys(randomNumber(9));

    }

    public void randomPassword() {
        getPwd().clear();
        getPwd().sendKeys(randomString(4) + "@" + randomNumber(3));
    }

    public void randomFirstName() {
        scrollInsideSignUpPopup();
        getFirstName().clear();
        getFirstName().sendKeys(randomString(4));
    }

    public void randomLastName() {
        getLastName().clear();
        getLastName().sendKeys(randomString(4));
    }

    public void randomAptSuiteBldgName() {
        getAptsuitebldg().clear();
        getAptsuitebldg().sendKeys(randomString(5));
    }

    public void randomStreetCityAddressName() {
        getStreetcityadd().clear();
        getStreetcityadd().sendKeys(randomString(5));
    }

    public void randomPostCode() {
        getPostcode().clear();
        getPostcode().sendKeys(randomNumber(6));
    }

    public void verifyLoginHereLink() {
        scrollPageToDown();
        String loginHereTxt = getLoginhereLink().getText();
        Assert.assertEquals(loginHereTxt, "Login Here");
    }

    public void clickLoginHereLink() {
        elementClick(getLoginhereLink());

    }


}


