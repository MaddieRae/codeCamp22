package com.accesshq.tests.userInterfaces;

public class nameMatch implements MatchingStrategy {
    String name;

    public nameMatch(String name) {this.name = name;
    }

    @Override
    public boolean match(PlanetTile planetTile)
    {
        if (planetTile.getPlanetName().equalsIgnoreCase(name)){
            return true;
        }
        return false;
    }

}
