package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestFavouritesPage extends BaseTest {

    @Test
    public void manualTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickManualTab();
        pm.favouritesPage().favManualList();;

    }

    @Test
    public void tenderTab(){
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().performLogin();
        pm.homePage().clickFavouritesTab();
        pm.favouritesPage().clickTenderTab();
        pm.favouritesPage().favTenderList();


    }



}
