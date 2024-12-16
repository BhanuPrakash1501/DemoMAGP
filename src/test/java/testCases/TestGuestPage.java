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
    public void clickOnViewAllBrn() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().verifyViewAll();
        pm.homePage().clickViewAllBtn();
        pm.homePage().clickLoginBtn();
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    @Test
    public void clickContactdirectoryLink() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().xbutton();
        Thread.sleep(2000);
        pm.homePage().clickOnContactDirectoryLink();

    }

    @Test
    public void clickProcureHereLink() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().xbutton();
        Thread.sleep(2000);
        pm.homePage().clickOnProcureHereLoginLink();

    }

    @Test
    public void clickOnIntroductionModule() {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
//        pm.homePage().xbutton();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().verifyIntroductionTxt();

    }


}
