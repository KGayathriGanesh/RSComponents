package com.RSComponents;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    private WebDriver driver;
    private static BaseClass _instance = new BaseClass();


    private BaseClass() {

    }

    public static BaseClass get_instance() {
        return _instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}