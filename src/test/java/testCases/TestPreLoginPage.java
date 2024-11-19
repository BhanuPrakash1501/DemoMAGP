package testCases;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

public class TestPreLoginPage extends BaseClass {
    PageObjectManager pm = new PageObjectManager();

    @Test
    public void testProLoginPageUI() {
        pm.preLoginPage().verifyPreLoginPage();
        pm.preLoginPage().verifyStaffLoginButton();
        pm.preLoginPage().verifyVendorLoginButton();
        pm.preLoginPage().verifyGuestLoginButton();
    }


}
