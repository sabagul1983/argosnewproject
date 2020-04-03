package org.example.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageobjects.HomePage;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() {
    }
    @When("^I entred product name \"([^\"]*)\"$")
    public void i_entred_product_name(String arg1) {
        homePage.doSearch(arg1);
    }
    @Then("^I click search button$")
    public void i_click_search_button() {
       homePage.clickSearch();
    }
}
