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
    // WebDriver instance for interacting with the browser
    public WebDriver _driver;

    // Constructor to initialize the FaqPage class
    public FaqPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
        PageFactory.initElements(driver, this); // Initializes WebElements using PageFactory
    }

    // WebElement for the first search bar on the FAQ page
    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    private WebElement searchBar;

    // WebElement for the second search bar on the FAQ page
    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    private WebElement search;

    // WebElement for clicking on a specific FAQ question (Q5)
    @FindBy(xpath = "//button[text()='Q5: Is PM covers policy on gifts received from suppliers?']")
    private WebElement clickTextBox;

    // WebElement for the close (cross) button in the FAQ section
    @FindBy(xpath = "(//img[@src='/cancel-gray.svg'])[1]")
    private WebElement clickCrossbtn;

    // WebElement for the profile icon on the FAQ page
    @FindBy(xpath = "//img[@src='/MAGP/home/p1.png']")
    private WebElement clickProfileicon;

    // WebElement for the "FAQs" heading on the page
    @FindBy(xpath = "//h2[text()='FAQs']")
    private WebElement faqs;

    // WebElement for the "Have A Question? Solve your Doubts" section
    @FindBy(xpath = "//h2[text()='Have A Question? Solve your Doubts']")
    private WebElement solveyourdoubts;

    // WebElement for FAQ question 1 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q1:')]")
    private WebElement q1;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'edition of the Procurement')]")
    private WebElement answer1;

    // WebElement for FAQ question 2 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q2:')]")
    private WebElement q2;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Users can link to internal')]")
    private WebElement answer2;

    // WebElement for FAQ question 3 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q3:')]")
    private WebElement q3;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Any changes to the policies')]")
    private WebElement answer3;

    // WebElement for FAQ question 4 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q4:')]")
    private WebElement q4;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Quotation Document issues')]")
    private WebElement answer4;

    // WebElement for FAQ question 5 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q5:')]")
    private WebElement q5;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Please refer to the MAHB’s Code of Ethic')]")
    private WebElement answer5;

    // WebElement for FAQ question 6 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q6:')]")
    private WebElement q6;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'SOP is detailing the internal process flow')]")
    private WebElement answer6;

    // WebElement for FAQ question 7 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q7:')]")
    private WebElement q7;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'GALOA and SOP are mentioned in general')]")
    private WebElement answer7;

    // WebElement for FAQ question 8 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q8:')]")
    private WebElement q8;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Tender advertisement is required for open tender type')]")
    private WebElement answer8;

    // WebElement for FAQ question 9 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q9:')]")
    private WebElement q9;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Superintending Officer (S.O.)’s request')]")
    private WebElement answer9;

    // WebElement for FAQ question 10 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q10:')]")
    private WebElement q10;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'maximum of tendering period is 4 weeks')]")
    private WebElement answer10;

    // WebElement for FAQ question 11 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q11:')]")
    private WebElement q11;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'PCD shall compile all queries from tenderer')]")
    private WebElement answer11;

    // WebElement for FAQ question 12 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q12:')]")
    private WebElement q12;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Head of Department PCD')]")
    private WebElement answer12;

    // WebElement for FAQ question 13 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q13:')]")
    private WebElement q13;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Tender Evaluation guidelines in the share point')]")
    private WebElement answer13;

    // WebElement for FAQ question 14 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q14:')]")
    private WebElement q14;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'Users can link to Tender Evaluation')]")
    private WebElement answer14;

    // WebElement for FAQ question 15 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q15:')]")
    private WebElement q15;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'March and September')]")
    private WebElement answer15;

    // WebElement for FAQ question 16 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q16:')]")
    private WebElement q16;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'emailed to Vendor Management PCD.')]")
    private WebElement answer16;

    // WebElement for FAQ question 17 and its corresponding answer
    @FindBy(xpath = "//button[contains(.,'Q17:')]")
    private WebElement q17;
    @FindBy(xpath = "//div[@class ='accordion-collapse collapse show']//div[contains(., 'the ePro User Access')]")
    private WebElement answer17;

    // List of all FAQ questions available on the page
    @FindBy(xpath = "//h2[@class='accordion-header']//button")
    private List<WebElement> faqList;


    public List<WebElement> getFaqList() {
        return faqList;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void globalSearchFAQ() {
        elementClick(getSearchBar());
        getSearchBar().sendKeys("epro");
    }

    public WebElement getSearch() {
        return search;
    }

    public void searchFAQ() {
        clickUsingJavaScript(getSearch());
        getSearch().sendKeys("gift");
        scrollPageToDown();
    }

    public WebElement getClickTextBox() {
        return clickTextBox;
    }
    public void clicktext() {
        // Waits for the visibility of the specific FAQ question before clicking
        waitForVisibility(By.xpath("//button[text()='Q5: Is PM covers policy on gifts received from suppliers?']"));

        // Clicks on the text box using JavaScript Executor
        clickUsingJavaScript(getClickTextBox());

        // Scrolls the page down to ensure visibility of further elements
        scrollPageToDown();
    }

    public void closetextbox() throws InterruptedException {
        // Waits for 3 seconds before closing the text box
        Thread.sleep(3000);

        // Clicks on the text box again to close it
        clickUsingJavaScript(getClickTextBox());
    }

    public WebElement getClickCrossbtn() {
        // Returns the WebElement representing the close button
        return clickCrossbtn;
    }

    public void crossbtn() {
        // Clicks the close button using JavaScript Executor
        clickUsingJavaScript(getClickCrossbtn());
    }

    public WebElement getClickProfileicon() {
        // Returns the WebElement representing the profile icon
        return clickProfileicon;
    }

    public void profile() {
        // Clicks on the profile icon using JavaScript Executor
        clickUsingJavaScript(getClickProfileicon());
    }

    public WebElement getFaqs() {
        // Returns the WebElement representing the FAQ section
        return faqs;
    }

    public void verifyfaq() {
        // Scrolls to the FAQ section
        scrollToElement(getFaqs());

        // Verifies that the FAQ section is displayed
        Assert.assertTrue(getFaqs().isDisplayed());
    }

    public WebElement getSolveyourdoubts() {
        // Returns the WebElement representing the "Solve your doubts" section
        return solveyourdoubts;
    }

    public void verifydoubts() {
        // Verifies that the "Solve your doubts" section is displayed
        Assert.assertTrue(getSolveyourdoubts().isDisplayed());
    }


    public WebElement getQ1() {
        return q1;
    }


    // Methods to get and verify each question and its answer
    public void verifyquest1() {
        Assert.assertTrue(getQ1().isDisplayed());
    }

    public WebElement getAnswer1() {
        return answer1;
    }

    public void verifyans1() {
        Assert.assertTrue(getAnswer1().isDisplayed());
    }


    public WebElement getQ2() {
        return q2;
    }

    public void verifyquest2() {
        Assert.assertTrue(getQ2().isDisplayed());
    }

    public WebElement getAnswer2() {
        return answer2;
    }

    public void verifyans2() {
        Assert.assertTrue(getAnswer2().isDisplayed());
    }


    public WebElement getQ3() {
        return q3;
    }

    public void verifyquest3() {
        Assert.assertTrue(getQ3().isDisplayed());
    }

    public WebElement getAnswer3() {
        return answer3;
    }

    public void verifyans3() {
        Assert.assertTrue(getAnswer3().isDisplayed());
    }


    public WebElement getQ4() {
        return q4;
    }

    public void verifyquest4() {
        Assert.assertTrue(getQ4().isDisplayed());
    }

    public WebElement getAnswer4() {
        return answer4;
    }

    public void verifyans4() {
        Assert.assertTrue(getAnswer4().isDisplayed());
    }


    public WebElement getQ5() {
        return q5;
    }

    public void verifyquest5() {
        Assert.assertTrue(getQ5().isDisplayed());
    }

    public WebElement getAnswer5() {
        return answer5;
    }

    public void verifyans5() {
        Assert.assertTrue(getAnswer5().isDisplayed());
    }


    public WebElement getQ6() {
        return q6;
    }

    public void verifyquest6() {
        Assert.assertTrue(getQ6().isDisplayed());
    }

    public WebElement getAnswer6() {
        return answer6;
    }

    public void verifyans6() {
        Assert.assertTrue(getAnswer6().isDisplayed());
    }


    public WebElement getQ7() {
        return q7;
    }

    public void verifyquest7() {
        Assert.assertTrue(getQ7().isDisplayed());
    }

    public WebElement getAnswer7() {
        return answer7;
    }

    public void verifyans7() {
        Assert.assertTrue(getAnswer7().isDisplayed());
    }


    public WebElement getQ8() {
        return q8;
    }

    public void verifyquest8() {
        Assert.assertTrue(getQ8().isDisplayed());
    }

    public WebElement getAnswer8() {
        return answer8;
    }


    public WebElement getQ9() {
        return q9;
    }

    public void verifyquest9() {
        Assert.assertTrue(getQ8().isDisplayed());
    }

    public WebElement getAnswer9() {
        return answer9;
    }

    public void VerifyAnswer9() {
        Assert.assertTrue(getAnswer9().isDisplayed());
    }


    public WebElement getQ10() {
        return q10;
    }

    public void verifyquest10() {
        Assert.assertTrue(getQ10().isDisplayed());
    }

    public WebElement getAnswer10() {
        return answer10;
    }

    public void verifyAnswer10() {
        Assert.assertTrue(getAnswer10().isDisplayed());
    }


    public WebElement getQ11() {
        return q11;
    }

    public void verifyQuest11() {
        Assert.assertTrue(getQ11().isDisplayed());
    }

    public WebElement getAnswer11() {
        return answer11;
    }

    public void verifyAnswer11() {
        Assert.assertTrue(getAnswer11().isDisplayed());
    }


    public WebElement getQ12() {
        return q12;
    }

    public void verifyQues12() {
        Assert.assertTrue(getQ12().isDisplayed());
    }

    public WebElement getAnswer12() {
        return answer12;
    }

    public void verifyAnswer12() {
        Assert.assertTrue(getAnswer12().isDisplayed());
    }


    public WebElement getQ13() {
        return q13;
    }

    public void verifyQuest13() {
        Assert.assertTrue(getQ13().isDisplayed());
    }

    public WebElement getAnswer13() {
        return answer13;
    }

    public void verifyAnswer13() {
        Assert.assertTrue(getAnswer13().isDisplayed());
    }


    public WebElement getQ14() {
        return q14;
    }

    public void verifyquest14() {
        Assert.assertTrue(getQ14().isDisplayed());
    }

    public WebElement getAnswer14() {
        return answer14;
    }

    public void verifyAnswer14() {
        Assert.assertTrue(getAnswer14().isDisplayed());
    }


    public WebElement getQ15() {
        return q15;
    }

    public void verifyQues15() {
        Assert.assertTrue(getQ15().isDisplayed());
    }

    public WebElement getAnswer15() {
        return answer15;
    }

    public void verifyAnswer15() {
        Assert.assertTrue(getAnswer15().isDisplayed());
    }


    public WebElement getQ16() {
        return q16;
    }

    public void verifyQues16() {
        Assert.assertTrue(getQ16().isDisplayed());
    }

    public WebElement getAnswer16() {
        return answer16;
    }

    public void verifyAnswer16() {
        Assert.assertTrue(getAnswer16().isDisplayed());
    }


    public WebElement getQ17() {
        return q17;
    }

    public void verifyQues17() {
        Assert.assertTrue(getQ17().isDisplayed());
    }

    public WebElement getAnswer17() {
        return answer17;
    }

    public void verifyAnswer17() {
        Assert.assertTrue(getAnswer17().isDisplayed());
    }


    public void listOfFaqs() throws InterruptedException {
        // Scrolls to the "Solve your doubts" section
        scrollToElement(getSolveyourdoubts());

        // Waits until the "Have A Question?" section is visible
        waitForVisibility(By.xpath("//h2[text()='Have A Question? Solve your Doubts']"));

        // Creates a JavaScript Executor for scrolling
        JavascriptExecutor js = (JavascriptExecutor) _driver;

        // Iterates through the list of FAQs and clicks each one
        for (int i = 0; i < getFaqList().size(); i++) {
            WebElement item = getFaqList().get(i);

            // Scrolls smoothly to each FAQ question
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", item);

            // Waits until the FAQ item is clickable
            WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(item));

            // Waits for 1 second before clicking
            Thread.sleep(1000);

            // Prints the text of the current FAQ item
            String txt = item.getText();
            System.out.println(txt);

            // Clicks the FAQ item using JavaScript Executor
            clickUsingJavaScript(item);

            // Verifies that the FAQ item is displayed
            Assert.assertTrue(getFaqList().get(i).isDisplayed());
        }
    }
}
