package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestFAQPage extends BaseTest {

    @Test
    public void faqSearcg() throws InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin("xixoja1991@craftapk.com", "Test@123");
        pm.homePage().clickFaq();
        pm.faqPage().searchFaq();
    }

    @Test
    public void listFaq() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickFaq();
        pm.faqPage().listOfFaqs();



    }
}
