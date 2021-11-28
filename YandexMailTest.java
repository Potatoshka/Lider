package com.potatoshka;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import java.util.ArrayList;

public class YandexMailTest extends BaseTest{
    //Locators
    private final String url ="https://yandex.ru/";
    private final String enterMailButton="//div[contains(text(),'Почта')]";
    private final String loginFieldXpath="//input[@name='login']";
    private final String passwordFieldXPath="//input[@name='passwd']";
    private final String enterButton="//button[@type='submit']";
    //Settings
    private final String login ="zerotool@yandex.ru";
    private final String password ="God123";



    @Test
    public void test(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        goTo(url);
        click(enterMailButton);
        ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(wid.get(1));
        inputField(loginFieldXpath,login);
        click(enterButton);
        inputField(passwordFieldXPath,password);
    }
    @AfterAll
    static void close(){
        driver.close();
    }


}
