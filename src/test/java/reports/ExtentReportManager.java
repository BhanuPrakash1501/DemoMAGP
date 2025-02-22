package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;  // UI of the report
    public ExtentReports extent;  //populate common info on the report
    public ExtentTest test; // creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context) {

        /*SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = new Date();
        String currentDateTimestamp = df.format(dt);*/

        String timeStamp = new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(new Date());
        String repName = "Test- Report_ " + timeStamp + ".html";

        sparkReporter = new ExtentSparkReporter("C:\\Users\\Mind-Graph\\IdeaProjects\\DemoMAGP\\screenshots\\" + repName);//specify location of the report

        sparkReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
        sparkReporter.config().setReportName("Functional Testing"); // name of the report
        sparkReporter.config().setTheme(Theme.DARK);


        // Initialize the ExtentReports object to generate the test report
        extent = new ExtentReports();

        // Attach the SparkReporter to capture the test execution details
        extent.attachReporter(sparkReporter);

        // Set system information in the test report for better identification
        extent.setSystemInfo("Computer Name", "Lennova"); // Name of the machine executing the tests
        extent.setSystemInfo("Environment", "QA"); // Test environment (QA, Staging, Production, etc.)
        extent.setSystemInfo("Tester Name", "Bhanu Prakash"); // Name of the person executing the tests
        extent.setSystemInfo("OS", "Windows10"); // Operating system being used
        extent.setSystemInfo("Browser Name", "Chrome"); // Browser used for test execution


    }


    // This method is triggered when a test case passes
    public void onTestSuccess(ITestResult result) {
        // Create a new test entry in the Extent Report for the passed test case
        test = extent.createTest(result.getName());

        // Log the status as PASS along with the test case name
        test.log(Status.PASS, "Test case PASSED is: " + result.getName());
    }

    // This method is triggered when a test case fails
    public void onTestFailure(ITestResult result) {
        // Create a new test entry in the Extent Report for the failed test case
        test = extent.createTest(result.getName());

        // Log the status as FAIL along with the test case name
        test.log(Status.FAIL, "Test case FAILED is: " + result.getName());

        // Log the reason for failure by capturing the throwable (exception)
        test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
    }

    // This method is triggered when a test case is skipped
    public void onTestSkipped(ITestResult result) {
        // Create a new test entry in the Extent Report for the skipped test case
        test = extent.createTest(result.getName());

        // Log the status as SKIP along with the test case name
        test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
    }


    // This method is executed after all test cases in the test suite have finished running
    public void onFinish(ITestContext context) {
        // Flushes all the logs and ensures the report is written and saved properly
        extent.flush();
    }

}
