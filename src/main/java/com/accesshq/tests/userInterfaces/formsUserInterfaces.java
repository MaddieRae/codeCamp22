package com.accesshq.tests.userInterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.accesshq.tests.webtests.baseTest;

import java.net.MalformedURLException;

public class formsUserInterfaces {
    private WebDriver driver;

    public formsUserInterfaces() throws MalformedURLException {
        ;
    }
    public void setName(String name){
        driver.findElement(By.id("name")).sendKeys(name);
    }
    public String getName(){
        return driver.findElement(By.id("name")).getText();
    }
    public void setEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }
    public String getEmail(){
        return driver.findElement(By.id("email")).getText();
    }
}
