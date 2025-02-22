package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;


public class HomePage extends BaseClass {

    // WebDriver instance for browser interaction
    private WebDriver _driver;

    // WebDriverWait instance with a timeout of 10 seconds for explicit waits
    public WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));

    // Constructor to initialize the HomePage class with a WebDriver instance
    public HomePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this); // Initialize web elements using PageFactory
    }

    // Web elements identified using @FindBy annotation with their respective XPaths
    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement home;

    @FindBy(xpath = "//a[normalize-space()='Favourites']")
    private WebElement favourites;

    @FindBy(xpath = "//a[normalize-space()='Calendar']")
    private WebElement calendar;

    @FindBy(xpath = "//a[text()='Gallery']")
    private WebElement gallery;

    @FindBy(xpath = "//a[@href='/user/notifications']")
    private WebElement notifications;

    @FindBy(xpath = "//a[normalize-space()='FAQ']")
    private WebElement fAQs;


    @FindBy(xpath = "//input[@placeholder='Tender Name']")
    private WebElement searchbar;

    @FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p2.png\"]")
    private WebElement bellIcon;

    @FindBy(xpath = "//a[@id='nav-dropdown-ligh-example']")
    private WebElement eng;

    @FindBy(xpath = "//a[@role='button']//img[@src=\"/MAGP/home/p1.png\"]")
    private WebElement profile;
    // a[@href="/user/introduction?id=get-introduction-list&name=Introduction"]

    public WebElement getProfileIcon() {
        return profileIcon;
    }

    @FindBy(xpath = "//button[@role='button']//img[@src='/MAGP/home/p1.png']")
    private WebElement profileIcon;

    @FindBy(xpath = "//a[contains(@href,'/user/manuals/introduction')]")
    private WebElement introduction;

    @FindBy(xpath = "//a[@href='/user/manuals/procurement-planning']")
    private WebElement procurementPlanning;

    @FindBy(xpath = "//a[@href='/user/introduction?id=get-requisition-list&name=Requisition']")
    private WebElement requisition;

    @FindBy(xpath = "//a[@href='/user/introduction?id=get-sourcing-list&name=Sourcing']")
    private WebElement sourcing;

    @FindBy(xpath = "//a[@href='/user/introduction?id=get-contract-administration-list&name=Contract+Administration']")
    private WebElement contractAdministration;

    @FindBy(xpath = "//a[@href='/user/introduction?id=get-vendor-management-list&name=Vendor+Management']")
    private WebElement vendorMgnt;

    @FindBy(xpath = "//button[text()='View All']")
    private WebElement viewAll;


    @FindBy(xpath = "//a[text()='View All']")
    private WebElement viewAllbtn;

    @FindBy(xpath = "//h2[normalize-space()='Introduction']")
    private WebElement introductionLink;

    @FindBy(xpath = "//p[normalize-space()='Preface']")
    private WebElement prefaceLink;

    @FindBy(xpath = "//p[normalize-space()='Procurement Codes of Ethics']")
    private WebElement procurementCodesofEthicsLink;

    @FindBy(xpath = "//p[normalize-space()='General Provision']")
    private WebElement generalProvisionLink;

    @FindBy(xpath = "//p[normalize-space()='Terms & Definitions']")
    private WebElement termsDefinitionsLink;

    @FindBy(xpath = "//p[normalize-space()='Process Symbols']")
    private WebElement processSymbolsLink;

    @FindBy(xpath = "//p[text()='MAHB’s  Procurement value chain']")
    private WebElement mAHBsProcurementvaluechainLink;

    @FindBy(xpath = "//h2[normalize-space()='Contact Directory']")
    private WebElement contactUsbtn;

    @FindBy(xpath = "//h2[normalize-space()='Procurement Planning']")
    private WebElement procurementplanningLink;

    @FindBy(xpath = "//p[normalize-space()='Business Case']")
    private WebElement businessCaseLink;

    @FindBy(xpath = "//p[normalize-space()='Annual Procurement Planning']")
    private WebElement annualProcurementPlanningLink;

    @FindBy(xpath = "//p[normalize-space()='Strategy Paper']")
    private WebElement strategyPaperLink;

    @FindBy(xpath = "//h2[normalize-space()='Requisition']")
    private WebElement requisitionLink;

    @FindBy(xpath = "//p[normalize-space()='Purchase Requisition']")
    private WebElement purchaseRequisitionLink;

    @FindBy(xpath = "//p[contains(text(),'Process of')]")
    private WebElement processofPurchaseRequisitionLink;

    @FindBy(xpath = "//h2[normalize-space()='Sourcing']")
    private WebElement SourcingLink;

    @FindBy(xpath = "//p[normalize-space()='Tender Management']")
    private WebElement tenderManagementLink;

    @FindBy(xpath = "//p[normalize-space()='Tender Administration']")
    private WebElement tenderAdministrationLink;

    @FindBy(xpath = "//p[normalize-space()='Tender Evaluation']")
    private WebElement tenderEvaluationLink;

    @FindBy(xpath = "//p[normalize-space()='Abort of Tender']")
    private WebElement AbortofTenderLink;

    @FindBy(xpath = "//p[normalize-space()='Clarification/ Negotiation prior to Award']")
    private WebElement clarificationNegotiationpriortoAwardLink;

    @FindBy(xpath = "//h2[normalize-space()='Contract Administration']")
    private WebElement contractAdministrationLink;

    @FindBy(xpath = "//p[normalize-space()='Contract Management Implementation']")
    private WebElement contractManagementImplementationLink;

    @FindBy(xpath = "//p[normalize-space()='Contract Renewal']")
    private WebElement contractRenewalLink;

    @FindBy(xpath = "//p[normalize-space()='Contract Termination']")
    private WebElement contractTerminationLink;

    @FindBy(xpath = "//p[normalize-space()='Contract Closeout']")
    private WebElement contractCloseoutLink;

    @FindBy(xpath = "//h2[normalize-space()='Vendor Management System']")
    private WebElement vendorManagementLink;

    @FindBy(xpath = "//p[normalize-space()='Vendor Registration']")
    private WebElement vendorRegistrationLink;

    @FindBy(xpath = "//p[normalize-space()='Potential Vendor Screening']")
    private WebElement potentialVendorScreeningLink;

    @FindBy(xpath = "//p[normalize-space()='Vendor Management']")
    private WebElement vendorMgntLink;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginbtn;

    @FindBy(xpath = "//img[@class='img-close']")
    private WebElement XBtnLoginPopup;

    @FindBy(xpath = "//div[@class='position-absolute close-icon']//button")
    private WebElement crossbtn;

    @FindBy(xpath = "//h2[normalize-space()='MAHB Contact Directory']")
    private WebElement mahbContactDirectoryLink;

    @FindBy(xpath = "//h2[normalize-space()='Procurehere login']")
    private WebElement procurehereLoginLink;

    @FindBy(xpath = "//h2[normalize-space()='Vendor Management System']")
    private WebElement vendorManagementSystemLink;

    @FindBy(xpath = "//div[@class='me-4 link-footer d-flex align-items-center']/a")
    private List<WebElement> links;

    @FindBy(xpath = "//h3[text()='Welcome to MAGP']")
    private WebElement welcomeToMagpTxt;

    @FindBy(xpath = "//a[text()='Purchase ID']")
    private WebElement purchaseIDTxt;

    @FindBy(xpath = "//p[text()='Purchase login ID to access an expanded array of modules and features']")
    private WebElement purchaseIDPopDescTxt;

    @FindBy(xpath = "//h2[text()='Latest Announcements']")
    private WebElement latestAnnouncementsTxt;

    @FindBy(xpath = "//p[text()='Last 7 days']")
    private WebElement last7daysTxt;

    @FindBy(xpath = "//img[@class='logo me-3']")
    private WebElement malaysiaLogoIcon;

    @FindBy(xpath = "(//img[contains(@class,'logo-small')])[1]")
    private WebElement magpLogoIcon;

    @FindBy(xpath = "//div[@class='position-absolute close-icon']//button")
    private WebElement xBtn;

    @FindBy(xpath = "//p[text()='Kindly proceed with the login process to access an expanded array of modules and features.']")
    private WebElement txtLoginPopUp;

    @FindBy(xpath = "//h3[text()='MAHB Procurement Contact Directory']")
    private WebElement MAHBHeadingTxt;

    public WebElement getNotifications() {
        return notifications;
    }

    public WebElement getGallery() {
        return gallery;
    }

    public WebElement getMAHBHeadingTxt() {
        return MAHBHeadingTxt;
    }

    public WebElement getTxtLoginPopUp() {
        return txtLoginPopUp;
    }

    public WebElement getxBtn() {
        return xBtn;
    }

    public WebElement getLatestAnnouncementsTxt() {
        return latestAnnouncementsTxt;
    }

    public WebElement getLast7daysTxt() {
        return last7daysTxt;
    }

    public WebElement getMalaysiaLogoIcon() {
        return malaysiaLogoIcon;
    }

    public WebElement getMagpLogoIcon() {
        return magpLogoIcon;
    }

    public WebElement getWelcomeToMagpTxt() {
        return welcomeToMagpTxt;
    }

    public WebElement getPurchaseIDTxt() {
        return purchaseIDTxt;
    }

    public WebElement getPurchaseIDPopDescTxt() {
        return purchaseIDPopDescTxt;
    }

    public List<WebElement> getLinks() {
        return links;
    }

    public WebElement getWelocmeToMagpTxt() {
        return welcomeToMagpTxt;
    }

    public WebElement getHome() {
        return home;
    }

    public WebElement getFavourites() {
        return favourites;
    }

    public WebElement getCalendar() {
        return calendar;
    }

    public WebElement getfAQs() {
        return fAQs;
    }

    public WebElement getSearchbar() {
        return searchbar;
    }

    public WebElement getBellIcon() {
        return bellIcon;
    }

    public WebElement getEng() {
        return eng;
    }

    public WebElement getProfile() {
        return profile;
    }

    public WebElement getIntroduction() {
        return introduction;
    }

    public WebElement getProcurementPlanning() {
        return procurementPlanning;
    }

    public WebElement getRequisition() {
        return requisition;
    }

    public WebElement getSourcing() {
        return sourcing;
    }

    public WebElement getContractAdministration() {
        return contractAdministration;
    }

    public WebElement getVendorMgnt() {
        return vendorMgnt;
    }

    public WebElement getViewAll() {
        return viewAll;
    }


    public WebElement getViewAllBtn() {
        return viewAllbtn;
    }

    public WebElement getIntroductionLink() {
        return introductionLink;
    }

    public WebElement getPrefaceLink() {
        return prefaceLink;
    }

    public WebElement getProcurementCodesofEthicsLink() {
        return procurementCodesofEthicsLink;
    }

    public WebElement getGeneralProvisionLink() {
        return generalProvisionLink;
    }

    public WebElement getTermsDefinitionsLink() {
        return termsDefinitionsLink;
    }

    public WebElement getProcessSymbolsLink() {
        return processSymbolsLink;
    }

    public WebElement getmAHBsProcurementvaluechainLink() {
        return mAHBsProcurementvaluechainLink;
    }

    public WebElement getContactUsbtn() {
        return contactUsbtn;
    }

    public WebElement getProcurementplanningLink() {
        return procurementplanningLink;
    }

    public WebElement getBusinessCaseLink() {
        return businessCaseLink;
    }

    public WebElement getAnnualProcurementPlanningLink() {
        return annualProcurementPlanningLink;
    }

    public WebElement getStrategyPaperLink() {
        return strategyPaperLink;
    }

    public WebElement getRequisitionLink() {
        return requisitionLink;
    }

    public WebElement getPurchaseRequisitionLink() {
        return purchaseRequisitionLink;
    }

    public WebElement getProcessofPurchaseRequisitionLink() {
        return processofPurchaseRequisitionLink;
    }

    public WebElement getSourcingLink() {
        return SourcingLink;
    }

    public WebElement getTenderManagementLink() {
        return tenderManagementLink;
    }

    public WebElement getTenderAdministrationLink() {
        return tenderAdministrationLink;
    }

    public WebElement getTenderEvaluationLink() {
        return tenderEvaluationLink;
    }

    public WebElement getAbortofTenderLink() {
        return AbortofTenderLink;
    }

    public WebElement getClarificationNegotiationpriortoAwardLink() {
        return clarificationNegotiationpriortoAwardLink;
    }

    public WebElement getContractAdministrationLink() {
        return contractAdministrationLink;
    }

    public WebElement getContractManagementImplementationLink() {
        return contractManagementImplementationLink;
    }

    public WebElement getContractRenewalLink() {
        return contractRenewalLink;
    }

    public WebElement getContractTerminationLink() {
        return contractTerminationLink;
    }

    public WebElement getContractCloseoutLink() {
        return contractCloseoutLink;
    }

    public WebElement getVendorManagementLink() {
        return vendorManagementLink;
    }

    public WebElement getVendorRegistrationLink() {
        return vendorRegistrationLink;
    }

    public WebElement getPotentialVendorScreeningLink() {
        return potentialVendorScreeningLink;
    }

    public WebElement getVendorMgntLink() {
        return vendorMgntLink;
    }

    public WebElement getLoginbtn() {
        return loginbtn;
    }

    public WebElement getCrossbtn() {
        return crossbtn;
    }

    public WebElement getXBtnLoginPopup() {
        return XBtnLoginPopup;
    }

    public WebElement getMahbContactDirectoryLink() {
        return mahbContactDirectoryLink;
    }

    public WebElement getProcurehereLoginLink() {
        return procurehereLoginLink;
    }

    public WebElement getVendorManagementSystemLink() {
        return vendorManagementSystemLink;
    }

    public void verifyWelcomeToMagpTxt() {
        String welcomeToMagpTxt = getWelocmeToMagpTxt().getText();
        Assert.assertEquals(welcomeToMagpTxt, "Welcome to MAGP");

    }
    /**
     * Clicks on the "Favourites" tab.
     */
    public void clickFavouritesTab() {
        elementClick(getFavourites());
    }

    /**
     * Clicks on various links, verifies navigation, and handles window switching.
     *
     * @throws InterruptedException Added to handle Thread.sleep() but should be replaced with explicit waits.
     */
    public void clickOnLinksAndVerify() throws InterruptedException {
        Thread.sleep(1000); // Consider replacing with explicit wait
        elementClick(getCrossbtn()); // Click the close button (possibly a popup)
        Thread.sleep(3000);

        // Scrolls to the "MAHB Contact Directory" link and clicks it
        scrollToElement(getMahbContactDirectoryLink());
        Thread.sleep(1000);
        String pWindow = getWindowHandle(); // Store the parent window handle

        elementClick(getMahbContactDirectoryLink()); // Open the contact directory link
        Thread.sleep(2000);

        navigateBack(); // Navigate back to the previous page
        popUpClose(getCrossbtn()); // Close popup if present
        scrollPageToDown(); // Scroll down the page

        // Click the "Procurehere Login" link and handle the new window
        elementClick(getProcurehereLoginLink());
        Thread.sleep(2000);
        Set<String> windows = getWindowHandles();

        for (String window : windows) {
            if (!window.equals(pWindow)) {
                switchToWindow(window); // Switch to the new window
                System.out.println(getAppTitle()); // Print the title of the new window
            }
        }

        closeWindow(); // Close the new window
        switchToWindow(pWindow); // Switch back to the main window

        // Click on "Vendor Management System" link and handle the new window
        elementClick(getVendorManagementSystemLink());
        Thread.sleep(3000);
        Set<String> handles = getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(pWindow)) {
                switchToWindow(handle);
                System.out.println(getAppTitle()); // Print the title of the new window
            }
        }

        closeWindow(); // Close the vendor management window
        switchToWindow(pWindow); // Switch back to the main window
        Thread.sleep(2000);
        quitWindow(); // Close all remaining browser windows
    }


    /**
     * Verifies that the "Purchase ID" text is displayed correctly.
     */
    public void verifyPurchaseIdTxt() {
        String purchaseIdTxt = getPurchaseIDTxt().getText();
        Assert.assertEquals(purchaseIdTxt, "Purchase ID");
    }

    /**
     * Verifies that the description for "Purchase ID" is displayed correctly.
     */
    public void verifyPurchaseIdDescTxt() {
        String purchaseIdDescTxt = getPurchaseIDTxt().getText();
        Assert.assertEquals(purchaseIdDescTxt, "Purchase login ID to access an expanded array of modules and features");
    }

    /**
     * Verifies that the "Latest Announcements" text is displayed correctly.
     * Uses scrolling and explicit wait to ensure element visibility.
     */
    public void verifyLatestAnnouncementTxt() {
        scrollToElement(getLast7daysTxt()); // Scroll to the "Last 7 days" text
        waitForVisibility(By.xpath("//h2[text()='Latest Announcements']")); // Wait for "Latest Announcements" to be visible
        String latestAnnouncementTxt = getLatestAnnouncementsTxt().getText();
        Assert.assertEquals(latestAnnouncementTxt, "Latest Announcements");
    }

    /**
     * Verifies that the "Last 7 days" text is displayed correctly.
     */
    public void verifyLast7DaysTxt() {
        String last7DaysTxt = getLast7daysTxt().getText();
        Assert.assertEquals(last7DaysTxt, "Last 7 days");
    }

    /**
     * Verifies the "View All" text is displayed correctly.
     * Uses scrolling and explicit waits for better reliability.
     *
     * @throws InterruptedException Consider replacing Thread.sleep with an explicit wait.
     */
    public void verifyViewAll() throws InterruptedException {
        Thread.sleep(3000); // Replace with explicit wait for better efficiency
        scrollToElement(getViewAll());
        waitForVisibility(By.xpath("//button[text()='View All']")); // Wait for "View All" button to be visible
        String viewAllTxt = getViewAll().getText();
        Assert.assertEquals(viewAllTxt, "View All");
    }

    public void verifyViewAllBtn() throws InterruptedException {
        Thread.sleep(3000); // Replace with explicit wait for better efficiency
        scrollToElement(getViewAllBtn());
        waitForVisibility(By.xpath("//a[text()='View All']")); // Wait for "View All" button to be visible
        String viewAllTxt = getViewAllBtn().getText();
        Assert.assertEquals(viewAllTxt, "View All");
    }

    /**
     * Clicks the "X" button on the login popup.
     */
    public void clickXbtnLoginPopUp() {
        elementClick(getXBtnLoginPopup());
    }

    /**
     * Clicks a generic "X" button.
     * Ensure this is the intended button and not conflicting with similar buttons elsewhere.
     */
    public void xbutton() {
        elementClick(xBtn);
    }


    /**
     * Verifies that the login popup text is displayed correctly.
     * Ensures that the user is prompted to proceed with the login process.
     */
    public void verifyLoginIDpopUpTxt() {
        waitForVisibility(By.xpath("//p[text()='Kindly proceed with the login process to access an expanded array of modules and features.']"));
        String ele = elementGetText(getTxtLoginPopUp());
        Assert.assertEquals(ele, "Kindly proceed with the login process to access an expanded array of modules and features.");
    }

    /**
     * Clicks the login button.
     * Assumes that the login button element is correctly retrieved.
     */
    public void clickLoginBtn() {
        elementClick(getLoginbtn());
    }

    /**
     * Clicks the "View All" button using JavaScript execution.
     * This method may be useful if the button is not interactable using standard click actions.
     */
    public void clickViewAllBtn() {
        clickUsingJavaScript(getViewAllBtn());
    }
    public void clickViewAll() {
        clickUsingJavaScript(getViewAll());
    }

    /**
     * Clicks on the "Contact Directory" link after ensuring it is visible.
     * Scrolls down the page, waits for the element to be visible, and then clicks it.
     * Verifies that the correct page or section is displayed by checking the heading text.
     */
    public void clickOnContactDirectoryLink() {
        scrollPageToDown(); // Scroll down the page to make the element visible
        waitForVisibility(By.xpath("//h2[normalize-space()='Contact Directory']")); // Wait until the "Contact Directory" section is visible
        clickUsingJavaScript(getContactUsbtn()); // Click the "Contact Us" button

        // Verify that the correct page or section has been loaded by checking the heading text
        String contactDir = elementGetText(getMAHBHeadingTxt());
        Assert.assertEquals(contactDir, "MAHB Procurement Contact Directory");
    }

    /**
     * Clicks on the "ProcureHere Login" link and verifies the navigation to a new window.
     * - Scrolls down to ensure the element is visible.
     * - Waits for the "ProcureHere Login" section to be visible.
     * - Clicks the link using JavaScript to handle any clickability issues.
     * - Switches to the newly opened window and prints the application title.
     * - Closes the new window and switches back to the original window.
     * - Prints the current URL and application title after switching back.
     *
     * @throws InterruptedException to handle sleep delays (should be replaced with explicit waits).
     */
    public void clickOnProcureHereLoginLink() throws InterruptedException {
        scrollPageToDown(); // Scroll down to make the element visible
        waitForVisibility(By.xpath("//h2[normalize-space()='Procurehere login']")); // Wait until the "ProcureHere Login" section is visible
        clickUsingJavaScript(getProcurehereLoginLink()); // Click the link using JavaScript

        String pWindow = getWindowHandle(); // Store the parent window handle

        Set<String> handles = getWindowHandles(); // Get all open window handles
        for (String handle : handles) {
            if (!handle.equals(pWindow)) { // Switch to the newly opened window
                switchToWindow(handle);
                Thread.sleep(2000); // Wait for the new page to load (replace with explicit waits)
                System.out.println(getAppTitle()); // Print the title of the new window
            }
        }

        closeWindow(); // Close the newly opened window
        Thread.sleep(2000); // Small delay before switching back (should be replaced with explicit waits)
        switchToWindow(pWindow); // Switch back to the parent window
        Thread.sleep(2000); // Delay before fetching the URL
        System.out.println(_driver.getCurrentUrl()); // Print the current URL
        Thread.sleep(2000);
        System.out.println(getAppTitle()); // Print the title of the current page
    }

    /**
     * Clicks on the "Vendor Management System" link.
     * - Scrolls down to make the element visible.
     * - Waits for the "Vendor Management System" section to be visible.
     * - Clicks the link.
     */
    public void clickOnVenderManagementSystemLink() {
        scrollPageToDown(); // Scroll down to ensure visibility
        waitForVisibility(By.xpath("//h2[normalize-space()='Vendor Management System']")); // Wait for the section to be visible
        elementClick(getVendorManagementLink()); // Click on the "Vendor Management System" link
        _driver.close();
    }


    /**
     * Clicks on the "Introduction Manual" link.
     * - Waits for 3 seconds (should be replaced with explicit waits).
     * - Scrolls to the "Introduction Manual" section to ensure visibility.
     * - Clicks the element using JavaScript in case of clickability issues.
     *
     * @throws InterruptedException due to the use of Thread.sleep() (should be optimized with WebDriverWait).
     */
    public void clickIntroductionManual() throws InterruptedException {
        Thread.sleep(3000); // Delay before interaction (should be replaced with an explicit wait)
        scrollToElement(getIntroduction()); // Scroll to the "Introduction Manual" section
        clickUsingJavaScript(getIntroduction()); // Click the element using JavaScript executor
    }

    /**
     * Clicks on the "Procurement Planning Manual" link.
     * - Scrolls to the section to ensure visibility.
     * - Clicks the link.
     */
    public void clickProcurementPlanningManual() {
        scrollToElement(getProcurementPlanning()); // Ensure element is visible
        elementClick(getProcurementPlanning()); // Click the Procurement Planning Manual link
    }

    /**
     * Clicks on the "Requisition Manual" link.
     * - Scrolls to the section to make it visible.
     * - Clicks the link.
     */
    public void clickRequistionManual() {
        scrollToElement(getRequisition()); // Scroll to the element
        elementClick(getRequisition()); // Click the Requisition Manual link
    }

    /**
     * Clicks on the "Sourcing Manual" link.
     * - Scrolls to the section to make it visible.
     * - Clicks the link using JavaScript for better interaction handling.
     */
    public void clickSourcingManual() {
        scrollToElement(getSourcing()); // Scroll to the element
        clickUsingJavaScript(getSourcing()); // Click using JavaScript executor
    }

    /**
     * Clicks on the "Contract Administration Manual" link.
     * - Scrolls to the section to make it visible.
     * - Clicks the link using JavaScript.
     */
    public void clickContractAdministrationManual() {
        scrollToElement(getContractAdministration()); // Scroll to the element
        clickUsingJavaScript(getContractAdministration()); // Click using JavaScript executor
    }

    /**
     * Clicks on the "Vendor Management Manual" link.
     * - Scrolls to the section to ensure visibility.
     * - Clicks the link.
     */
    public void clickVendorManagentManual() {
        scrollToElement(getVendorMgnt()); // Scroll to the element
        elementClick(getVendorMgnt()); // Click the Vendor Management Manual link
    }

    /**
     * Clicks on the "Calendar" tab.
     */
    public void clickCalendarTab() {
        elementClick(getCalendar()); // Click the Calendar tab
    }

    /**
     * Clicks on the "Gallery" tab.
     */
    public void clickGalleryTab() {
        elementClick(getGallery()); // Click the Gallery tab
    }

    /**
     * Clicks on the "Notifications" tab.
     */
    public void clickNotificationsTab() {
        elementClick(getNotifications()); // Click the Notifications tab
    }

    /**
     * Clicks on the "FAQ" tab.
     */
    public void clickfaqtab() {
        elementClick(getfAQs()); // Click the FAQ tab
    }

    /**
     * Verifies the "Home" tab is displayed correctly.
     * - Waits for the visibility of the Home tab.
     * - Retrieves the text of the Home tab and asserts it matches "Home".
     */
    public void verifyHometab() {
        waitForVisibility(By.xpath("//a[text()='Home']")); // Wait for Home tab to be visible
        String hometxt = elementGetText(getHome()); // Get the Home tab text
        Assert.assertEquals(hometxt, "Home"); // Assert the text is as expected
    }

    /**
     * Verifies the "FAQ" tab is displayed correctly.
     * - Waits for the FAQ tab to be visible.
     * - Retrieves the text of the FAQ tab and asserts it matches "FAQ".
     */
    public void verifyFAQtab() {
        waitForVisibility(By.xpath("//a[text()='FAQ']")); // Wait for FAQ tab to be visible
        String Faqtxt = elementGetText(getfAQs()); // Get the FAQ tab text
        Assert.assertEquals(Faqtxt, "FAQ"); // Assert the text is correct
    }

    /**
     * Verifies the "ENG" tab is displayed correctly.
     * - Waits for the ENG tab to be visible.
     * - Retrieves the text of the ENG tab and asserts it matches "ENG".
     */
    public void verifyENGtab() {
        waitForVisibility(By.xpath("//a[text()='ENG']")); // Wait for ENG tab to be visible
        String engtxt = elementGetText(getEng()); // Get the ENG tab text
        Assert.assertEquals(engtxt, "ENG"); // Assert the text is correct
    }

    /**
     * Verifies that the "Profile" tab is displayed.
     * - Waits for the Profile icon to be visible.
     * - Asserts that the Profile tab is displayed.
     */
    public void verifyprofiletab() {
        wait.until(ExpectedConditions.visibilityOf(getProfileIcon())); // Wait for Profile icon to be visible
        Assert.assertTrue(getProfile().isDisplayed()); // Assert that the Profile tab is displayed
    }


}

