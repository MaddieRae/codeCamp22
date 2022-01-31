package com.accesshq.tests.webtests;
import com.accesshq.tests.userInterfaces.menuUI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.accesshq.tests.webtests.baseTest;

public class webtestSuite extends baseTest{


    // protected WebDriver driver;@BeforeEach
   // var mySetup = new baseTest(getDriverSetup);
   // mySetup.getDriverSetup
   // public void getDriverSetup() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
       // driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
//}
 //   @AfterEach
      //  public void Cleanup() {
      //      if (driver != null) {
     //        driver.quit();
 // }
 //}

  //  @Test
  //  void getsetForms(){

   // }


    @Test
    void TestFormsPage(){
        //WebDriver driver = baseTest.driver;

        var myMenu = new menuUI();
        myMenu.clickForm();
        WebElement element = driver.findElement(By.id("name"));
        element.click();
        element.sendKeys("Maddie");
        Assertions.assertEquals(element.getAttribute("name").toLowerCase(),"name");

        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("tilly.g@hotmail.com");

        WebElement submitButton = null;
        var buttons = driver.findElements(By.tagName("button"));
        for (WebElement button: buttons){
            if (button.getText().equalsIgnoreCase("submit")){
                submitButton = button;
                break;
            }
        }
        if (submitButton != null){
            submitButton.click();
        }
        else {
            throw new NotFoundException();
        }
        var emailError = driver.findElement(By.id("email-err"));
        var agreeError = driver.findElement(By.id("agree-err"));
        var nameError = driver.findElement(By.id("name-err"));

        Assertions.assertNotNull(emailError);
        Assertions.assertNotNull(agreeError);
        Assertions.assertNotNull(nameError);

        //var errors = driver.findElements(By.className("form-error mb-4"));
    }
    @Test
    void testPlanets(){
        var myMenu = new menuUI();
        myMenu.clickPlanet();
    }
   // @Test
  //  void testHome(){
   //     var myMenu = new menuUI();
    //    myMenu.clickHome();
    //}
}

