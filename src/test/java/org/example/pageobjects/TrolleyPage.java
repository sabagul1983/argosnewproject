package org.example.pageobjects;

import org.example.drivers.DriversFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TrolleyPage extends DriversFactory {
    @FindBy(css="input[name=\"search\"]")
    WebElement postCode;
    public void enterPostCode(String code){
        postCode.sendKeys(code);
    }
    @FindBy(css="select[name=\"add-to-trolley-quantity\"]")
    WebElement selectQuantity;
    public void quantitySelect(String quantity){
        Select select=new Select(selectQuantity);
        select.selectByVisibleText(quantity);
        System.out.println("quantity change to :" + quantity);
    }
    @FindBy(css="button[data-test=\"component-att-button\"]")
    WebElement addToTrolley;
    public void addTrolley(){
        addToTrolley.click();
    }
    @FindBy(css="a[data-test=\"component-att-button-basket\"]")
    WebElement goTrolley;
    public void goToTrolley(){
        goTrolley.click();
    }
    @FindBy(css="span[data-e2e=\"product-line-price\"]")
    WebElement totalPrice;
    public void checkTotal(){
       String price= totalPrice.getText();
        System.out.println("total price is :" + price);
    }
    @FindBy(css="div[class=\"ProductCard__unitPrice__rTWTs\"]")
    WebElement unitPrice;
    public void checkUnitPrice(){
       String unitPriceCheck= unitPrice.getText();
        System.out.println("per unit price is :"+ unitPriceCheck);
    }
}
