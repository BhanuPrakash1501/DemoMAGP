package testCases;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.io.IOException;

public class TestForgetPasswordPage extends BaseClass {
    PageObjectManager pm = new PageObjectManager();

    @Test
    public void verifyInvalidEmail() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyInvalidEMailAdressTxt(getCellValue("Testdata", 0, 3));
        pm.forgetPasswordPage().verifySendLinkButton();
        pm.forgetPasswordPage().verifyGobackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }

    @Test
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
