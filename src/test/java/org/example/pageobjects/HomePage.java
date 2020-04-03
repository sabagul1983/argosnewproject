package org.example.pageobjects;

import org.example.drivers.DriversFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriversFactory {

    @FindBy(css="input[data-test=\"search-input\"]")
    WebElement searchBox;
    public void doSearch(String productName){
        searchBox.sendKeys(productName);
    }
    @FindBy(css="button[type=\"submit\"]")
    WebElement clickSubmit;
    public void clickSearch(){
        clickSubmit.click();
    }
}
