package baseTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    // Declares the WebDriver instance for browser interaction.
    protected WebDriver driver;

    // Declares an instance of PageObjectManager to manage page objects.
    public PageObjectManager pm;

    // Stores the browser type specified in the configuration file.
    private String browser;

    // Stores the application URL retrieved from the configuration file.
    private String url;

    /**
     * This method initializes the browser before each test method in the "sanity" group.
     * It reads configuration properties, launches the specified browser,
     * navigates to the URL, and initializes the PageObjectManager.
     *
     * @throws IOException if there is an issue reading the configuration file.
     */
    @BeforeMethod(groups = {"sanity"})
    public void launchBrowser() throws IOException {
        try {
            // Retrieves the project's base directory.
            String dir = System.getProperty("user.dir");

            // Reads the configuration file from the test resources directory.
            FileInputStream fis = new FileInputStream(dir + "//src//test//resources//config.properties");

            // Creates a Properties object to load key-value pairs from the configuration file.
            Properties prop = new Properties();
            prop.load(fis);

            // Extracts the browser type and URL from the configuration file.
            browser = prop.getProperty("browser");
            url = prop.getProperty("url");

            ChromeOptions options=new ChromeOptions();
            options.addArguments("--incognito");
            options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});


            // Initializes the appropriate WebDriver based on the browser type.
            if (browser.equalsIgnoreCase("chrome"))
                driver = new ChromeDriver(options);
            else if (browser.equalsIgnoreCase("firefox"))
                driver = new FirefoxDriver();
            else if (browser.equalsIgnoreCase("edge"))
                driver = new EdgeDriver();

        } catch (Exception ignored) {
            // Exception handling is ignored, but it should ideally be logged for debugging purposes.
        }

        // Navigates to the specified URL.
        driver.get(url);

        // Maximizes the browser window.
        driver.manage().window().maximize();

        // Sets an implicit wait of 60 seconds for element interactions.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Initializes the PageObjectManager with the WebDriver instance.
        pm = new PageObjectManager(driver);
    }


    /**
     * This method is executed after each test method in the "sanity" group.
     * It ensures that the WebDriver instance is properly closed to free up resources.
     */
//    @AfterMethod(groups = {"sanity"})
//    public void tearDown() {
//        // Checks if the WebDriver instance is not null to avoid NullPointerException.
//        if (driver != null) {
//            // Closes all browser windows and terminates the WebDriver session.
//            driver.quit();
//        }
//    }


}
