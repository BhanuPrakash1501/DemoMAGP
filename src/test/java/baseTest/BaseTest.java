package baseTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjectManager.PageObjectManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    public PageObjectManager pm;
    private String browser;
    private String url;

    @BeforeMethod(groups = {"sanity"})
    public void lunchBrowser() throws IOException {
        try {
            String dir = System.getProperty("user.dir");
            FileInputStream fis = new FileInputStream(dir + "//src//test//resources//config.properties");
            // C:\Users\Mind-Graph\IdeaProjects\frame\src\test\resources\config.properties
            Properties prop = new Properties();
            prop.load(fis);
            browser = prop.getProperty("browser");
            url = prop.getProperty("url");
            if (browser.equalsIgnoreCase("chrome"))
                driver = new ChromeDriver();
            else if (browser.equalsIgnoreCase("firefox"))
                driver = new FirefoxDriver();
            else if (browser.equalsIgnoreCase("edge"))
                driver = new EdgeDriver();
        } catch (Exception ignored) {


        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        pm = new PageObjectManager(driver);


    }

    @AfterMethod(groups = {"sanity"})
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }

}
