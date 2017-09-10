package de.real.service;

import de.real.entity.Client;
import de.real.entity.Location;
import de.real.entity.Route;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class DeliveryServiceTest {
    private static DeliveryService deliveryService;

    @BeforeClass
    public static void beforeClass() {
        deliveryService = new DeliveryService();
    }

    @Test
    public void testCalculateShortestRouteClient1() {
        Client client1 = new Client(1, new Location(51.2117165, 6.7678955, "Kronprinzenstraße 88, 40217 Düsseldorf"));

        Route shortestRoute = deliveryService.calculateShortestRoute(client1);

        Assert.assertEquals(2, shortestRoute.getDroneDepot().getId());
        Assert.assertEquals(1, shortestRoute.getShop().getId());
        Assert.assertEquals(4.88, shortestRoute.getTotalDistance(), 0.02);
    }

    @Test
    public void testCalculateShortestRouteClient2() {
        Client client2 = new Client(2, new Location(51.23516, 6.7762113, "Kaiserstraße 2, 40479 Düsseldorf"));

        Route shortestRoute = deliveryService.calculateShortestRoute(client2);

        Assert.assertEquals(2, shortestRoute.getDroneDepot().getId());
        Assert.assertEquals(1, shortestRoute.getShop().getId());
        Assert.assertEquals(4.44, shortestRoute.getTotalDistance(), 0.02);
    }
}
