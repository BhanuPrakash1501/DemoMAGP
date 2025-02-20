package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.io.IOException;

//@Listeners(reports.ExtentReportManager.class)
public class TestVendorLoginPage extends BaseTest {


    @Test(groups = {"sanity"})
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

    @Test(groups = {"regression"})
    public void testVendorWithValidCredentials()  {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

    }

    @Test(groups = {"regression"})
    public void testVendorWithInValidCredentials() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().verifyInvalidEmail("assa");
    }

    @Test(groups = {"regression"})
    public void verifyHomePageUI() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.homePage().verifyWelcomeToMagpTxt();
        pm.homePage().verifyLatestAnnouncementTxt();
        pm.homePage().verifyLast7DaysTxt();

    }


    @Test(groups = {"regression"})
    public void clickManuals() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickPreface();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        pm.introductionPage().clickProcurementCodesofethics();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        pm.introductionPage().clickGeneralProvisions();

    }



    @Test(groups = {"regression"})
    public void manualTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickManualTab();
        pm.favouritesPage().favManualList();

    }

    @Test(groups = {"regression"})
    public void tenderTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickTenderTab();


    }

    @Test(groups = {"regression"})
    public void clickGallery() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        Thread.sleep(6000);
        pm.homePage().clickGalleryTab();
        pm.galleryPage().gallery();
        pm.galleryPage().searchGaller();

    }

    @Test(groups = {"regression"})
    public void clickNotifications() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        Thread.sleep(6000);
        pm.homePage().clickNotificationsTab();
        pm.notificationsPage().notifications();

    }

    @Test(groups = {"regression"})
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



    @Test(groups = {"regression"})
    public void testEditProfileFields() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().clickXbuttonEditProfile();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().enterValuesEditProfile();

    }



    @Test(groups = {"regression"})
    public void LogoutFunctionality() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnNoKeepLogout();
        Thread.sleep(3000);
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnYesLogout();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }


    @Test(groups = {"regression"})
    public void testLinks() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkPreface();
        Thread.sleep(3000);
        driver.navigate().back();
        pm.profilePage().clickLinkCalendarEvents();
        Thread.sleep(3000);
        driver.navigate().back();
        pm.profilePage().clickLinkGeneralProvision();

    }



    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
    public void clickfavoutitesManual() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().verifyViewAll();
        pm.homePage().clickViewAllBtn();
        pm.favouritesPage().clickfavTender();
//        pm.homePage().clickFavouritesTab();
//        pm.favouritesPage().clickTenderTab();
//        pm.favouritesPage().favTenderList();

    }

    @Test(groups = {"sanity"})
    public void searchByTitlesinGeneralTab() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
//        pm.vendorLoginPage().xbutton();
        pm.homePage().verifyViewAll();
        pm.homePage().clickViewAllBtn();
        pm.announcementPage().clickGeneralTab();

    }


}
