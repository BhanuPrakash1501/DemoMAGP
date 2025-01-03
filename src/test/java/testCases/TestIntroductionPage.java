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

    @Test
    public void clickProcurementCodesOfEthics(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickProcurementCodesofethics();

    }

    @Test
    public void clickGeneralProvision() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickGeneralProvisions();

    }

    @Test
    public void clickTermsAndDefinationManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickTermsAndDefinations();

    }

    @Test
    public void clickProcessSymbols() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickProcessSymbols();

    }

    @Test
    public void clickValueChain() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickvalueChain();

    }




}
