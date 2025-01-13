package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestGalleryPage extends BaseTest {

    @Test
    public void clickGallery() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin();
        pm.staffLoginPage().performPassword();
        Thread.sleep(6000);
        pm.homePage().clickGalleryTab();
        pm.galleryPage().gallery();

    }
}
