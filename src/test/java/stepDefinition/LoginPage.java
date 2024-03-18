package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User succesfully enters the log in details")
    public void user_succesfully_enters_the_log_in_details() throws InterruptedException, IllegalAccessException {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();
    }
    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException, IllegalAccessException {
        click_newregister_btn();
    }
}
