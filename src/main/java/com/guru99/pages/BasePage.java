package com.guru99.pages;

import commonLibs.implementation.ElementControl;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    WebDriver driver;
    public ElementControl ctrl;
    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        ctrl = new ElementControl(driver);
    }
}
