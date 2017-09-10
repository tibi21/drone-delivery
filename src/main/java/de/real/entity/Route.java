package de.real.entity;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class Route {
    private DroneDepot droneDepot;

    private Shop shop;

    private Client client;

    private double totalDistance;

    public DroneDepot getDroneDepot() {
        return droneDepot;
    }

    public void setDroneDepot(DroneDepot droneDepot) {
        this.droneDepot = droneDepot;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
}
