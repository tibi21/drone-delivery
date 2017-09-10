package de.real.util;

import de.real.entity.Duration;
import de.real.entity.Location;

/**
 * Created by tiberiu on 09/09/2017.
 */
public class DeliveryUtil {
    /**
     * @param speed Speed is in km/h.
     * @param distance Distance is in kilometers.
     * @return duration in minutes and seconds.
     */
    public static Duration calculateDeliveryTime(double speed, double distance) {
        double durationInHours = distance/speed;
        int durationInMinutes = (int)(durationInHours * Constants.MINUTES_IN_ONE_HOUR);
        int durationInSeconds = (int)(durationInHours * Constants.SECONDS_IN_ONE_HOUR);

        Duration duration = new Duration();

        duration.setMinutes(durationInMinutes);
        duration.setSeconds(durationInSeconds - durationInMinutes * Constants.SECONDS_IN_ONE_MINUTE);

        return duration;
    }

    /**
     *
     * @param location1
     * @param location2
     * @return the distance between locations in kilometers.
     */
    public static double calculateDistanceBetweenEarthCoordinates(Location location1, Location location2) {
        double latitudeDeltaInRadians = degreesToRadians(location2.getLatitude() - location1.getLatitude());
        double longitudeDeltaInRadians = degreesToRadians(location2.getLongitude() - location1.getLongitude());

        double latitude1InRadians = degreesToRadians(location1.getLatitude());
        double latitude2InRadians = degreesToRadians(location2.getLatitude());

        double intermediary = Math.sin(latitudeDeltaInRadians/2) * Math.sin(latitudeDeltaInRadians/2) + Math.sin(longitudeDeltaInRadians/2) * Math.sin(longitudeDeltaInRadians/2) * Math.cos(latitude1InRadians) * Math.cos(latitude2InRadians);

        return 2 * Math.atan2(Math.sqrt(intermediary), Math.sqrt(1-intermediary)) * Constants.EARTH_MEDIUM_RADIUS_KM;
    }

    private static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }
}
