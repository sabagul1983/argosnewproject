package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.drivers.DriversFactory;

public class Hooks {
    DriversFactory driversFactory=new DriversFactory();
    @Before
    public void openBrowser(){
        driversFactory.setUp();
        driversFactory.manageBrowser();
        driversFactory.setTime();
        driversFactory.navigate("https://www.argos.co.uk/");
    }
//    @After
    public void close(){
        driversFactory.closeBrowser();
    }
}
