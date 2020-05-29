package com.eyousefi.model;

public class GeoLocation {
    private final double latitude;
    private final double longitude;

    public static GeoLocation of(double latitude, double longitude) {
        return new GeoLocation(latitude, longitude);
    }

    public GeoLocation(double latitude, double longitude) {
        validate(latitude, longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private void validate(double latitude, double longitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException(String.format("Invalid latitude %f", latitude));
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException(String.format("Invalid longitude %f", longitude));
        }
    }

    /**
     * @return Latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return Longitude
     */
    public double getLongitude() {
        return longitude;
    }
}
