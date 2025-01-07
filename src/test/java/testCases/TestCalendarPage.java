package testCases;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class TestCalendarPage extends BaseTest {

    @Test
    public void ClickOnCalendar() throws InterruptedException {
        pm.preLoginPage().clickBtnstaffLogin();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");
        Thread.sleep(6000);
        pm.homePage().clickCalendarTab();
        pm.calendarPage().Calendar();

    }

}
