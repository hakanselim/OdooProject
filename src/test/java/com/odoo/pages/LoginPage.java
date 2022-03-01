package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy (xpath = "//input[@id='login']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginBttn;




}
