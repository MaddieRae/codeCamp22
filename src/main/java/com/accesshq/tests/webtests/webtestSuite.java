package com.accesshq.tests.webtests;
import com.accesshq.tests.userInterfaces.menuUI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import com.accesshq.tests.userInterfaces.PlanetTile;

public class webtestSuite extends baseTest{

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
       // var findingJupiter = new PlanetTile(WebElement ele);
     //   findingJupiter.equals(findingJupiter);

    }
    @Test
    void testHome(){
        var myMenu = new menuUI();
        myMenu.clickHome();
    }
}

