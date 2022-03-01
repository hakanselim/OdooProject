package com.odoo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{
    @FindBy (xpath = "//ol[@class='breadcrumb']")
    public WebElement pagetitle;
}
