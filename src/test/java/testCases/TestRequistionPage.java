package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestRequistionPage extends BaseTest {

    @Test
    public void clickPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickPurchaseRequisition();

    }

    @Test
    public void clickProcessOfPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickProcessingofPurchaseRequisition();

    }
}
