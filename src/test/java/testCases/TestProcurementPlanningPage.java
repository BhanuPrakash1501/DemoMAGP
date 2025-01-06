package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestProcurementPlanningPage extends BaseTest {

    @Test
    public void clickBusinessCase() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickbusinessCase();

    }

    @Test
    public void clickAnnualProcurementplanningmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickAnnualProcurementplanning();

    }

    @Test
    public void clickStrategypaperManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickStrategypaper();

    }

}

