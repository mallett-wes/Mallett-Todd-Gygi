package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Map implements Serializable{
    private ArrayList<Location> locations = new ArrayList<>();

    public Map(){

    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Map map = (Map) o;

        return locations != null ? locations.equals(map.locations) : map.locations == null;
    }

    @Override
    public int hashCode() {
        return locations != null ? locations.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Map{" +
                "locations=" + locations +
                '}';
    }
}
