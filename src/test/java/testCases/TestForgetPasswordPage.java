package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(reports.ExtentReportManager.class)
public class TestForgetPasswordPage extends BaseTest {


    @Test
    public void verifyUI(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyMAGPlogo();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyForgetpasswordimgTxt();
        pm.forgetPasswordPage().verifyImgDesctxt();

    }

    @Test
    public void verifyInvalidEmail() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyInvalidEMailAdressTxt(("asddasd"));
        pm.forgetPasswordPage().verifySendLinkButton();
        pm.forgetPasswordPage().clickGobackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }



    @Test
    public void verifyValidEmail() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyValidEMailAdressTxt("xixoja1991@craftapk.com");
        pm.forgetPasswordPage().clickBtnSendLink();
        pm.forgetPasswordPage().verifyWellDonetxt();
        pm.forgetPasswordPage().verifyPopUpdesctxtMssg();
        pm.forgetPasswordPage().clickBackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }

}
