package com.odoo.step_definitions;

import com.odoo.pages.DashBoardPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps_hkn {

    LoginPage login = new LoginPage();
    DashBoardPage dasboard = new DashBoardPage();


    @Given("Navigate to login page")
    public void navigate_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("Enter {string} And {string} and click login button")
    public void enter_and_and_click_login_button(String userName, String password) {

        login.emailBox.sendKeys(userName);
        login.passwordBox.sendKeys(password);
        login.loginBttn.click();
    }
    @Then("User should land {string} page")
    public void user_should_land_page(String expectedPageTitle) {
        BrowserUtils.waitForVisibility(dasboard.pagetitle,5);
        String actualPageTitle = dasboard.pagetitle.getText().substring(1);
        System.out.println("actualPageTitle = " + actualPageTitle);
        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }
}
