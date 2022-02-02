package com.accesshq.tests.webtests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {
    protected WebDriver driver;

    @BeforeEach
    public void getDriverSetup() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();

        var chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
    }

    @AfterEach
    public void Cleanup(){
        if (driver != null){
            driver.quit();
        }
    }
}

