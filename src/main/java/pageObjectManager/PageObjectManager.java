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
