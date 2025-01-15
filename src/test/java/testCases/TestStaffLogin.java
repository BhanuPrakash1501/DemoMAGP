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
    public void clickPrefaceManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        pm.homePage().clickIntroductionManual();
        pm.introductionPage().clickPreface();

    }

    @Test
    public void clickProcurementCodesOfEthics() throws InterruptedException {
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
        pm.procurementPlanningPage().clickbusinessCasepolicies();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickbusinessCaseprocessFlowChart();

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
        pm.procurementPlanningPage().clickAnnualProcurementpolicies();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickAnnualProcurementProcessFlowChart();

    }

    @Test
    public void clickStrategypaperManual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickProcurementPlanningManual();
        pm.procurementPlanningPage().clickStrategypaper();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickStrategypaperpolicies();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickStrategypaperProcessFlowChartDA();
        Thread.sleep(2000);
        pm.procurementPlanningPage().clickStrategypaperProcessFlowChartOT();

    }

    @Test
    public void clickPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickPurchaseRequisition();
        Thread.sleep(3000);
        pm.requistionPage().clickPurchaseRequisitionpolicies();
        Thread.sleep(3000);
        pm.requistionPage().clickPurchaseRequisitionprocessFlowChart();

    }

    @Test
    public void clickProcessOfPurchaseRequistionmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickRequistionManual();
        pm.requistionPage().clickProcessingofPurchaseRequisition();
        Thread.sleep(3000);
        pm.requistionPage().clickProcessingofPurchaseRequisitionpolicies();
        Thread.sleep(3000);
        pm.requistionPage().clickProcessingofPurchaseRequisitionprocessFlowChart();

    }

    @Test
    public void clickTenderManagementmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderManagement();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderManagementpolicies();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderManagementprocessFlowChart();

    }

    @Test
    public void clickTenderAdministrationmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderAdministration();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderAdministrationpolicies();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderAdministrationprocessFlowChartABRM();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderAdministrationprocessFlowChartBERM();

    }

    @Test
    public void clickTenderEvaluationmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickTenderEvaluation();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderEvaluationpolicies();
        Thread.sleep(3000);
        pm.sourcingPage().clickTenderEvaluationprocessFlowChart();

    }

    @Test
    public void clickAbortofTendermanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickAbortofTender();
        Thread.sleep(3000);
        pm.sourcingPage().clickAbortofTenderpolicies();
        Thread.sleep(3000);
        pm.sourcingPage().clickAbortofTenderprocessFlowChart();

    }

    @Test
    public void clickClarificationNegotiationpriortoAwardmanual() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickSourcingManual();
        pm.sourcingPage().clickClarificationNegotiationpriortoAward();
        Thread.sleep(3000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardpolicies();
        Thread.sleep(3000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardprocessFlowChartabNego();
        Thread.sleep(3000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardprocessFlowChartabCPA();

    }

    @Test
    public void clickContractManagementImplementation() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickContractAdministrationManual();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickContractManagementImplemetation();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();
    }

    @Test
    public void clickContractRenewal() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickContractAdministrationManual();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickContractRenewal();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();
    }

    @Test
    public void clickContractTermination() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickContractAdministrationManual();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickContractTermination();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();
    }

    @Test
    public void clickContractCloseout() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickContractAdministrationManual();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickContractCloseout();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();
    }

    @Test
    public void clickVendorRegistration() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickVendorManagentManual();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickVendorRegistration();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartRen();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartNReg();
    }

    @Test
    public void clickPotentialVendorScreening() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickVendorManagentManual();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickPotentialVendorScreening();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChart();
    }

    @Test
    public void clickVendorPerformanceManagement() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickVendorManagentManual();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickVendorPerformanceManagement();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartUnsch();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartSched();
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

    @Test (priority = 0)
    public void globalSearchFAQ(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().globalSearchFAQ();
    }

    @Test (priority = 1)
    public void searchFaq(){
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().searchFAQ();
    }
    @Test (priority = 2)
    public void clicktext() throws InterruptedException {
        pm.preLoginPage().clickBtnguestLogin();
        pm.homePage().clickXbtnLoginPopUp();
        pm.homePage().clickfaqtab();
        pm.faqPage().searchFAQ();
        pm.faqPage().clicktext();
        pm.faqPage().closetextbox();
        pm.faqPage().crossbtn();
        pm.faqPage().profile();
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


    @Test
    public void verifyProfileUI() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.profilePage().clickProfileBtn();
        pm.profilePage().verifyUserProfileTxt();
        pm.profilePage().verifyLogoutTxt();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().verifyAreYouSureWantToLogoutTxt();
        pm.profilePage().verifyNoKeepLoginTxt();
        pm.profilePage().verifyYesLogoutTxt();
        pm.profilePage().clickBtnXLogoutPopUp();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().verifySaveTxt();
    }




    @Test
    public void testEditProfileFields() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().clickXbuttonEditProfile();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().enterValuesStaffEditProfile();

    }



    @Test
    public void testLogoutFunctionality() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnNoKeepLogout();
        Thread.sleep(3000);
        pm.profilePage().clickBtnLogout();
        pm.profilePage().clickBtnYesLogout();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }


    @Test
    public void testQuickLinks() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickLinkPreface();
        Thread.sleep(3000);
        driver.navigate().back();
        pm.profilePage().clickLinkCalendarEvents();
        Thread.sleep(3000);
        driver.navigate().back();
        pm.profilePage().clickLinkGeneralProvision();

    }




}
