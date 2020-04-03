package org.example.stepdefinition;

import cucumber.api.java.en.Then;
import org.example.pageobjects.TrolleyPage;

public class TrolleySteps {
    TrolleyPage trolleyPage=new TrolleyPage();
    @Then("^I entered my postcode \"([^\"]*)\"$")
    public void i_entered_my_postcode(String code){
        trolleyPage.enterPostCode(code);
    }
    @Then("^I selected the quantity \"([^\"]*)\"$")
    public void i_selected_the_quantity(String quantity) {
       trolleyPage.quantitySelect(quantity);
    }
    @Then("^I clicked on add to the trolley button$")
    public void i_clicked_on_add_to_the_trolley_button() {
        trolleyPage.addTrolley();
    }
    @Then("^I clicked go to the trolley button$")
    public void i_clicked_go_to_the_trolley_button() {
        trolleyPage.goToTrolley();

    }
    @Then("^I checked the total price$")
    public void i_checked_the_total_price() {
        trolleyPage.checkTotal();

    }
    @Then("^I have checked per unit price$")
    public void i_have_checked_per_unit_price() {
        trolleyPage.checkUnitPrice();

    }
}
