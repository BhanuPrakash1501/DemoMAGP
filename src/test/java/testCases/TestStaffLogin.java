package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestStaffLogin extends BaseTest {
    @Test
    public void TestStaffLoginWithValidCredentials(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();

    }

    @Test
    public void ClickOnCalendar() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickCalendarTab();
        pm.calendarPage().Calendar();

    }

    @Test
    public void manualTab(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickManualTab();
        pm.favouritesPage().favManualList();;

    }

    @Test
    public void tenderTab(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickTenderTab();


    }

    @Test
    public void clickGallery() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickGalleryTab();
        pm.galleryPage().gallery();

    }

    @Test
    public void clickPrefaceManual(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickPreface();

    }

    @Test
    public void clickProcurementCodesOfEthics(){
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickProcurementCodesofethics();

    }

    @Test
    public void clickGeneralProvision() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickGeneralProvisions();

    }

    @Test
    public void clickTermsAndDefinationManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickTermsAndDefinations();

    }

    @Test
    public void clickProcessSymbols() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickProcessSymbols();

    }

    @Test
    public void clickValueChain() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickvalueChain();

    }

    @Test
    public void clickBusinessCase() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickbusinessCase();
        Thread.sleep(2000);
        pm.procurementPlanningPage().businessCasePolicies();

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
        pm.procurementPlanningPage().businessCasePolicies();

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

    @Test
    public void clickPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickPurchaseRequisition();

    }

    @Test
    public void clickProcessOfPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickProcessingofPurchaseRequisition();

    }

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

    @Test
    public void clickNotifications() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickNotificationsTab();
        pm.notificationsPage().notifications();

    }


}
