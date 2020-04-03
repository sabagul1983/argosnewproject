package org.example.stepdefinition;

import cucumber.api.java.en.Then;
import org.example.pageobjects.ResultPage;

public class ResultSteps {
    ResultPage resultPage=new ResultPage();
    @Then("^I selected price range \"([^\"]*)\"$")
    public void i_selected_price_range(String priceFilter) {
        resultPage.selectPrice(priceFilter);
    }
    @Then("^I selected customer rating \"([^\"]*)\"$")
    public void i_selected_customer_rating(String ratingFilter) {
        resultPage.customerRating(ratingFilter);

    }
    @Then("^I have selected the desired item$")
    public void i_have_selected_the_desired_item() {
        resultPage.itemSelection();

    }
}
