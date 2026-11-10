package commonLibs.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ScreenshotUtils
{
    private TakesScreenshot camera;
    public ScreenshotUtils(WebDriver driver)
    {
        camera= (TakesScreenshot)driver;
    }
    public void captureandsaveScreenshot(String filename) throws Exception
    {
        filename=filename.trim();
        File imgfile, tmpfile;
        imgfile= new File(filename);
        if(imgfile.exists())
        {
            throw new Exception("Already Exist");
        }
        tmpfile= camera.getScreenshotAs(OutputType.FILE);
        FileUtils.moveFile(tmpfile,imgfile);

    }
}
