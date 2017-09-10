package de.real.cache;

import de.real.entity.DroneDepot;
import de.real.entity.Shop;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class DroneDepotToShop {
    private Shop shop;
    private DroneDepot closestDroneDepotToShop;
    /**
     * Distance between shop and closest drone depot in kilometers.
     */
    private double distance;

    public DroneDepotToShop(Shop shop, DroneDepot closestDroneDepotToShop, double distance) {
        this.shop = shop;
        this.closestDroneDepotToShop = closestDroneDepotToShop;
        this.distance = distance;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public DroneDepot getClosestDroneDepotToShop() {
        return closestDroneDepotToShop;
    }

    public void setClosestDroneDepotToShop(DroneDepot closestDroneDepotToShop) {
        this.closestDroneDepotToShop = closestDroneDepotToShop;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
