package com.accesshq.tests.userInterfaces;
import com.accesshq.tests.userInterfaces.menuUI;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class planetPage {
    private WebDriver driver;

    public planetPage(WebDriver driver) {
        this.driver = driver;
    }

    public PlanetTile getPlanetTilebyName(String planetName) {
        var planets = driver.findElements(By.className("planet"));
        PlanetTile currentTile = null;
        for (WebElement planet : planets){
            currentTile = new PlanetTile(planet);
            if (currentTile.getPlanetName().equalsIgnoreCase(planetName)){
                return currentTile;
            }
        }
        throw new NotFoundException();
    }
}