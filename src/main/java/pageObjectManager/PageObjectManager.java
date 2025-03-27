package pageObjectManager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageObjectManager {

    public WebDriver _driver;


    private VendorLoginPage vendorLoginPage;
    private PreLoginPage preLoginPage;
    private FaqPage faqPage;
    private FavouritesPage favouritesPage;
    private ForgetPasswordPage forgetPasswordPage;
    private HomePage homePage;
    private ProfilePage profilePage;
    private SignUpPage signUpPage;
    private StaffLoginPage staffLoginPage;
    private IntroductionPage introductionPage;
    private ProcurementPlanningPage procurementPlanningPage;
    private RequistionPage requistionPage;
    private ContractAdministrationPage contractAdministrationPage;
    private SourcingPage sourcingPage;
    private CalendarPage calendarPage;
    private GalleryPage galleryPage;
    private NotificationsPage notificationsPage;
    private VendorManagementPage vendorManagementPage;
    private AnnouncementPage announcementPage;
//    private PrefacePage prefacePage;

    // Constructor to initialize WebDriver instance
    public PageObjectManager(WebDriver driver) {

        this._driver = driver;
    }

    // Returns an instance of PreLoginPage, initializing it lazily if not already created
    public PreLoginPage preLoginPage() {
        if (preLoginPage == null) {
            preLoginPage = new PreLoginPage(_driver);
        }
        return preLoginPage;
    }

    // Returns an instance of VendorLoginPage, initializing it lazily if not already created
    public VendorLoginPage vendorLoginPage() {
        if (vendorLoginPage == null) {
            vendorLoginPage = new VendorLoginPage(_driver);
        }
        return vendorLoginPage;
    }

    // Returns an instance of SignUpPage, initializing it lazily if not already created
    public SignUpPage signUpPage() {
        if (signUpPage == null) {
            signUpPage = new SignUpPage(_driver);
        }
        return signUpPage;
    }

    // Returns an instance of ForgetPasswordPage, initializing it lazily if not already created
    public ForgetPasswordPage forgetPasswordPage() {
        if (forgetPasswordPage == null) {
            forgetPasswordPage = new ForgetPasswordPage(_driver);
        }
        return forgetPasswordPage;
    }

    // Returns an instance of HomePage, initializing it lazily if not already created
    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(_driver);
        }
        return homePage;
    }

    // Returns an instance of IntroductionPage, initializing it lazily if not already created
    public IntroductionPage introductionPage() {
        if (introductionPage == null) {
            introductionPage = new IntroductionPage(_driver);
        }
        return introductionPage;
    }

    // Returns an instance of ProcurementPlanningPage, initializing it lazily if not already created
    public ProcurementPlanningPage procurementPlanningPage() {
        if (procurementPlanningPage == null) {
            procurementPlanningPage = new ProcurementPlanningPage(_driver);
        }
        return procurementPlanningPage;
    }

    // Returns an instance of RequisitionPage, initializing it lazily if not already created
    public RequistionPage requistionPage() {
        if (requistionPage == null) {
            requistionPage = new RequistionPage(_driver);
        }
        return requistionPage;
    }

    // Returns an instance of ContractAdministrationPage, initializing it lazily if not already created
    public ContractAdministrationPage contractAdministrationPage() {
        if (contractAdministrationPage == null) {
            contractAdministrationPage = new ContractAdministrationPage(_driver);
        }
        return contractAdministrationPage;
    }

    // Returns an instance of SourcingPage, initializing it lazily if not already created
    public SourcingPage sourcingPage() {
        if (sourcingPage == null) {
            sourcingPage = new SourcingPage(_driver);
        }
        return sourcingPage;
    }

    // Returns an instance of VendorManagementPage, initializing it lazily if not already created
    public VendorManagementPage vendorManagementPage() {
        if (vendorManagementPage == null) {
            vendorManagementPage = new VendorManagementPage(_driver);
        }
        return vendorManagementPage;
    }

    // Returns an instance of StaffLoginPage, initializing it lazily if not already created
    public StaffLoginPage staffLoginPage() {
        if (staffLoginPage == null) {
            staffLoginPage = new StaffLoginPage(_driver);
        }
        return staffLoginPage;
    }

    // Returns an instance of FavouritesPage, initializing it lazily if not already created
    public FavouritesPage favouritesPage() {
        if (favouritesPage == null) {
            favouritesPage = new FavouritesPage(_driver);
        }
        return favouritesPage;
    }

    // Returns an instance of CalendarPage, initializing it lazily if not already created
    public CalendarPage calendarPage() {
        if (calendarPage == null) {
            calendarPage = new CalendarPage(_driver);
        }
        return calendarPage;
    }

    // Returns an instance of GalleryPage, initializing it lazily if not already created
    public GalleryPage galleryPage() {
        if (galleryPage == null) {
            galleryPage = new GalleryPage(_driver);
        }
        return galleryPage;
    }

    // Returns an instance of NotificationsPage, initializing it lazily if not already created
    public NotificationsPage notificationsPage() {
        if (notificationsPage == null) {
            notificationsPage = new NotificationsPage(_driver);
        }
        return notificationsPage;
    }

    // Returns an instance of ProfilePage, initializing it lazily if not already created
    public ProfilePage profilePage() {
        if (profilePage == null) {
            profilePage = new ProfilePage(_driver);
        }
        return profilePage;
    }

    // Returns an instance of FaqPage, initializing it lazily if not already created
    public FaqPage faqPage() {
        if (faqPage == null) {
            faqPage = new FaqPage(_driver);
        }
        return faqPage;
    }

    // Returns an instance of AnnouncementPage, initializing it lazily if not already created
    public AnnouncementPage announcementPage() {
        if (announcementPage == null) {
            announcementPage = new AnnouncementPage(_driver);
        }
        return announcementPage;
    }




}
