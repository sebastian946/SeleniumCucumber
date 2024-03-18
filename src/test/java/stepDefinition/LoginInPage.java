package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.LogininPage.*;

public class LoginInPage {
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException, IllegalAccessException {
        visibility_product_formalshoes();
        visibility_product_sneakers();
        visibility_product_sportshoes();
    }
}
