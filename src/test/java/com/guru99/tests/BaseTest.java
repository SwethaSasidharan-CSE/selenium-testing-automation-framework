package com.guru99.tests;

import com.aventstack.extentreports.Status;
import com.guru99.pages.LoginPage;
import commonLibs.implementation.CommonDriver;
import commonLibs.utils.ReportUtils;
import commonLibs.utils.ScreenshotUtils;
import commonLibs.utils.configUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.Properties;

public class BaseTest
{
    WebDriver driver;
    CommonDriver common;
    LoginPage loginpage;
    String url;
    Properties confp;
    String currentworkingdirectory;
    String configfilename;
    String ReportFilename;
    ReportUtils report;
    ScreenshotUtils screenshot;

    @BeforeSuite
    public void presetup () throws Exception{
        currentworkingdirectory=System.getProperty("user.dir");
        configfilename=currentworkingdirectory+"/config/config.properties";
        ReportFilename=currentworkingdirectory+"/reports/testreport.html";
        confp = configUtils.readProperties(configfilename);
        report=new ReportUtils(ReportFilename);
    }
    @BeforeClass
    public void setup() throws Exception
    {
        url=confp.getProperty("baseUrl");
        String browserType= confp.getProperty("browserType");
        common = new CommonDriver(browserType);
        driver=common.getDriver();
        loginpage = new LoginPage(driver);
        screenshot = new ScreenshotUtils(driver);
        common.navigateToURL(url);

    }

    @AfterMethod
    public void TestResult(ITestResult result) throws Exception {
        String TestCaseName= result.getMethod().getMethodName();
        long executionTime = System.currentTimeMillis();
        String screenshotfilename= currentworkingdirectory+"/screenshots/"+TestCaseName+"_"+executionTime+".jpeg";
        if(result.getStatus()==ITestResult.FAILURE)
        {
            ReportUtils.addTestLog(Status.FAIL, "One or more steps failed");
            screenshot.captureandsaveScreenshot(screenshotfilename);
            ReportUtils.attachScreenshotToReport(screenshotfilename);
        }
    }

    @AfterClass
    public void teardown()
    {
        common.closeAllDrivers();
    }

    @AfterSuite
    public void postteardown()
    {
        report.flushReport();
    }
}
