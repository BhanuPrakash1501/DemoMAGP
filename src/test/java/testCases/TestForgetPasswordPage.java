package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(reports.ExtentReportManager.class)
public class TestForgetPasswordPage extends BaseTest {


    @Test
    public void verifyInvalidEmail() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyInvalidEMailAdressTxt(("asddasd"));
        pm.forgetPasswordPage().verifySendLinkButton();
        pm.forgetPasswordPage().verifyGobackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }



    @Test(dependsOnMethods = {"verifyInvalidEmail"})
    public void verifyValidEmail() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyValidEMailAdressTxt("xixoja1991@craftapk.com");
        pm.forgetPasswordPage().verifySendLinkButton();
        pm.forgetPasswordPage().clickBtnSendLink();
        pm.forgetPasswordPage().verifyGobackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }

}
