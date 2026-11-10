package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
    @CacheLookup
    @FindBy(name="uid") private WebElement UserId;
    @CacheLookup
    @FindBy(name="password") private WebElement Password;
    @CacheLookup
    @FindBy(name="btnLogin") private WebElement LoginButton;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void loginToWebPage(String username, String password)
    {
        ctrl.setText(UserId, username);
        ctrl.setText(Password,password);
        ctrl.clickElement(LoginButton);


    }
}
