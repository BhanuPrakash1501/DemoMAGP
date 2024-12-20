package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestIntroductionPage extends BaseTest {

    @Test
    public void verifyUI(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().verifyIntroductionTxt();
        pm.introductionPage().verifyPrefaceTxt();
        pm.introductionPage().verifyProcurementCodesofethicstxt();
        pm.introductionPage().verifyGeneralProvisiontxt();
        pm.introductionPage().verifyWantToViewMoretxt();
        pm.introductionPage().verifyWantToViewMoreDesctxt();
        pm.introductionPage().verifyPurchasedIdTxt();

    }
    @Test
    public void clickPurchasedIdButton(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickBtnPurchasedLoginID();
        pm.introductionPage().verifyComingSoonTxt();
        pm.introductionPage().verifyWeWillNotifyYouTxt();
        pm.introductionPage().clickBackToHomePage();
    }

    @Test
    public void clickPrefaceManual(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickPreface();

    }




}
