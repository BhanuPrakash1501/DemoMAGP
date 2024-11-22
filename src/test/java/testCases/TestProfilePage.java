package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

@Listeners(reports.ExtentReportManager.class)
public class TestProfilePage extends BaseTest {


    @Test
    public void testProfilePage() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
    }

    @Test
    public void testEditProfileFields() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().enterValuesEditProfile();

    }

    @Test
    public void testXbuttonEditProfile() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().clickXbuttonEditProfile();


    }

    @Test
    public void testNoLogoutFunctionality() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnNoKeepLogout();

    }

    @Test
    public void testYesLogoutFunctionality() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnYesLogout();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }

    @Test
    public void testPrefaceQuickLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkPreface();

    }

    @Test
    public void testCalendarEventLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkCalendarEvents();

    }

    @Test
    public void testGeneralProvisionLink(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkGeneralProvision();

    }

//    @Test
//    public void uploadProPic(){
//        pm.preLoginPage().clickBtnvendorLogin();
//        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
//        pm.vendorLoginPage().xbutton();
//        pm.profilePage().clickProfileBtn();
//        pm.profilePage().clickEditProPicBtn();
//    }


}
