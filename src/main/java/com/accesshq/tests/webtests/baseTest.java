package com.accesshq.tests.webtests;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.accesshq.tests.userInterfaces.formsUserInterfaces;
import com.accesshq.tests.userInterfaces.menuUI;

public abstract class baseTest {
    protected static WebDriver driver;

    @BeforeAll
    static void getDriverSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");

    }

    public void Cleanup(){
        if (driver != null){
            driver.quit();
        }
    }

    }

