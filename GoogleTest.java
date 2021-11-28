package com.potatoshka;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class GoogleTest extends BaseTest{
    private final String url ="https://www.google.com/";
    private final String searchLocator="//input[@name='q']";
    private final String keys ="купить кофемашину bork c804";


    @Test
    public void test(){
        goTo(url);
        inputField(searchLocator,keys+"\n");
    }
    @AfterAll
    static void quit(){
        driver.close();
    }
}
