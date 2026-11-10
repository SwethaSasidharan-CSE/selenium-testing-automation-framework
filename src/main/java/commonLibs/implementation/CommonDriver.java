package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonDriver {
    WebDriver driver;
    public CommonDriver(String browsertype) throws Exception
    {

        if (browsertype.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();

        }
        else
        {
            throw new Exception("Invalid Browser");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    public void navigateToURL(String url)
    {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);

    }
    public String getTitle()
    {
        return driver.getTitle();
    }

    public void closeAllDrivers()
    {
        driver.quit();
    }
    public WebDriver getDriver()
    {
        return driver;
    }

}
