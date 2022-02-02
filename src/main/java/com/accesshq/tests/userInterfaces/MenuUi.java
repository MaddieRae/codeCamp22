package com.accesshq.tests.userInterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuUi {


       protected WebDriver driver;
       public MenuUi(WebDriver driver) {
           this.driver = driver;
       }

        public void clickForm () {
            driver.findElement(By.cssSelector("[aria-label='forms']")).click();
        }
        public void clickPlanet () {
            driver.findElement(By.cssSelector("[aria-label='planets']")).click();
        }
        public void clickHome () {
            driver.findElement(By.cssSelector("[aria-label='home']")).click();
        }

}
