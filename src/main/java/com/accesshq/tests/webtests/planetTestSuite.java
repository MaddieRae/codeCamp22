package com.accesshq.tests.webtests;
import com.accesshq.tests.userInterfaces.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.accesshq.tests.userInterfaces.MenuUi;


public class planetTestSuite extends baseTest {


@Test
    public void findDistancetoJupiter()
    {
        var myMenu = new MenuUi(driver);
        myMenu.clickPlanet();

        var planetspage = new planetPage(driver);

        PlanetTile planet = planetspage.getPlanetTile(new nameMatch("Jupiter"));

        //var plantt = planetspage.getPlanetTilebyName("jupiter");


        Assertions.assertEquals("778,500,000 km",planet.getDistance());
        //Cleanup();
    }
}

