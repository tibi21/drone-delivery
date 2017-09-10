package de.real.de.real.cache;

import de.real.cache.DroneDepotToShop;
import de.real.cache.DroneDepotToShopDistanceCache;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by tiberiu on 10/09/2017.
 */
public class DroneDepotToShopDistanceCacheTest {
    @Test
    public void testInitializeDistanceToShop1() {
        DroneDepotToShopDistanceCache.initialize();

        DroneDepotToShop closestDroneDepotToShop = DroneDepotToShopDistanceCache.getClosestDroneDepotToShop(1);

        Assert.assertEquals(0.34, closestDroneDepotToShop.getDistance(), 0.02);
    }

    @Test
    public void testInitializeDistanceToShop2() {
        DroneDepotToShopDistanceCache.initialize();

        DroneDepotToShop closestDroneDepotToShop = DroneDepotToShopDistanceCache.getClosestDroneDepotToShop(2);

        Assert.assertEquals(4.34, closestDroneDepotToShop.getDistance(), 0.02);
    }
}
