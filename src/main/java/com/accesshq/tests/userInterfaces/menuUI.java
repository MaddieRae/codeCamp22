package com.accesshq.tests.userInterfaces;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.accesshq.tests.webtests.baseTest;
public class menuUI {

    private WebDriver driver;

    public menuUI(WebDriver driver){
        this.driver = driver;
    }

    public void clickForm(){
        driver.findElement(By.cssSelector("[aria-label='forms']")).click();
    }
    public void  clickPlanet(){
        driver.findElement(By.cssSelector("[aria-label='planets']")).click();
    }
    public void clickHome(){
        driver.findElement(By.cssSelector("[aria-label='home']")).click();
    }
}
