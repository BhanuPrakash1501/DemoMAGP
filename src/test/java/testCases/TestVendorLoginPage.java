package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.awt.*;
import java.io.IOException;

@Listeners(reports.ExtentReportManager.class)
public class TestVendorLoginPage extends BaseTest {

    /***********************    Login   ****************************************/


    /**
     * This test validates the UI elements on the Vendor Login Page.
     * It ensures that all essential UI components are displayed correctly.
     */
    @Test(groups = {"regression", "sanity"})
    public void testVendorLoginPageUI() {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Verifies that the MAGP logo is displayed on the login page.
        pm.vendorLoginPage().verifyMAGPlogo();

        // Verifies the presence and correctness of the "Login" header text.
        pm.vendorLoginPage().verifyLoginHeaderTxt();

        // Verifies the presence of the email text field.
        pm.vendorLoginPage().verifyEmailTxt();

        // Verifies the presence of the password text field.
        pm.vendorLoginPage().verifyPasswordTxt();

        // Verifies the presence of the "Forgot Password?" link.
        pm.vendorLoginPage().verifyForgetPasswordTxt();

        // Verifies the Google login button is displayed.
        pm.vendorLoginPage().verifyGooglebtn();

        // The Facebook button verification is currently commented out.
//    pm.vendorLoginPage().verifyFacebookbtn();

        // Verifies that the "Don't have an account?" message is displayed.
        pm.vendorLoginPage().verifyDonthaveAnAccountTxt();

        // Verifies the "Register Now" link is present.
        pm.vendorLoginPage().verifyRegisterNowLnk();

        // Verifies the presence of the "WELCOME" text.
        pm.vendorLoginPage().verifyWelcomeTxt();

        // Verifies the welcome paragraph text for vendor registration.
        pm.vendorLoginPage().verifyWelcomeParagraphTxt();
    }

    /**
     * This test verifies that a vendor can log in with valid credentials.
     * It ensures the login process is functional and redirects correctly.
     */
    @Test(groups = {"regression", "sanity"})
    public void testVendorWithValidCredentials() throws IOException {
        // Clicks the "Vendor Login" button to access the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();
    }

    /**
     * This test verifies the system's behavior when a vendor enters invalid credentials.
     * It checks for proper error handling and validation messages.
     */
    @Test(groups = {"regression", "sanity"})
    public void testVendorWithInValidCredentials() {
        // Clicks the "Vendor Login" button to access the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Enters an invalid email address and verifies the error message.
        pm.vendorLoginPage().verifyInvalidEmail("assa");
    }


    /***********************    SignUp   ****************************************/


    /**
     * This test verifies the UI elements of the registration page.
     * It ensures that all required fields and buttons are present.
     */
    @Test(groups = {"regression"})
    public void registerNowUIValidations() {
        // Navigate to the pre-login page and click the vendor login button
        pm.preLoginPage().clickBtnvendorLogin();

        // Click the 'Register Now' link on the vendor login page
        pm.vendorLoginPage().clickRegisterNowlink();

        // Verifies all required UI elements on the registration page
        pm.signUpPage().verifyMAGPlogo(); // Check that the MAGP logo is displayed
        pm.signUpPage().verifySignUpHeaderTxt(); // Validate the sign-up header text
        pm.signUpPage().verifyemailHeaderTxt(); // Verify the email header text
        pm.signUpPage().verifymobileNoHeaderTxt(); // Verify the mobile number header text
        pm.signUpPage().verifypasswordHeaderTxt(); // Verify the password header text
        pm.signUpPage().verifyfirstNameHeaderTxt(); // Verify the first name header text
        pm.signUpPage().verifylastNameHeaderTxt(); // Verify the last name header text
        pm.signUpPage().verifyaptSuiteBuildingHeaderTxt(); // Verify the apartment/suite/building header text
        pm.signUpPage().verifystreetCityAddressHeaderTxt(); // Verify the street/city/address header text
        pm.signUpPage().verifypostCodeHeaderTxt(); // Verify the post code header text
        pm.signUpPage().verifyGoogleBtn(); // Verify that the Google button is displayed
        // pm.signUpPage().verifyFacebookBtn(); // Uncomment if Facebook button validation is needed
        pm.signUpPage().verifyAlreadyHaveAnAccountTxt(); // Verify the 'Already have an account?' text
        pm.signUpPage().verifyWelcometxt(); // Verify the welcome text
        pm.signUpPage().verifyDesctxt(); // Verify the description text
        pm.signUpPage().verifyLoginHereLink(); // Verify the 'Login here' link
    }


    /**
     * This test validates different fields on the sign-up page.
     * It ensures that input validation is properly enforced.
     */
    @Test(groups = {"regression"})
    public void signUpFieldValidations() throws IOException {
        // Click the vendor login button on the pre-login page
        pm.preLoginPage().clickBtnvendorLogin();

        // Click the 'Register Now' link on the vendor login page
        pm.vendorLoginPage().clickRegisterNowlink();

        // Performs input field validations for the registration process
        pm.signUpPage().performEmailValidations("as"); // Validate the email format with an invalid input
        pm.signUpPage().performMobileNoValidation("12"); // Validate mobile number with an invalid input
        pm.signUpPage().performPassword8CharsValidation("as"); // Validate password length (minimum 8 characters) with an invalid input
        pm.signUpPage().performPasswordUpperCaseValidation("cdefgh"); // Validate password for at least one uppercase letter with an invalid input
        pm.signUpPage().performPasswordOneNumberValidation(); // Validate password to ensure at least one numeric digit
        pm.signUpPage().performPasswordSpecialcharValidation(); // Validate password to ensure at least one special character
        pm.signUpPage().performFirstNameValidation("a"); // Validate first name with an invalid input (too short)
        pm.signUpPage().performlastNameValidation("a"); // Validate last name with an invalid input (too short)
        pm.signUpPage().performAptSuiteBldgValidation("a"); // Validate apartment/suite/building input with an invalid input (too short)
        pm.signUpPage().performStreetCityAddressValidation("a"); // Validate street/city/address input with an invalid input (too short)
        pm.signUpPage().performPostCodeValidation("34"); // Validate post code with an invalid input

        // Verifies the presence of the sign-up button on the registration page
        pm.signUpPage().verifySignUpBtn(); // Check that the sign-up button is displayed and enabled

    }

    /**
     * This test enters random values for sign-up fields and attempts to register.
     * It ensures that users can complete the registration process successfully.
     */
    @Test(groups = {"regression"})
    public void enterValuesForSignUP() {
        // Click the vendor login button on the pre-login page
        pm.preLoginPage().clickBtnvendorLogin();

        // Click the 'Register Now' link on the vendor login page
        pm.vendorLoginPage().clickRegisterNowlink();

        // Enters random values into the sign-up fields for testing purposes
        pm.signUpPage().randmEmail(); // Generate and enter a random email address
        pm.signUpPage().randomMobileNumbers(); // Generate and enter a random mobile number
        pm.signUpPage().randomPassword(); // Generate and enter a random password
        pm.signUpPage().randomFirstName(); // Generate and enter a random first name
        pm.signUpPage().randomLastName(); // Generate and enter a random last name
        pm.signUpPage().randomAptSuiteBldgName(); // Generate and enter a random apartment/suite/building name
        pm.signUpPage().randomStreetCityAddressName(); // Generate and enter a random street/city/address
        pm.signUpPage().randomPostCode(); // Generate and enter a random post code

        // Clicks the "Login Here" link to return to the login page
        pm.signUpPage().clickLoginHereLink();

        // Verifies that the user is redirected to the login page by checking the login header text
        pm.vendorLoginPage().verifyLoginHeaderTxt(); // Check that the login header text is displayed correctly

    }


/***********************          HomePage           ********************************/
    /**
     * This test verifies that the home page UI elements are displayed correctly.
     * It ensures that the user successfully lands on the home page after logging in.
     */
    @Test(groups = {"regression", "sanity"})
    public void verifyHomePageUI() throws InterruptedException, IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        pm.homePage().verifyLogos();

        // The 'X' button action is currently commented out (possibly to close a popup).
//    pm.vendorLoginPage().xbutton();

        // Verifies the presence of the "Welcome to MAGP" text on the home page.
        pm.homePage().verifyWelcomeToMagpTxt();

        // Verifies that the "Latest Announcements" section is displayed.
        pm.homePage().verifyLatestAnnouncementTxt();

        // Verifies the presence of the "Last 7 Days" section on the home page.
        pm.homePage().verifyLast7DaysTxt();
    }


    /**********************   Manuals   *****************************************/

    /**
     * This test verifies navigation through various manuals available in the system.
     * It ensures that clicking different manual sections works as expected.
     */
    @Test(groups = {"regression", "sanity"})
    public void clickManuals() throws InterruptedException, IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Clicks on the "Introduction Manual" to open it.
        pm.homePage().clickIntroductionManual();

        // Clicks on the "Preface" section inside the introduction manual.
        pm.introductionPage().clickPreface();

        // Waits for 3 seconds before navigating back.
        Thread.sleep(3000);
        driver.navigate().back();

        // Waits for 3 seconds before proceeding further.
        Thread.sleep(3000);

        // Clicks on the "Procurement Codes of Ethics" section.
        pm.introductionPage().clickProcurementCodesofethics();

        // Waits for 3 seconds before navigating back.
        Thread.sleep(3000);
        driver.navigate().back();

        // Waits for 3 seconds before proceeding further.
        Thread.sleep(3000);

        // Clicks on the "General Provisions" section.
        pm.introductionPage().clickGeneralProvisions();
    }


/***********************    Favourite Tab   ****************************************/

    /**
     * This test verifies the functionality of the "Favorites" tab under the manuals section.
     * It ensures that users can access their favorite manuals correctly.
     */
    @Test(groups = {"regression", "sanity"})
    public void manualTab() throws IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Clicks on the "Favorites" tab on the home page.
        pm.homePage().clickFavouritesTab();

        // Navigates to the "Manuals" section under the "Favorites" tab.
        pm.favouritesPage().clickManualTab();

        // Verifies the list of favorite manuals.
        pm.favouritesPage().favManualList();
    }

    /**
     * This test verifies the functionality of the "Tender" tab under the favorites section.
     * It ensures that the user can navigate to the Tender tab successfully.
     */
    @Test(groups = {"regression", "sanity"})
    public void tenderTab() throws IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Clicks on the "Favorites" tab on the home page.
        pm.homePage().clickFavouritesTab();

        // Clicks on the "Tender" tab within the Favorites section.
        pm.favouritesPage().clickTenderTab();

        pm.favouritesPage().favTenderList();
    }

    /**
     * This test verifies the functionality of the "Favorites" manual feature.
     * It ensures that users can navigate to the favorites section and interact with their favorite items.
     */
    @Test(groups = {"regression"})
    public void clickfavoutitesManual() throws InterruptedException, IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Verifies the "View All" button and clicks it.
        pm.homePage().verifyViewAllBtn();
        pm.homePage().clickViewAllBtn();

        // Clicks on the favorite tender.
        pm.favouritesPage().clickfavTender();
    }


    /***********************    Gallery Tab   ****************************************/


    /**
     * This test verifies the functionality of the "Gallery" tab.
     * It ensures that the user can access and interact with the gallery.
     */
    @Test(groups = {"regression", "sanity"})
    public void clickGallery() throws InterruptedException, IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Waits for 6 seconds to allow elements to load properly.
        Thread.sleep(6000);

        // Clicks on the "Gallery" tab on the home page.
        pm.homePage().clickGalleryTab();

        // Accesses and verifies the gallery section.
        pm.galleryPage().gallery();

        // Searches within the gallery.
        pm.galleryPage().searchGaller();
    }


/***********************    Profile   ****************************************/


    /**
     * This test verifies the UI elements and functionalities on the Profile page.
     * It ensures that the profile section is accessible and that various elements are displayed correctly.
     */
    @Test(groups = {"regression"})
    public void verifyUI() throws IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Clicks on the "Profile" button to access the user profile section.
        pm.profilePage().clickProfileBtn();

        // Verifies that the "User Profile" text is displayed.
        pm.profilePage().verifyUserProfileTxt();

        // Verifies that the "Login ID" text is displayed.
        pm.profilePage().verifyLoginIDTxt();

        // Verifies that the "Need to Purchase" text is displayed.
        pm.profilePage().verifyNeedtoPurchaseTxt();

        // Verifies that the "Logout" text is displayed.
        pm.profilePage().verifyLogoutTxt();

        // Clicks on the "Logout" button.
        pm.profilePage().clickBtnLogout();

        // Verifies the "Are you sure you want to logout?" confirmation message.
        pm.profilePage().verifyAreYouSureWantToLogoutTxt();

        // Verifies the "No, Keep Login" text option.
        pm.profilePage().verifyNoKeepLoginTxt();

        // Verifies the "Yes, Logout" text option.
        pm.profilePage().verifyYesLogoutTxt();

        // Clicks the close (X) button on the logout confirmation popup.
        pm.profilePage().clickBtnXLogoutPopUp();

        // Clicks on the "Edit Profile" button.
        pm.profilePage().clickEditProfileBtn();

        // Verifies the presence of the "Save" button in the edit profile section.
        pm.profilePage().verifySaveTxt();
    }

    /**
     * This test verifies the functionality of editing profile fields.
     * It ensures that users can access and modify their profile details.
     */
    @Test(groups = {"regression", "sanity"})
    public void testEditProfileFields() throws IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Clicks on the "Profile" button to access the user profile section.
        pm.profilePage().clickProfileBtn();

        // Clicks on the "Edit Profile" button.
        pm.profilePage().clickEditProfileBtn();

        // Clicks on the (X) button to close the edit profile pop-up.
        pm.profilePage().clickXbuttonEditProfile();

        // Clicks on the "Edit Profile" button again to reopen the edit profile section.
        pm.profilePage().clickEditProfileBtn();

        // Enters values in the edit profile fields.
        pm.profilePage().enterValuesEditProfile();
    }


    /**
     * This test verifies the logout functionality.
     * It ensures that users can log out successfully and are redirected to the login page.
     */
    @Test(groups = {"regression", "sanity"})
    public void LogoutFunctionality() throws InterruptedException, IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Opens the profile menu.
        pm.profilePage().clickProfileBtn();

        // Clicks the logout button.
        pm.profilePage().clickBtnLogout();

        // Clicks the "No, Keep Login" button to cancel logout.
        pm.profilePage().clickBtnNoKeepLogout();

        // Waits for 3 seconds.
        Thread.sleep(3000);

        // Clicks the logout button again.
        pm.profilePage().clickBtnLogout();

        // Confirms logout by clicking the "Yes, Logout" button.
        pm.profilePage().clickBtnYesLogout();

        // Verifies that the user is redirected to the login page.
        pm.vendorLoginPage().verifyLoginHeaderTxt();
    }

    /**
     * This test verifies the functionality of various links in the profile section.
     * It ensures that users can navigate to different sections and return to the profile page.
     */
    @Test(groups = {"regression"})
    public void testLinks() throws InterruptedException, IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Opens the profile menu.
        pm.profilePage().clickProfileBtn();

        // Clicks the "Preface" link and navigates back.
        pm.profilePage().clickLinkPreface();
        Thread.sleep(3000);
        driver.navigate().back();

        // Clicks the "Calendar Events" link and navigates back.
        pm.profilePage().clickLinkCalendarEvents();
        Thread.sleep(3000);
        driver.navigate().back();

        // Clicks the "General Provision" link.
        pm.profilePage().clickLinkGeneralProvision();
    }


    /***********************    Announcements   ****************************************/


    /**
     * This test verifies the search functionality within the General tab.
     * It ensures that users can filter announcements based on search criteria.
     */
    @Test(groups = {"regression", "sanity"})
    public void searchByTitlesinGeneralTab() throws InterruptedException, IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Verifies the "View All" button and clicks it.
        pm.homePage().verifyViewAllBtn();
        pm.homePage().clickViewAllBtn();

        // Clicks on the "General" tab in the announcements section.
        pm.announcementPage().clickGeneralTab();
    }


    @Test(groups = {"regression", "sanity"})
    public void searchByCirculartitles() throws IOException, InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Verifies the "View All" button and clicks it.
        pm.homePage().clickViewAllBtn();
        pm.announcementPage().clickCircularTab();
        pm.announcementPage().seachCurcularTitles();
    }

    @Test(groups = {"regression", "sanity"})
    public void verifyViewAndPDFIcons() throws IOException, InterruptedException, AWTException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        // Verifies the "View All" button and clicks it.
        pm.homePage().clickViewAllBtn();
        pm.announcementPage().clickCircularTab();
        pm.announcementPage().verifyViewAndPdfIcons();
        pm.announcementPage().clickViewBtn();
        pm.announcementPage().clickPdfbtn();
    }

    @Test(groups = {"regression", "sanity"})
    public void checkTenderDetails() throws IOException, InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        // Verifies the "View All" button and clicks it.
        pm.homePage().clickViewAllBtn();
        pm.announcementPage().clickOnTender();
        pm.announcementPage().markAsFavourite();

    }


/***********************    Notification   ****************************************/

    /**
     * This test verifies the functionality of the "Notifications" tab.
     * It ensures that the user can access and view notifications successfully.
     */
    @Test(groups = {"regression"})
    public void clickNotifications() throws InterruptedException, IOException {
        // Clicks the "Vendor Login" button to navigate to the login page.
        pm.preLoginPage().clickBtnvendorLogin();

        // Performs login using valid credentials.
        pm.vendorLoginPage().performLogin();

        // Waits for 6 seconds to allow elements to load properly.
        Thread.sleep(6000);

        // Clicks on the "Notifications" tab on the home page.
        pm.homePage().clickNotificationsTab();

        // Accesses and verifies the notifications section.
        pm.notificationsPage().scrollToTodayHeading();
    }

    @Test
    public void clickNotificationReadRadioBtn() throws IOException, InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickNotificationsTab();
        pm.notificationsPage().scrollToTodayHeading();
        pm.notificationsPage().verifyTodayHeading();
        pm.notificationsPage().verifyThisweekHeading();
        pm.notificationsPage().verifyMarkAllReadHeading();
        pm.notificationsPage().verifyContentMssgDesc();
        pm.notificationsPage().verifyyourAllcaughtUpMssg();


        pm.notificationsPage().clickReadRadioBtn();
//        pm.notificationsPage().clickUnReadRadioBtn();

    }


    /***********************    Calendar   ****************************************/

    @Test(groups = {"regression", "sanity"})
    public void verifycalendarUIElements() throws IOException, InterruptedException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickCalendarTab();
        pm.calendarPage().verifyUI();
        pm.calendarPage().clickPreviousAndNextBtn();
        pm.calendarPage().verifytenders();
    }


    // Test to verify the functionality of searching within the FAQ section
    @Test(groups = {"regression", "sanity"})
    public void searchFaq() throws IOException {

        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Step 3: Click on the "FAQ" tab to navigate to the FAQ section
        pm.homePage().clickfaqtab();

        // Step 4: Perform a specific search within the FAQ section
        pm.faqPage().searchFAQ();
    }


    // Test to verify the FAQ text interaction and profile navigation
    @Test(groups = {"regression", "sanity"})
    public void clicktext() throws InterruptedException, IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();

        // Step 3: Click on the "FAQ" tab to navigate to the FAQ section
        pm.homePage().clickfaqtab();

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
