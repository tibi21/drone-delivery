package de.real.entity;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class Client {
    private int id;

    private Location location;

    public Client(int id, Location location) {
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
