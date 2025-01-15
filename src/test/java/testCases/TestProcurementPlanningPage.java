package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestProcurementPlanningPage extends BaseTest {

    @Test
    public void clickBusinessCase() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickbusinessCase();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickbusinessCasepolicies();

    }

    @Test
    public void clickAnnualProcurementplanningmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickAnnualProcurementplanning();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickbusinessCasepolicies();

    }

    @Test
    public void clickStrategypaperManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickStrategypaper();

    }

}

