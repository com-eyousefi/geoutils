package com.eyousefi.service.impl;

import com.eyousefi.model.DistanceUnit;
import com.eyousefi.model.GeoLocation;
import com.eyousefi.service.LocationService;

public class DefaultLocationService implements LocationService {
    private static final double r2d = 180.0D / Math.PI;
    private static final double d2r = Math.PI / 180.0D;
    private static final double d2km = 111189.57696D * r2d;

    DefaultLocationService() {
    }

    @Override
    public double getDistanceBetween(GeoLocation point1, GeoLocation point2, DistanceUnit distanceUnit) {
        return getDistanceBetween(point1.getLatitude(), point1.getLongitude(), point2.getLatitude(), point2.getLongitude(), distanceUnit);
    }

    @Override
    public double getDistanceBetween(double lat1, double lon1, double lat2, double lon2, DistanceUnit distanceUnit) {
        final double x = lat1 * d2r;
        final double y = lat2 * d2r;
        final double dist = Math.acos(Math.sin(x) * Math.sin(y) + Math.cos(x) * Math.cos(y) * Math.cos(d2r * (lon1 - lon2))) * d2km;
        return distanceUnit.fromMeters(dist);
    }
}
