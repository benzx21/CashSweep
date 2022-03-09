package steps;

import base.FrameworkConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class stepdefinitions {
    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://www.saucedemo.com/");
    }

    @Given("I enter following login details")
    public void i_enter_following_login_details(DataTable logindata) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.Login(logindata.cell(1, 0), logindata.cell(1, 1));
    }
    @Then("I click Log off")
    public void i_click_log_off() {
        // Write code here that turns the phrase above into concrete actions
    }





    @And("I enter the username as standard_user")
    public void iEnterTheUsernameAsStandard_user() {
        LoginPage loginPage = new LoginPage();
        loginPage.captureUsernameField("standard_user");
    }

    @And("I enter the password as secret_sauce")
    public void iEnterThePasswordAsSecret_sauce() {

        LoginPage loginPage = new LoginPage();
        loginPage.capturePasswordField("secret_sauce");
    }
}
