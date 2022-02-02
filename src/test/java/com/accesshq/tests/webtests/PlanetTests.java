package com.accesshq.tests.webtests;
import com.accesshq.tests.userInterfaces.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.accesshq.tests.userInterfaces.MenuUi;


public class PlanetTests extends BaseTests {


@Test
    public void findDistancetoJupiter()
    {
        var myMenu = new MenuUi(driver);
        myMenu.clickPlanet();
        var planetspage = new planetPage(driver);

        PlanetTile planet = planetspage.getPlanetTile(new nameMatch("Jupiter"));
        Assertions.assertEquals("778,500,000 km",planet.getDistance());

        PlanetTile planetDist = planetspage.getPlanetTile(new distanceMatch("108,200,000 km"));
        Assertions.assertEquals("108,200,000 km", planetDist.getDistance());

       // Stream.empty() = planet.getDistance();
    }
}

