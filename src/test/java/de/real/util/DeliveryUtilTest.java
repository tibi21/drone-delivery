package de.real.util;

import de.real.entity.Duration;
import de.real.entity.Location;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class DeliveryUtilTest {

    @Test
    public void testCalculateDeliveryTime1() {
        Duration duration = DeliveryUtil.calculateDeliveryTime(60, 30);

        Assert.assertEquals(30, duration.getMinutes());
        Assert.assertEquals(0, duration.getSeconds());
    }

    @Test
    public void testCalculateDeliveryTime2() {
        Duration duration = DeliveryUtil.calculateDeliveryTime(60, 0.3);

        Assert.assertEquals(0, duration.getMinutes());
        Assert.assertEquals(18, duration.getSeconds());
    }

    @Test
    public void testCalculateDistanceBetweenEarthCoordinates1() {
        Location location1 = new Location(51.2346719, 6.8234472, "Metrostrasse 12, 40235 Düsseldorf");
        Location location2 = new Location(51.2368119, 6.7219868, "Am Albertussee 1, 40549 Düsseldorf");
        double distance = DeliveryUtil.calculateDistanceBetweenEarthCoordinates(location1, location2);

        Assert.assertEquals(7.06, distance, 0.01);
    }

    @Test
    public void testCalculateDistanceBetweenEarthCoordinates2() {
        Location location1 = new Location(51.2376356, 6.7174228, "Schiessstraße 31, 40549 Düsseldorf");
        Location location2 = new Location(51.2117165, 6.7678955, "Kronprinzenstraße 88, 40217 Düsseldorf");
        double distance = DeliveryUtil.calculateDistanceBetweenEarthCoordinates(location1, location2);

        Assert.assertEquals(4.55, distance, 0.01);
    }
}
