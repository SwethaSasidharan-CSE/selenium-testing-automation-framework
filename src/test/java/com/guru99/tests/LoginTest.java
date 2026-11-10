package com.guru99.tests;

import com.aventstack.extentreports.Status;
import commonLibs.utils.ReportUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest
{
    @Parameters({"username","password"})
    @Test
    public void loginToApplication(String username, String password)
    {
        ReportUtils.createATestCase("Verify User Login Credentials");
        ReportUtils.addTestLog(Status.INFO,"Performing Login");
        loginpage.loginToWebPage(username,password);
        String expectedtitle = "GTPL Bank Manager HomePage";
        String actualtitle = common.getTitle();
        Assert.assertEquals(expectedtitle,actualtitle);
        ReportUtils.addTestLog(Status.INFO,"Comparing Expected and Actual");
    }
}
