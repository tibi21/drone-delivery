package de.real.entity;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class Location {
    private double latitude;

    private double longitude;

    private String address;

    public Location(double latitude, double longitude, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }
}
