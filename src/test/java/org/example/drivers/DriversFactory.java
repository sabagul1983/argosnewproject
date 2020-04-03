package org.example.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriversFactory {
//    constructor of the class
    public DriversFactory(){
        PageFactory.initElements(driver,this);

    }
    public static WebDriver driver;
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    public void manageBrowser(){
        driver.manage().window().maximize();
    }
    public void setTime(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void navigate(String url) {
        driver.get(url);
        System.out.println(url);
    }
    public void closeBrowser(){
        driver.quit();
    }
}
