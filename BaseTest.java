package com.potatoshka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BaseTest {

  static   WebDriver driver = new ChromeDriver();

    public static void goTo(String url){
        driver.manage().deleteAllCookies();
        driver.get(url);
    }
    public static void click(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
    public static void inputField(String xpath,String keys)  {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(keys);
    }


    public static String readURL(){
       return driver.getCurrentUrl();
    }
}
