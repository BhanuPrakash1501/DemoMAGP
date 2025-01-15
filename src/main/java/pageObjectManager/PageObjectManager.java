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
//    private PrefacePage prefacePage;


    public PageObjectManager(WebDriver driver) {

        this._driver = driver;
    }

    public PreLoginPage preLoginPage() {
        if(preLoginPage == null){
            preLoginPage = new PreLoginPage(_driver);
        }
        return preLoginPage;

    }

    public VendorLoginPage vendorLoginPage() {
        if (vendorLoginPage == null) {
            vendorLoginPage = new VendorLoginPage(_driver);
        }
        return vendorLoginPage;
    }

    public SignUpPage signUpPage() {
        if (signUpPage == null) {
            signUpPage = new SignUpPage(_driver);
        }
        return signUpPage;
    }

    public ForgetPasswordPage forgetPasswordPage() {
        if (forgetPasswordPage == null) {
            forgetPasswordPage = new ForgetPasswordPage(_driver);
        }
        return forgetPasswordPage;
    }

    public HomePage homePage(){
        if(homePage == null){
            homePage= new HomePage(_driver);
        }
        return homePage;
    }
    public IntroductionPage introductionPage(){
        if(introductionPage == null){
            introductionPage =  new IntroductionPage(_driver);
        }
        return introductionPage;
    }

    public ProcurementPlanningPage procurementPlanningPage(){
        if(procurementPlanningPage == null){
            procurementPlanningPage =  new ProcurementPlanningPage(_driver);
        }
        return procurementPlanningPage;
    }

    public RequistionPage requistionPage(){
        if(requistionPage == null){
            requistionPage =  new RequistionPage(_driver);
        }
        return requistionPage;
    }

    public ContractAdministrationPage contractAdministrationPage(){
        if(contractAdministrationPage == null){
            contractAdministrationPage = new ContractAdministrationPage(_driver);
        }
        return contractAdministrationPage;
    }

    public SourcingPage sourcingPage(){
        if(sourcingPage == null){
            sourcingPage =  new SourcingPage(_driver);
        }
        return sourcingPage;
    }

    public VendorManagementPage vendorManagementPage(){
        if(vendorManagementPage == null){
            vendorManagementPage =  new VendorManagementPage(_driver);
        }
        return vendorManagementPage;
    }

    public StaffLoginPage staffLoginPage(){
        if (staffLoginPage == null){
            staffLoginPage= new StaffLoginPage(_driver);
        }
        return staffLoginPage;
    }
    public FavouritesPage favouritesPage(){
        if (favouritesPage  == null){
            favouritesPage = new FavouritesPage(_driver);
        }
        return favouritesPage;
    }

    public CalendarPage calendarPage(){
        if (calendarPage  == null){
            calendarPage = new CalendarPage(_driver);
        }
        return calendarPage;
    }

    public GalleryPage galleryPage(){
        if(galleryPage == null){
            galleryPage = new GalleryPage(_driver);
        }
        return galleryPage;
    }

    public NotificationsPage notificationsPage(){
        if (notificationsPage  == null){
            notificationsPage = new NotificationsPage(_driver);
        }
        return notificationsPage;
    }

    public ProfilePage profilePage(){
        if(profilePage == null){
            profilePage = new ProfilePage(_driver);
        }
        return profilePage;

    }

    public FaqPage faqPage(){
        if(faqPage == null){
            faqPage = new FaqPage(_driver);
        }
        return faqPage;

    }


}
