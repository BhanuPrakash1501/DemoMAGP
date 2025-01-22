package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestGuestPage extends BaseTest {

    @Test
    public void clickGuestLoginBtn() {
        pm.preLoginPage().clickBtnguestLogin();
    }

    @Test
    public void verifyLoginPopUPUI() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().verifyLoginIDpopUpTxt();
        pm.homePage().clickXbtnLoginPopUp();

    }

    @Test
    public void clickLoginButtonInPopUp() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickLoginBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }


    @Test
    public void clickprofileIcon() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.profilePage().clickProfileBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    @Test
    public void verifyLatestAnnouncements() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyLatestAnnouncementTxt();
    }

    @Test
    public void clickOnViewAllBtn() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyViewAll();
        pm.homePage().clickViewAllBtn();
        pm.homePage().clickLoginBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    @Test
    public void clickContactdirectoryLink()  {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnContactDirectoryLink();

    }

    @Test
    public void clickProcureHereLink() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnProcureHereLoginLink();

    }

    @Test
    public void clickVMSLink()  {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnVenderManagementSystemLink();

    }

    @Test
    public void clickOnIntroductionModule() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().verifyIntroductionTxt();
        pm.introductionPage().verifyPrefaceDesctxt();
        pm.introductionPage().verifyWantToViewMoretxt();
        pm.introductionPage().verifyIfWantToViewMoretxt();
        pm.introductionPage().verifyLoginBtntxt();

    }

    @Test
    public void clickLoginBtn() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().verifyWantToViewMoretxt();
        pm.introductionPage().verifyIfWantToViewMoretxt();
        pm.introductionPage().verifyLoginBtntxt();
        pm.introductionPage().clickloginBtn();

    }

    @Test
    public void verifytabs(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyHometab();
        pm.homePage().verifyFAQtab();
        pm.homePage().verifyENGtab();


    }


}
