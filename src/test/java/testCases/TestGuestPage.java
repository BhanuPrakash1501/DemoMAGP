package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listners.ListnerClass;

@Listeners(ListnerClass.class)
public class TestGuestPage extends BaseTest {


    // Test to verify the guest login button click functionality
    @Test(groups = {"sanity", "regression"})
    public void clickGuestLoginBtn() {
        pm.preLoginPage().clickBtnguestLogin();
    }

    // Test to verify the UI elements of the login popup
    @Test(groups = {"sanity", "regression"})
    public void verifyLoginPopUPUI() {
        // Click on the guest login button to trigger the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Verify that the login ID text appears in the popup
        pm.homePage().verifyLoginIDpopUpTxt();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();
    }


    // Test to verify that the login button in the popup functions correctly
    @Test(groups = {"sanity", "regression"})
    public void clickLoginButtonInPopUp() {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Click the login button in the popup
        pm.homePage().clickLoginBtn();

        // Verify that the login header text appears after clicking login
        pm.preLoginPage().verifyLoginHeaderTxt();
    }

    // Test to verify that clicking the profile icon triggers the login process
    @Test(groups = {"sanity", "regression"})
    public void clickprofileIcon() {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the profile icon button
        pm.profilePage().clickProfileBtn();

        // Verify that the login header text appears after clicking the profile icon
        pm.preLoginPage().verifyLoginHeaderTxt();
    }


    // Test to verify that the latest announcements section is displayed correctly
    @Test(groups = {"sanity", "regression"})
    public void verifyLatestAnnouncements() {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Verify that the latest announcements text is displayed
        pm.homePage().verifyLatestAnnouncementTxt();
    }

    // Test to verify the functionality of the "View All" button in the announcements section
    @Test(groups = {"sanity", "regression"})
    public void clickOnViewAllBtn() throws InterruptedException {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Verify that the "View All" button is present
        pm.homePage().verifyViewAll();

        // Click on the "View All" button to navigate to the announcements page
        pm.homePage().clickViewAll();

        // Click the login button after navigating
        pm.homePage().clickLoginBtn();

        // Verify that the login header text is displayed after clicking login
        pm.preLoginPage().verifyLoginHeaderTxt();
    }


    // Test to verify that the "Contact Directory" link functions correctly
    @Test(groups = {"sanity", "regression"})
    public void clickContactdirectoryLink() {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the "Contact Directory" link
        pm.homePage().clickOnContactDirectoryLink();
    }

    // Test to verify that the "Procure Here" link functions correctly
    @Test(groups = {"sanity", "regression"})
    public void clickProcureHereLink() throws InterruptedException {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the "Procure Here" login link
        pm.homePage().clickOnProcureHereLoginLink();
    }


    // Test to verify that the "Vendor Management System" (VMS) link functions correctly
    @Test(groups = {"sanity", "regression"})
    public void clickVMSLink() {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the "Vendor Management System" link
        pm.homePage().clickOnVenderManagementSystemLink();
    }

    // Test to verify that the "Introduction Module" page elements are displayed correctly
    @Test(groups = {"sanity", "regression"})
    public void clickOnIntroductionModule() throws InterruptedException {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the "Introduction Manual" link
        pm.homePage().clickIntroductionManual();

        // Verify that the introduction text is displayed
        pm.introductionPage().verifyIntroductionTxt();

        // Verify that the preface description text is displayed
        pm.introductionPage().verifyPrefaceDesctxt();

        // Verify that the "Want to View More" text is displayed
        pm.introductionPage().verifyWantToViewMoretxt();

        // Verify that the "If You Want to View More" text is displayed
        pm.introductionPage().verifyIfWantToViewMoretxt();

        // Verify that the login button text is displayed
        pm.introductionPage().verifyLoginBtntxt();
    }

    // Test to verify the login button functionality after navigating through the introduction module
    @Test(groups = {"sanity", "regression"})
    public void clickLoginBtn() throws InterruptedException {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Click on the "Introduction Manual" link
        pm.homePage().clickIntroductionManual();

        // Verify that the "Want to View More" text is displayed
        pm.introductionPage().verifyWantToViewMoretxt();

        // Verify that the "If You Want to View More" text is displayed
        pm.introductionPage().verifyIfWantToViewMoretxt();

        // Verify that the login button text is displayed
        pm.introductionPage().verifyLoginBtntxt();

        // Click on the login button
        pm.introductionPage().clickloginBtn();
    }

    // Test to verify the presence of important tabs on the home page
    @Test(groups = {"sanity", "regression"})
    public void verifytabs() throws InterruptedException {
        // Click on the guest login button to open the login popup
        pm.preLoginPage().clickBtnguestLogin();

        // Close the login popup by clicking the 'X' button
        pm.homePage().clickXbtnLoginPopUp();

        // Verify that the "Home" tab is displayed
        pm.homePage().verifyHometab();

        pm.homePage().verifyLogos();

        // Verify that the "FAQ" tab is displayed
        pm.homePage().verifyFAQtab();

        // Verify that the "ENG" tab is displayed
        pm.homePage().verifyENGtab();
    }

    // Test to verify the functionality of searching within the FAQ section
    @Test(groups = {"sanity", "regression"})
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
    @Test(groups = {"sanity", "regression"})
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


    }


}
