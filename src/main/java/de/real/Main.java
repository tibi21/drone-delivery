package de.real;

import de.real.cache.DroneDepotToShopDistanceCache;
import de.real.entity.Client;
import de.real.entity.Duration;
import de.real.entity.Location;
import de.real.entity.Route;
import de.real.service.DeliveryService;
import de.real.util.Constants;
import de.real.util.DeliveryUtil;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class Main {
    private static DeliveryService deliveryService = new DeliveryService();

    public static void main(String[] args) {
        DroneDepotToShopDistanceCache.initialize();

        manage(new Client(1, new Location(51.2117165, 6.7678955, "Kronprinzenstraße 88, 40217 Düsseldorf")));
        manage(new Client(2, new Location(51.23516, 6.7762113, "Kaiserstraße 2, 40479 Düsseldorf")));
        manage(new Client(3, new Location(51.2275977, 6.7577484, "Wildenbruchstraße 2, 40545 Düsseldorf")));
        manage(new Client(4, new Location(51.2080526, 6.8288701, "Schlesische Straße 5, 40231 Düsseldorf")));
    }

    private static void manage(Client client) {
        Route shortestRoute = deliveryService.calculateShortestRoute(client);
        Duration duration = DeliveryUtil.calculateDeliveryTime(Constants.DRONE_SPEED, shortestRoute.getTotalDistance());

        display(shortestRoute, duration);
    }

    private static void display(Route route, Duration duration) {
        StringBuilder sb = new StringBuilder();

        sb.append("Depot ").append(route.getDroneDepot().getId()).append(" (");
        sb.append(route.getDroneDepot().getLocation().getAddress()).append(")");
        sb.append(" -> ");
        sb.append("Shop ").append(route.getShop().getId()).append(" (");
        sb.append(route.getShop().getLocation().getAddress()).append(")");
        sb.append(" -> ");
        sb.append("Client ").append(route.getClient().getId());
        sb.append(" (").append(route.getClient().getLocation().getAddress()).append(")");

        System.out.println(sb.toString());
        System.out.println("Total distance: " + Math.round(route.getTotalDistance()*100.0)/100.0 + " km");
        System.out.println("Delivery time: " + duration.getMinutes() + " minutes and " + duration.getSeconds() + " seconds");

        System.out.println();
    }
}
