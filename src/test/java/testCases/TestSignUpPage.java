package testCases;

import baseClass.BaseClass;
import baseTest.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.io.IOException;

@Listeners(reports.ExtentReportManager.class)
public class TestSignUpPage extends BaseTest {


    @Test
    public void registerNowUIValidations() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().verifySignUpHeaderTxt();
        pm.signUpPage().verifyemailHeaderTxt();
        pm.signUpPage().verifymobileNoHeaderTxt();
        pm.signUpPage().verifypasswordHeaderTxt();
        pm.signUpPage().verifyfirstNameHeaderTxt();
        pm.signUpPage().verifylastNameHeaderTxt();
        pm.signUpPage().verifyaptSuiteBuildingHeaderTxt();
        pm.signUpPage().verifystreetCityAddressHeaderTxt();
        pm.signUpPage().verifypostCodeHeaderTxt();
        pm.signUpPage().verifyGoogleBtn();
        pm.signUpPage().verifyFacebookBtn();
        pm.signUpPage().verifyLoginHereLink();


    }

    @Test
    public void signUpFieldValidations() throws IOException {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().performEmailValidations("as");
        pm.signUpPage().performMobileNoValidation("12");
        pm.signUpPage().performPassword8CharsValidation("as");
        pm.signUpPage().performPasswordUpperCaseValidation("cdefgh");
        pm.signUpPage().performPasswordOneNumberValidation();
        pm.signUpPage().performPasswordSpecialcharValidation();
        pm.signUpPage().performFirstNameValidation("a");
        pm.signUpPage().performlastNameValidation("a");
        pm.signUpPage().performAptSuiteBldgValidation("a");
        pm.signUpPage().performStreetCityAddressValidation("a");
        pm.signUpPage().performPostCodeValidation("34");
        pm.signUpPage().verifySignUpBtn();

    }

    @Test
    public void enterValuesForSignUP() {
        pm.preLoginPage().clickBtnvendorLogin();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().randmEmail();
        pm.signUpPage().randomMobileNumbers();
        pm.signUpPage().randomPassword();
        pm.signUpPage().randomFirstName();
        pm.signUpPage().randomLastName();
        pm.signUpPage().randomAptSuiteBldgName();
        pm.signUpPage().randomStreetCityAddressName();
        pm.signUpPage().randomPostCode();
        pm.signUpPage().clickLoginHereLink();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }


}
