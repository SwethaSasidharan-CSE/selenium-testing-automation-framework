package commonLibs.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportUtils
{
    ExtentHtmlReporter htmlReport;
    static ExtentReports extentReports;
    static ExtentTest extentTest;
    public ReportUtils(String ReportFilename)
    {
        ReportFilename=ReportFilename.trim();
        htmlReport =new ExtentHtmlReporter(ReportFilename);
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReport);
    }
    public static void createATestCase(String TestCase)
    {
        extentTest=extentReports.createTest(TestCase);
    }
    public static void addTestLog(Status status, String comment)
    {
        extentTest.log(status,comment);
    }
    public void flushReport()
    {
        extentReports.flush();
    }
    public static void attachScreenshotToReport(String filename) throws  Exception
    {
        extentTest.addScreenCaptureFromPath(filename);
    }
}
