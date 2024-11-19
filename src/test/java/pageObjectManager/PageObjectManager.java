package pageObjectManager;

import pages.*;

public class PageObjectManager {
    private VendorLoginPage vendorLoginPage;
    private PreLoginPage preLoginPage;
    private FaqPage faqPage;
    private FavouritesPage favouritesPage;
    private ForgetPasswordPage forgetPasswordPage;
    private HomePage homePage;
    private ProfilePage profilePage;
    private SignUpPage signUpPage;
    private StaffLoginPage staffLoginPage;
//    private IntroductionPage introductionPage;
//    private PrefacePage prefacePage;

    public PreLoginPage preLoginPage() {
        if (preLoginPage == null) {
            preLoginPage = new PreLoginPage();
        }
        return preLoginPage;
    }

    public VendorLoginPage vendorLoginPage() {
        if (vendorLoginPage == null) {
            vendorLoginPage = new VendorLoginPage();
        }
        return vendorLoginPage;
    }

    public SignUpPage signUpPage() {
        if (signUpPage == null) {
            signUpPage = new SignUpPage();
        }
        return signUpPage;
    }

    public ForgetPasswordPage forgetPasswordPage() {
        if (forgetPasswordPage == null) {
            forgetPasswordPage = new ForgetPasswordPage();
        }
        return forgetPasswordPage;
    }

    public HomePage homePage(){
        if(homePage == null){
            homePage= new HomePage();
        }
        return homePage;
    }
//    public IntroductionPage introductionPage(){
//        if(introductionPage == null){
//            introductionPage =  new IntroductionPage();
//        }
//        return introductionPage;
//    }

    public StaffLoginPage staffLoginPage(){
        if (staffLoginPage == null){
            staffLoginPage= new StaffLoginPage();
        }
        return staffLoginPage;
    }
    public FavouritesPage favouritesPage(){
        if (favouritesPage  == null){
            favouritesPage = new FavouritesPage();
        }
        return favouritesPage;
    }

    public ProfilePage profilePage(){
        if(profilePage == null){
            profilePage = new ProfilePage();
        }
        return profilePage;

    }
}
