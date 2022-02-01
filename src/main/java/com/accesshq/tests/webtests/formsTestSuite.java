package com.accesshq.tests.webtests;

import com.accesshq.tests.userInterfaces.menuUI;
import com.accesshq.tests.userInterfaces.planetPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.accesshq.tests.userInterfaces.formsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formsTestSuite extends baseTest {

    @Test
    public void checkforPopup()
    {
        var myMenu = new menuUI();
        myMenu.clickForm();

        var formsPage = new formsPage(driver);
        formsPage.setName("maddie");
        formsPage.setEmail("email@email.com");
        formsPage.clickAgree();
        formsPage.clickSubmit();

        new WebDriverWait(driver, 10).until(driver1 -> formsPage.isPopupVisible());
        String expectedMessage = ("Thanks for your feedback " + "maddie");
        Assertions.assertEquals(expectedMessage, formsPage.getPopupMessage());
        Cleanup();
    }
}
