package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementControl
{
    WebDriver driver;

    public ElementControl(WebDriver driver)
    {
        this.driver= this.driver;
    }
    public void clickElement (WebElement element)
    {
        element.click();
    }
    public void clear(WebElement element)
    {
        element.clear();
    }
    public void setText(WebElement element, String text)
    {
        element.sendKeys(text);
    }
    public boolean is_enabled(WebElement element)
    {
        return element.isEnabled();
    }
    public boolean is_displayed(WebElement element)
    {
        return element.isDisplayed();
    }
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public void getTextFromAlert()
    {
        driver.switchTo().alert().getText();
    }
    public void selectByVisibleText(WebElement element, String text)
    {
        Select sel=new Select(element);
        sel.selectByVisibleText(text);
    }
}
