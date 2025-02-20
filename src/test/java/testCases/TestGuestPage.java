package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestGuestPage extends BaseTest {

    @Test(groups = {"sanity"})
    public void clickGuestLoginBtn() {
        pm.preLoginPage().clickBtnguestLogin();
    }

    @Test(groups = {"regression"})
    public void verifyLoginPopUPUI() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().verifyLoginIDpopUpTxt();
        pm.homePage().clickXbtnLoginPopUp();

    }

    @Test(groups = {"regression"})
    public void clickLoginButtonInPopUp() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickLoginBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }


    @Test(groups = {"regression"})
    public void clickprofileIcon() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.profilePage().clickProfileBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    @Test(groups = {"regression"})
    public void verifyLatestAnnouncements() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyLatestAnnouncementTxt();
    }

    @Test(groups = {"regression"})
    public void clickOnViewAllBtn() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyViewAll();
        pm.homePage().clickViewAllBtn();
        pm.homePage().clickLoginBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    @Test(groups = {"regression"})
    public void clickContactdirectoryLink()  {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnContactDirectoryLink();

    }

    @Test(groups = {"regression"})
    public void clickProcureHereLink() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnProcureHereLoginLink();

    }

    @Test(groups = {"regression"})
    public void clickVMSLink()  {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickOnVenderManagementSystemLink();

    }

    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
    public void verifytabs(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyHometab();
        pm.homePage().verifyFAQtab();
        pm.homePage().verifyENGtab();


    }


}
