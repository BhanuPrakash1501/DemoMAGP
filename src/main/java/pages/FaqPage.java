package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FaqPage extends BaseClass {
    private WebDriver _driver;

    public FaqPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement searchBar;

    @FindBy(xpath = "//h2[text()='Have A Question? Solve your Doubts']")
    private WebElement haveAQuestiontxt;

    @FindBy(xpath = "//h2[@class='accordion-header']//button")
    private List<WebElement> faqList;


    public List<WebElement> getFaqList() {
        return faqList;
    }

    public WebElement getHaveAQuestiontxt() {
        return haveAQuestiontxt;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void searchFaq() {
//        scrollToElement(haveAQuestiontxt);
//        waitForVisibility(By.xpath("//h2[text()='Have A Question? Solve your Doubts']"));
//        waitForVisibility(By.xpath("(//input[@placeholder='Search'])[2]"));
        scrollByWindow();
        clickUsingJavaScript(getSearchBar());
        elementSendKeys(getSearchBar(), "Internal process");
//        getSearchBar().sendKeys("Internal process");
    }

    public void listOfFaqs() throws InterruptedException {
        scrollToElement(getHaveAQuestiontxt());
        waitForVisibility(By.xpath("//h2[text()='Have A Question? Solve your Doubts']"));
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        for (int i = 0; i < getFaqList().size(); i++) {

            WebElement item = getFaqList().get(i);
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", item);
            WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(item));
            Thread.sleep(1000);
            String txt = item.getText();
            System.out.println(txt);
            clickUsingJavaScript(item);
            Assert.assertTrue(getFaqList().get(i).isDisplayed());

        }
//        for (WebElement element : getFaqList()) {
//            String text = element.getText();
//            System.out.println(text);
//        }
    }


}
