package com.accesshq.tests.userInterfaces;

import com.accesshq.tests.webtests.webtestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.accesshq.tests.webtests.baseTest;

import java.net.MalformedURLException;

public class menuUI extends baseTest {

       //static WebDriver driver = baseTest.driver;

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
