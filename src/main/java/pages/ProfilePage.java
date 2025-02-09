package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends BaseClass {
    private WebDriver _driver;

    public ProfilePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//b[text()='User Profile']")
    private WebElement userProfileTxt;

    @FindBy(xpath = "//p[text()='Login ID']")
    private WebElement loginIdTxt;

    public WebElement getAreYouSureWantToLogouttxt() {
        return areYouSureWantToLogouttxt;
    }

    @FindBy(xpath = "//span[text()='Need to Purchase']")
    private WebElement needToPurchaseTxt;

    @FindBy(xpath = "//p[text()='Are you sure you want to Logout? ']")
    private WebElement areYouSureWantToLogouttxt;

    @FindBy(xpath = "//img[@src='/MAGP/p2.png']")
    private WebElement btnProfileIcon;

    public WebElement getEditProfilePictureBtn() {
        return editProfilePictureBtn;
    }

    @FindBy(xpath = "//button[text()='Edit Profile']")
    private WebElement editProfilebtn;

    @FindBy(xpath = "//img[@class='edit-icon']")
    WebElement editProfilePictureBtn;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement savebtn;

    @FindBy(xpath = "//span[normalize-space()='Introduction, Preface']")
    private WebElement introductionprefacelnk;

    @FindBy(xpath = "//span[normalize-space()='Calendar, Events']")
    private WebElement calendarEventsLink;


    @FindBy(xpath = "//span[normalize-space()='Introduction, General Provision']")
    private WebElement generalProvisionLink;

    @FindBy(xpath = "//img[@class='icon-lg me-3']")
    private WebElement backbtn;

    @FindBy(xpath = "//p[@class='error']")
    private WebElement logoutbtn;

    @FindBy(xpath = "//img[@class='img-close']")
    private WebElement crosspopupbtn;

    @FindBy(xpath = "//button[normalize-space()='No, Keep Login']")
    private WebElement nokeepLoginbtn;

    @FindBy(xpath = "//button[normalize-space()='Yes, Logout']")
    private WebElement yesLogoutbtn;

    @FindBy(id = "Mobile Number")
    private WebElement MobileNo;

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

    @FindBy(xpath = "//img[@class='img-close']")
    private WebElement btnXEditProPopUp;


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

    public WebElement getBtnXEditProPopUp() {
        return btnXEditProPopUp;
    }

    public WebElement getEditProfilebtn() {
        return editProfilebtn;
    }


    public WebElement getMobileNo() {
        return MobileNo;
    }


    public WebElement getPostCodeTxtBox() {
        return postcode;
    }

    public WebElement getSavebtn() {
        return savebtn;
    }

    public WebElement getIntroductionprefacelnk() {
        return introductionprefacelnk;
    }

    public WebElement getCalendarEventsLink() {
        return calendarEventsLink;
    }

    public WebElement getBackbtn() {
        return backbtn;
    }

    public WebElement getLogoutbtn() {
        return logoutbtn;
    }

    public WebElement getGeneralProvisionLink() {
        return generalProvisionLink;
    }

    public WebElement getCrosspopupbtn() {
        return crosspopupbtn;
    }

    public WebElement getNokeepLoginbtn() {
        return nokeepLoginbtn;
    }

    public WebElement getYesLogoutbtn() {
        return yesLogoutbtn;
    }

    public WebElement getBtnProfileIcon() {
        return btnProfileIcon;
    }

    public WebElement getLoginIdTxt() {
        return loginIdTxt;
    }

    public WebElement getNeedToPurchaseTxt() {
        return needToPurchaseTxt;
    }

    public WebElement getUserProfileTxt() {
        return userProfileTxt;
    }

    public void clickProfileBtn() {
        elementClick(getBtnProfileIcon());
    }

    public void verifyUserProfileTxt() {
        String ustxt = elementGetText(getUserProfileTxt());
        Assert.assertEquals(ustxt, "User Profile");
    }

    public void verifyLoginIDTxt() {
        String lgIDtxt = elementGetText(getLoginIdTxt());
        Assert.assertEquals(lgIDtxt, "Login ID");
    }

    public void verifyNeedtoPurchaseTxt() {
        String needToPurchasetxt = elementGetText(getNeedToPurchaseTxt());
        Assert.assertEquals(needToPurchasetxt, "Need to Purchase");
    }

    public void verifyLogoutTxt() {
        String logouttxt = elementGetText(getLogoutbtn());
        Assert.assertEquals(logouttxt, "Logout");
    }

    public void verifyNoKeepLoginTxt() {
        String nokeepLogintxt = elementGetText(getNokeepLoginbtn());
        Assert.assertEquals(nokeepLogintxt, "No, Keep Login");
    }

    public void verifyYesLogoutTxt() {
        String yeslogouttxt = elementGetText(getYesLogoutbtn());
        Assert.assertEquals(yeslogouttxt, "Yes, Logout");
    }

    public void verifyAreYouSureWantToLogoutTxt() {
        String areYouSureWantToLogouttxt = elementGetText(getAreYouSureWantToLogouttxt());
        Assert.assertEquals(areYouSureWantToLogouttxt, "Are you sure you want to Logout?");
    }

    public void verifySaveTxt() {
        String savetxt = elementGetText(getSavebtn());
        Assert.assertEquals(savetxt, "Save");
    }


    public void clickEditProfileBtn() {
        elementClick(getEditProfilebtn());
    }

    public void enterValuesEditProfile() {
        elementClear(getFirstName());
        getFirstName().sendKeys(randomString(4));
        elementClear(getMobileNo());
        getMobileNo().sendKeys(randomNumber(9));
        elementClear(getLastName());
        getLastName().sendKeys(randomString(4));
        elementClear(getAptsuitebldg());
        getAptsuitebldg().sendKeys(randomString(5));
        elementClear(getStreetcityadd());
        getStreetcityadd().sendKeys(randomString(5));
        elementClear(getPostcode());
        getPostcode().sendKeys(randomNumber(6));
        clickUsingJavaScript(getSavebtn());


    }

    public void enterValuesStaffEditProfile() {
        elementClear(getMobileNo());
        getMobileNo().sendKeys(randomNumber(9));
        elementClear(getAptsuitebldg());
        getAptsuitebldg().sendKeys(randomString(5));
        elementClear(getStreetcityadd());
        getStreetcityadd().sendKeys(randomString(5));
        elementClear(getPostcode());
        getPostcode().sendKeys(randomNumber(6));
        clickUsingJavaScript(getSavebtn());
    }

    public void clickXbuttonEditProfile() {
        elementClick(getBtnXEditProPopUp());
    }


    public void clickBtnLogout() {

        elementClick(getLogoutbtn());
    }

    public void clickBtnNoKeepLogout() {
        elementClick(getNokeepLoginbtn());
    }

    public void clickBtnYesLogout() {
        elementClick(getYesLogoutbtn());
    }

    public void clickBtnXLogoutPopUp() {
        elementClick(getBtnXEditProPopUp());
    }

    public void clickLinkPreface() {
        elementClick(getIntroductionprefacelnk());
    }

    public void clickLinkCalendarEvents() {
        elementClick(getCalendarEventsLink());
    }


    public void clickLinkGeneralProvision() {
        elementClick(getGeneralProvisionLink());

    }

    public void clickEditProPicBtn() {
        elementClick(getEditProfilePictureBtn());
//        getEditProfilePictureBtn().sendKeys("C:\\Users\\Mind-Graph\\Downloads\\bird-thumbnail.jpg");
        elementSendKeysFileUpload(getEditProfilePictureBtn(), "C:\\Users\\Mind-Graph\\Downloads\\bird-thumbnail.jpg");

    }


}


