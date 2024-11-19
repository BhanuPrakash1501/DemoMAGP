package testCases;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

public class TestVendorLoginPage extends BaseClass {
    PageObjectManager pm = new PageObjectManager();

    @Test
    public void testVendorLoginPageUI() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().verifyEmailTxt();
        pm.vendorLoginPage().verifyPasswordTxt();
        pm.vendorLoginPage().verifyForgetPasswordTxt();
        pm.vendorLoginPage().verifyGooglebtn();
        pm.vendorLoginPage().verifyFacebookbtn();
        pm.vendorLoginPage().verifyWelcomeTxt();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
        pm.vendorLoginPage().verifyWelcomeParagraphTxt();
        pm.vendorLoginPage().verifyRegisterNowLnk();


    }

    @Test
    public void testVendorWithValidCredentials() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");

    }

    @Test
    public void testVendorWithInValidCredentials() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().verifyInvalidEmail("assa");
    }

    @Test
    public void verifyHomePageUI() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.homePage().verifyWelcomeToMagpTxt();
        pm.homePage().verifyLatestAnnouncementTxt();
        pm.homePage().verifyLast7DaysTxt();
        pm.homePage().verifyViewAll();
    }

    @Test
    public void testGoogleLoginFunctionality(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickbtnGoogle();




    }

}
