package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestStaffLogin extends BaseTest {
    @Test
    public void TestStaffLoginWithValidCredentials(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");

    }
}
