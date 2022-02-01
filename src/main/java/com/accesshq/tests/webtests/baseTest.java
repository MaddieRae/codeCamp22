package com.accesshq.tests.webtests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
    protected WebDriver driver;

    @BeforeEach
    public void getDriverSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
    }

    @AfterEach
    public void Cleanup(){
        if (driver != null){
            driver.quit();
        }
    }
}

