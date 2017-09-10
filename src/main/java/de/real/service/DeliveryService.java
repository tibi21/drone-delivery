package de.real.service;

import de.real.cache.DroneDepotToShop;
import de.real.cache.DroneDepotToShopDistanceCache;
import de.real.entity.Client;
import de.real.entity.Route;
import de.real.entity.Shop;
import de.real.util.Constants;
import de.real.util.DeliveryUtil;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class DeliveryService {
    /**
     * Calculates the shortest possible route from a drone depot to a shop and then to the client.
     *
     * @param client
     * @return shortest route.
     */
    public Route calculateShortestRoute(Client client) {
        Route shortestRoute = new Route();

        shortestRoute.setClient(client);
        shortestRoute.setTotalDistance(Double.MAX_VALUE);

        for(Shop shop : Constants.SHOPS) {
            DroneDepotToShop droneDepotToShop = DroneDepotToShopDistanceCache.getClosestDroneDepotToShop(shop.getId());

            double shopToClientDistance = DeliveryUtil.calculateDistanceBetweenEarthCoordinates(shop.getLocation(), client.getLocation());
            double totalDistance = droneDepotToShop.getDistance() + shopToClientDistance;

            if(totalDistance < shortestRoute.getTotalDistance()) {
                shortestRoute.setDroneDepot(droneDepotToShop.getClosestDroneDepotToShop());
                shortestRoute.setShop(shop);
                shortestRoute.setTotalDistance(totalDistance);
            }
        }

        return shortestRoute;
    }
}
