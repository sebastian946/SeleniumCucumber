package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {
    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page(){
        try {
            open_url();
            click_hamburguer_menu();
            click_signIn_link();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
