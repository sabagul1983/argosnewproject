package org.example.pageobjects;

import org.example.drivers.DriversFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.fail;

public class ResultPage extends DriversFactory {
    @FindBy(css = "label[name=\"price\"]")
    List<WebElement> priceList;

    public void selectPrice(String priceFilter) {
        if (priceList.size() == 0) {
            fail("No price ranges found");
        }
        for (WebElement price : priceList) {
            String availableFilter = price.getText();
            if (availableFilter.contains(priceFilter)) {
                price.click();
                break;
            }
        }
    }

    @FindBy(css = "div[class=\"RadioListstyles__RadioOption-sc-4132xt-4 YjqRa\"]")
    List<WebElement> ratingList;

    public void customerRating(String ratingFilter) {

        if (ratingList.size() == 0) {
            fail("No ratings found");
        }
        for (WebElement reviewFilter : ratingList) {
            String availableFilter = reviewFilter.getText();
            if (availableFilter.equalsIgnoreCase(ratingFilter)) {
                reviewFilter.click();
                break;
            }
        }
    }
    @FindBy(css="div[data-test=\"component-product-card\"]")
    List<WebElement> selectItem;
    public void itemSelection(){
        selectItem.get(1).click();
    }
}
