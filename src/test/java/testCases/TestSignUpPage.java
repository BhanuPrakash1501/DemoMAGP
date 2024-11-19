package testCases;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pageObjectManager.PageObjectManager;

import java.io.IOException;

public class TestSignUpPage extends BaseClass {
    PageObjectManager pm = new PageObjectManager();

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
        pm.signUpPage().performEmailValidations(getCellValue("SignUp", 1, 0));
        pm.signUpPage().performMobileNoValidation(getCellValue("SignUP", 1, 1));
        pm.signUpPage().performPassword8CharsValidation(getCellValue("SignUp", 1, 2));
        pm.signUpPage().performPasswordUpperCaseValidation(getCellValue("SignUp", 2, 2));
        pm.signUpPage().performPasswordOneNumberValidation();
        pm.signUpPage().performPasswordSpecialcharValidation();
        pm.signUpPage().performFirstNameValidation(getCellValue("SignUp", 1, 3));
        pm.signUpPage().performlastNameValidation(getCellValue("SignUp", 1, 4));
        pm.signUpPage().performAptSuiteBldgValidation(getCellValue("SignUp", 1, 5));
        pm.signUpPage().performStreetCityAddressValidation(getCellValue("SignUp", 1, 6));
        pm.signUpPage().performPostCodeValidation(getCellValue("SignUp", 1, 7));
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
