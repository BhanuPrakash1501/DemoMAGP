package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestSourcingPage extends BaseTest {

    @Test
    public void clickTenderManagementmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderManagement();

    }

    @Test
    public void clickTenderAdministrationmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderAdministration();

    }

    @Test
    public void clickTenderEvaluationmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderEvaluation();

    }

    @Test
    public void clickAbortofTendermanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickAbortofTender();

    }

    @Test
    public void clickClarificationNegotiationpriortoAwardmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickClarificationNegotiationpriortoAward();

    }
}
