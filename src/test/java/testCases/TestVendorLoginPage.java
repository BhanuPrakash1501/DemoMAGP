package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

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
    public void testGoogleLoginFunctionality() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickbtnGoogle();


    }

}
