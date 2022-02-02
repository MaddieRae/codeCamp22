package com.accesshq.tests.userInterfaces;

public class distanceMatch implements MatchingStrategy {
    String planetDist;

    public distanceMatch(String planetDist) {this.planetDist = planetDist;
    }

    @Override
    public boolean match(PlanetTile planetTile)
    {
        if (planetTile.getDistance().equalsIgnoreCase(planetDist)){
            return true;
        }
        return false;
    }

}
