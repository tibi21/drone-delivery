package de.real.cache;

import de.real.entity.DroneDepot;
import de.real.entity.Shop;
import de.real.util.Constants;
import de.real.util.DeliveryUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class DroneDepotToShopDistanceCache {
    /**
     * The key of the map is the shop ID.
     */
    private static Map<Integer, DroneDepotToShop> droneDepotToShopDistances;

    public static void initialize() {
        droneDepotToShopDistances = new HashMap<>();

        for(Shop shop : Constants.SHOPS) {
            // we look for the closest possible drone depot for current shop.
            DroneDepotToShop closestDroneDepotToShop = null;

            for(DroneDepot droneDepot : Constants.DRONE_DEPOTS) {
                double distance = DeliveryUtil.calculateDistanceBetweenEarthCoordinates(droneDepot.getLocation(), shop.getLocation());

                if(closestDroneDepotToShop == null || distance < closestDroneDepotToShop.getDistance()) {
                    closestDroneDepotToShop = new DroneDepotToShop(shop, droneDepot, distance);
                }
            }

            droneDepotToShopDistances.put(shop.getId(), closestDroneDepotToShop);
        }
    }

    public static DroneDepotToShop getClosestDroneDepotToShop(Integer shopId) {
        return droneDepotToShopDistances.get(shopId);
    }
}
