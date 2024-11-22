package baseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



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
    protected static WebDriver _driver;


    public BaseClass(WebDriver driver) {
        this._driver = driver;
    }



    public byte[] screenShot() {
        TakesScreenshot sc = (TakesScreenshot) _driver;
        byte[] b = sc.getScreenshotAs(OutputType.BYTES);
        return b;

    }


    public String projectPath() {
        String path = System.getProperty("user.dir");
        return path;
    }


    public static void enterAppInUrl(String url) {
        _driver.get(url);
    }


    public static void tab() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
    }


    public static void enter() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }


    public static void maximizeWindow() {
        _driver.manage().window().maximize();
    }


    public void elementSendKeys(WebElement element, String text) {
        element.sendKeys(text);

    }

    public void elementSendKeysFileUpload(WebElement element, String text) {
        element.sendKeys(text);

    }


    public void elementClear(WebElement element) {
        element.clear();
    }


    public void elementSendKeysjs(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }


    public void elementClick(WebElement element) {
        element.click();
    }


    public String getAppTitle() {
        String title = _driver.getTitle();
        return title;
    }


    public WebElement findElementById(String attribute) {
        WebElement element = _driver.findElement(By.id(attribute));
        return element;
    }


    public WebElement findElementByClassName(String attribute) {
        WebElement element = _driver.findElement(By.className(attribute));
        return element;
    }


    public WebElement findElementByXpath(String xpathExp) {
        WebElement element = _driver.findElement(By.xpath(xpathExp));
        return element;
    }


    public void closeWindow() {
        _driver.close();
    }


    public static void quitWindow() {
        _driver.quit();
    }


    public String elementGetText(WebElement element) {
        String text = element.getText();
        return text;
    }


    public String elementGetAttribute(WebElement element, String attributeName) {
        String attribute = element.getAttribute(attributeName);
        return attribute;
    }


    public void selectOptionBytext(WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }


    public void selectOptionByAttribute(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByValue(value);
    }


    public void selectOptionByIndex(WebElement element, int index) {
        Select s = new Select(element);
        s.selectByIndex(index);
    }


    public String getOptions(WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement webElement = options.get(i);
            String text = webElement.getText();
            System.out.println(text);
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


    public void updateCellData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
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


    public void alertDismiss() {
        Alert al = _driver.switchTo().alert();
        al.dismiss();
    }


    public void alertSendKey(String text) {
        Alert al = _driver.switchTo().alert();
        al.sendKeys(text);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("arguments[0].scrollIntoView()", element);

    }

    public static void scrollPageToDown() {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

    }

    public void scrollInsideSignUpPopup() {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        js.executeScript("document.querySelector('.signup-box').scrollTop=5000");
    }

    public void navigateBack() {
        _driver.navigate().back();
    }

    public void switchToWindow(String window) {
        _driver.switchTo().window(window);
    }

    public String getWindowHandle() {
        return _driver.getWindowHandle();

    }

    public Set<String> getWindowHandles() {
        return _driver.getWindowHandles();
    }

    public String randomString(int x) {
        String name = RandomStringUtils.randomAlphabetic(x);
        return name;
    }

    public String randomNumber(int y) {
        String number = RandomStringUtils.randomNumeric(y);
        return number;
    }

    public String randomAlphaNumeric(int x, int y) {
        String name = RandomStringUtils.randomAlphabetic(x);
        String number = RandomStringUtils.randomNumeric(y);
        return (name + number);
    }

    public void clickUsingJavaScript(WebElement ele) {
        WebElement element = ele;
        ((JavascriptExecutor) _driver).executeScript("arguments[0].click();", element);
    }

    public void popUpClose(WebElement ele) {
        elementClick(ele);
    }

}
