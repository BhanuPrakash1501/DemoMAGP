package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ProfilePage extends BaseClass {
    // WebDriver instance for handling browser interactions
    private WebDriver _driver;

    /**
     * Constructor to initialize the ProfilePage with the given WebDriver.
     * Uses PageFactory to initialize WebElements.
     *
     * @param driver WebDriver instance
     */
    public ProfilePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElement representing the "User Profile" text on the profile page
    @FindBy(xpath = "//b[text()='User Profile']")
    private WebElement userProfileTxt;

    // WebElement representing the "Login ID" label on the profile page
    @FindBy(xpath = "//p[text()='Login ID']")
    private WebElement loginIdTxt;

    /**
     * Returns the WebElement for the logout confirmation message.
     *
     * @return WebElement representing "Are you sure you want to Logout?"
     */
    public WebElement getAreYouSureWantToLogouttxt() {
        return areYouSureWantToLogouttxt;
    }

    // WebElement representing the "Need to Purchase" section on the profile page
    @FindBy(xpath = "//span[text()='Need to Purchase']")
    private WebElement needToPurchaseTxt;

    // WebElement representing the logout confirmation message
    @FindBy(xpath = "//p[text()='Are you sure you want to Logout? ']")
    private WebElement areYouSureWantToLogouttxt;

    // WebElement representing the profile icon button
    @FindBy(xpath = "//img[@src='/MAGP/p2.png']")
    private WebElement btnProfileIcon;

    /**
     * Returns the WebElement for the edit profile picture button.
     *
     * @return WebElement representing the edit profile picture button
     */
    public WebElement getEditProfilePictureBtn() {
        return editProfilePictureBtn;
    }

    // WebElement representing the "Edit Profile" button
    @FindBy(xpath = "//button[text()='Edit Profile']")
    private WebElement editProfilebtn;

    // WebElement for the profile picture edit icon
    @FindBy(xpath = "//img[@class='edit-icon']")
    WebElement editProfilePictureBtn;

    // WebElement representing the "Save" button on the profile page
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement savebtn;

    // WebElement representing the "Introduction, Preface" navigation link
    @FindBy(xpath = "//span[normalize-space()='Introduction, Preface']")
    private WebElement introductionprefacelnk;

    // WebElement representing the "Calendar, Events" navigation link
    @FindBy(xpath = "//span[normalize-space()='Calendar, Events']")
    private WebElement calendarEventsLink;

    // WebElement representing the "Introduction, General Provision" navigation link
    @FindBy(xpath = "//span[normalize-space()='Introduction, General Provision']")
    private WebElement generalProvisionLink;

    // WebElement representing the back button on the profile page
    @FindBy(xpath = "//img[@class='icon-lg me-3']")
    private WebElement backbtn;

    // WebElement representing the logout button (marked as an error class)
    @FindBy(xpath = "//p[@class='error']")
    private WebElement logoutbtn;

    // WebElement representing the close button on a popup
    @FindBy(xpath = "//img[@class='img-close']")
    private WebElement crosspopupbtn;

    // WebElement representing the "No, Keep Login" button in the logout confirmation popup
    @FindBy(xpath = "//button[normalize-space()='No, Keep Login']")
    private WebElement nokeepLoginbtn;

    // WebElement representing the "Yes, Logout" button in the logout confirmation popup
    @FindBy(xpath = "//button[normalize-space()='Yes, Logout']")
    private WebElement yesLogoutbtn;

    // WebElement for the "Mobile Number" input field
    @FindBy(id = "Mobile Number")
    private WebElement MobileNo;

    // WebElement for the "First Name" input field
    @FindBy(id = "First Name")
    private WebElement firstName;

    // WebElement for the "Last Name" input field
    @FindBy(id = "Last Name")
    private WebElement lastName;

    // WebElement for the "Apartment, Suite, Building..." input field
    @FindBy(id = "Apartment, Suite, Building...")
    private WebElement aptsuitebldg;

    // WebElement for the "Street City and Address" input field
    @FindBy(id = "Street City and Address")
    private WebElement streetcityadd;

    // WebElement for the "Postcode" input field
    @FindBy(id = "Postcode")
    private WebElement postcode;

    // WebElement representing the close button for the edit profile popup
    @FindBy(xpath = "//img[@class='img-close']")
    private WebElement btnXEditProPopUp;



    /**
     * Returns the WebElement for the "First Name" input field.
     *
     * @return WebElement representing the First Name field.
     */
    public WebElement getFirstName() {
        return firstName;
    }

    /**
     * Returns the WebElement for the "Last Name" input field.
     *
     * @return WebElement representing the Last Name field.
     */
    public WebElement getLastName() {
        return lastName;
    }

    /**
     * Returns the WebElement for the "Apartment, Suite, Building" input field.
     *
     * @return WebElement representing the Apartment/Suite/Building field.
     */
    public WebElement getAptsuitebldg() {
        return aptsuitebldg;
    }

    /**
     * Returns the WebElement for the "Street City and Address" input field.
     *
     * @return WebElement representing the Street/City/Address field.
     */
    public WebElement getStreetcityadd() {
        return streetcityadd;
    }

    /**
     * Returns the WebElement for the "Postcode" input field.
     *
     * @return WebElement representing the Postcode field.
     */
    public WebElement getPostcode() {
        return postcode;
    }

    /**
     * Returns the WebElement for the close button in the "Edit Profile" popup.
     *
     * @return WebElement representing the close button.
     */
    public WebElement getBtnXEditProPopUp() {
        return btnXEditProPopUp;
    }

    /**
     * Returns the WebElement for the "Edit Profile" button.
     *
     * @return WebElement representing the Edit Profile button.
     */
    public WebElement getEditProfilebtn() {
        return editProfilebtn;
    }

    /**
     * Returns the WebElement for the "Mobile Number" input field.
     *
     * @return WebElement representing the Mobile Number field.
     */
    public WebElement getMobileNo() {
        return MobileNo;
    }

    /**
     * Returns the WebElement for the "Postcode" input field.
     * This is a duplicate method of getPostcode().
     *
     * @return WebElement representing the Postcode field.
     */
    public WebElement getPostCodeTxtBox() {
        return postcode;
    }

    /**
     * Returns the WebElement for the "Save" button.
     *
     * @return WebElement representing the Save button.
     */
    public WebElement getSavebtn() {
        return savebtn;
    }

    /**
     * Returns the WebElement for the "Introduction, Preface" navigation link.
     *
     * @return WebElement representing the Introduction, Preface link.
     */
    public WebElement getIntroductionprefacelnk() {
        return introductionprefacelnk;
    }

    /**
     * Returns the WebElement for the "Calendar, Events" navigation link.
     *
     * @return WebElement representing the Calendar, Events link.
     */
    public WebElement getCalendarEventsLink() {
        return calendarEventsLink;
    }

    /**
     * Returns the WebElement for the "Back" button.
     *
     * @return WebElement representing the Back button.
     */
    public WebElement getBackbtn() {
        return backbtn;
    }

    /**
     * Returns the WebElement for the "Logout" button.
     *
     * @return WebElement representing the Logout button.
     */
    public WebElement getLogoutbtn() {
        return logoutbtn;
    }

    /**
     * Returns the WebElement for the "Introduction, General Provision" navigation link.
     *
     * @return WebElement representing the General Provision link.
     */
    public WebElement getGeneralProvisionLink() {
        return generalProvisionLink;
    }

    /**
     * Returns the WebElement for the close button on a popup.
     *
     * @return WebElement representing the close button on a popup.
     */
    public WebElement getCrosspopupbtn() {
        return crosspopupbtn;
    }

    /**
     * Returns the WebElement for the "No, Keep Login" button in the logout confirmation popup.
     *
     * @return WebElement representing the No, Keep Login button.
     */
    public WebElement getNokeepLoginbtn() {
        return nokeepLoginbtn;
    }

    /**
     * Returns the WebElement for the "Yes, Logout" button in the logout confirmation popup.
     *
     * @return WebElement representing the Yes, Logout button.
     */
    public WebElement getYesLogoutbtn() {
        return yesLogoutbtn;
    }

    /**
     * Returns the WebElement for the profile icon button.
     *
     * @return WebElement representing the Profile Icon button.
     */
    public WebElement getBtnProfileIcon() {
        return btnProfileIcon;
    }

    /**
     * Returns the WebElement for the "Login ID" label.
     *
     * @return WebElement representing the Login ID label.
     */
    public WebElement getLoginIdTxt() {
        return loginIdTxt;
    }

    /**
     * Returns the WebElement for the "Need to Purchase" section.
     *
     * @return WebElement representing the Need to Purchase section.
     */
    public WebElement getNeedToPurchaseTxt() {
        return needToPurchaseTxt;
    }

    /**
     * Returns the WebElement for the "User Profile" text.
     *
     * @return WebElement representing the User Profile text.
     */
    public WebElement getUserProfileTxt() {
        return userProfileTxt;
    }


    /**
     * Clicks on the Profile Icon button to navigate to the Profile Page.
     */
    public void clickProfileBtn() {
        elementClick(getBtnProfileIcon());
    }

    /**
     * Verifies that the "User Profile" text is displayed correctly.
     */
    public void verifyUserProfileTxt() {
        String ustxt = elementGetText(getUserProfileTxt());
        Assert.assertEquals(ustxt, "User Profile");
    }

    /**
     * Verifies that the "Login ID" text is displayed correctly.
     */
    public void verifyLoginIDTxt() {
        String lgIDtxt = elementGetText(getLoginIdTxt());
        Assert.assertEquals(lgIDtxt, "Login ID");
    }

    /**
     * Verifies that the "Need to Purchase" text is displayed correctly.
     */
    public void verifyNeedtoPurchaseTxt() {
        String needToPurchasetxt = elementGetText(getNeedToPurchaseTxt());
        Assert.assertEquals(needToPurchasetxt, "Need to Purchase");
    }

    /**
     * Verifies that the "Logout" text is displayed correctly.
     */
    public void verifyLogoutTxt() {
        String logouttxt = elementGetText(getLogoutbtn());
        Assert.assertEquals(logouttxt, "Logout");
    }

    /**
     * Verifies that the "No, Keep Login" text is displayed correctly in the logout confirmation popup.
     */
    public void verifyNoKeepLoginTxt() {
        String nokeepLogintxt = elementGetText(getNokeepLoginbtn());
        Assert.assertEquals(nokeepLogintxt, "No, Keep Login");
    }

    /**
     * Verifies that the "Yes, Logout" text is displayed correctly in the logout confirmation popup.
     */
    public void verifyYesLogoutTxt() {
        String yeslogouttxt = elementGetText(getYesLogoutbtn());
        Assert.assertEquals(yeslogouttxt, "Yes, Logout");
    }

    /**
     * Verifies that the logout confirmation message is displayed correctly.
     */
    public void verifyAreYouSureWantToLogoutTxt() {
        String areYouSureWantToLogouttxt = elementGetText(getAreYouSureWantToLogouttxt());
        Assert.assertEquals(areYouSureWantToLogouttxt, "Are you sure you want to Logout?");
    }

    /**
     * Verifies that the "Save" button text is displayed correctly.
     */
    public void verifySaveTxt() {
        scrollToElementAndWait(getSavebtn());
        String savetxt = elementGetText(getSavebtn());
        Assert.assertEquals(savetxt, "Save");
    }

    /**
     * Clicks on the "Edit Profile" button to enable profile editing.
     */
    public void clickEditProfileBtn() {
        elementClick(getEditProfilebtn());
    }

    /**
     * Enters values into the Edit Profile fields with randomly generated data
     * and clicks the "Save" button to update the profile.
     */
    public void enterValuesEditProfile() {
        // Clear the existing First Name field and enter a new random 4-character string
        elementClear(getFirstName());
        getFirstName().sendKeys(randomString(4));

        // Clear the existing Mobile Number field and enter a new random 9-digit number
        elementClear(getMobileNo());
        getMobileNo().sendKeys(randomNumber(9));

        // Clear the existing Last Name field and enter a new random 4-character string
        elementClear(getLastName());
        getLastName().sendKeys(randomString(4));

        // Clear the Apartment/Suite/Building field and enter a new random 5-character string
        elementClear(getAptsuitebldg());
        getAptsuitebldg().sendKeys(randomString(5));

        // Clear the Street, City, and Address field and enter a new random 5-character string
        elementClear(getStreetcityadd());
        getStreetcityadd().sendKeys(randomString(5));

        // Clear the Postcode field and enter a new random 6-digit number
        elementClear(getPostcode());
        getPostcode().sendKeys(randomNumber(6));

        // Click the "Save" button using JavaScript to submit the updated profile details
        clickUsingJavaScript(getSavebtn());
    }

    /**
     * Enters values into the staff's Edit Profile fields with randomly generated data
     * and clicks the "Save" button to update the profile.
     */
    public void enterValuesStaffEditProfile() {
        // Clear the existing mobile number field and enter a new random 9-digit number
        elementClear(getMobileNo());
        getMobileNo().sendKeys(randomNumber(9));

        // Clear the Apartment/Suite/Building field and enter a new random string
        elementClear(getAptsuitebldg());
        getAptsuitebldg().sendKeys(randomString(5));

        // Clear the Street, City, and Address field and enter a new random string
        elementClear(getStreetcityadd());
        getStreetcityadd().sendKeys(randomString(5));

        // Clear the Postcode field and enter a new random 6-digit number
        elementClear(getPostcode());
        getPostcode().sendKeys(randomNumber(6));

        // Click the "Save" button using JavaScript to submit the updated staff profile details
        clickUsingJavaScript(getSavebtn());
    }


    /**
     * Clicks the close button on the Edit Profile popup.
     */
    public void clickXbuttonEditProfile() {
        elementClick(getBtnXEditProPopUp());
    }

    /**
     * Clicks the Logout button to initiate the logout process.
     */
    public void clickBtnLogout() {
        elementClick(getLogoutbtn());
    }

    /**
     * Clicks the "No, Keep Login" button in the logout confirmation popup.
     */
    public void clickBtnNoKeepLogout() {
        elementClick(getNokeepLoginbtn());
    }

    /**
     * Clicks the "Yes, Logout" button in the logout confirmation popup.
     */
    public void clickBtnYesLogout() {
        elementClick(getYesLogoutbtn());
    }

    /**
     * Clicks the close button in the Logout confirmation popup.
     */
    public void clickBtnXLogoutPopUp() {
        elementClick(getBtnXEditProPopUp());
    }

    /**
     * Clicks on the "Introduction, Preface" link.
     */
    public void clickLinkPreface() {
        elementClick(getIntroductionprefacelnk());
    }

    /**
     * Clicks on the "Calendar, Events" link.
     */
    public void clickLinkCalendarEvents() {
        elementClick(getCalendarEventsLink());
    }

    /**
     * Clicks on the "General Provision" link.
     */
    public void clickLinkGeneralProvision() {
        elementClick(getGeneralProvisionLink());
    }

    /**
     * Clicks on the "Edit Profile Picture" button and uploads a profile picture.
     */
    public void clickEditProPicBtn() {
        elementClick(getEditProfilePictureBtn());

        // Uploads the selected image file
        elementSendKeysFileUpload(getEditProfilePictureBtn(), "C:\\Users\\Mind-Graph\\Downloads\\bird-thumbnail.jpg");
    }

    public void uploadpic() throws InterruptedException, AWTException {
        Thread.sleep(3000);
        WebElement ele = findElementByXpath("//*[@class='edit-icon']");
        clickUsingJavaScript(ele);
        // Set the path of the file you want to upload
        String filePath = "C:\\Users\\Mind-Graph\\IdeaProjects\\DemoMAGP\\logo\\MagpLogo.png";

        // Create an instance of the Robot class
        Robot robot = new Robot();

        // Use Robot to type the file path into the file dialog
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Press Ctrl + V to paste the file path into the file dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait for a second before pressing Enter
        Thread.sleep(1000);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait for the upload to complete (optional)
        Thread.sleep(5000);

        // Additional code for testing (e.g., check if the upload was successful)
        System.out.println("File uploaded successfully!");
    }



}


