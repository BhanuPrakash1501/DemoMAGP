package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Set;


public class HomePage extends BaseClass {

    private WebDriver _driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement home;

    @FindBy(xpath = "//a[normalize-space()='Favourites']")
    private WebElement favourites;

    @FindBy(xpath = "//a[normalize-space()='Calendar']")
    private WebElement calendar;

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

    @FindBy(xpath = "//a[contains(@href,'/user/introduction?id=get-introduction-list&name=Introduction')]")
    private WebElement introduction;

    @FindBy(xpath = "//a[@href='/user/introduction?id=get-procurement-planning-list&name=Procurement+Planning']")
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

    public void clickFavouritesTab() {
        elementClick(getFavourites());
    }

    public void clickOnLinksAndVerify() throws InterruptedException {
        Thread.sleep(1000);
        elementClick(getCrossbtn());
        Thread.sleep(3000);

        scrollToElement(getMahbContactDirectoryLink());
        Thread.sleep(1000);

        String pWindow = getWindowHandle();

        elementClick(getMahbContactDirectoryLink());
        Thread.sleep(2000);

        navigateBack();
        popUpClose(getCrossbtn());
        scrollPageToDown();

        elementClick(getProcurehereLoginLink());
        Thread.sleep(2000);
        Set<String> windows = getWindowHandles();

        for (String window : windows) {

            if (!window.equals(pWindow)) {
                switchToWindow(window);
                System.out.println(getAppTitle());

            }

        }
        closeWindow();
        switchToWindow(pWindow);
        elementClick(getVendorManagementSystemLink());
        Thread.sleep(3000);
        Set<String> handles = getWindowHandles();
        for (String handle : handles) {

            if (!handle.equals(pWindow)) {
                switchToWindow(handle);
                System.out.println(getAppTitle());

            }

        }
        closeWindow();
        switchToWindow(pWindow);
        Thread.sleep(2000);
        quitWindow();

    }

    public void verifyPurchaseIdTxt() {
        String purchaseIdTxt = getPurchaseIDTxt().getText();
        Assert.assertEquals(purchaseIdTxt, "Purchase ID");
    }

    public void verifyPurchaseIdDescTxt() {
        String purchaseIdDescTxt = getPurchaseIDTxt().getText();
        Assert.assertEquals(purchaseIdDescTxt, "Purchase login ID to access an expanded array of modules and features");
    }

    public void verifyLatestAnnouncementTxt() {
        scrollToElement(getLast7daysTxt());
        waitForVisibility(By.xpath("//h2[text()='Latest Announcements']"));
        String latestAnnouncementTxt = getLatestAnnouncementsTxt().getText();
        Assert.assertEquals(latestAnnouncementTxt, "Latest Announcements");
    }

    public void verifyLast7DaysTxt() {
        String last7DaysTxt = getLast7daysTxt().getText();
        Assert.assertEquals(last7DaysTxt, "Last 7 days");
    }

    public void verifyViewAll() {
        scrollToElement(getViewAll());
        waitForVisibility(By.xpath("//button[text()='View All']"));
        String viewAllTxt = getViewAll().getText();
        Assert.assertEquals(viewAllTxt, "View All");
    }


    public void clickXbtnLoginPopUp() {
        elementClick(getXBtnLoginPopup());
    }

    public void xbutton() {
        elementClick(xBtn);
    }

    public void verifyLoginIDpopUpTxt() {
        String ele = elementGetText(getTxtLoginPopUp());
        Assert.assertEquals(ele, "Kindly proceed with the login process to access an expanded array of modules and features.");
    }

    public void clickLoginBtn() {
        elementClick(getLoginbtn());

    }

    public void clickViewAllBtn() {
        elementClick(getViewAll());

    }

    public void clickOnContactDirectoryLink() {
        scrollPageToDown();
        waitForVisibility(By.xpath("//h2[normalize-space()='Contact Directory']"));
        elementClick(getContactUsbtn());
        String contactDir = elementGetText(getMAHBHeadingTxt());
        Assert.assertEquals(contactDir, "MAHB Procurement Contact Directory");

    }

    public void clickOnProcureHereLoginLink() throws InterruptedException {
        scrollPageToDown();
        waitForVisibility(By.xpath("//h2[normalize-space()='Procurehere login']"));
        elementClick((getProcurehereLoginLink()));

        String pWindow = getWindowHandle();
        Set<String> handles = getWindowHandles();
        for (String handle : handles) {

            if (!handle.equals(pWindow)) {
                switchToWindow(handle);
                Thread.sleep(2000);
                System.out.println(getAppTitle());

            }

        }
        closeWindow();
        switchToWindow(pWindow);
        System.out.println(getAppTitle());
    }

    public void clickOnVenderManagementSystemLink() {
        scrollPageToDown();
        waitForVisibility(By.xpath("//h2[normalize-space()='Vendor Management System']"));
        elementClick(getVendorManagementLink());
    }

    public void clickIntroductionManual() {
        scrollToElement(getIntroduction());
        elementClick(getIntroduction());
    }

    public void clickProcurementPlanningManual() {
        scrollToElement(getProcurementPlanning());
        elementClick(getProcurementPlanning());
    }

    public void clickRequistionManual() {
        scrollToElement(getRequisition());
        elementClick(getRequisition());
    }

    public void clickSourcingManual() {
        scrollToElement(getSourcing());
        elementClick(getSourcing());
    }

    public void clickContractAdministrationManual() {
        scrollToElement(getContractAdministration());
        elementClick(getContractAdministration());
    }

    public void clickVendorManagentManual() {
        scrollToElement(getVendorMgnt());
        elementClick(getVendorMgnt());
    }


    public void clickFaq() throws InterruptedException {
        Thread.sleep(3000);
        elementClick(getfAQs());
    }

    public void clickCalendarTab() {

    }

}

