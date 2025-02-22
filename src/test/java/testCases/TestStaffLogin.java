package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(reports.ExtentReportManager.class)

public class TestStaffLogin extends BaseTest {

    // Test to verify staff login functionality with valid credentials
    @Test(groups = {"regression"})
    public void TestStaffLoginWithValidCredentials() {
        // Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Enter the password and proceed with login
        pm.staffLoginPage().performPassword();
    }


    // Test to verify navigation through different sections of the Introduction Manual
    @Test(groups = {"regression"})
    public void clickIntroductionManual() throws InterruptedException {
        // Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Click on the "Introduction Manual" link in the home page
        pm.homePage().clickIntroductionManual();

        // Click on "Preface" section and navigate back
        pm.introductionPage().clickPreface();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Click on "Procurement Codes of Ethics" section and navigate back
        pm.introductionPage().clickProcurementCodesofethics();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Click on "General Provisions" section and navigate back
        pm.introductionPage().clickGeneralProvisions();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Click on "Terms and Definitions" section and navigate back
        pm.introductionPage().clickTermsAndDefinations();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Click on "Process Symbols" section and navigate back
        pm.introductionPage().clickProcessSymbols();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);

        // Click on "Value Chain" section
        pm.introductionPage().clickvalueChain();
    }


    // Test to verify navigation through the Business Case and related sections in Procurement Planning
    @Test(groups = {"regression"})
    public void clickBusinessCase() throws InterruptedException {
        // Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Wait for login to complete
        Thread.sleep(6000);

        // Close any pop-up or overlay if present
        pm.homePage().xbutton();

        // Wait for UI to settle
        Thread.sleep(6000);

        // Click on the "Procurement Planning Manual"
        pm.homePage().clickProcurementPlanningManual();

        // Click on the "Business Case" section
        pm.procurementPlanningPage().clickbusinessCase();
        Thread.sleep(2000);

        // Click on the "Business Case Policies" subsection
        pm.procurementPlanningPage().clickbusinessCasepolicies();
        Thread.sleep(2000);

        // Click on the "Business Case Process Flow Chart" subsection
        pm.procurementPlanningPage().clickbusinessCaseprocessFlowChart();
        Thread.sleep(2000);

        // Navigate back to the Procurement Planning main tab
        pm.procurementPlanningPage().clickProcurementPlanningTabLink();
        Thread.sleep(3000);

        // Click on the "Annual Procurement Planning" section
        pm.procurementPlanningPage().clickAnnualProcurementplanning();
        Thread.sleep(2000);

        // Click on the "Annual Procurement Policies" subsection
        pm.procurementPlanningPage().clickAnnualProcurementpolicies();
        Thread.sleep(2000);

        // Click on the "Annual Procurement Process Flow Chart" subsection
        pm.procurementPlanningPage().clickAnnualProcurementProcessFlowChart();
        Thread.sleep(2000);

        // Navigate back to the Procurement Planning main tab
        pm.procurementPlanningPage().clickProcurementPlanningTabLink();
        Thread.sleep(3000);

        // Click on the "Strategy Paper" section
        pm.procurementPlanningPage().clickStrategypaper();
        Thread.sleep(2000);

        // Click on the "Strategy Paper Policies" subsection
        pm.procurementPlanningPage().clickStrategypaperpolicies();
        Thread.sleep(2000);

        // Click on the "Strategy Paper Process Flow Chart (DA)" subsection
        pm.procurementPlanningPage().clickStrategypaperProcessFlowChartDA();
        Thread.sleep(2000);

        // Click on the "Strategy Paper Process Flow Chart (OT)" subsection
        pm.procurementPlanningPage().clickStrategypaperProcessFlowChartOT();
    }


    // Test to verify navigation through the Purchase Requisition Manual and related sections
    @Test(groups = {"regression"})
    public void clickPurchaseRequistionmanual() throws InterruptedException {
        // Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Wait for login process to complete
        Thread.sleep(6000);

        // Click on the "Requisition Manual"
        pm.homePage().clickRequistionManual();

        // Click on the "Purchase Requisition" section
        pm.requistionPage().clickPurchaseRequisition();
        Thread.sleep(3000);

        // Click on the "Purchase Requisition Policies" subsection
        pm.requistionPage().clickPurchaseRequisitionpolicies();
        Thread.sleep(3000);

        // Click on the "Purchase Requisition Process Flow Chart" subsection
        pm.requistionPage().clickPurchaseRequisitionprocessFlowChart();
        Thread.sleep(3000);

        // Navigate back to the Requisition tab
        pm.requistionPage().clickRequisitionTabLink();
        Thread.sleep(3000);

        // Click on the "Processing of Purchase Requisition" section
        pm.requistionPage().clickProcessingofPurchaseRequisition();
        Thread.sleep(3000);

        // Click on the "Processing of Purchase Requisition Policies" subsection
        pm.requistionPage().clickProcessingofPurchaseRequisitionpolicies();
        Thread.sleep(3000);

        // Click on the "Processing of Purchase Requisition Process Flow Chart" subsection
        pm.requistionPage().clickProcessingofPurchaseRequisitionprocessFlowChart();
    }


    // Test to verify navigation through the Tender Management Manual and related sections
    @Test(groups = {"regression"})
    public void clickTenderManagementmanual() throws InterruptedException {
        // Step 1: Log in as staff
        pm.preLoginPage().clickBtnstaffLogin();  // Click on the staff login button
        pm.staffLoginPage().performLogin();      // Enter login credentials
        pm.staffLoginPage().performPassword();   // Enter password and complete login

        // Wait for the login process to complete
        Thread.sleep(6000);

        // Step 2: Navigate to the Sourcing Manual
        pm.homePage().clickSourcingManual();  // Click on "Sourcing Manual"

        // Step 3: Access the "Tender Management" section
        pm.sourcingPage().clickTenderManagement();  // Click on "Tender Management"
        Thread.sleep(2000);

        // Step 4: Access "Tender Management Policies" subsection
        pm.sourcingPage().clickTenderManagementpolicies();  // Click on "Tender Management Policies"
        Thread.sleep(2000);

        // Step 5: Access "Tender Management Process Flow Chart" subsection
        pm.sourcingPage().clickTenderManagementprocessFlowChart();  // Click on "Tender Management Process Flow Chart"


        // Step 6: Navigate back to the Sourcing tab
        Thread.sleep(2000);
        pm.sourcingPage().clickSourcingTabLink();  // Click on "Sourcing" tab to return to the main section

        // Step 7: Access the "Tender Administration" section
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderAdministration();  // Click on "Tender Administration"

        // Step 8: Access "Tender Administration Policies" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderAdministrationpolicies();  // Click on "Tender Administration Policies"

        // Step 9: Access "Tender Administration Process Flow Chart (ABRM)" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderAdministrationprocessFlowChartABRM();  // Click on "Tender Administration Process Flow Chart - ABRM"

        // Step 10: Access "Tender Administration Process Flow Chart (BERM)" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderAdministrationprocessFlowChartBERM();  // Click on "Tender Administration Process Flow Chart - BERM"

        // Step 11: Navigate back to the Sourcing tab
        Thread.sleep(1000);
        pm.sourcingPage().clickSourcingTabLink();  // Click on "Sourcing" tab to return to the main section

        // Step 12: Access the "Tender Evaluation" section
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderEvaluation();  // Click on "Tender Evaluation"

        // Step 13: Access "Tender Evaluation Policies" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderEvaluationpolicies();  // Click on "Tender Evaluation Policies"

        // Step 14: Access "Tender Evaluation Process Flow Chart" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickTenderEvaluationprocessFlowChart();  // Click on "Tender Evaluation Process Flow Chart"


        // Step 15: Navigate back to the Sourcing tab
        Thread.sleep(1000);
        pm.sourcingPage().clickSourcingTabLink();  // Click on "Sourcing" tab to return to the main section

        // Step 16: Access the "Abort of Tender" section
        Thread.sleep(2000);
        pm.sourcingPage().clickAbortofTender();  // Click on "Abort of Tender"

        // Step 17: Access "Abort of Tender Policies" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickAbortofTenderpolicies();  // Click on "Abort of Tender Policies"

        // Step 18: Access "Abort of Tender Process Flow Chart" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickAbortofTenderprocessFlowChart();  // Click on "Abort of Tender Process Flow Chart"


        // Step 19: Navigate back to the Sourcing tab
        Thread.sleep(2000);
        pm.sourcingPage().clickSourcingTabLink();  // Click on "Sourcing" tab to return to the main section

        // Step 20: Access the "Clarification & Negotiation Prior to Award" section
        Thread.sleep(1000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAward();  // Click on "Clarification & Negotiation Prior to Award"

        // Step 21: Access "Clarification & Negotiation Prior to Award Policies" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardpolicies();  // Click on "Clarification & Negotiation Prior to Award Policies"

        // Step 22: Access "Clarification & Negotiation Prior to Award Process Flow Chart (Negotiation)" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardprocessFlowChartabNego();  // Click on "Clarification & Negotiation Prior to Award Process Flow Chart - Negotiation"

        // Step 23: Access "Clarification & Negotiation Prior to Award Process Flow Chart (CPA)" subsection
        Thread.sleep(2000);
        pm.sourcingPage().clickClarificationNegotiationpriortoAwardprocessFlowChartabCPA();  // Click on "Clarification & Negotiation Prior to Award Process Flow Chart - CPA"


    }

    // Test case to verify the Contract Management Implementation process
    @Test(groups = {"regression"})
    public void clickContractManagementImplementation() throws InterruptedException {
        // Step 1: Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for login process to complete
        Thread.sleep(6000);

        // Step 5: Click on "Contract Administration Manual"
        pm.homePage().clickContractAdministrationManual();
        Thread.sleep(2000);

        // Step 6: Click on "Contract Management Implementation" section
        pm.contractAdministrationPage().clickContractManagementImplemetation();
        Thread.sleep(2000);

        // Step 7: Click on "Policies" subsection related to Contract Management Implementation
        pm.contractAdministrationPage().clickpolicies();
        Thread.sleep(2000);

        // Step 8: Click on "Process Flow Chart" subsection related to Contract Management Implementation
        pm.contractAdministrationPage().clickprocessFlowChart();


        // Step 9: Navigate back to the Contract Administration tab
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickcontractAdministrationTabLink();  // Click on "Contract Administration" tab to return to the main section

        // Step 10: Access the "Contract Renewal" section
        Thread.sleep(1000);
        pm.contractAdministrationPage().clickContractRenewal();  // Click on "Contract Renewal"

        // Step 11: Access "Policies" subsection related to Contract Renewal
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();  // Click on "Contract Renewal Policies"

        // Step 12: Access "Process Flow Chart" subsection related to Contract Renewal
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();  // Click on "Contract Renewal Process Flow Chart"

        // Step 13: Navigate back to the Contract Administration tab
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickcontractAdministrationTabLink();  // Click on "Contract Administration" tab to return to the main section

        // Step 14: Access the "Contract Termination" section
        Thread.sleep(1000);
        pm.contractAdministrationPage().clickContractTermination();  // Click on "Contract Termination"

        // Step 15: Access "Policies" subsection related to Contract Termination
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();  // Click on "Contract Termination Policies"

        // Step 16: Access "Process Flow Chart" subsection related to Contract Termination
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();  // Click on "Contract Termination Process Flow Chart"


        // Step 17: Navigate back to the Contract Administration tab
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickcontractAdministrationTabLink();  // Click on "Contract Administration" tab to return to the main section

        // Step 18: Access the "Contract Closeout" section
        Thread.sleep(1000);
        pm.contractAdministrationPage().clickContractCloseout();  // Click on "Contract Closeout"

        // Step 19: Access "Policies" subsection related to Contract Closeout
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickpolicies();  // Click on "Contract Closeout Policies"

        // Step 20: Access "Process Flow Chart" subsection related to Contract Closeout
        Thread.sleep(2000);
        pm.contractAdministrationPage().clickprocessFlowChart();  // Click on "Contract Closeout Process Flow Chart"


    }


    // Test to verify the Vendor Registration process within the Vendor Management Manual
    @Test(groups = {"regression"})
    public void clickVendorRegistration() throws InterruptedException {
        // Step 1: Click on the staff login button to open the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Navigate to the Vendor Management Manual
        pm.homePage().clickVendorManagentManual();
        Thread.sleep(2000);

        // Step 6: Click on the Vendor Registration section
        pm.vendorManagementPage().clickVendorRegistration();
        Thread.sleep(2000);

        // Step 7: Click on the policies related to Vendor Registration
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);

        // Step 8: Click on the process flow charts for vendor renewal and new registration
        pm.vendorManagementPage().clickprocessFlowChartRen();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartNReg();
        Thread.sleep(2000);

        // Step 9: Navigate back to the Vendor Management tab
        pm.vendorManagementPage().clickVendorManagementTabLink();
        Thread.sleep(1000);

        // Step 10: Click on the Potential Vendor Screening section
        pm.vendorManagementPage().clickPotentialVendorScreening();
        Thread.sleep(2000);

        // Step 11: Click on the policies related to Vendor Screening
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);

        // Step 12: Click on the process flow chart for Vendor Screening
        pm.vendorManagementPage().clickprocessFlowChart();
        Thread.sleep(2000);

        // Step 13: Navigate back to the Vendor Management tab
        pm.vendorManagementPage().clickVendorManagementTabLink();
        Thread.sleep(1000);

        // Step 14: Click on the Vendor Performance Management section
        pm.vendorManagementPage().clickVendorPerformanceManagement();
        Thread.sleep(2000);

        // Step 15: Click on the policies related to Vendor Performance Management
        pm.vendorManagementPage().clickpolicies();
        Thread.sleep(2000);

        // Step 16: Click on the process flow charts for unscheduled and scheduled vendor performance management
        pm.vendorManagementPage().clickprocessFlowChartUnsch();
        Thread.sleep(2000);
        pm.vendorManagementPage().clickprocessFlowChartSched();
    }


    // Test to verify the functionality of clicking on the Calendar tab
    @Test(groups = {"regression"})
    public void ClickOnCalendar() throws InterruptedException {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the "Calendar" tab
        pm.homePage().clickCalendarTab();

        // Step 6: Perform actions on the Calendar page
        pm.calendarPage().Calendar();
    }

    // Test to verify the functionality of accessing the Manual tab from Favorites
    @Test(groups = {"regression"})
    public void manualTab() {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Click on the "Favourites" tab
        pm.homePage().clickFavouritesTab();

        // Step 5: Click on the "Manual" tab within the Favourites section
        pm.favouritesPage().clickManualTab();

        // Optional: Uncomment the line below if additional verification is needed
        // pm.favouritesPage().favManualList();
    }


    // Test to verify the functionality of accessing the Tender tab from Favorites
    @Test(groups = {"regression"})
    public void tenderTab() {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Click on the "Favourites" tab
        pm.homePage().clickFavouritesTab();

        // Step 5: Click on the "Tender" tab within the Favourites section
        pm.favouritesPage().clickTenderTab();
    }

    // Test to verify the functionality of clicking on the Gallery tab
    @Test(groups = {"regression"})
    public void clickGallery() throws InterruptedException {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the "Gallery" tab
        pm.homePage().clickGalleryTab();

        // Step 6: Perform actions on the Gallery page
        pm.galleryPage().gallery();
    }


    // Test to verify the functionality of the global search within the FAQ section
    @Test(groups = {"regression"})
    public void globalSearchFAQ() {
        // Step 1: Click on the guest login button to navigate as a guest user
        pm.preLoginPage().clickBtnguestLogin();

        // Step 2: Close the login popup if displayed
        pm.homePage().clickXbtnLoginPopUp();

        // Step 3: Click on the "FAQ" tab to navigate to the FAQ section
        pm.homePage().clickfaqtab();

        // Step 4: Perform a global search within the FAQ section
        pm.faqPage().globalSearchFAQ();
    }

    // Test to verify the functionality of searching within the FAQ section
    @Test(groups = {"regression"})
    public void searchFaq() {
        // Step 1: Click on the guest login button to navigate as a guest user
        pm.preLoginPage().clickBtnguestLogin();

        // Step 2: Close the login popup if displayed
        pm.homePage().clickXbtnLoginPopUp();

        // Step 3: Click on the "FAQ" tab to navigate to the FAQ section
        pm.homePage().clickfaqtab();

        // Step 4: Perform a specific search within the FAQ section
        pm.faqPage().searchFAQ();
    }


    // Test to verify the FAQ text interaction and profile navigation
    @Test(groups = {"regression"})
    public void clicktext() throws InterruptedException {
        // Step 1: Click on the guest login button to access the application
        pm.preLoginPage().clickBtnguestLogin();

        // Step 2: Close the login pop-up if it appears
        pm.homePage().clickXbtnLoginPopUp();

        // Step 3: Navigate to the FAQ tab
        pm.homePage().clickfaqtab();

        // Step 4: Perform a search in the FAQ section
        pm.faqPage().searchFAQ();

        // Step 5: Click on the search result text
        pm.faqPage().clicktext();

        // Step 6: Close the text box that appears
        pm.faqPage().closetextbox();

        // Step 7: Click the cross button to exit the FAQ search
        pm.faqPage().crossbtn();

        // Step 8: Navigate to the profile section
        pm.faqPage().profile();
    }


    // Test to verify that notifications are accessible and displayed correctly
    @Test(groups = {"regression"})
    public void clickNotifications() throws InterruptedException {
        // Step 1: Click on the staff login button to access the staff login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the Notifications tab
        pm.homePage().clickNotificationsTab();

        // Step 6: Verify that notifications are displayed
        pm.notificationsPage().notifications();
    }


    // Test to verify the UI elements and functionality of the Profile page
    @Test(groups = {"regression"})
    public void verifyProfileUI() throws InterruptedException {
        // Step 1: Click on the staff login button to access the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the Profile button to open the profile page
        pm.profilePage().clickProfileBtn();

        // Step 6: Verify that the "User Profile" text is displayed
        pm.profilePage().verifyUserProfileTxt();

        // Step 7: Verify that the "Logout" text is displayed
        pm.profilePage().verifyLogoutTxt();

        // Step 8: Click on the Logout button
        pm.profilePage().clickBtnLogout();

        // Step 9: Verify that the "Are you sure you want to logout?" confirmation text is displayed
        pm.profilePage().verifyAreYouSureWantToLogoutTxt();

        // Step 10: Verify that the "No, Keep Logged In" option is displayed
        pm.profilePage().verifyNoKeepLoginTxt();

        // Step 11: Verify that the "Yes, Logout" option is displayed
        pm.profilePage().verifyYesLogoutTxt();

        // Step 12: Click the 'X' button to close the Logout confirmation pop-up
        pm.profilePage().clickBtnXLogoutPopUp();

        // Step 13: Click on the "Edit Profile" button
        pm.profilePage().clickEditProfileBtn();

        // Step 14: Verify that the "Save" button is present on the Edit Profile screen
        pm.profilePage().verifySaveTxt();
    }


    // Test to verify the functionality of editing profile fields
    @Test(groups = {"regression"})
    public void testEditProfileFields() throws InterruptedException {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the Profile button to access the profile page
        pm.profilePage().clickProfileBtn();

        // Step 6: Click on the Edit Profile button to open the edit profile form
        pm.profilePage().clickEditProfileBtn();

        // Step 7: Click the 'X' button to close the Edit Profile form
        pm.profilePage().clickXbuttonEditProfile();

        // Step 8: Click on the Edit Profile button again to reopen the form
        pm.profilePage().clickEditProfileBtn();

        // Step 9: Enter values into the Edit Profile fields
        pm.profilePage().enterValuesStaffEditProfile();

    }


    // Test to verify the logout functionality
    @Test(groups = {"regression"})
    public void testLogoutFunctionality() throws InterruptedException {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the Profile button to access the profile page
        pm.profilePage().clickProfileBtn();

        // Step 6: Click on the Logout button to initiate logout
        pm.profilePage().clickBtnLogout();

        // Step 7: Click "No, Keep Logged In" to cancel the logout process
        pm.profilePage().clickBtnNoKeepLogout();

        // Step 8: Wait for the UI to reflect the cancellation
        Thread.sleep(3000);

        // Step 9: Click on the Logout button again
        pm.profilePage().clickBtnLogout();

        // Step 10: Click "Yes, Logout" to confirm logout
        pm.profilePage().clickBtnYesLogout();

        // Step 11: Verify that the login page is displayed after successful logout
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }


    // Test to verify the functionality of Quick Links in the Profile section
    @Test(groups = {"regression"})
    public void testQuickLinks() throws InterruptedException {
        // Step 1: Click on the staff login button to navigate to the login page
        pm.preLoginPage().clickBtnstaffLogin();

        // Step 2: Enter valid login credentials
        pm.staffLoginPage().performLogin();

        // Step 3: Enter the password and proceed with login
        pm.staffLoginPage().performPassword();

        // Step 4: Wait for the login process to complete
        Thread.sleep(6000);

        // Step 5: Click on the Profile button to access the profile section
        pm.profilePage().clickProfileBtn();

        // Step 6: Click on the "Preface" quick link
        pm.profilePage().clickLinkPreface();

        // Step 7: Wait for the page to load before navigating back
        Thread.sleep(3000);

        // Step 8: Navigate back to the Profile page
        driver.navigate().back();

        // Step 9: Click on the "Calendar Events" quick link
        pm.profilePage().clickLinkCalendarEvents();

        // Step 10: Wait for the page to load before navigating back
        Thread.sleep(3000);

        // Step 11: Navigate back to the Profile page
        driver.navigate().back();

        // Step 12: Click on the "General Provision" quick link
        pm.profilePage().clickLinkGeneralProvision();
    }


}



