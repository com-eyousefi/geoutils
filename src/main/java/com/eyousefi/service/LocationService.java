package com.eyousefi.service;

import com.eyousefi.model.DistanceUnit;
import com.eyousefi.model.GeoLocation;

public interface LocationService {
    /**
     * Get distance between two points in meters
     *
     * @param point1       Point 1
     * @param point2       Point 2
     * @param distanceUnit Distance unit
     * @return Distance in unit
     */
    double getDistanceBetween(GeoLocation point1, GeoLocation point2, DistanceUnit distanceUnit);

    /**
     * Get distance between two points in meters
     *
     * @param lat1         Latitude for point 1
     * @param lon1         Longitude for point 1
     * @param lat2         Latitude for point 2
     * @param lon2         Longitude for point 2
     * @param distanceUnit Distance unit
     * @return Distance in meters
     */
    double getDistanceBetween(double lat1, double lon1, double lat2, double lon2, DistanceUnit distanceUnit);
}
