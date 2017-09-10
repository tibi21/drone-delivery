package de.real.entity;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class Shop {
    private int id;

    private Location location;

    public Shop(int id, Location location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
