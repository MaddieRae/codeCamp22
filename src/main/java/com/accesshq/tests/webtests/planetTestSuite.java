package com.accesshq.tests.webtests;
import com.accesshq.tests.userInterfaces.menuUI;
import com.accesshq.tests.userInterfaces.PlanetTile;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.accesshq.tests.userInterfaces.menuUI;
import com.accesshq.tests.userInterfaces.planetPage;
import org.openqa.selenium.WebDriver;
import com.accesshq.tests.webtests.baseTest;
import org.openqa.selenium.WebElement;


public class planetTestSuite extends baseTest {




@Test
    public void findDistancetoJupiter()
    {
        var myMenu = new menuUI();
        myMenu.clickPlanet();

        var planetspage = new planetPage(driver);
        var plantt = planetspage.getPlanetTilebyName("jupiter");

        Assertions.assertEquals("778,500,000 km",plantt.getDistance());
        Cleanup();
    }
}

