package com.accesshq.tests.userInterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class planetPage {
    private WebDriver driver;

    public planetPage(WebDriver driver) {
        this.driver = driver;
    }

    public PlanetTile getPlanetTile(MatchingStrategy strategy){
        var planetTiles = driver.findElements(By.className("planet"));
        for (WebElement tile : planetTiles){
            PlanetTile planet = new PlanetTile(tile);
            if (strategy.match(planet)){
                return planet;
            }
        }
        throw new NotFoundException("planet not found");
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