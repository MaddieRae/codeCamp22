package com.accesshq.tests.userInterfaces;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formsPage {
    private WebDriver driver;

    public formsPage(WebDriver driver) {
        this.driver = driver;
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
    public void clickAgree(){
        driver.findElement(By.cssSelector(".v-input--selection-controls__ripple")).click();
    }
    public void clickSubmit(){
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
    }
    public boolean isPopupVisible() {
        return driver.findElement(By.cssSelector(".snackbar")).isDisplayed();
    }
    public String getPopupMessage(){
        return driver.findElement(By.cssSelector(".snackbar")).getText();
    }
}
