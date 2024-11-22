package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

@Listeners(reports.ExtentReportManager.class)
public class TestPreLoginPage extends BaseTest {


    @Test
    public void testProLoginPageUI() {
        pm.preLoginPage().verifyPreLoginPage();
        pm.preLoginPage().verifyStaffLoginButton();
        pm.preLoginPage().verifyVendorLoginButton();
        pm.preLoginPage().verifyGuestLoginButton();
    }


}
