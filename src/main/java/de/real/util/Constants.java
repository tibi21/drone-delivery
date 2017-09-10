package de.real.util;

import de.real.entity.DroneDepot;
import de.real.entity.Location;
import de.real.entity.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class Constants {
    public static final int SECONDS_IN_ONE_HOUR = 3600;
    public static final int MINUTES_IN_ONE_HOUR = 60;
    public static final int SECONDS_IN_ONE_MINUTE = 60;
    public static final int EARTH_MEDIUM_RADIUS_KM = 6371;
    // speed is in km/h
    public static final double DRONE_SPEED = 60.0;
    public static final List<DroneDepot> DRONE_DEPOTS = new ArrayList<>();
    public static final List<Shop> SHOPS = new ArrayList<>();

    static {
        DRONE_DEPOTS.add(new DroneDepot(1, new Location(51.2346719, 6.8234472, "Metrostrasse 12, 40235 Düsseldorf")));
        DRONE_DEPOTS.add(new DroneDepot(2, new Location(51.2368119, 6.7219868, "Am Albertussee 1, 40549 Düsseldorf")));

        SHOPS.add(new Shop(1, new Location(51.2376356, 6.7174228, "Schiessstraße 31, 40549 Düsseldorf")));
        SHOPS.add(new Shop(2, new Location(51.2089383, 6.7766309, "Friedrichstraße 152, 40217 Düsseldorf")));
        SHOPS.add(new Shop(3, new Location(51.2019935, 6.7164407, "Breslauer Str. 2, 41460 Neuss")));
        SHOPS.add(new Shop(4, new Location(51.2312339, 6.6835105, "Bataverstraße 93, 41462 Neuss")));
        SHOPS.add(new Shop(5, new Location(51.2965073, 6.829303, "Am Sandbach 30, 40878 Ratingen")));
    }
}
