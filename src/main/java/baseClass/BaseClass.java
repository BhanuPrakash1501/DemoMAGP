package baseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class BaseClass {
    // Base class for WebDriver operations
    protected static WebDriver _driver;
    static Logger logger;
    /**
     * Constructor to initialize WebDriver instance.
     *
     * @param driver The WebDriver instance to be used across tests.
     */
    public BaseClass(WebDriver driver) {
        this._driver = driver;
    }

    /**
     * Captures a screenshot and returns it as a byte array.
     *
     * @return A byte array containing the screenshot.
     */
    public byte[] screenShot() {
        TakesScreenshot sc = (TakesScreenshot) _driver;
        byte[] b = sc.getScreenshotAs(OutputType.BYTES);
        return b;
    }

    /**
     * Retrieves the project's root directory path.
     *
     * @return The absolute path of the project directory.
     */
    public String projectPath() {
        String path = System.getProperty("user.dir");
        return path;
    }

    /**
     * Opens a specified URL in the browser.
     *
     * @param url The URL to navigate to.
     */
    public static void enterAppInUrl(String url) {
        _driver.get(url);
    }

    /**
     * Simulates pressing the TAB key using the Robot class.
     *
     * @throws AWTException If the Robot instance fails.
     */
    public static void tab() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
    }

    /**
     * Simulates pressing the ENTER key using the Robot class.
     *
     * @throws AWTException If the Robot instance fails.
     */
    public static void enter() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    /**
     * Maximizes the browser window.
     */
    public static void maximizeWindow() {
        _driver.manage().window().maximize();
    }

    /**
     * Sends text input to a WebElement.
     *
     * @param element The target WebElement.
     * @param text    The text to be entered.
     */
    public void elementSendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    /**
     * Sends file path input to a WebElement for file uploads.
     *
     * @param element The target WebElement.
     * @param text    The file path to be uploaded.
     */
    public void elementSendKeysFileUpload(WebElement element, String text) {
        element.sendKeys(text);
    }

    /**
     * Clears the content of a WebElement input field.
     *
     * @param element The target WebElement.
     */
    public void elementClear(WebElement element) {
        element.clear();
    }

    /**
     * Sets a value in an input field using JavaScript.
     *
     * @param element The target WebElement.
     * @param text    The text to be entered.
     */
    public void elementSendKeysjs(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    /**
     * Clicks on a WebElement.
     *
     * @param element The target WebElement.
     */
    public void elementClick(WebElement element) {
        element.click();
    }

    /**
     * Retrieves the current page title.
     *
     * @return The title of the current page.
     */
    public String getAppTitle() {
        return _driver.getTitle();
    }

    /**
     * Finds a WebElement using its ID attribute.
     *
     * @param attribute The ID of the element.
     * @return The located WebElement.
     */
    public WebElement findElementById(String attribute) {
        return _driver.findElement(By.id(attribute));
    }

    /**
     * Finds a WebElement using its class name.
     *
     * @param attribute The class name of the element.
     * @return The located WebElement.
     */
    public WebElement findElementByClassName(String attribute) {
        return _driver.findElement(By.className(attribute));
    }

    /**
     * Finds a WebElement using an XPath expression.
     *
     * @param xpathExp The XPath expression.
     * @return The located WebElement.
     */
    public WebElement findElementByXpath(String xpathExp) {
        return _driver.findElement(By.xpath(xpathExp));
    }

    /**
     * Closes the current browser window.
     */
    public void closeWindow() {
        _driver.close();
    }

    /**
     * Quits the browser session, closing all windows.
     */
    public static void quitWindow() {
        _driver.quit();
    }

    /**
     * Retrieves the text content of a WebElement.
     *
     * @param element The target WebElement.
     * @return The text content of the element.
     */
    public String elementGetText(WebElement element) {
        return element.getText();
    }

    /**
     * Retrieves the value of a specified attribute from a WebElement.
     *
     * @param element       The target WebElement.
     * @param attributeName The attribute name whose value is required.
     * @return The attribute value.
     */
    public String elementGetAttribute(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }

    /**
     * Selects a dropdown option by visible text.
     *
     * @param element The dropdown WebElement.
     * @param text    The visible text to be selected.
     */
    public void selectOptionByText(WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    /**
     * Selects a dropdown option by attribute value.
     *
     * @param element The dropdown WebElement.
     * @param value   The value attribute of the option to be selected.
     */
    public void selectOptionByAttribute(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByValue(value);
    }

    /**
     * Selects a dropdown option by index position.
     *
     * @param element The dropdown WebElement.
     * @param index   The index of the option to be selected.
     */
    public void selectOptionByIndex(WebElement element, int index) {
        Select s = new Select(element);
        s.selectByIndex(index);
    }

    /**
     * Retrieves all options from a dropdown and prints them.
     *
     * @param element The dropdown WebElement.
     * @return null (since this method only prints options).
     */
    public String getOptions(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        return null;
    }


    public String getCellValue(String sheetName, int rowNum, int cellNum) throws IOException {
        String res = "";

        File file = new File(".\\excel\\TestData.xlsx");
        FileInputStream stream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(stream);
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(cellNum);
        CellType type = cell.getCellType();
        switch (type) {
            case STRING:
                res = cell.getStringCellValue();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    Date dateCellValue = cell.getDateCellValue();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    res = dateFormat.format(dateCellValue);
                } else {
                    double numericCellValue = cell.getNumericCellValue();
                    long check = Math.round(numericCellValue);
                    if (check == numericCellValue) {
                        res = String.valueOf(numericCellValue);
                    } else {
                        res = String.valueOf(check);
                    }
                }
                break;
            default:
                break;
        }
        return res;
    }


    /*    public void updateCellData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
                throws IOException {

            File file = new File("C:\\MAGPWeb\\MAGPWeb\\excel\\TestData.xlsx");
            // File file = new
            // File("C:\\Users\\SAM\\eclipse-workspace\\FirstSession\\excel\\facebook.xlsx");
            FileInputStream stream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(stream);
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(cellNum);
            String value = cell.getStringCellValue();
            if (value.equals(oldData)) {
                cell.setCellValue(newData);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
        }


        public void createCell(String sheetName, int rowNum, int cellNum, String data) throws IOException {
            File file = new File("C:\\Users\\SAM\\eclipse-workspace\\FirstSession\\excel\\adactin.xlsx");
            // File file = new
            // File("C:\\Users\\SAM\\eclipse-workspace\\FirstSession\\excel\\facebook.xlsx");
            FileInputStream stream = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(stream);
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.createCell(cellNum);
            cell.setCellValue(data);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
        }

        /**
         * @param time
         * @seemaintain implicit waits as seconds
         */
    public void implicitWait(long time) {
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * maintain to handle the alert to accept
     */
    public void alertAccept() {
        Alert al = _driver.switchTo().alert();
        al.accept();
    }


    /**
     * Dismisses a currently active JavaScript alert.
     * This method is useful when handling alert popups that need to be closed.
     */
    public void alertDismiss() {
        Alert al = _driver.switchTo().alert(); // Switch to the alert popup
        al.dismiss(); // Click the 'Cancel' or 'Dismiss' button
    }

    /**
     * Sends a text input to a currently active JavaScript alert.
     * This method is useful when dealing with prompt alerts that require user input.
     *
     * @param text The text to send to the alert input field.
     */
    public void alertSendKey(String text) {
        Alert al = _driver.switchTo().alert(); // Switch to the alert popup
        al.sendKeys(text); // Send the specified text to the alert
    }

    /**
     * Scrolls smoothly to a specified element using JavaScript.
     * This ensures that the element is brought into view before interacting with it.
     *
     * @param element The WebElement to scroll to.
     */
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) _driver; // Cast WebDriver to JavascriptExecutor
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element); // Scroll to the element smoothly
    }


    /**
     * Scrolls to the specified element and waits until it becomes clickable.
     * This method is useful when dealing with elements that are not immediately clickable due to dynamic content or overlays.
     *
     * @param element The WebElement to scroll to and wait for.
     */
    public void scrollToElementAndWait(WebElement element) {
        scrollToElement(element); // Scroll to the element
        waitForElementToBeClickable(element); // Wait until the element is clickable
    }


    /**
     * Scrolls the webpage to the bottom using JavaScript.
     * This is useful when dealing with infinite scrolling pages or lazy-loaded content.
     */
    public static void scrollPageToDown() {
        JavascriptExecutor js = (JavascriptExecutor) _driver; // Cast WebDriver instance to JavascriptExecutor
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);"); // Scroll to the bottom of the page
    }


    /**
     * Scrolls inside the sign-up popup to reveal hidden content.
     * Uses JavaScript to manipulate the scroll position of the '.signup-box' element.
     */
    public void scrollInsideSignUpPopup() {
        JavascriptExecutor js = (JavascriptExecutor) _driver; // Cast WebDriver instance to JavascriptExecutor
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5)); // Wait for the popup to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2"))); // Ensure a heading is present before scrolling
        js.executeScript("document.querySelector('.signup-box').scrollTop=5000"); // Scroll inside the signup popup
    }


    /**
     * Navigates back to the previous page in the browser history.
     */
    public void navigateBack() {
        _driver.navigate().back();
    }

    /**
     * Switches the WebDriver's focus to a specific window.
     *
     * @param window The handle of the window to switch to.
     */
    public void switchToWindow(String window) {
        _driver.switchTo().window(window);
    }

    /**
     * Retrieves the current window handle.
     *
     * @return A string representing the current window handle.
     */
    public String getWindowHandle() {
        return _driver.getWindowHandle();
    }

    /**
     * Retrieves all window handles opened by the WebDriver.
     *
     * @return A set of strings representing all window handles.
     */
    public Set<String> getWindowHandles() {
        return _driver.getWindowHandles();
    }


    /**
     * Generates a random alphabetic string of the specified length.
     *
     * @param x The number of alphabetic characters to generate.
     * @return A random alphabetic string of length 'x'.
     */
    public String randomString(int x) {
        // Generate a random string containing 'x' alphabetic characters
        String name = RandomStringUtils.randomAlphabetic(x);

        // Return the generated alphabetic string
        return name;
    }


    /**
     * Generates a random numeric string of the specified length.
     *
     * @param y The number of numeric characters to generate.
     * @return A random numeric string of length 'y'.
     */
    public String randomNumber(int y) {
        // Generate a random string containing 'y' numeric characters
        String number = RandomStringUtils.randomNumeric(y);

        // Return the generated numeric string
        return number;
    }


    /**
     * Generates a random alphanumeric string by combining random alphabetic and numeric values.
     *
     * @param x The number of alphabetic characters to generate.
     * @param y The number of numeric characters to generate.
     * @return A concatenated string of random alphabetic and numeric characters.
     */
    public String randomAlphaNumeric(int x, int y) {
        // Generate a random string containing 'x' alphabetic characters
        String name = RandomStringUtils.randomAlphabetic(x);

        // Generate a random string containing 'y' numeric characters
        String number = RandomStringUtils.randomNumeric(y);

        // Concatenate both parts and return the final alphanumeric string
        return name + number;
    }


    // Method to perform a click action using JavaScriptExecutor
    public void clickUsingJavaScript(WebElement ele) {
        WebElement element = ele; // Assign the WebElement to a local variable
        ((JavascriptExecutor) _driver).executeScript("arguments[0].click();", element); // Execute JavaScript click
    }


    // Method to close a popup by clicking on the specified WebElement
    public void popUpClose(WebElement ele) {
        elementClick(ele);
    }

    /**
     * Waits for the specified element to become visible on the page.
     *
     * @param locator The By locator of the element to wait for.
     * @return The WebElement once it becomes visible.
     */
    public WebElement waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(20)); // Initialize explicit wait with a timeout of 20 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); // Wait until the element is visible and return it
    }


    /**
     * Scrolls the window horizontally by 1600 pixels using JavaScript.
     * This method is useful when elements are outside the current viewport.
     */
    public void scrollByWindow() {
        JavascriptExecutor js = (JavascriptExecutor) _driver; // Cast WebDriver instance to JavascriptExecutor
        js.executeScript("window.scrollBy(1600,0)"); // Scroll window by 1600 pixels horizontally
    }


    /**
     * Waits until the specified WebElement is clickable.
     * This ensures the element is both visible and enabled before interacting with it.
     *
     * @param element The WebElement to wait for.
     */
    public void waitForElementToBeClickable(WebElement element) {
        // Create an explicit wait with a timeout of 30 seconds
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(30));

        // Wait until the element is clickable (visible and enabled)
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static Logger getLogger()
    {
        logger=LogManager.getLogger(); //Log4j
        return logger;
    }


}
