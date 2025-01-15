package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.io.IOException;

@Listeners(reports.ExtentReportManager.class)
public class TestVendorLoginPage extends BaseTest {


    @Test
    public void testVendorLoginPageUI()  {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().verifyMAGPlogo();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
        pm.vendorLoginPage().verifyEmailTxt();
        pm.vendorLoginPage().verifyPasswordTxt();
        pm.vendorLoginPage().verifyForgetPasswordTxt();
        pm.vendorLoginPage().verifyGooglebtn();
//        pm.vendorLoginPage().verifyFacebookbtn();
        pm.vendorLoginPage().verifyDonthaveAnAccountTxt();
        pm.vendorLoginPage().verifyRegisterNowLnk();
        pm.vendorLoginPage().verifyWelcomeTxt();
        pm.vendorLoginPage().verifyWelcomeParagraphTxt();




    }

    @Test
    public void testVendorWithValidCredentials() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

    }

    @Test
    public void testVendorWithInValidCredentials() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().verifyInvalidEmail("assa");
    }

    @Test
    public void verifyHomePageUI() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.homePage().verifyWelcomeToMagpTxt();
        pm.homePage().verifyLatestAnnouncementTxt();
        pm.homePage().verifyLast7DaysTxt();
        pm.homePage().verifyViewAll();
    }


    @Test
    public void clickPrefaceManual(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickPreface();

    }

    @Test
    public void clickProcurementCodesOfEthics(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickProcurementCodesofethics();

    }

    @Test
    public void clickGeneralProvision() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickGeneralProvisions();

    }

    @Test
    public void manualTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickManualTab();
        pm.favouritesPage().favManualList();;

    }

    @Test
    public void tenderTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickTenderTab();


    }

    @Test
    public void clickGallery() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        Thread.sleep(6000);
        pm.homePage().clickGalleryTab();
        pm.galleryPage().gallery();
        pm.galleryPage().searchGaller();

    }

    @Test
    public void clickNotifications() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        Thread.sleep(6000);
        pm.homePage().clickNotificationsTab();
        pm.notificationsPage().notifications();

    }

    @Test
    public void verifyUI(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().verifyUserProfileTxt();
        pm.profilePage().verifyLoginIDTxt();
        pm.profilePage().verifyNeedtoPurchaseTxt();
        pm.profilePage().verifyLogoutTxt();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().verifyAreYouSureWantToLogoutTxt();
        pm.profilePage().verifyNoKeepLoginTxt();
        pm.profilePage().verifyYesLogoutTxt();
        pm.profilePage().clickBtnXLogoutPopUp();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().verifySaveTxt();
    }


    @Test
    public void testProfilePage() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
    }

    @Test
    public void testEditProfileFields() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().enterValuesEditProfile();

    }

    @Test
    public void testXbuttonEditProfile() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().clickXbuttonEditProfile();


    }

    @Test
    public void testNoLogoutFunctionality() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnNoKeepLogout();

    }

    @Test
    public void testYesLogoutFunctionality() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnYesLogout();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }

    @Test
    public void testPrefaceQuickLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkPreface();

    }

    @Test
    public void testCalendarEventLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkCalendarEvents();

    }

    @Test
    public void testGeneralProvisionLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkGeneralProvision();

    }

    @Test
    public void registerNowUIValidations() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().verifyMAGPlogo();
        pm.signUpPage().verifySignUpHeaderTxt();
        pm.signUpPage().verifyemailHeaderTxt();
        pm.signUpPage().verifymobileNoHeaderTxt();
        pm.signUpPage().verifypasswordHeaderTxt();
        pm.signUpPage().verifyfirstNameHeaderTxt();
        pm.signUpPage().verifylastNameHeaderTxt();
        pm.signUpPage().verifyaptSuiteBuildingHeaderTxt();
        pm.signUpPage().verifystreetCityAddressHeaderTxt();
        pm.signUpPage().verifypostCodeHeaderTxt();
        pm.signUpPage().verifyGoogleBtn();
//        pm.signUpPage().verifyFacebookBtn();
        pm.signUpPage().verifyAlreadyHaveAnAccountTxt();
        pm.signUpPage().verifyWelcometxt();
        pm.signUpPage().verifyDesctxt();
        pm.signUpPage().verifyLoginHereLink();


    }

    @Test
    public void signUpFieldValidations() throws IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().performEmailValidations("as");
        pm.signUpPage().performMobileNoValidation("12");
        pm.signUpPage().performPassword8CharsValidation("as");
        pm.signUpPage().performPasswordUpperCaseValidation("cdefgh");
        pm.signUpPage().performPasswordOneNumberValidation();
        pm.signUpPage().performPasswordSpecialcharValidation();
        pm.signUpPage().performFirstNameValidation("a");
        pm.signUpPage().performlastNameValidation("a");
        pm.signUpPage().performAptSuiteBldgValidation("a");
        pm.signUpPage().performStreetCityAddressValidation("a");
        pm.signUpPage().performPostCodeValidation("34");
        pm.signUpPage().verifySignUpBtn();

    }

    @Test
    public void enterValuesForSignUP() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().randmEmail();
        pm.signUpPage().randomMobileNumbers();
        pm.signUpPage().randomPassword();
        pm.signUpPage().randomFirstName();
        pm.signUpPage().randomLastName();
        pm.signUpPage().randomAptSuiteBldgName();
        pm.signUpPage().randomStreetCityAddressName();
        pm.signUpPage().randomPostCode();
        pm.signUpPage().clickLoginHereLink();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }


}
