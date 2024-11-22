package pages;


import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StaffLoginPage extends BaseClass {
    public WebDriver _driver;

    public StaffLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "i0116")
    private WebElement signEmail;

    @FindBy(id = "idSIButton9")
    private WebElement nextbtn;

    @FindBy(id = "passwordInput")
    private WebElement pdwbtn;

    @FindBy(id = "submitButton")
    private WebElement signInbtn;

    @FindBy(id = "idBtn_Back")
    private WebElement nobtn;

    public WebElement getSignEmail() {
        return signEmail;
    }

    public WebElement getNextbtn() {
        return nextbtn;
    }

    public WebElement getPdwbtn() {
        return pdwbtn;
    }

    public WebElement getSignInbtn() {
        return signInbtn;
    }

    public WebElement getNobtn() {
        return nobtn;
    }

    public void performLogin(String username) {
        elementSendKeys(getSignEmail(), username);
        elementClick(getNextbtn());

    }

    public void performPassword(String password) {

        elementSendKeys(getPdwbtn(), password);
        elementClick(getSignInbtn());
        elementClick(getNobtn());

    }

}



